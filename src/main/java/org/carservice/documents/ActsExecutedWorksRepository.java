package org.carservice.documents;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create the ActsExecutedWorksRepository for take advantages of Spring Data JPA.
 */

public interface ActsExecutedWorksRepository extends JpaRepository<ActsExecutedWorks, Integer> {
}
