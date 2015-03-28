
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

	/**
	 * set a user in the database
	 * @param usermail
	 * @param firstname
	 * @param lastname
	 * @param address
	 * @param address2
	 * @param city
	 * @param postcode
	 * @param telephone
	 * @param password
	 * @return
	 */
	public abstract boolean register(String usermail, String firstname, String lastname, String address, String address2, String city, int postcode, String telephone, String password);
	
	public abstract boolean setRegistration(String firstname, String lastname, String address, String address2, String city, int postcode, String telephone, String password, User oldUser);
}
