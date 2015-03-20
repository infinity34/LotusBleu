
package Data;

/**
 * 
 * 
 * @poseidon-object-id [Im37e90f00m14bf8ad3fd2mm76c2]
 */
public abstract class Room {
	
	private int area;
	private String name;
	
	public Room(int area, String name){
		this.area = area;
		this.name = name;
	}
	
	public void setArea(int area){
		this.area = area;
	}
	
	public void setRoomName(String name){
		this.name = name;
	}
	
	public int getArea(){
		return this.area;
	}
	
	public String getRoomName(){
		return this.name;
	}
	
 }

