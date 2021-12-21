package org.carservice.works;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Create the org.carservice.WorkService class that acts as a middle layer
 * between persistence layer (repository) and controller layer.
 */

@Service
@Transactional
public class WorksService {
    @Autowired
    private WorksRepository repo;

    public List<Works> listAll() {
        return repo.findAll();
    }

    public void save(Works works) {
        repo.save(works);
    }

    public Works get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }

}
