package org.carservice.works;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create the WorksRepository for take advantages of Spring Data JPA.
 */

public interface WorksRepository extends JpaRepository<Works, Integer> {
}
