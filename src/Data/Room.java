
package Data;

/**
 * 
 * @author remy
 * @author Prisca (design)
 *
 */
public abstract class Room {
	
	/**
	 * this is the area of the room (in scare meters)
	 */
	private int area;
	
	/**
	 * this is the name of the room
	 */
	private String name;
	
	/**
	 * Constructor of a room
	 * A room can't be instantiated
	 * @param name
	 * @param area
	 */
	public Room(String name , int area){
		this.area = area;
		this.name = name;
	}
	
	/**
	 * set the area of the room 
	 * with the area in parameter
	 * @param area
	 */
	public void setArea(int area){
		this.area = area;
	}
	
	/**
	 * 
	 * @return the area of the room
	 */
	public int getArea(){
		return this.area;
	}

	/**
	 * 
	 * @return the name of the room
	 */
	public String getRoomName() {
		return name;
	}
	
	/**
	 * set the name of the room 
	 * with the name in parameter
	 * @param name
	 */
	public void setRoomName(String name) {
		this.name = name;
	}
	
 }

