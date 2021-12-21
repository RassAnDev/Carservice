package org.carservice.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create the org.carservice.cars.CarsController class.
 * This is a Spring Controller following REST style.
 */

@RestController
public class CarsController {
    @Autowired
    private CarsService service;

    @GetMapping("/cars")
    public List<Cars> list() {
        return service.listAll();
    }
}
