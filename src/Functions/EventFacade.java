
package Functions;

import java.util.ArrayList;
import java.util.Date;

import Data.Activity;
import Data.Event;

/**
 * 
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7dda]
 */
public class EventFacade {

/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [I777ab4eam14bf4e91384mm7ca0]
 */
    private Functions.SessionFacade session;

/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [Im37e90f00m14bf8ad3fd2mm763d]
 */
    private ActivityFacade activity;
/**
 * 
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7952]
 */
    public Persistence.EventManager eventManager;

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7d5a]
 * @return 
 */
    public ArrayList<Event> getEvents() {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7d14]
 * @param String 
 * @return 
 */
    public ArrayList<Event> getEventByKeyword(String keyword) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7cd3]
 * @param String 
 * @param Date 
 * @param Date 
 * @param Boolean 
 * @param Date 
 */
    public void addEvent(String name, Date begin, Date end, Boolean recurrence, Date recurrenceEnd) {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7c92]
 * @param Event 
 */
    public void removeEvent(Event eventToRemove) {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7c51]
 * @param Event 
 */
    public void updateEvent(Event eventToUpdate) {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im37e90f00m14bf8ad3fd2mm762b]
 * @return 
 */
    public ArrayList<Activity> getActivities() {        
        // your code here
        return null;
    } 
 }
