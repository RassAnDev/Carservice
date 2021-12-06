package org.carservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create the CarsRepository for take advantages of Spring Data JPA.
 */

public interface CarsRepository extends JpaRepository<Cars, Integer> {
}
