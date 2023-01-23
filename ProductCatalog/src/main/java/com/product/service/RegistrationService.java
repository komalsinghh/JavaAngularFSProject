/**
 * 
 */
package com.product.service;

import com.product.entities.User;

/**
 * The Interface RegistrationService.
 *
 * @author komalsingh01
 */
public interface RegistrationService {
	
	/**
	 * Save user.
	 *
	 * @param user the user
	 * @return the user
	 */
	public User saveUser(User user);

	/**
	 * Fetch user by user email.
	 *
	 * @param email the email
	 * @return the user
	 */
	public User fetchUserByUserEmail(String email);
	
	/**
	 * Fetch user by user email and password.
	 *
	 * @param email the email
	 * @param password the password
	 * @return the user
	 */
	public User fetchUserByUserEmailAndPassword(String email, String password);
}
