package org.carservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create the org.carservice.WorksController class.
 * This is a Spring Controller following REST style.
 */

@RestController
public class WorksController {
    @Autowired
    private WorksService service;

    @GetMapping("/works")
    public List<Works> list() {
        return service.listAll();
    }
}
