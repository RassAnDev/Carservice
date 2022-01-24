package org.carservice.documents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Create the org.carservice.documents.InvoicesForPaymentsController class.
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

    @GetMapping("/invoicesforpayments/{id}")
    public InvoicesForPayments get(@PathVariable Integer id) {
        try {
            return service.get(id);
        } catch(NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "NO_DATA_ON_THIS_ID", e);
        }
    }

    @PostMapping("/invoicesforpayments")
    public void add(@RequestBody InvoicesForPayments invoicesForPayments) {
        service.save(invoicesForPayments);
    }

    @PutMapping("/invoicesforpayments/{id}")
    public ResponseEntity<?> update(@RequestBody InvoicesForPayments invoicesForPayments, @PathVariable Integer id) {
        try {
            InvoicesForPayments existInvoiceForPayment = service.get(id);
            existInvoiceForPayment.setInvoiceForPaymentId(invoicesForPayments.getInvoiceForPaymentId());
            existInvoiceForPayment.setActExecutedWorkId(invoicesForPayments.getActExecutedWorkId());

            service.save(invoicesForPayments);

            return new ResponseEntity<>(HttpStatus.OK);
        } catch(NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/invoicesforpayments/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
