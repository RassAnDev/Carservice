package org.carservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create the org.carservice.InvoicesForPaymentsController class.
 * This is a Spring Controller following REST style.
 */
@RestController
public class InvoicesForPaymentsController {
    @Autowired
    private InvoicesForPaymentsService service;

    @GetMapping("/invoicesforpayments")
    public List<InvoicesForPayments> list() {
        return service.listAll();
    }
}
