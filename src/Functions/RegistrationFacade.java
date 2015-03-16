
package Functions;

import Persistence.RegistrationManager;
import Persistence.RegisterForClassSessionManagerRegistrationManagerDB;

/**
 * 
 * 
 */
public class RegistrationFacade {



	/**
	 * 
	 * 
	 */
	public Persistence.RegistrationManager registrationManager;

	/**
	 * 
	 * 
	 */
	public RegistrationFacade(){
		registrationManager = new RegisterForClassSessionManagerRegistrationManagerDB();
	}
	
	/**
	 * <p>Does ...</p>
	 * 
	 * 
	 * @param mail
	 * @param username 
	 * @param password
	 * @param ...
	 * @return 
	 */
	public Boolean register(String username, String password,String userFirstName, String address1, String address2, int postCode, String city, String phone, boolean isAdmin, boolean isResponsible, boolean isContributor, boolean isMember) {        
		// your code here
		return registrationManager.register(username, password, userFirstName, address1, address2, postCode, city, phone, isAdmin, isResponsible, isContributor, isMember);
	}  

}
