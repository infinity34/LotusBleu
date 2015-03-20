
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
	public void Logout() {} 

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
	
	public boolean registration(){
		return true;
	}

	public void registrationCotisation() {        
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

	public static SessionFacade getSessionFacade() {
		// TODO Auto-generated method stub
		return null;
	} 

}
