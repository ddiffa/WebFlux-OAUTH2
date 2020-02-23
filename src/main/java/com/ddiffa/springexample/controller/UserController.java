package com.ddiffa.springexample.controller;

import com.ddiffa.springexample.model.User;
import com.ddiffa.springexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public Iterable<User> getAllUser() {
        return userService.findAll();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable("id") long id) {
        return userService.getUser(id);
    }

    @PutMapping("/users/{id}")
    public User update(@PathVariable long id, @RequestBody User user) {
        user.setId(id);
        return userService.save(user);
    }

    @DeleteMapping("/users/{id}")
    public String delete(@PathVariable(value = "id") Long id) {
        userService.delete(id);
        return "Success";
    }

}
