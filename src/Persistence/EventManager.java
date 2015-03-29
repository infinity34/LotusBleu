
package Persistence;
import java.util.ArrayList;

import Data.Event;
import Data.TimeSlot;

/**
 * Event manager class
 * Designed by Maxime
 * Developped by Prisca
 */
public abstract class EventManager {


	/**
	 * <p> Return the list of all events which are in the database</p>
	 *
	 * @return ArrayList<Event>
	 */
    public abstract ArrayList<Event> getEvents();

	/**
	 * <p>Add an event with its name</p>
	 *  
	 * @param eventName 
	 * @param eventRoomID 
	 * @param eventTimeSlot 
	 * @param eventActivity 
	 * @param eventContributorName 
	 * @param eventContributorFirstname 
	 */
    public abstract Boolean addEvent(String eventName, int eventRoomID, TimeSlot eventTimeSlot,
    		String eventActivity, String eventContributorName, String eventContributorFirstname );


	/**
	 * <p>Get an event with keyword</p>
	 * 
	 * @param keyword 
	 */
    public abstract ArrayList<Event> getEventsByKeyword(String keyword);
 

   // public abstract Event getAnEventWithName(String name);

    /**
	 * <p>Remove an event</p>
	 * 
	 * @param eventToRemove 
	 */
	public abstract Boolean removeEvent(Event eventToRemove);

	/**
	 * <p>Update an event</p>
	 * 
	 * @param eventToUpdate 
	 * @param eventName 
	 * @param eventRoomID 
	 * @param eventTimeSlot 
	 * @param eventActivity 
	 * @param eventContributorName 
	 * @param eventContributorFirstname 
	 */
	public abstract Boolean updateEvent(Event eventToUpdate, String eventName, int eventRoomID, TimeSlot eventTimeSlot,
			String eventActivity, String eventContributorName, String eventContributorFirstname);

	public abstract ArrayList<Event> getEventsWithAName(String name);

	public abstract Event getAnEventWithID(int evenIDreceived);
	
	public abstract ArrayList<Event> getEventsForUser();
	
	public abstract ArrayList<Event> getMyEvents();
	
	public abstract void registerToEvent(Event event);
	
	public abstract void cancelRegistrationToEvent(Event event);
	
}
