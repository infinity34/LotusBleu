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
		classRoom = new ClassRoom(1,"nameOffice",15);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreationClassRoom() {
		assertNotNull(classRoom);
		assertEquals(classRoom.getRoomName(), "nameOffice");
		assertEquals(classRoom.getArea(), 1);
		assertEquals(classRoom.getMaximumNumberOfParticipant(), 15);
	}
	
	@Test
	public void testSetNameOffice() {
		assertEquals(classRoom.getRoomName(), "nameOffice");
		classRoom.setRoomName("MonOffice");
		assertEquals(classRoom.getRoomName(), "MonOffice");
	}
	
	@Test
	public void testSetAreaOffice() {
		assertEquals(classRoom.getArea(), 1);
		classRoom.setArea(2);
		assertEquals(classRoom.getArea(), 2);
	}
	
	@Test
	public void testSetParticipantNumber() {
		assertEquals(classRoom.getMaximumNumberOfParticipant(), 15);
		classRoom.setMaximumNumberOfParticipant(20);
		assertEquals(classRoom.getMaximumNumberOfParticipant(), 20);
	}

}
