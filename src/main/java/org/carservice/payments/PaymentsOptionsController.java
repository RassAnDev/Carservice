package org.carservice.payments;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Create the org.carservice.payments.PaymentsOptionsController class.
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

    @GetMapping("/paymentsoptions/{id}")
    public PaymentsOptions get(@PathVariable Integer id) {
        try {
            return service.get(id);
        } catch(NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "NO_DATA_ON_THIS_ID", e);
        }
    }

    @PostMapping("/paymentsoptions")
    public void add(@RequestBody PaymentsOptions paymentsOptions) {
        service.save(paymentsOptions);
    }

    @PutMapping("/paymentsoptions/{id}")
    public ResponseEntity<?> update(@RequestBody PaymentsOptions paymentsOptions, @PathVariable Integer id) {
        try {
            PaymentsOptions existPaymentOption = service.get(id);
            existPaymentOption.setPaymentOptionId(paymentsOptions.getPaymentOptionId());
            existPaymentOption.setCash(paymentsOptions.getCash());
            existPaymentOption.setCashless(paymentsOptions.getCashless());

            service.save(paymentsOptions);

            return new ResponseEntity<>(HttpStatus.OK);
        } catch(NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/paymentsoptions/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}
