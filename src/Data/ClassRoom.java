package Data;

public class ClassRoom extends Room{

	private int maximumNumberOfParticipant;

	public ClassRoom(int roomID, int area,  int maximumNumberOfParticipant){
		super(roomID, area);
		this.maximumNumberOfParticipant = maximumNumberOfParticipant;
	}
	
	public int getMaximumNumberOfParticipant(){
		return maximumNumberOfParticipant;
	}
	
	public void setMaximumNumberOfParticipant(int maximumNumberOfParticipant){
		this.maximumNumberOfParticipant = maximumNumberOfParticipant;
	}

}
