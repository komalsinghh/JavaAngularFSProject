/**
 * 
 */
package com.product.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.entities.User;
import com.product.service.RegistrationService;

/**
 * The Class AuthenticationController.
 *
 * @author komalsingh01
 */
@RestController
@CrossOrigin(origins="http://localhost:4200")
public class AuthenticationController {
	
	/** The registration service. */
	@Autowired
	private RegistrationService registrationService;
	
	/**
	 * Register user.
	 *
	 * @param user the user
	 * @return the user
	 * @throws Exception the exception
	 */
	@PostMapping("/register")
	public User registerUser(@RequestBody User user) throws Exception{
		String tempEmailId=user.getUserEmail();
		if(tempEmailId!=null && !"".equals(tempEmailId)) {
			User userObj=registrationService.fetchUserByUserEmail(tempEmailId);
			if(userObj!=null) {
				throw new Exception("User with "+tempEmailId+" already exists!");
			}
		}
		User userObj=null;
		userObj=registrationService.saveUser(user);
		return userObj;
	}
	
	/**
	 * Login user.
	 *
	 * @param user the user
	 * @return the user
	 * @throws Exception the exception
	 */
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmailId=user.getUserEmail();
		String tempPassword=user.getUserPassword();
		User userObj=null;
		if(tempEmailId!=null && tempPassword!=null) {
			userObj=registrationService.fetchUserByUserEmailAndPassword(tempEmailId, tempPassword);
		}
		if(userObj==null) {
			throw new Exception("Bad Credential");
		}
		return userObj;
	}
	
}
