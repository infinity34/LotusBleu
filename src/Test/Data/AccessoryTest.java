package Data;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccessoryTest {

	public static Accessory accessory;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		accessory = new Accessory("TestAccessory");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAccessory() {
		assertNotNull(accessory);
		assertEquals(accessory.getAccessoryName(), "TestAccessory");
	}

	@Test
	public void testSetAccessoryName() {
		assertEquals(accessory.getAccessoryName(), "TestAccessory");
		accessory.setAccessoryName("NewNameTest");
		assertEquals(accessory.getAccessoryName(), "NewNameTest");
	}

}
