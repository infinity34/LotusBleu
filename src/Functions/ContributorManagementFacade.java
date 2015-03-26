
package Functions;

import java.sql.ResultSet;
import java.util.ArrayList;




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
 * <p>Add or update the contributor of an event.</p>
 * 
 * @poseidon-object-id [I1a98ea51m14c1cdb41d3mm7126]
 * @param contributor 
 * @return 
 */
public Boolean addContributorToEvent(String myEvent,String begin,String end, String name, String firstname) {        
    	return contributorManager.addContributorToEvent(myEvent,begin, end, name, firstname);
    } 

/**
 * <p></p>
 * 
 * @poseidon-object-id [I1a98ea51m14c1cdb41d3mm70e6]
 * @param contributor 
 * @return 
 */
    public ResultSet listEvents(String name, String firstname) {    
        return contributorManager.listEvents(name, firstname);
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
 * <p>Make a user no being a contributor anymore.</p>
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
