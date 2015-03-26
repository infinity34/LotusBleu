package Data;

public class ClassRoom extends Room{

	private int maximumNumberOfParticipant;

	public ClassRoom(String name, int area,  int maximumNumberOfParticipant){
		super(name, area);
		this.maximumNumberOfParticipant = maximumNumberOfParticipant;
	}
	
	public int getMaximumNumberOfParticipant(){
		return maximumNumberOfParticipant;
	}
	
	public void setMaximumNumberOfParticipant(int maximumNumberOfParticipant){
		this.maximumNumberOfParticipant = maximumNumberOfParticipant;
	}

}
