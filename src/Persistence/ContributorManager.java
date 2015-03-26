
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

    public abstract void createContributor();
    
    public abstract ArrayList<User> listContributor(); 

    public abstract void deleteContributorEvent(Event myEvent, ContributorRole myContributor);
    
    public abstract Boolean deleteContributorEventFromEvent(String eventName, String name, String firstname);

 }
