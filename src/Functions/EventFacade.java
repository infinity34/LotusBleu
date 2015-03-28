
package Functions;

import java.util.ArrayList;

import Data.Activity;
import Data.Event;
import Data.TimeSlot;
import Persistence.EventManagerDB;

/**
 * Event facade
 * Designed by Maxime
 * Developed by Prisca
 * 
 */
public class EventFacade {

	
	//Variables
    public Persistence.EventManager eventManager;
    private static EventFacade facade;
    
    //Constructors
    private EventFacade(){
		super();
		this.eventManager = new EventManagerDB();
	}
    
    public static EventFacade getFacade() {
		if (facade == null)
		{
			facade = new EventFacade();
		}
		
		return facade;
		
	}
    
    //Methods
   
    /**
	 * <p> Return the list of all events which are in the database</p>
	 *
	 * @return ArrayList<Event>
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
		 * <p>Add an event with its name</p>
		 * 
		 */
	    public Boolean addEvent(String eventName, int eventRoomID, TimeSlot eventTimeSlot,
	    		String eventActivity, String eventContributorName, String eventContributorFirstname ) {        
	    	
	    	return eventManager.addEvent(eventName,eventRoomID,eventTimeSlot,eventActivity,eventContributorName,eventContributorFirstname );
	    } 
	
		/**
		 * <p>Remove an event</p>
		 *
		 */
	    public Boolean removeEvent(Event eventToRemove) {        
	
	    	return eventManager.removeEvent(eventToRemove);
	    } 
	
		/**
		 * <p>Update an event</p>
		 * 
		 */
	    public Boolean updateEvent(Event eventToUpdate, String eventName, int eventRoomID, TimeSlot eventTimeSlot,
				String eventActivity, String eventContributorName, String eventContributorFirstname) {        
	    	return eventManager.updateEvent( eventToUpdate,  eventName,  eventRoomID,  eventTimeSlot,
	    			 eventActivity,  eventContributorName,  eventContributorFirstname);
	    } 
	
		/**
		 * <p>Get all activities</p>
		 * 
		 * @return 
		 */
	    public ArrayList<Activity> getAllActivities() {        
	    	return ActivityFacade.getFacade().getAllActivities();
	    } 
	    
	    /**
		 * <p>Get an event</p>
		 * 
		 */
	   /* public Event getAnEventWithName(String name) {
	    	return eventManager.getAnEventWithName(name);
	    }*/
	    
	    public  ArrayList<Event> getEventsWithAName(String name){
	    	return eventManager.getEventsWithAName(name);
	    }
	    
	    /**
		 * <p>Get an event with eventID</p>
		 * 
		 */
	    public Event getAnEventWithID(int evenIDreceived){
	    	return eventManager.getAnEventWithID(evenIDreceived);
	    }
	    
	    /**
	     * Return the list of events for which the user is not already registered 
	     * 
	     * @return ArrayList<Event> the list of events
	     */
	    public ArrayList<Event> getEventsForUser(){
	    	return eventManager.getEventsForUser();
	    }
	    
	    /**
	     * 
	     */
	    public void registerToEvent(Event event){
	    	eventManager.registerToEvent(event);
	    }
 }
