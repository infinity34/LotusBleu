package Data;

/**
 * 
 * @author remy
 * @Design Prisca
 */
public class ClassRoom extends Room{

	/**
	 * maximumNumberOfParticipant matches at the maximal number of people
	 * which can enter in the classroom 
	 */
	private int maximumNumberOfParticipant;

	/**
	 * Constructor of a classroom
	 * the classroom is defined by it name, the area of the classroom
	 * and the maximal number of attendee
	 * @param name
	 * @param area
	 * @param maximumNumberOfParticipant
	 */
	public ClassRoom(String name, int area,  int maximumNumberOfParticipant){
		super(name, area);
		this.maximumNumberOfParticipant = maximumNumberOfParticipant;
	}
	
	/**
	 * 
	 * @return the maximal number of attendee 
	 * which can enter in the classroom
	 */
	public int getMaximumNumberOfParticipant(){
		return maximumNumberOfParticipant;
	}
	
	/**
	 * set the maximal number of attendee 
	 * which can enter in the classroom
	 * with maximumNumberOfParticipant
	 * @param maximumNumberOfParticipant
	 */
	public void setMaximumNumberOfParticipant(int maximumNumberOfParticipant){
		this.maximumNumberOfParticipant = maximumNumberOfParticipant;
	}

}
