package org.carservice.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
