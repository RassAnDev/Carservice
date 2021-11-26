package org.carservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create the org.carservice.EmployeesController class.
 * This is a Spring Controller following REST style.
 */

@RestController
public class EmployeesController {
    @Autowired
    private EmployeesService service;

    @GetMapping("/employees")
    public List<Employees> list() {
        return service.listAll();
    }
}
