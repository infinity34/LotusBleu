
package Functions;

import Persistence.SessionManager;
import Persistence.SessionManagerDB;

/**
 * 
 * 
 */
public class SessionFacade {



	/**
	 * 
	 * 
	 */
	public SessionManager sessionManager;

	/**
	 * 
	 * 
	 */
	public SessionFacade(){
		sessionManager = new SessionManagerDB();
	}
	
	/**
	 * <p>Does ...</p>
	 * 
	 * 
	 * @param username 
	 * @param password 
	 * @return 
	 */
	public Boolean Login(String username, String password) {        
		// your code here
		return sessionManager.Login(username,password);
	} 

	/**
	 * <p>Does ...</p>
	 * 
	 * 
	 * @return 
	 */
	public Boolean Logout() {        
		// your code here
		return null;
	} 

	/**
	 * <p>Does ...</p>
	 * 
	 * 
	 * @return 
	 */
	public Data.User GetCurrentUser() {        
		// your code here
		return null;
	} 

	/**
	 * <p>Does ...</p>
	 * 
	 * 
	 * @return 
	 */
	public Boolean Registration() {        
		// your code here
		return null;
	}

	public static SessionFacade getSessionFacade() {
		// TODO Auto-generated method stub
		return null;
	} 

}
