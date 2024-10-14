package com.ticketer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ticketer.entities.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}