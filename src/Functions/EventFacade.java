
package Functions;

import java.util.ArrayList;

import Data.Activity;
import Data.Event;
import Data.TimeSlot;

/**
 * Event facade
 * Designed by Maxime
 * Developed by Prisca
 * 
 */
public class EventFacade {

	//Variables
    //private Functions.SessionFacade session;
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
	 * @param String 
	 * @param Date 
	 * @param Date 
	 * @param Boolean 
	 * @param Date 
	 */
	    public Boolean addEvent(String eventName, int eventRoomID, TimeSlot eventTimeSlot,
				Activity eventActivity, String eventContributorName, String eventContributorFirstname ) {        
	    	
	    	return eventManager.addEvent(eventName,eventRoomID,eventTimeSlot,eventActivity,eventContributorName,eventContributorFirstname );
	    } 
	
	/**
	 * <p>Remove an event</p>
	 *
	 * @param Event 
	 */
	    public Boolean removeEvent(Event eventToRemove) {        
	
	    	return eventManager.removeEvent(eventToRemove);
	    } 
	
	/**
	 * <p>Update an event</p>
	 * 
	 * @param Event 
	 */
	    public Boolean updateEvent(Event eventToUpdate, String eventName, int eventRoomID, TimeSlot eventTimeSlot,
				Activity eventActivity, String eventContributorName, String eventContributorFirstname) {        
	    	return eventManager.updateEvent( eventToUpdate,  eventName,  eventRoomID,  eventTimeSlot,
	    			 eventActivity,  eventContributorName,  eventContributorFirstname);
	    } 
	
	/**
	 * <p>Get all activities</p>
	 * 
	 * @return 
	 */
	    public ArrayList<Activity> getAllActivities() {        
	    	activity.getAllActivities();
	        return null;
	    } 
	    
	    
	    public Event getAnEventWithName(String name) {
	    	return eventManager.getAnEventWithName(name);
	    }
 }
