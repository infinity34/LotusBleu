package Data;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ClassRoomTest {

	private static ClassRoom classRoom;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		classRoom = new ClassRoom("name",20,15);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreationClassRoom() {
		assertNotNull(classRoom);
		assertEquals(classRoom.getRoomName(), "name");
		assertEquals(classRoom.getArea(), 20);
		assertEquals(classRoom.getMaximumNumberOfParticipant(), 15);
	}
	
	@Test
	public void testSetNameClassRoom() {
		assertEquals(classRoom.getRoomName(), "name");
		classRoom.setRoomName("name2");
		assertEquals(classRoom.getRoomName(), "name2");
	}
	
	@Test
	public void testSetAreaClassRoom() {
		assertEquals(classRoom.getArea(), 20);
		classRoom.setArea(2);
		assertEquals(classRoom.getArea(), 2);
	}
	
	@Test
	public void testSetParticipantNumberClassRoom() {
		assertEquals(classRoom.getMaximumNumberOfParticipant(), 15);
		classRoom.setMaximumNumberOfParticipant(20);
		assertEquals(classRoom.getMaximumNumberOfParticipant(), 20);
	}

}
