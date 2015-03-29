package Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Data.Event;
import Data.TimeSlot;

/**
 * test on the classe EventManagerDB
 * @author remy
 *
 */

public class EventManagerDBTest {
	
	private static EventManager eventManager;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		eventManager = new EventManagerDB();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test //intégration
	public void testUpdateEvent() {
		Event eventToUpdate = this.eventManager.getAnEventWithID(6);
		String eventName = "Fitness_modifié";
		int roomID = 2;
		TimeSlot eventTimeSlot = eventToUpdate.getEventTimeSlot();
		String eventActivity = "Yoga";
		String eventContributorName = "";
		String eventContributorFirstname = "";
		
		this.eventManager.updateEvent(eventToUpdate, eventName, roomID, eventTimeSlot,
				eventActivity, eventContributorName, eventContributorFirstname);
	}

}
