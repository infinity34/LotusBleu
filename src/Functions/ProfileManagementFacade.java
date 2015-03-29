
package Functions;

import Data.User;
import Persistence.SessionManager;


public class ProfileManagementFacade {

	public SessionManager sessionManager;

    public void updateUser() {        
        this.sessionManager.updateUser();
    } 
    
    public User getUser(){
    	return this.sessionManager.GetCurrentUser();
    }
    
    public void changePassword(String password){
    	this.sessionManager.changePassword(password);
    }
    
    public ProfileManagementFacade(){
    	super();
    	this.sessionManager = SessionFacade.getSessionFacade().getSessionManager();
    }
}
