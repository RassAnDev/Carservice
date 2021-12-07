package org.carservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Create the org.carservice.PaymentsOptionsService class that acts as a middle layer
 * between persistence layer (repository) and controller layer.
 */

@Service
@Transactional
public class PaymentsOptionsService {
    @Autowired
    private PaymentsOptionsRepository repo;

    public List<PaymentsOptions> listAll() {
        return repo.findAll();
    }

    public void save(PaymentsOptions paymentsOptions) {
        repo.save(paymentsOptions);
    }

    public PaymentsOptions get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
