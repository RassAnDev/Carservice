package org.carservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create the OrganizationsExecutorsRepository for take advantages of Spring Data JPA.
 */

public interface OrganizationsExecutorsRepository extends JpaRepository<OrganizationsExecutors, Integer> {
}
