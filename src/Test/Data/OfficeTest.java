package Data;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OfficeTest {

	private static Office office;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		office = new Office(1,3);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreationOffice() {
		assertNotNull(office);
		assertEquals(office.getRoomID(), 1);
		assertEquals(office.getArea(), 3);
	}
	
	@Test
	public void testSetNameOffice() {
		assertEquals(office.getRoomID(), 1);
		office.setRoomID(2);
		assertEquals(office.getRoomID(), 2);
	}
	
	@Test
	public void testSetAreaOffice() {
		assertEquals(office.getArea(), 3);
		office.setArea(2);
		assertEquals(office.getArea(), 2);
	}
}
