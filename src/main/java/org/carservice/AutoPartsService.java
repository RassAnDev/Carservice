package org.carservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Create the org.carservice.AutoPartsService class that acts as a middle layer
 * between persistence layer (repository) and controller layer.
 * This service class simply forwards the calls to an implementation of the org.carservice.AutoPartsRepository interface.
 * In addition, all the methods are executed in transactions
 * because this class is marked with the @Transactional annotation.
 */

@Service
@Transactional
public class AutoPartsService {
    @Autowired
    private AutoPartsRepository repo;

    public List<AutoParts> listAll() {
        return repo.findAll();
    }

    public void save(AutoParts autoParts) {
        repo.save(autoParts);
    }

    public AutoParts get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
