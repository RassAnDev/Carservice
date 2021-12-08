package org.carservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create the org.carservice.ActsExecutedWorksController class.
 * This is a Spring Controller following REST style.
 */

@RestController
public class ActsExecutedWorksController {
    @Autowired
    private ActsExecutedWorksService service;

    @GetMapping("/actsexecutedworks")
    public List<ActsExecutedWorks> list() {
        return service.listAll();
    }
}
