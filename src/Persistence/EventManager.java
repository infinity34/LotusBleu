
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
    public abstract void addEvent(String eventName, Room eventRoom, TimeSlot eventTimeSlot,
			Activity eventActivity, ContributorRole eventContributor);


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
	 */
    public abstract void getAnEventWithName(String name);

    /**
	 * <p>Remove an event</p>
	 * 
	 * @param String 
	 */
	public abstract void removeEvent(Event eventToRemove);

	/**
	 * <p>Update an event</p>
	 * 
	 * @param String 
	 */
	public abstract void updateEvent(Event eventToUpdate);
	
}
