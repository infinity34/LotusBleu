package Data;

/**
 * This class represents an event
 * Designed by Maxime
 * Developed by Prisca
 * 
 */
public class Event {

	private String eventName; //Represents the name of the event
	private Room eventRoom; //Represents the room used for this event
	private TimeSlot eventTimeSlot; //Represents the time slot of the event
	private Activity eventActivity; //Represents the activity which the event depends on
	private ContributorRole eventContributor; //Represents the contributor responsible of this event

	/**
	 * Create a new Event
	 * 
	 * @param eventName
	 * @param eventRoom
	 * @param eventTimeSlot
	 * @param eventActivity
	 * @param eventContributor
	 */
	public Event(String eventName, Room eventRoom, TimeSlot eventTimeSlot,
			Activity eventActivity, ContributorRole eventContributor) {
		super();
		this.eventName = eventName;
		this.eventRoom = eventRoom;
		this.eventTimeSlot = eventTimeSlot;
		this.eventActivity = eventActivity;
		this.eventContributor = eventContributor;
	}

	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * @param eventName
	 *            the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	/**
	 * @return the eventRoom
	 */
	public Data.Room getEventRoom() {
		return eventRoom;
	}

	/**
	 * @param eventRoom
	 *            the eventRoom to set
	 */
	public void setEventRoom(Data.Room eventRoom) {
		this.eventRoom = eventRoom;
	}

	/**
	 * @return the eventTimeSlot
	 */
	public Data.TimeSlot getEventTimeSlot() {
		return eventTimeSlot;
	}

	/**
	 * @param eventTimeSlot
	 *            the eventTimeSlot to set
	 */
	public void setEventTimeSlot(Data.TimeSlot eventTimeSlot) {
		this.eventTimeSlot = eventTimeSlot;
	}

	/**
	 * @return the eventActivity
	 */
	public Data.Activity getEventActivity() {
		return eventActivity;
	}

	/**
	 * @param eventActivity
	 *            the eventActivity to set
	 */
	public void setEventActivity(Data.Activity eventActivity) {
		this.eventActivity = eventActivity;
	}

	/**
	 * @return the eventContributor
	 */
	public Data.ContributorRole getEventContributor() {
		return eventContributor;
	}

	/**
	 * @param eventContributor
	 *            the eventContributor to set
	 */
	public void setEventContributor(Data.ContributorRole eventContributor) {
		this.eventContributor = eventContributor;
	}

}
