package BL;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Persistence.RegisterForClassSessionManagerRegistrationManagerDB;

public class RegistrationManagerDBTest {
	
	private static RegisterForClassSessionManagerRegistrationManagerDB registrationManagerDB;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	registrationManagerDB = new RegisterForClassSessionManagerRegistrationManagerDB();	
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
	public void testRegister() {
		Boolean test = registrationManagerDB.register("remy", "azerty", null, null, null, 0, null, null, false, false, false, false);
		assertEquals(true, test);
	}

}
