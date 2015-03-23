package Persistence;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Data.ClassRoom;
import Data.Room;

public class RoomManagerDBTest {
	
	static private RoomManager roomManager;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		roomManager = new RoomManagerDB();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddRoom() {
		assertEquals("problème la liste n'est pas vide à l'initialisation",0,roomManager.getRooms().size());
		Room room1 = new ClassRoom(1, "my classroom", 45);
		roomManager.addRoom(room1);
		assertEquals("problème la liste n'a pas le bon nombre de pièce",1,roomManager.getRooms().size());
	}

}