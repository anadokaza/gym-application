package com.example.demo;

import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Create
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Read
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get
    public Optional<User> getUserById(Long userId) {
        return userRepository.findById(userId);
    }

    // Update
    public User updateUser(Long userId, User updatedUser) {
        Optional<User> optionalUser = userRepository.findById(userId);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setUsername(updatedUser.getUsername());
            user.setEmail(updatedUser.getEmail());
            // Set other properties as needed
            return userRepository.save(user);
        } else {
            throw new RuntimeException("User not found with id: " + userId);
        }
    }

    // Delete
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
