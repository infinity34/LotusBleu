
package Functions;

import java.sql.Date;

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
	
	/**
	 * Represents the SessionFacade used to implement the singleton Pattern
	 */
	private static SessionFacade session;

	/**
	 * 
	 * 
	 */
	private SessionFacade(){
		super();
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
		return this.sessionManager.GetCurrentUser();
	} 
	
	public boolean registration(){
		return true;
	}

	public void registrationCotisation() {   
		java.util.Date utilDate = new java.util.Date();
		Date currentDate = new Date(utilDate.getTime());
		if (this.sessionManager.GetCurrentUser().getMemberRole() != null) {
			Date endDate = this.sessionManager.GetCurrentUser().getMemberRole().getSubscription()
					.getEndSubscriptionDate();
			if(endDate.before(currentDate)){
				endDate = currentDate;
			}
			endDate.setYear(endDate.getYear()+1);
			System.out.println(endDate);
			this.sessionManager.registerForAYear(endDate);
		}
		else{
			currentDate.setYear(currentDate.getYear()+1);
			System.out.println(currentDate);
			this.sessionManager.registerForAYear(currentDate);
		}
	} 

	public static SessionFacade getSessionFacade() {
		if(session == null){
			session = new SessionFacade();
		}
		return session;
	}

	/**
	 * @return the sessionManager
	 */
	public SessionManager getSessionManager() {
		return sessionManager;
	} 

}
