
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
public class EventManager {

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
    public ArrayList<Event> getEvents() {        
        return this.events;
    } 

/**
 * <p>Add an event with its name</p>
 * 
 * @param String 
 */
    public void addEvent(String eventName, Room eventRoom, TimeSlot eventTimeSlot,
			Activity eventActivity, ContributorRole eventContributor) {        
        // your code here
    } 

/**
 * <p>Load all events</p>
 * 
 */
    public void loadEvents() {        
        // your code here
    } 

/**
 * <p>Get an event with keyword</p>
 * 
 * @param String 
 */
    public void getEventsByKeyword(String keyword) {        
        // your code here
    } 
 }
