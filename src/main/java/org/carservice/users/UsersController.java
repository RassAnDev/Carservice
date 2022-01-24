package org.carservice.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Create the org.carservice.users.Users class.
 */

@RestController
public class UsersController {
    @Autowired
    private UsersService service;

    @GetMapping("/users")
    public List<Users> list() {
        return service.listAll();
    }

    @GetMapping("/users/{id}")
    public Users get(@PathVariable Integer id) {
        try {
            return service.get(id);
        } catch(NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "NO_DATA_ON_THIS_ID", e);
        }
    }

    @PostMapping("/users")
    public void add(@RequestBody Users users) {
        service.save(users);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<?> update(@RequestBody Users users, @PathVariable Integer id) {
        try {
            Users existUser = service.get(id);
            existUser.setUserId(users.getUserId());
            existUser.setUsername(users.getUsername());
            existUser.setPassword(users.getPassword());

            service.save(users);

            return new ResponseEntity<>(HttpStatus.OK);
        } catch(NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
