package com.ticketer.controllers;

import com.ticketer.entities.dtos.UserDto;
import com.ticketer.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUserById(id);
        return "User deleted successfully!";
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody UserDto userDto) {
        userService.updateUserById(id, userDto);
        return "User updated successfully!";
    }
}
