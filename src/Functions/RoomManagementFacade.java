
package Functions;


import Data.Room;
import Persistence.RoomManager;
import Persistence.RoomManagerDB;

/**
 * 
 * @author remy
 *
 */
public class RoomManagementFacade {

	/**
	 * roomManager
	 * allows to manage the persistence of the Room
	 */
	public RoomManager roomManager;

	/**
	 * Constructor
	 * 
	 */
	public RoomManagementFacade(){
		super();
		//TODO
		this.roomManager = new RoomManagerDB();
	}

	/**
	 * @return the roomManager
	 */
	public RoomManager getRoomManager(){
		return this.roomManager;
	}


	/**
	 * set the room manager with the roomManager
	 * in parameter
	 */
	public void setRoomManager(RoomManager roomManager){
		this.roomManager = roomManager;
	}

	/**
	 * return an array with the rooms field
	 */
	public String[][] loadRooms(){
		this.roomManager.loadRooms();
		return this.roomManager.loadRoomsView();
	}


	/**
	 * add a room
	 * create an instance in the dataBase
	 * and add the room at the list
	 */
	public boolean addRoom(String name, int area, int numberOfParticipant){
		System.out.println(name+", "+area +", "+numberOfParticipant);
		return this.roomManager.addRoom(name, area, numberOfParticipant);
	}

	/**
	 * add a room
	 * create an instance in the dataBase
	 * and add the room at the list
	 */
	public boolean addRoom(String name, int area){
		return this.roomManager.addRoom(name, area);
	}

	/**
	 * Delete a room
	 * Delete the instance in the DataBase
	 * and Delete the room in list of the roomManager
	 */
	public boolean deleteRoom(Room room) {        
		return this.roomManager.removeRoom(room);
	} 

	/**
	 * Delete a room
	 * Delete the instance in the DataBase
	 * and Delete the room with the name name
	 * in list of the roomManager

	 */
	public boolean deleteRoom(String name) {        
		return this.roomManager.removeRoom(name);
	} 

	/**
	 * Update a room
	 * Update the instance in the DataBase

	 */
	public boolean updateRoom(String name, int area, Room room) {        
		return this.roomManager.updateRoom(name, area, room);
	}

	/**
	 * get a room
	 * @return room
	 * @param name
	 */
	public Room getRoom(String name) {        
		return this.roomManager.getRoom(name);
	}

}
