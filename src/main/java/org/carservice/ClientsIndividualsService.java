package org.carservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Create the org.carservice.ClientsIndividualsService class that acts as a middle layer
 * between persistence layer (repository) and controller layer.
 */

@Service
@Transactional
public class ClientsIndividualsService {
    @Autowired
    private ClientsIndividualsRepository repo;

    public List<ClientsIndividuals> listAll() {
        return repo.findAll();
    }

    public void save(ClientsIndividuals clientsIndividuals) {
        repo.save(clientsIndividuals);
    }

    public ClientsIndividuals get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
