package org.carservice.documents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Create the org.carservice.documents.ActsExecutedWorksService class that acts as a middle layer
 * between persistence layer (repository) and controller layer.
 */

@Service
@Transactional
public class ActsExecutedWorksService {
    @Autowired
    private ActsExecutedWorksRepository repo;

    public List<ActsExecutedWorks> listAll() {
        return repo.findAll();
    }

    public void save(ActsExecutedWorks actsExecutedWorks) {
        repo.save(actsExecutedWorks);
    }

    public ActsExecutedWorks get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
