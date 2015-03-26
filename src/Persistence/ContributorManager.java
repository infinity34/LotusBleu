
package Persistence;

import java.util.ArrayList;

import Data.ContributorRole;
import Data.Event;
import Data.User;

/**
 * Contributor
 * Designed by Remy
 * Developed by Lyvia
 */
public abstract class ContributorManager {
	
	public abstract boolean addContributor(Data.User contributor);
     
    public abstract ArrayList<Event> listEvents(Data.User contributor);

    public abstract Boolean createContributor(String name, String firstname);
    
    public abstract ArrayList<String> listContributor(); 

    public abstract Boolean deleteContributor(String name, String firstname);
    
    public abstract Boolean deleteContributorFromEvent(String eventName, String name, String firstname);

 }
