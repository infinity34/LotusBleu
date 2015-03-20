
package Functions;

import Persistence.SessionManager;

/**
 * 
 * 
 * @poseidon-object-id [Im21c582b6m14bfa1dcb70mm77a3]
 */
public class ProfileManagementFacade {

	public SessionManager sessionManager;

    public void updateUser() {        
        this.sessionManager.updateUser();
    } 
    
    public void changePassword(String password){
    	this.sessionManager.changePassword(password);
    }
}
