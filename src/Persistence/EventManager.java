
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
	 * @param String 
	 */
    public abstract Boolean addEvent(String eventName, int eventRoomID, TimeSlot eventTimeSlot,
    		String eventActivity, String eventContributorName, String eventContributorFirstname );


	/**
	 * <p>Get an event with keyword</p>
	 * 
	 * @param String 
	 * @return 
	 */
    public abstract ArrayList<Event> getEventsByKeyword(String keyword);
 

	/**
	 * <p>Get an event with name</p>
	 * 
	 * @param String 
	 * @return 
	 */
   // public abstract Event getAnEventWithName(String name);

    /**
	 * <p>Remove an event</p>
	 * 
	 * @param String 
	 */
	public abstract Boolean removeEvent(Event eventToRemove);

	/**
	 * <p>Update an event</p>
	 * 
	 * @param String 
	 */
	public abstract Boolean updateEvent(Event eventToUpdate, String eventName, int eventRoomID, TimeSlot eventTimeSlot,
			String eventActivity, String eventContributorName, String eventContributorFirstname);

	public abstract ArrayList<Event> getEventsWithAName(String name);

	public abstract Event getAnEventWithID(int evenIDreceived);
	
	public abstract ArrayList<Event> getEventsForUser();
	
	public abstract void registerToEvent(Event event);
	
}
