
package Persistence;

import java.util.ArrayList;
import Data.Room;

/**
 * 
 * 
 * 
 */
public abstract class RoomManager {

	/**
	 * The ArrayList (rooms) contains all the rooms
	 */
	private ArrayList<Room> rooms;

	/**
	 * 
	 */
	public RoomManager() {
		this.setRooms(new ArrayList<Room>());
	}


	/**
	 * @return the room list
	 */
	public ArrayList<Room> getRooms() {
		return this.rooms;
	}

	/**
	 * @param set the room list
	 */
	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}

	/**
	 * 
	 * @return 
	 */
	public void addListRoom( Room room ) {        
		this.rooms.add(room);
	} 

	public abstract void addRoom(int roomID, int area, int numberOfParticipant);
	
	public abstract void addRoom(int roomID, int area);

	public abstract void loadRooms();

	public abstract void removeRoom(Room room);

	public void removeListRoom(Room room) {
		this.rooms.remove(room);
	}

}
