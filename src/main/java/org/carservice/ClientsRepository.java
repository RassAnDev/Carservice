package org.carservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create the ClientsRepository for take advantages of Spring Data JPA.
 */

public interface ClientsRepository extends JpaRepository<Clients, Integer> {
}
