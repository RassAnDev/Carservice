package org.carservice.payments;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create the PaymentsOptionsRepository for take advantages of Spring Data JPA.
 */

public interface PaymentsOptionsRepository extends JpaRepository<PaymentsOptions, Integer> {
}
