
package Persistence;

import java.util.ArrayList;

import Data.ClassRoom;
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
	
	public void removeListRoom( String name ) {     
		for(int i=0; i<rooms.size();i++){
			if(rooms.get(i).getRoomName().equals(name)){
				rooms.remove(i);
			}
		}
	} 

	public abstract void addRoom(String name, int area, int numberOfParticipant);
	
	public abstract void addRoom(String name, int area);

	public abstract void loadRooms();
	
	public abstract Room getRoom(String name);

	public abstract void removeRoom(Room room);
	
	public abstract void removeRoom(String name);

	public void removeListRoom(Room room) {
		this.rooms.remove(room);
	}
	
	/**
	 * return an array with the field of rooms
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
	 * update the room
	 */
	public abstract void updateRoom(String name, int area, Room oldroom);


}
