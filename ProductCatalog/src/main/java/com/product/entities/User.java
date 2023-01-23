/**
 * 
 */
package com.product.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * The Class User.
 *
 * @author komalsingh01
 */
@Entity
public class User {
	
	/** The user id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	/** The user first name. */
	private String userFirstName;
	
	/** The user last name. */
	private String userLastName;
	
	/** The user email. */
	private String userEmail;
	
	/** The user password. */
	private String userPassword;
	
	/**
	 * Instantiates a new user.
	 */
	public User() {
	}
	
	/**
	 * Instantiates a new user.
	 *
	 * @param userId the user id
	 * @param userFirstName the user first name
	 * @param userLastName the user last name
	 * @param userEmail the user email
	 * @param userPassword the user password
	 */
	public User(int userId, String userFirstName, String userLastName, String userEmail, String userPassword) {
		super();
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}
	
	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public int getUserId() {
		return userId;
	}
	
	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	/**
	 * Gets the user first name.
	 *
	 * @return the user first name
	 */
	public String getUserFirstName() {
		return userFirstName;
	}
	
	/**
	 * Sets the user first name.
	 *
	 * @param userFirstName the new user first name
	 */
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	
	/**
	 * Gets the user last name.
	 *
	 * @return the user last name
	 */
	public String getUserLastName() {
		return userLastName;
	}
	
	/**
	 * Sets the user last name.
	 *
	 * @param userLastName the new user last name
	 */
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	
	/**
	 * Gets the user email.
	 *
	 * @return the user email
	 */
	public String getUserEmail() {
		return userEmail;
	}
	
	/**
	 * Sets the user email.
	 *
	 * @param userEmail the new user email
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	/**
	 * Gets the user password.
	 *
	 * @return the user password
	 */
	public String getUserPassword() {
		return userPassword;
	}
	
	/**
	 * Sets the user password.
	 *
	 * @param userPassword the new user password
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userEmail=" + userEmail + ", userPassword=" + userPassword + "]";
	}
	
}
