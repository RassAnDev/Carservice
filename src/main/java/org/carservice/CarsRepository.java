package org.carservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create the AutoPartRepository for take advantages of Spring Data JPA.
 */

public interface CarsRepository extends JpaRepository<Cars, Integer> {
}
