
package Persistence;

import java.sql.Date;

import Data.User;

/**
 * 
 * 
 */
public abstract class SessionManager {

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
	public abstract Boolean Login(String username, String password);

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
	
	public abstract void updateUser();
	
	public abstract void changePassword(String password);
	
	public abstract void registerForAYear(Date date,  boolean firstSubscription);
	
}
