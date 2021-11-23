package org.carservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create the org.carservice.AutoPartsController class.
 * This is a Spring Controller following REST style.
 * The @RestController annotation enables the handler methods in this controller
 * to be exposed as RESTful APIs, for example reading JSON data from the request
 * and including JSON data to the response.
 * And this REST controller still takes advantages of Spring’s dependency injection
 * (an instance of AutoPartsService is autowired).
 */

@RestController
public class AutoPartsController {
    @Autowired
    private AutoPartsService service;

    @GetMapping("/autoparts")
    public List<AutoParts> list() {
        return service.listAll();
    }

}
