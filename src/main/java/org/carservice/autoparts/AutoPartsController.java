package org.carservice.autoparts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Create the org.carservice.autoparts.AutoPartsController class.
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

    @GetMapping("/autoparts/{id}")
    public AutoParts get(@PathVariable Integer id) {
        try {
            return service.get(id);
        } catch(NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "NO_DATA_ON_THIS_ID", e);
        }
    }

    @PostMapping("/autoparts")
    public void add(@RequestBody AutoParts autoParts) {
        service.save(autoParts);
    }

    @PutMapping("/autoparts/{id}")
    public ResponseEntity<?> update(@RequestBody AutoParts autoParts, @PathVariable Integer id) {
        try {
            AutoParts existAutoPart = service.get(id);
            existAutoPart.setAutoPartId(autoParts.getAutoPartId());
            existAutoPart.setWorkOrderId(autoParts.getWorkOrderId());
            existAutoPart.setPurchaseDate(autoParts.getPurchaseDate());
            existAutoPart.setAutoPartName(autoParts.getAutoPartName());
            existAutoPart.setCatalogueNumber(autoParts.getCatalogueNumber());
            existAutoPart.setSupplierName(autoParts.getSupplierName());
            existAutoPart.setWholesaleUnitPrice(autoParts.getWholesaleUnitPrice());
            existAutoPart.setUnitRetailPrice(autoParts.getUnitRetailPrice());
            existAutoPart.setMarkupAmount(autoParts.getMarkupAmount());

            service.save(autoParts);

            return new ResponseEntity<>(HttpStatus.OK);
        } catch(NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/autoparts/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}
