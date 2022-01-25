package org.carservice.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Create the org.carservice.employees.EmployeesController class.
 * This is a Spring Controller following REST style.
 */

@RestController
public class EmployeesController {
    @Autowired
    private EmployeesService service;

    @GetMapping("/employees")
    public List<Employees> list() {
        return service.listAll();
    }

    @GetMapping("/employees/{id}")
    public Employees get(@PathVariable Integer id) {
        try {
            return service.get(id);
        } catch(NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "NO_DATA_ON_THIS_ID", e);
        }
    }

    @PostMapping("/employees")
    public void add(@RequestBody Employees employees) {
        service.save(employees);
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<?> update(@RequestBody Employees employees, @PathVariable Integer id) {
        try {
            Employees existEmployee = service.get(id);
            existEmployee.setEmployeePositionId(employees.getEmployeePositionId());
            existEmployee.setFirstname(employees.getFirstname());
            existEmployee.setPatronymic(employees.getPatronymic());
            existEmployee.setSurname(employees.getSurname());

            service.save(employees);

            return new ResponseEntity<>(HttpStatus.OK);
        } catch(NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/employees/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
