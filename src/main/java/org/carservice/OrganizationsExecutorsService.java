package org.carservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Create the org.carservice.OrganizationsExecutorsService class that acts as a middle layer
 * between persistence layer (repository) and controller layer.
 */

@Service
@Transactional
public class OrganizationsExecutorsService {
    @Autowired
    private OrganizationsExecutorsRepository repo;

    public List<OrganizationsExecutors> listAll() {
        return repo.findAll();
    }

    public void save(OrganizationsExecutors organizationsExecutors) {
        repo.save(organizationsExecutors);
    }

    public OrganizationsExecutors get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
