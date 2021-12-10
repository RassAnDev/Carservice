package org.carservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create the org.carservice.WorkOrdersController class.
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
}
