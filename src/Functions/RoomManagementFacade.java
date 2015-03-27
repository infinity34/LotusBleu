
package Functions;

import java.util.ArrayList;
import java.util.Arrays;

import Data.ClassRoom;
import Data.Room;
import Persistence.RoomManager;
import Persistence.RoomManagerDB;

/**
 * 
 * 
 */
public class RoomManagementFacade {

	/**
	 * 
	 * 
	 */
	public RoomManager roomManager;

	/**
	 * 
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
	 * @param the roomManager
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
	public void addRoom(String name, int area, int numberOfParticipant){
		System.out.println(name+", "+area +", "+numberOfParticipant);
		this.roomManager.addRoom(name, area, numberOfParticipant);
	}

	/**
	 * add a room
	 * create an instance in the dataBase
	 * and add the room at the list
	 */
	public void addRoom(String name, int area){
		this.roomManager.addRoom(name, area);
	}
	
	/**
	 * Delete a room
	 * Delete the instance in the DataBase
	 * and Delete the room in list of the roomManager
	 * @return 
	 */
	public void deleteRoom(Room room) {        
		this.roomManager.removeRoom(room);
	} 
	
	/**
	 * Delete a room
	 * Delete the instance in the DataBase
	 * and Delete the room with the name name
	 * in list of the roomManager
	 * @return 
	 */
	public void deleteRoom(String name) {        
		this.roomManager.removeRoom(name);
	} 
	
	/**
	 * Update a room
	 * Update the instance in the DataBase
	 * @return 
	 */
	public void updateRoom(String name, int area, Room room) {        
		this.roomManager.updateRoom(name, area, room);
	}
	
	/**
	 * get a room
	 * @return room
	 * @param String name
	 */
	public Room getRoom(String name) {        
		return this.roomManager.getRoom(name);
	}

}
