package org.carservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create the WorkOrdersRepository for take advantages of Spring Data JPA.
 */

public interface WorkOrdersRepository extends JpaRepository <WorkOrders, Integer> {
}
