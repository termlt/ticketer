package com.ticketer.services;

import com.ticketer.entities.dtos.UserDto;

import java.util.List;

public interface UserService {
    UserDto getUserById(Long id);
    void registerUser(UserDto userDto);
    void updateUserById(Long id, UserDto userDto);
    void deleteUserById(Long id);
    List<UserDto> getAllUsers();
    void assignRoleToUser(Long userId, Long roleId);
}
