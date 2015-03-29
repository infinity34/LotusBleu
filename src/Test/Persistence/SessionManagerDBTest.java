package Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Data.User;
/**
 * 
 * @author remy
 *
 */
public class SessionManagerDBTest {

	private static SessionManagerDB sessionManager;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		SessionManagerDBTest.sessionManager = new SessionManagerDB();
	}

	@After
	public void tearDown() throws Exception {
	}

	//ceci est un test d'integration
	@Test
	public void testRegisterUser() {
		//sessionManager.register("test@gmail.com", "rémy","Tartière", "rue bidon", "" , "Sete", 34200, "0467444444", "pwd");
	}
	
	//ceci est un test d'integration
	@Test
	public void testSetRegistration() {
		User olduser = new User();
		
		olduser.setAddress1("rue bidon");
		olduser.setAddress2("");
		olduser.setCity("Sete");
		olduser.setPassword("test");
		olduser.setPostcode("34200");
		olduser.setUsermail("test@gmail.com");
		olduser.setUsername("test");
		olduser.setUserfirstname("test");
		sessionManager.setRegistration("rémy","Tartière", "rue bidon", "" , "Sete", 34200, "0467444444", "pwd", olduser);
	}

}
