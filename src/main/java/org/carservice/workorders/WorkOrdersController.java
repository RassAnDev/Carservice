package org.carservice.workorders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

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
}
