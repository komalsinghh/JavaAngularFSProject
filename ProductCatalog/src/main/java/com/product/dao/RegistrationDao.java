/**
 * 
 */
package com.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.entities.User;

/**
 * The Interface RegistrationDao.
 *
 * @author komalsingh01
 */
@Repository
public interface RegistrationDao extends JpaRepository<User, Integer>{
	
	/**
	 * Find by user email.
	 *
	 * @param emailId the email id
	 * @return the user
	 */
	public User findByUserEmail(String emailId);
	
	/**
	 * Find by user email and user password.
	 *
	 * @param emailId the email id
	 * @param password the password
	 * @return the user
	 */
	public User findByUserEmailAndUserPassword(String emailId, String password);
	
}
