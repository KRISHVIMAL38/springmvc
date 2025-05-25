package com.usermanagementservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.usermanagementservice.entity.User;
import com.usermanagementservice.service.UserService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    // SLF4J Logger
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    public UserController(UserService service) {
        this.userService = service;
        logger.info("UserController initialized with UserService");
    }

    @GetMapping("/")
    public ResponseEntity<?> getAllUsers() {
        logger.info("Request received to get all users");
        
        try {
            List<User> users = userService.getAllUsers();
            logger.info("Successfully retrieved {} users", users.size());
            return new ResponseEntity<>(users, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error occurred while retrieving all users: {}", e.getMessage(), e);
            String errorMessage = "Failed to retrieve users: " + e.getMessage();
            return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{Id}")
    public ResponseEntity<?> getUserById(@PathVariable("Id") long Id) {
        logger.info("Request received to get user by ID: {}", Id);
        
        try {
            User user = userService.getUserById(Id);
            if (user != null) {
                logger.info("Successfully retrieved user with ID: {}", Id);
                return new ResponseEntity<>(user, HttpStatus.OK);
            } else {
                logger.warn("User not found with ID: {}", Id);
                String errorMessage = "User not found with ID: " + Id;
                return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            logger.error("Error occurred while retrieving user with ID {}: {}", Id, e.getMessage(), e);
            String errorMessage = "Failed to retrieve user with ID " + Id + ": " + e.getMessage();
            return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/")
    public ResponseEntity<?> addUser(@RequestBody User user) {
        logger.info("Request received to add new user: {}", user != null ? user.toString() : "null");
        
        try {
            User createdUser = userService.addUser(user);
            if (createdUser != null) {
                logger.info("Successfully created user with ID: {}", createdUser.getId());
                return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
            } else {
                logger.warn("Failed to create user");
                String errorMessage = "Failed to create user - service returned null";
                return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e) {
            logger.error("Error occurred while creating user: {}", e.getMessage(), e);
            String errorMessage = "Failed to create user: " + e.getMessage();
            return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{Id}")
    public ResponseEntity<?> updateUser(@RequestBody User user, @PathVariable("Id") long Id) {
        logger.info("Request received to update user with ID: {}", Id);
        
        try {
            User updatedUser = userService.updateUser(user, Id);
            if (updatedUser != null) {
                logger.info("Successfully updated user with ID: {}", Id);
                return new ResponseEntity<>(updatedUser, HttpStatus.OK);
            } else {
                logger.warn("User not found for update with ID: {}", Id);
                String errorMessage = "User not found for update with ID: " + Id;
                return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            logger.error("Error occurred while updating user with ID {}: {}", Id, e.getMessage(), e);
            String errorMessage = "Failed to update user with ID " + Id + ": " + e.getMessage();
            return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{Id}")
    public ResponseEntity<?> deleteUser(@PathVariable("Id") Long Id) {
        logger.info("Request received to delete user with ID: {}", Id);
        
        try {
            User deletedUser = userService.deleteUser(Id);
            if (deletedUser != null) {
                logger.info("Successfully deleted user with ID: {}", Id);
                return new ResponseEntity<>("User deleted successfully with ID: " + Id, HttpStatus.OK);
            } else {
                logger.warn("User not found for deletion with ID: {}", Id);
                String errorMessage = "User not found for deletion with ID: " + Id;
                return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            logger.error("Error occurred while deleting user with ID {}: {}", Id, e.getMessage(), e);
            String errorMessage = "Failed to delete user with ID " + Id + ": " + e.getMessage();
            return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}