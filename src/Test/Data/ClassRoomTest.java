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
		classRoom = new ClassRoom(1,"nameOffice",15);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreationClassRoom() {
		assertNotNull(classRoom);
		assertEquals(classRoom.getRoomName(), "nameOffice");
		assertEquals(classRoom.getArea(), 1);
	}
	
	@Test
	public void testSetNameOffice() {
		assertEquals(office.getRoomName(), "nameOffice");
		office.setRoomName("MonOffice");
		assertEquals(office.getRoomName(), "MonOffice");
	}
	
	@Test
	public void testSetAreaOffice() {
		assertEquals(office.getArea(), 1);
		office.setArea(2);
		assertEquals(office.getArea(), 2);
	}

}
