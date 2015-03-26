
package Functions;

import java.util.ArrayList;

import Data.Event;
import Data.User;
import Persistence.AccessoryManagerDB;
import Persistence.ContributorManagerDB;

/**
 * 
 * 
 * @poseidon-object-id [Im16e76644m14bffa18d1dmm764c]
 */
public class ContributorManagementFacade {
	
	//private SessionManager session;
    public Persistence.ContributorManager contributorManager;
    
    public ContributorManagementFacade(){
    	super();
    	this.contributorManager = new ContributorManagerDB();
    }
	
	
	
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I1a98ea51m14c1cdb41d3mm7126]
 * @param contributor 
 * @return 
 */
	
	 
	 
    public boolean addContributor(Data.User contributor) {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I1a98ea51m14c1cdb41d3mm70e6]
 * @param contributor 
 * @return 
 */
    public ArrayList<Event> listEvents(Data.User contributor) {    
        return contributorManager.listEvents(contributor);
    } 

/**
 * <p>make a user become a contributor.</p>
 * 
 * @poseidon-object-id [I1a98ea51m14c1cdb41d3mm703d]
 */
    public Boolean createContributor(String name,String firstname) {        
        return contributorManager.createContributor(name,firstname);
    } 

/**
 * <p>Return a list of all contributor's name and first name</p>
 * 
 * @poseidon-object-id [I1a98ea51m14c1cdb41d3mm7018]
 * @return ArrayList of all contributors
 */
    public ArrayList<String> listContributor() {        
        // your code here
        return contributorManager.listContributor();
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I1a98ea51m14c1cdb41d3mm6ff3]
 */
    public Boolean deleteContributor(String name, String firstname) {        
        return contributorManager.deleteContributor(name, firstname);
    } 
    
    
    public Boolean deleteContributorFromEvent(String eventName, String name, String firstname) { 
		 return contributorManager.deleteContributorFromEvent(eventName, name, firstname);
	} 
    
/**
 * 
 * 
 * @poseidon-object-id [Im16e76644m14bffa18d1dmm75ec]
 */
    
 }
