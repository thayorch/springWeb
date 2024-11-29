package com.martinez.webspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martinez.webspring.entity.User;
import com.martinez.webspring.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public boolean deleteUser(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);  // Delete the user from the database
            return true;
        }
        return false;  // User not found
    }

    public User updateUser(Long id, User userDetails) {
        return userRepository.findById(id).map(user -> {
            user.setName(userDetails.getName());
            user.setEmail(userDetails.getEmail());
            return userRepository.save(user); // Save the updated user
        }).orElse(null); // Return null if the user doesn't exist
    }
}
