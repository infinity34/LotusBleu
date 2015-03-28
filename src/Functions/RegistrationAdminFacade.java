
package Functions;

import Data.User;
import Persistence.SessionManager;

/**
 * 
 * @author remy
 * @Design Prisca
 */
public class RegistrationAdminFacade {

	/**
	 * 
	 */
	//public Persistence.RegistrationAdminManager registrationAdminManager;

	/**
	 * Session Manager to manage the 
	 * registration and the connection
	 */
	public SessionManager sessionManager;

	/**
	 * Facade constructor
	 * initialize the facade 
	 * with the SessionManager
	 */
	public RegistrationAdminFacade() {
		this.sessionManager = new SessionManager();
	}


	/**
	 * 
	 * Method to register a user
	 * 
	 * @param password 
	 * @param telephone 
	 * @param postcode 
	 * @param city 
	 * @param address 	 
	 * @param address2
	 * @param lastname 
	 * @param firstname 
	 * @param usermail 
	 * @param city2 
	 * @return true if the user has been added
	 */
	public boolean addRegistration(String usermail, String firstname, String lastname, String address, String address2, String city, int postcode, String telephone, String password) {        
		// your code here
		return this.sessionManager.register(usermail, firstname, lastname, address,address2, city, postcode, telephone, password);
	} 

	/**
	 * change the registration with the fields in parameter
	 * @param usermail
	 * @param firstname
	 * @param lastname
	 * @param address
	 * @param address2
	 * @param city
	 * @param postcode
	 * @param telephone
	 * @param password
	 * @param oldUser
	 * @return true if the update has executed with success
	 */
	public boolean setRagistration(String usermail, String firstname, String lastname, String address, String address2, String city, int postcode, String telephone, String password, User oldUser) {        

		return this.sessionManager.setRegistration(usermail, firstname, lastname, address,address2, city, postcode, telephone, password, oldUser);
	} 

	/**
	 * delete a user with the mail usermail
	 * @param usermail
	 * @return
	 */
	public boolean deleteRegistration(String usermail) {        
		// your code here
		return false;
	} 

	/**
	 * @return a tab of information on the 
	 * registration in DataBase
	 */
	public Object[][] displayRegistrations() {        
		return this.sessionManager.displayRegistrations();
	} 

	/**
	 * search a User with the email usermail
	 * @param usermail
	 * @return a User
	 */
	public User getRegistration(String usermail) {


	}
}
