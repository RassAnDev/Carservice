package org.carservice.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create the org.carservice.clients.ClientsOrganizationsController class.
 * This is a Spring Controller following REST style.
 */

@RestController
public class ClientsOrganizationsController {
    @Autowired
    private ClientsOrganizationsService service;

    @GetMapping("/clientsorganizations")
    public List<ClientsOrganizations> list() {
        return service.listAll();
    }
}
