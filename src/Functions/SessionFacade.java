
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
	private SessionManager sessionManager;
	private static SessionFacade session;

	/**
	 * 
	 * 
	 */
	private SessionFacade(){
		sessionManager = new SessionManagerDB();
	}
	
	public static SessionFacade getSessionFacade(){
		if(session == null){
			session = new SessionFacade();
		}
		return session;
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
		return sessionManager.GetCurrentUser();
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

}
