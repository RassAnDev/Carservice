package org.carservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create the org.carservice.PaymentsOptionsController class.
 * This is a Spring Controller following REST style.
 */

@RestController
public class PaymentsOptionsController {
    @Autowired
    private PaymentsOptionsService service;

    @GetMapping("/paymentsoptions")
    public List<PaymentsOptions> list() {
        return service.listAll();
    }

}
