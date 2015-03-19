
package Functions;

public class ProfileManagementFacade {

	public Persistence.SessionManager sessionManager;

    public void updateUser() {        
        this.sessionManager.updateUser();
    } 

    public void changePassword(String password){
    	this.sessionManager.changePassword(password);
    }
    
    
 }
