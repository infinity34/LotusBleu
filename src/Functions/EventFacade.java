
package Functions;

import java.util.ArrayList;
import java.util.Date;

import Data.Activity;
import Data.ContributorRole;
import Data.Event;
import Data.Room;
import Data.TimeSlot;

/**
 * Event facade
 * Designed by Maxime
 * Developed by Prisca
 * 
 */
public class EventFacade {

	//Variables
    private Functions.SessionFacade session;
    private ActivityFacade activity;
    public Persistence.EventManager eventManager;
    
    //Methods
    /**
     * <p>Does ...</p>
     * 
     * @param String 
     * @return 
     */
    public ArrayList<Event> getEvents() {        
        
        return eventManager.getEvents();
    } 

	/**
	 * <p>Does ...</p>
	 * 
	 * @param String 
	 * @return 
	 */
	    public ArrayList<Event> getEventByKeyword(String keyword) {        
	
	    	return eventManager.getEventsByKeyword(keyword);
	
	    } 
	
	/**
	 * <p>Add an event</p>
	 * 
	 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7cd3]
	 * @param String 
	 * @param Date 
	 * @param Date 
	 * @param Boolean 
	 * @param Date 
	 */
	    public void addEvent(String eventName, int eventRoomID, TimeSlot eventTimeSlot,
				Activity eventActivity, String eventContributorName, String eventContributorFirstname ) {        
	    	
	    	eventManager.addEvent(eventName,eventRoomID,eventTimeSlot,eventActivity,eventContributorName,eventContributorFirstname );
	    } 
	
	/**
	 * <p>Remove an event</p>
	 *
	 * @param Event 
	 */
	    public void removeEvent(Event eventToRemove) {        
	
	    	eventManager.removeEvent(eventToRemove);
	    } 
	
	/**
	 * <p>Does ...</p>
	 * 
	 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7c51]
	 * @param Event 
	 */
	    public void updateEvent(Event eventToUpdate) {        
	    	eventManager.updateEvent(eventToUpdate);
	    } 
	
	/**
	 * <p>Does ...</p>
	 * 
	 * @poseidon-object-id [Im37e90f00m14bf8ad3fd2mm762b]
	 * @return 
	 */
	    public ArrayList<Activity> getAllActivities() {        
	    	activity.getAllActivities();
	        return null;
	    } 
 }
