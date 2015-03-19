package Test.BL;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Persistence.SessionManagerDB;

public class SessionManagerDBTest {

	private static SessionManagerDB sessionManagerDB;	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sessionManagerDB = new SessionManagerDB();	
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
	public void testLogin() {
		Boolean test = sessionManagerDB.Login("clerix.maxime@gmail.com", "password");
		
		assertEquals(true, test);
	}


}
