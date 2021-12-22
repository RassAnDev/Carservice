package org.carservice.cars;

import org.carservice.cars.Cars;
import org.carservice.cars.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Create the org.carservice.cars.CarsService class that acts as a middle layer
 * between persistence layer (repository) and controller layer.
 */

@Service
@Transactional
public class CarsService {
    @Autowired
    private CarsRepository repo;

    public List<Cars> listAll() {
        return repo.findAll();
    }

    public void save(Cars cars) {
        repo.save(cars);
    }

    public Cars get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
