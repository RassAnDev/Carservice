package org.carservice.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
