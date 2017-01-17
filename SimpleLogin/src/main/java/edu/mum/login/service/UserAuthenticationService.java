/**
 * 
 */
package edu.mum.login.service;

/**
 * @author yared
 *
 */
public class UserAuthenticationService {

	
	private static final String USER_NAME = "admin";
	private static final String PASSSWORD = "test123";
	
		
	public boolean authenticateUser(String userName, String password) {
		if(userName.equals(USER_NAME) && password.equals(PASSSWORD))
			return true;
		return false;
	}
}
