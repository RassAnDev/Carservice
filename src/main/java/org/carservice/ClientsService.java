package org.carservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Create the org.carservice.ClientsService class that acts as a middle layer
 * between persistence layer (repository) and controller layer.
 */

@Service
@Transactional
public class ClientsService {
    @Autowired
    private ClientsRepository repo;

    public List<Clients> listAll() {
        return repo.findAll();
    }

    public void save(Clients clients) {
        repo.save(clients);
    }

    public Clients get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
