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
	public void testAddListRoom() {
		assertEquals("problème la liste n'est pas vide à l'initialisation",0,roomManager.getRooms().size());
		Room room1 = new ClassRoom(1,15, 45);
		roomManager.addListRoom(room1);
		assertEquals("problème la liste n'a pas le bon nombre de pièce",1,roomManager.getRooms().size());
	}
	
	
	@Test
	public void testLoadRooms() {
		assertEquals("problème la liste n'est pas vide à l'initialisation",0,roomManager.getRooms().size());
		roomManager.loadRooms();
		assertNotEquals("problème la liste est vide à l'initialisation",0,roomManager.getRooms().size());
		assertNotEquals("problème la liste ne fait pas la taille voulu (verifier avec requete sur la base si elle n'a pas evoluer)",3,roomManager.getRooms().size());
	}
	
	@Test
	public void testAddRoom() {
		
		Room room = new ClassRoom(5,20,25);
		roomManager.addRoom(room);
	}
	

}
