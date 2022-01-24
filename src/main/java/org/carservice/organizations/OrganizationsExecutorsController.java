package org.carservice.organizations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

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

    @GetMapping("/organizationsexecutors/{id}")
    public OrganizationsExecutors get(@PathVariable Integer id) {
        try{
            return service.get(id);
        } catch(NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"NO_DATA_ON_THIS_ID", e);
        }
    }

    @PostMapping("/organizationsexecutors")
    public void add(@RequestBody OrganizationsExecutors organizationsExecutors) {
        service.save(organizationsExecutors);
    }

    @PutMapping("/organizationsexecutors/{id}")
    public ResponseEntity<?> update(@RequestBody OrganizationsExecutors organizationsExecutors, @PathVariable Integer id) {
       try {
           OrganizationsExecutors existOrganizationExecutor = service.get(id);
           existOrganizationExecutor.setOrganizationExecutorId(organizationsExecutors.getOrganizationExecutorId());
           existOrganizationExecutor.setNameOfCompany(organizationsExecutors.getNameOfCompany());
           existOrganizationExecutor.setLegalAddress(organizationsExecutors.getLegalAddress());
           existOrganizationExecutor.setTaxpayerNumber(organizationsExecutors.getTaxpayerNumber());
           existOrganizationExecutor.setRegistrationReasonCode(organizationsExecutors.getRegistrationReasonCode());
           existOrganizationExecutor.setStateRegistrationNumber(organizationsExecutors.getStateRegistrationNumber());
           existOrganizationExecutor.setBankDetails(organizationsExecutors.getBankDetails());

           service.save(organizationsExecutors);

           return new ResponseEntity<>(HttpStatus.OK);
       } catch(NoSuchElementException e) {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
    }

    @DeleteMapping("/organizationsexecutors/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
