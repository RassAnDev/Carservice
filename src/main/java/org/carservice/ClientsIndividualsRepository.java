package org.carservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create the ClientsIndividualsRepository for take advantages of Spring Data JPA.
 */

public interface ClientsIndividualsRepository extends JpaRepository<ClientsIndividuals, Integer> {
}
