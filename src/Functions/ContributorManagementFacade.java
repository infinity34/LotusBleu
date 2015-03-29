
package Functions;

import java.util.ArrayList;
import Data.Event;
import Persistence.ContributorManagerDB;

public class ContributorManagementFacade {
	
	private static ContributorManagementFacade facade;
    public Persistence.ContributorManager contributorManager;
    
    public ContributorManagementFacade(){
    	super();
    	this.contributorManager = new ContributorManagerDB();
    }
	
    public static ContributorManagementFacade getContributorManagementFacade(){
		if(facade == null)
			facade = new ContributorManagementFacade();
		return facade;
    }
	
	
/**
 * <p>Add or update the contributor of an event.</p>
 * 
 * @param contributor 
 * @return 
 */
public Boolean addContributorToEvent(int id, String name, String firstname) {        
    	return contributorManager.addContributorToEvent(id, name, firstname);
    } 

/**
 * <p>List all the events of a contributor</p>
 * 
 * @param contributor 
 * @return 
 */
    public ArrayList<Event> listEvents(String name, String firstname) {    
        return contributorManager.listEvents(name, firstname);
    } 

/**
 * <p>make a user become a contributor.</p>
 * 
 */
    public Boolean createContributor(String name,String firstname, String description) {        
        return contributorManager.createContributor(name,firstname,description);
    } 

    
    
    
    
/**
 * <p>Return a list of all contributor's name and first name</p>
 * 
 * @return ArrayList of all contributors
 */
    public ArrayList<String> listContributor() {        
        // your code here
        return contributorManager.listContributor();
    } 

/**
 * <p>Make a user no being a contributor anymore.</p>
 * 
 */
    public Boolean deleteContributor(String name, String firstname) {        
        return contributorManager.deleteContributor(name, firstname);
    } 
    
    
	 public Boolean deleteContributorFromEvent(int id){
		 return contributorManager.deleteContributorFromEvent(id);
	} 
    
    public ArrayList<String> searchContributor(String name, String firstname){
    	return contributorManager.searchContributor(name,firstname);
    }
    
    
 }
