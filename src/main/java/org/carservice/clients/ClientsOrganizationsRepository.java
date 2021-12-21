package org.carservice.clients;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create the ClientsOrganizationsRepository for take advantages of Spring Data JPA.
 */

public interface ClientsOrganizationsRepository extends JpaRepository<ClientsOrganizations, Integer> {
}
