package org.example.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserDAO userDAO;

    public UserController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userDAO.findAll();
    }

    @PostMapping("/users")
    public ResponseEntity<String> createUser(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);

        userDAO.addUser(user);
        return ResponseEntity.ok("User created successfully.");
    }
}