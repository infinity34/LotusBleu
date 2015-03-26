
package Functions;

import java.util.ArrayList;

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
	 * return the list of all rooms
	 */
	public ArrayList<Room> loadRooms(){
		this.roomManager.loadRooms();
		return this.roomManager.getRooms();
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
	 * Update a room
	 * Update the instance in the DataBase
	 * @return 
	 */
	public void updateRoom(int roomID, int area, int numberOfParticipant) {        
		
	}

}
