
package Functions;

import java.util.Date;

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
	 * <p>Authentify the user</p>
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
	public void Logout() {} 

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
	public void Registration() {        
		if (this.sessionManager.GetCurrentUser().getMemberRole() != null) {
			Date endDate = this.sessionManager.GetCurrentUser().getMemberRole().getSubscription()
					.getEndSubscriptionDate();
			Date currentDate = new Date();
			if(endDate.before(currentDate)){
				endDate = currentDate;
			}
			endDate.setYear(endDate.getYear()+1);
			this.sessionManager.registerForAYear(endDate);
		}
	} 

}
