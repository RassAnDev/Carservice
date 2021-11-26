package org.carservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Create the org.carservice.EmployeesService class that acts as a middle layer
 * between persistence layer (repository) and controller layer.
 */

@Service
@Transactional
public class EmployeesService {
    @Autowired
    private EmployeesRepository repo;

    public List<Employees> listAll() {
        return repo.findAll();
    }

    public void save(Employees employees) {
        repo.save(employees);
    }

    public Employees get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
