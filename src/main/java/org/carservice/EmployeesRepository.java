package org.carservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create the EmployeesRepository for take advantages of Spring Data JPA.
 */

public interface EmployeesRepository extends JpaRepository<Employees, Integer> {
}
