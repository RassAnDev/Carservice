package org.carservice.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

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
    
    @GetMapping("/clientsorganizations/{id}")
    public ClientsOrganizations get(@PathVariable Integer id) {
        try {
            return service.get(id);
        } catch(NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "NO_DATA_ON_THIS_ID", e);
        }
    }
    
    @PostMapping("/clientsorganizations")
    public void add(@RequestBody ClientsOrganizations clientsOrganizations) {
        service.save(clientsOrganizations);
    }
    
    @PutMapping("/clientsorganizations/{id}")
    public ResponseEntity<?> update(@RequestBody ClientsOrganizations clientsOrganizations, @PathVariable Integer id) {
        try {
            ClientsOrganizations existClientOrganization = service.get(id);
            existClientOrganization.setClientOrganizationId(clientsOrganizations.getClientOrganizationId());
            existClientOrganization.setNameOfCompany(clientsOrganizations.getNameOfCompany());
            existClientOrganization.setLegalAddress(clientsOrganizations.getLegalAddress());
            existClientOrganization.setTaxpayerNumber(clientsOrganizations.getTaxpayerNumber());
            existClientOrganization.setRegistrationReasonCode(clientsOrganizations.getRegistrationReasonCode());
            existClientOrganization.setStateRegistrationNumber(clientsOrganizations.getStateRegistrationNumber());
            existClientOrganization.setBankDetails(clientsOrganizations.getBankDetails());
            existClientOrganization.setAgreementNumber(clientsOrganizations.getAgreementNumber());
            existClientOrganization.setAgreementDate(clientsOrganizations.getAgreementDate());
            existClientOrganization.setMobile(clientsOrganizations.getMobile());

            service.save(clientsOrganizations);

            return new ResponseEntity<>(HttpStatus.OK);
        } catch(NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/clientsorganizations/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
