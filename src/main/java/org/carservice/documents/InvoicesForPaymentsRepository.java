package org.carservice.documents;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create the InvoicesForPaymentsRepository for take advantages of Spring Data JPA.
 */

public interface InvoicesForPaymentsRepository extends JpaRepository<InvoicesForPayments, Integer> {
}
