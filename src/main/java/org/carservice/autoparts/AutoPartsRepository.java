package org.carservice.autoparts;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create the AutoPartsRepository for take advantages of Spring Data JPA.
 * Then Spring Data JPA will generate implementation code for the most common CRUD operations.
 * It means we don’t have to write a single query.
 */

public interface AutoPartsRepository extends JpaRepository<AutoParts, Integer> {
}
