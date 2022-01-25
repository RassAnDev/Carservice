package org.carservice.works;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Create the org.carservice.works.WorksController class.
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

    @GetMapping("/works/{id}")
    public Works get(@PathVariable Integer id) {
        try {
            return service.get(id);
        } catch(NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "NO_DATA_ON_THIS_ID", e);
        }
    }

    @PostMapping("/works")
    public void add(@RequestBody Works works) {
        service.save(works);
    }

    @PutMapping("/works/{id}")
    public ResponseEntity<?> update(@RequestBody Works works, @PathVariable Integer id) {
        try {
            Works existWork = service.get(id);
            existWork.setWorkId(works.getWorkId());
            existWork.setWorkOrderId(works.getWorkOrderId());
            existWork.setTitle(works.getTitle());
            existWork.setUnitPrice(works.getUnitPrice());

            service.save(works);

            return new ResponseEntity<>(HttpStatus.OK);
        } catch(NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/works/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}
