package Tools;

import static org.junit.Assert.*;

import java.sql.Statement;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Tools.DBconnection;

public class DBconnectionTest {

	private DBconnection con;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
	public void testGetConnection() {
		con = DBconnection.getConnection();
		assertNotNull("la connection est nulle",con);
	}

	@Test
	public void testGetState() {
		con = DBconnection.getConnection();
		Statement state = con.getState();
		assertNull("le statement est nulle", state);
	}

}
