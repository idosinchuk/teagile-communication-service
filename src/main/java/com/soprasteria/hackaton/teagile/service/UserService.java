package com.soprasteria.hackaton.teagile.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.soprasteria.hackaton.teagile.dto.UserRequestDTO;
import com.soprasteria.hackaton.teagile.dto.UserResponseDTO;

/**
 * 
 * Service for user
 * 
 * @author Igor Dosinchuk
 *
 */
public interface UserService {

	/**
	 * Retrieve list of all users.
	 * 
	 * @return List of {@link UserResponseDTO}
	 */
	ResponseEntity<List<UserResponseDTO>> getAllUsers();

	/**
	 * Find user by id.
	 * 
	 * @param id user id
	 * @return {@link UserResponseDTO}
	 */
	ResponseEntity<UserResponseDTO> getUser(int id);

	/**
	 * Find user by email.
	 * 
	 * @param email user email
	 * @return {@link UserResponseDTO}
	 */
	ResponseEntity<UserResponseDTO> getUserByEmail(String email);

	/**
	 * Find user by email and password.
	 * 
	 * @param email    user email
	 * @param password user password
	 * @return {@link UserResponseDTO}
	 */
	ResponseEntity<UserResponseDTO> getUserByEmailAndPassword(String email, String password);

	/**
	 * Add a user.
	 * 
	 * @param userRequestDTO object to save
	 * 
	 * @return ResponseEntity
	 */
	ResponseEntity<?> addUser(UserRequestDTO userRequestDTO);

	/**
	 * Update the user.
	 * 
	 * @param id             user id
	 * @param userRequestDTO object to save
	 * 
	 * @return ResponseEntity
	 */
	ResponseEntity<?> updateUser(int id, UserRequestDTO userRequestDTO);
}
