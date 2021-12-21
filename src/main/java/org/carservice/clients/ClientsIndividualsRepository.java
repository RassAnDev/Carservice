package org.carservice.clients;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create the ClientsIndividualsRepository for take advantages of Spring Data JPA.
 */

public interface ClientsIndividualsRepository extends JpaRepository<ClientsIndividuals, Integer> {
}
