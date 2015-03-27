
package Functions;

import Persistence.SessionManager;



/**
 * 
 * 
 * @poseidon-object-id [I64875daam14c1cbbcc52mm7df9]
 */
public class RegistrationAdminFacade {

	public SessionManager sessionManager;
	
	public RegistrationAdminFacade() {
		this.sessionManager = new SessionManager();
	}
	
	
	/**
	 * 
	 * @param password 
	 * @param telephone 
	 * @param postcode 
	 * @param city 
	 * @param address 
	 * @param lastname 
	 * @param firstname 
	 * @param usermail 
	 * 
	 * @poseidon-object-id [I64875daam14c1cbbcc52mm7d71]
	 * @return 
	 */
	public boolean addRegistration(String usermail, String firstname, String lastname, String address, String city, int postcode, String telephone, String password) {        
		// your code here
		return this.sessionManager.registerForAYear(date);;
	} 

	/**
	 * <p>Does ...</p>
	 * 
	 * @poseidon-object-id [I64875daam14c1cbbcc52mm7d4c]
	 * @return 
	 */
	public boolean setRagistration() {        
		// your code here
		return false;
	} 

	/**
	 * <p>Does ...</p>
	 * 
	 * @poseidon-object-id [I64875daam14c1cbbcc52mm7d27]
	 * @return 
	 */
	public boolean deleteRegistration(String usermail) {        
		// your code here
		return false;
	} 

	/**
	 * <p>Does ...</p>
	 * @return 
	 * 
	 * @poseidon-object-id [I34add1b6m14c1cdf1de1mm7aba]
	 */
	public Object[][] displayRegistrations() {        
		// your code here
	} 
	/**
	 * 
	 * 
	 * @poseidon-object-id [I64875daam14c1cbbcc52mm7d9b]
	 */
	public Persistence.RegistrationAdminManager registrationAdminManager;

	public void getRegistration(String usermail) {
		// TODO Auto-generated method stub

	}
}
