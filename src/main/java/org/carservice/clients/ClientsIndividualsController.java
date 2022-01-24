package org.carservice.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Create the org.carservice.clients.ClientsIndividualsController class.
 * This is a Spring Controller following REST style.
 */

@RestController
public class ClientsIndividualsController {
    @Autowired
    private ClientsIndividualsService service;

    @GetMapping("/clientsindividuals")
    public List<ClientsIndividuals> list() {
        return service.listAll();
    }

    @GetMapping("/clientsindividuals/{id}")
    public ClientsIndividuals get(@PathVariable Integer id) {
        try {
            return service.get(id);
        } catch(NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "NO_DATA_ON_THIS_ID", e);
        }
    }

    @PostMapping("/clientsindividuals")
    public void add(@RequestBody ClientsIndividuals clientsIndividuals) {
        service.save(clientsIndividuals);
    }

    @PutMapping("/clientsindividuals/{id}")
    public ResponseEntity<?> update(@RequestBody ClientsIndividuals clientsIndividuals, @PathVariable Integer id) {
        try {
            ClientsIndividuals existClientIndividual = service.get(id);
            existClientIndividual.setClientIndividualId(clientsIndividuals.getClientIndividualId());
            existClientIndividual.setSurname(clientsIndividuals.getSurname());
            existClientIndividual.setFirstname(clientsIndividuals.getFirstname());
            existClientIndividual.setPatronymic(clientsIndividuals.getPatronymic());
            existClientIndividual.setMobile(clientsIndividuals.getMobile());

            service.save(clientsIndividuals);

            return new ResponseEntity<>(HttpStatus.OK);
        } catch(NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/clientsindividuals/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
