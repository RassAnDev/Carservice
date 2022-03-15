package org.carservice.workorders;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.ModelAndView;

import java.io.InputStream;
import java.util.*;

/**
 * Create the org.carservice.workorders.WorkOrdersController class.
 * This is a Spring Controller following REST style.
 */

@RestController
public class WorkOrdersController {
    @Autowired
    private WorkOrdersService service;

    @GetMapping("/workorders")
    public List<WorkOrders> list() {
        return service.listAll();
    }

    @GetMapping("/workorders/{id}")
    public WorkOrders get(@PathVariable Integer id) {
        try {
            return service.get(id);
        } catch(NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "NO_DATA_ON_THIS_ID", e);
        }
    }

    @PostMapping("/workorders")
    public void add(@RequestBody WorkOrders workOrders) {
        service.save(workOrders);
    }

    @PutMapping("/workorders/{id}")
    public ResponseEntity<?> update(@RequestBody WorkOrders workOrders, @PathVariable Integer id) {
        try {
            WorkOrders existWorkOrder = service.get(id);
            existWorkOrder.setWorkOrderId(workOrders.getWorkOrderId());
            existWorkOrder.setClientId(workOrders.getClientId());
            existWorkOrder.setCarId(workOrders.getCarId());
            existWorkOrder.setEmployeePositionPerformer(workOrders.getEmployeePositionPerformer());
            existWorkOrder.setEmployeePositionMasterCons(workOrders.getEmployeePositionMasterCons());
            existWorkOrder.setPaymentOptionId(workOrders.getPaymentOptionId());
            existWorkOrder.setWorkOrderNumber(workOrders.getWorkOrderNumber());
            existWorkOrder.setStartDate(workOrders.getStartDate());
            existWorkOrder.setEndDate(workOrders.getEndDate());
            existWorkOrder.setWorkQuantity(workOrders.getWorkQuantity());
            existWorkOrder.setWorkAmount(workOrders.getWorkAmount());
            existWorkOrder.setAutoPartQuantity(workOrders.getAutoPartQuantity());
            existWorkOrder.setAutoPartAmount(workOrders.getAutoPartAmount());
            existWorkOrder.setDiscountOnWork(workOrders.getDiscountOnWork());
            existWorkOrder.setTotalCost(workOrders.getTotalCost());
            existWorkOrder.setWagePercentage(workOrders.getWagePercentage());
            existWorkOrder.setRecommendation(workOrders.getRecommendation());

            service.save(workOrders);

            return new ResponseEntity<>(HttpStatus.OK);
        } catch(NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/workorders/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    final Logger log = LoggerFactory.getLogger(this.getClass());
    final ModelAndView model = new ModelAndView();
    List<WorkOrderReport> wO;

    // Method to display the index page of the application
    @GetMapping("/welcome")
    public ModelAndView index() {
        log.info("Showing the welcome page.");
        model.setViewName("welcome");
        return model;
    }

    // Method to create the pdf report via jasper framework
    @GetMapping("/workorder")
    public ModelAndView viewReport() {
        log.info("Preparing the pdf report via jasper.");
        try {
            createPdfReport(wO);
            log.info("File successfully saved at the given path.");
        } catch(final Exception e) {
            log.error("An error has occurred while preparing the workorder pdf report.");
            e.printStackTrace();
        }
        model.setViewName("welcome");
        return model;
    }

    // Method to create the pdf file using the workorder list datasource.
    private void createPdfReport(final List<WorkOrderReport> workOrders) throws JRException {
        // Fetching the .jrxml file from the resources folder.
        final InputStream stream = this.getClass().getResourceAsStream("/workorder.jrxml");

        // Compile the Jasper report from .jrxml to .jasper
        final JasperReport report = JasperCompileManager.compileReport(stream);

        // Fetching the workOrders from the data source
        final JRBeanCollectionDataSource source = new JRBeanCollectionDataSource(workOrders);

        final Map<String, Object> parameters = new HashMap<>();

        // Filling the report with the workOrder data
        final JasperPrint print = JasperFillManager.fillReport(report, parameters, source);

        final String filePath = "C:\\";

        // Export the report to a PDF file
        JasperExportManager.exportReportToPdfFile(print, filePath + "WorkOrder.pdf");
    }
}
