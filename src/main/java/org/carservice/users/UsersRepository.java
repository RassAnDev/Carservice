package org.carservice.users;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create the UsersRepository for take advantages of Spring Data JPA.
 */

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
