package Persistence;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Data.Activity;

public class ActivityManagerBDTest {

	private static ActivityManagerBD activityManagerBD;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		activityManagerBD = new ActivityManagerBD();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		activityManagerBD = new ActivityManagerBD();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEditActivity() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteActivity() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllActivity() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateActivityStringString() {
		Activity activity = activityManagerBD.createActivity("Yoga", "We will do yoga");
		assertEquals(activity.getName(), "Yoga");
	}

}
