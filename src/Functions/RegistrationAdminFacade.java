
package Functions;

import java.util.ArrayList;

import Data.User;
import Persistence.SessionManager;
import Persistence.SessionManagerDB;

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
		this.sessionManager = new SessionManagerDB();
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
	 * @param admin 
	 * @param inCharge 
	 * @param city2 
	 * @return true if the user has been added
	 */
	public boolean addRegistration(String usermail, String firstname, String lastname, String address, String address2, String city, int postcode, String telephone, String password, boolean inCharge, boolean admin) {        
		// your code here
		return this.sessionManager.register(usermail, firstname, lastname, address, address2, city, postcode, telephone, password,inCharge, admin);
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
	public boolean setRagistration( String firstname, String lastname, String address, String address2, String city, int postcode, String telephone, String password, User oldUser) {        

		return this.sessionManager.setRegistration( firstname, lastname, address,address2, city, postcode, telephone, password, oldUser);
	} 

	/**
	 * delete a user with the mail usermail
	 * @param usermail
	 * @return
	 */
	public boolean deleteRegistration(String usermail) {        
		
		return this.sessionManager.deleteRegistration(usermail);
	} 

	/**
	 * @return a tab of information on the 
	 * registration in DataBase
	 */
	public ArrayList<User> displayRegistrations() {        
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
