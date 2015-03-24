
package Data;

/**
 * 
 * 
 * @poseidon-object-id [Im37e90f00m14bf8ad3fd2mm76c2]
 */
public abstract class Room {
	
	private int area;
	private int roomID;
	
	public Room(int roomID, int area){
		this.area = area;
		this.roomID = roomID;
	}
	
	public void setArea(int area){
		this.area = area;
	}
	
	public int getArea(){
		return this.area;
	}

	public int getRoomID() {
		return roomID;
	}

	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}
	
 }

