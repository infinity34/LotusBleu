
package Persistence;

import java.util.Date;

import Data.User;

/**
 * 
 * 
 */
public class SessionManager {

	/**
	 * 
	 * 
	 */
	public User user;

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @param user
	 */
	public SessionManager() {
		super();
		this.user = new User();
	}

	/**
	 * <p>Does ...</p>
	 * 
	 * 
	 * @return 
	 */
	public Boolean Login(String username, String password) {        
		return null;
	} 

	/**
	 * <p>Disconnect the user</p>
	 * 
	 * 
	 * @return 
	 */
	public void logout() {
		this.user = null;
	} 

	/**
	 * <p>Does ...</p>
	 * 
	 * 
	 * @return 
	 */
	public User GetCurrentUser() {        
		return this.user;
	}
	
	public void updateUser(){}
	
	public void changePassword(String password){}
	
	public void registerForAYear(Date date){}
	
}
