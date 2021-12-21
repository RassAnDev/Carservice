package org.carservice.workorders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Create the org.carservice.workorders.WorkOrdersService class that acts as a middle layer
 * between persistence layer (repository) and controller layer.
 */

@Service
@Transactional
public class WorkOrdersService {
    @Autowired
    private WorkOrdersRepository repo;

    public List<WorkOrders> listAll() {
        return repo.findAll();
    }

    public void save(WorkOrders workOrders) {
        repo.save(workOrders);
    }

    public WorkOrders get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
