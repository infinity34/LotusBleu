package Data;

public class ClassRoom extends Room{

	private int maximumNumberOfParticipant;

	public ClassRoom(int area, String name,  int maximumNumberOfParticipant){
		super(area, name);
		this.maximumNumberOfParticipant = maximumNumberOfParticipant;
	}
	
	public int getMaximumNumberOfParticipant(){
		return maximumNumberOfParticipant;
	}
	
	public void setMaximumNumberOfParticipant(int maximumNumberOfParticipant){
		this.maximumNumberOfParticipant = maximumNumberOfParticipant;
	}

}
