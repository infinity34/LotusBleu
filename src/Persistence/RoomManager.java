package Persistence;

import java.util.ArrayList;

import Data.ClassRoom;
import Data.Room;
/**
 * 
 * @author remy
 * @Design Prisca
 */
public abstract class RoomManager {

	/**
	 * The ArrayList (rooms) contains all the rooms
	 */
	private ArrayList<Room> rooms;

	/**
	 * Constructor of a Room Manager
	 * initialize the room list
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
	 * set the room list
	 * @param rooms
	 */
	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}

	/**
	 * Add the room (in parameter)
	 * to the list
	 * @param room
	 */
	public void addListRoom( Room room ) {        
		this.rooms.add(room);
	} 

	/**
	 * Delete the room with the name "name"
	 * of the list 
	 * @param name
	 */
	public void removeListRoom( String name ) {     
		for(int i=0; i<rooms.size();i++){
			if(rooms.get(i).getRoomName().equals(name)){
				rooms.remove(i);
			}
		}
	} 
	
	public abstract boolean addRoom(String name, int area, int numberOfParticipant);

	public abstract boolean addRoom(String name, int area);

	public abstract void loadRooms();

	public abstract Room getRoom(String name);

	public abstract boolean removeRoom(Room room);

	public abstract boolean removeRoom(String name);

	public void removeListRoom(Room room) {
		this.rooms.remove(room);
	}

	/**
	 * return an array with the field of rooms
	 * allows the display of the rooms
	 */
	public String[][] loadRoomsView(){
		this.loadRooms();

		String[][] tab = new String[rooms.size()][3];

		for( int i=0; i<rooms.size(); i++){
			tab[i][0] = rooms.get(i).getRoomName();
			tab[i][1] = Integer.toString(rooms.get(i).getArea());
			if (rooms.get(i).getClass().getSimpleName().equals("ClassRoom")){
				tab[i][2] = Integer.toString(((ClassRoom) rooms.get(i)).getMaximumNumberOfParticipant());
			}
			else{
				tab[i][2] = null;
			}
		}
		return tab;
	}

	/**
	 * update a room oldroom
	 * with a name, and an area
	 * @param String name
	 * @param int area
	 * @param Room oldroom
	 * @return true if the update 
	 * has found the old room
	 * and if it has modified its fields
	 */
	public abstract boolean updateRoom(String name, int area, Room oldroom);


}
