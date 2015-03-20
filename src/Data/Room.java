
package Data;

/**
 * 
 * 
 * @poseidon-object-id [Im37e90f00m14bf8ad3fd2mm76c2]
 */
public abstract class Room {
	
	private int area;
	private int numberOfParticipant;
	private int roomID;
	private String roomType;
	
	public Room(int roomID, int area, int numberOfParticipant, String roomType){
		this.area = area;
		this.roomID = roomID;
		this.numberOfParticipant = numberOfParticipant;
		this.roomType = roomType;
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

	public int getNumberOfParticipant() {
		return numberOfParticipant;
	}

	public void setNumberOfParticipant(int numberOfParticipant) {
		this.numberOfParticipant = numberOfParticipant;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
 }

