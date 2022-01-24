package org.carservice.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Create the org.carservice.clients.ClientsController class.
 * This is a Spring Controller following REST style.
 */

@RestController
public class ClientsController {
    @Autowired
    private ClientsService service;

    @GetMapping("/clients")
    public List<Clients> list() {
        return service.listAll();
    }
    
    @GetMapping("/clients/{id}")
    public Clients get(@PathVariable Integer id) {
        try {
            return service.get(id);
        } catch(NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "NO_DATA_ON_THIS_ID", e);
        }
    }

    @PostMapping("/clients")
    public void add(@RequestBody Clients clients) {
        service.save(clients);
    }

    @PutMapping("/clients/{id}")
    public ResponseEntity<?> update(@RequestBody Clients clients, @PathVariable Integer id) {
        try{
            Clients existClient = service.get(id);
            existClient.setClientId(clients.getClientId());
            existClient.setClientIndividualId(clients.getClientIndividualId());
            existClient.setClientOrganizationId(clients.getClientOrganizationId());

            service.save(clients);

            return new ResponseEntity<>(HttpStatus.OK);
        } catch(NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/clients/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
