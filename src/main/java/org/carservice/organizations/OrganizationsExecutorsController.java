package org.carservice.organizations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create the org.carservice.organizations.OrganizationsExecutorsController class.
 * This is a Spring Controller following REST style.
 */

@RestController
public class OrganizationsExecutorsController {
    @Autowired
    private OrganizationsExecutorsService service;

    @GetMapping("/organizationsexecutors")
    public List<OrganizationsExecutors> list() {
        return service.listAll();
    }
}
