package Data;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EventTest {

	public static Event event;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		//Room room = new ClassRoom(0, null, 0);
		Activity activity = new Activity("Salsa", "Salsa description");
		TimeSlot timeslot = new TimeSlot(null, null, false, null);
		event = new Event("Salsa Night",null,timeslot,activity,null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEvent() {
		assertNotNull(event);
		assertEquals(event.getEventName(), "Salsa Night");
		assertEquals(event.getEventActivity().getName(), "Salsa");
	}

	@Test
	public void testSetEventName() {
		assertEquals(event.getEventName(), "Salsa Night");
		event.setEventName("Super Salsa Night");
		assertEquals(event.getEventName(), "Super Salsa Night");
	}

	@Test
	public void testSetEventRoom() {
		//fail("Not yet implemented");
	}

	@Test
	public void testSetEventTimeSlot() {
		//fail("Not yet implemented");
		Date beginDate = null;
		Date endDate = null;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String date1 = "22/03/2015";
		String date2 = "23/03/2015";
		try {
			beginDate = simpleDateFormat.parse(date1);
			System.out.println("begin date: "+beginDate);
			endDate = simpleDateFormat.parse(date2);
			System.out.println("end date: "+ endDate);
		} 
		catch (ParseException e) {
		e.printStackTrace();
		}
		
		assertEquals(event.getEventTimeSlot().getBeginDate(), null);
		assertEquals(event.getEventTimeSlot().getEndDate(), null);
		event.setEventTimeSlot(new TimeSlot(beginDate,endDate,false,null));
		assertEquals(event.getEventTimeSlot().getBeginDate(), beginDate);
		assertEquals(event.getEventTimeSlot().getEndDate(), endDate);
		
	}
	

	@Test
	public void testSetEventActivity() {
		assertEquals(event.getEventActivity().getName(), "Salsa");
		Activity activity = new Activity("Super Salsa", "Super Salsa description");
		event.setEventActivity(activity);
		assertEquals(event.getEventActivity().getName(), "Super Salsa");
	}

	@Test
	public void testSetEventContributor() {
		//fail("Not yet implemented");
	}

}
