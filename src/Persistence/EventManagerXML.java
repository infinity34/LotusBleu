
package Persistence;

import java.util.ArrayList;

import Data.Activity;
import Data.Event;
import Data.TimeSlot;

/**
 * 
 * 
 * @poseidon-object-id [I777ab4eam14bf4e91384mm7b6b]
 */
public class EventManagerXML extends Persistence.EventManager {

	@Override
	public ArrayList<Event> getEvents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean addEvent(String eventName, int eventRoomID, TimeSlot eventTimeSlot,
			Activity eventActivity, String eventContributorName, String eventContributorFirstname ) {
				return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Event> getEventsByKeyword(String keyword) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Event getAnEventWithName(String name) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean removeEvent(Event eventToRemove) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean updateEvent(Event eventToUpdate, String eventName, int eventRoomID, TimeSlot eventTimeSlot,
			String eventActivity, String eventContributorName, String eventContributorFirstname) {
		return null;
		// TODO Auto-generated method stub
		
	}
 }
