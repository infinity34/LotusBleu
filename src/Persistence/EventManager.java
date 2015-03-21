
package Persistence;
import java.util.ArrayList;

import Data.Activity;
import Data.ContributorRole;
import Data.Event;
import Data.Room;
import Data.TimeSlot;

/**
 * Event manager class
 * Designed by Maxime
 * Developped by Prisca
 */
public abstract class EventManager {

private ArrayList<Event> events; //Represents the list of events

public EventManager() {
	super();
	this.events = new ArrayList<Event>();
}

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
    public abstract void addEvent(String eventName, int eventRoomID, TimeSlot eventTimeSlot,
			Activity eventActivity, String eventContributorName, String eventContributorFirstname );


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
    public abstract Event getAnEventWithName(String name);

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
	public abstract Boolean updateEvent(Event eventToUpdate);
	
}
