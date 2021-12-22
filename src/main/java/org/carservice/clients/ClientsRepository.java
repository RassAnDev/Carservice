package org.carservice.clients;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create the ClientsRepository for take advantages of Spring Data JPA.
 */

public interface ClientsRepository extends JpaRepository<Clients, Integer> {
}
