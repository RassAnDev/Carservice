package org.carservice.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
