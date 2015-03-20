package Data;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ActivityTest {
	
	public static Activity activity;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		activity = new Activity("Yoga","We will the best of yoga");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testActivity() {
		assertNotNull(activity);
		assertEquals(activity.getName(), "Yoga");
		assertEquals(activity.getDescription(), "We will the best of yoga");
	}

	@Test
	public void testSetName() {
		assertEquals(activity.getName(), "Yoga");
		activity.setName("Super Yoga");
		assertEquals(activity.getName(), "Super Yoga");
	}

	@Test
	public void testSetDescription() {
		assertEquals(activity.getDescription(), "We will the best of yoga");
		activity.setDescription("We will the best of super yoga");
		assertEquals(activity.getDescription(), "We will the best of super yoga");
	}

}
