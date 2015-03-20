
package Persistence;

import java.util.ArrayList;
import Data.Room;

/**
 * 
 * 
 * 
 */
public class RoomManager {

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
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I64875daam14c1cbbcc52mm7cb4]
 * @return 
 */
    public void addRoom( Room room ) {        
    	this.rooms.add(room);
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I64875daam14c1cbbcc52mm7c8f]
 * @return 
 */
    private boolean updateRoom() {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I64875daam14c1cbbcc52mm7c6a]
 * @return 
 */
    private boolean deleteRoom() {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I64875daam14c1cbbcc52mm79a6]
 */
    private void listAllRoom() {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I34add1b6m14c1cdf1de1mm7797]
 */
    private void displayRoomPlanning() {        
        // your code here
    } 
 }
