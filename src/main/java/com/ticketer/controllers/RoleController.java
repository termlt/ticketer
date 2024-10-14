package com.ticketer.controllers;

import com.ticketer.entities.Role;
import com.ticketer.repositories.RoleRepository;
import com.ticketer.services.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {

    private final RoleRepository roleRepository;

    private final UserServiceImpl userServiceImpl;

    public RoleController(RoleRepository roleRepository, UserServiceImpl userServiceImpl) {
        this.roleRepository = roleRepository;
        this.userServiceImpl = userServiceImpl;
    }

    @PostMapping
    public String createRole(@RequestBody Role role) {
        roleRepository.save(role);
        return "Role created successfully!";
    }

    @GetMapping
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @PutMapping("/{roleId}/assign/{userId}")
    public String assignRoleToUser(@PathVariable Long roleId, @PathVariable Long userId) {
        userServiceImpl.assignRoleToUser(userId, roleId);
        return "Role assigned successfully!";
    }
}
