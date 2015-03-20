package Data;

/**
 * This class represents an event
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7a9c]
 */
public class Event {

	/**
	 * <p>
	 * Represents the name of the event
	 * </p>
	 * 
	 * @poseidon-object-id [I5c276a37m14bf4d9e555mm792c]
	 */
	private String eventName;

	/**
	 * <p>
	 * Represents the room used for this event
	 * </p>
	 * 
	 * @poseidon-object-id [Im37e90f00m14bf8ad3fd2mm76d3]
	 */
	private Room eventRoom;

	/**
	 * <p>
	 * Represents the time slot of the event
	 * </p>
	 * 
	 * @poseidon-object-id [Im37e90f00m14bf8ad3fd2mm76c1]
	 */
	private TimeSlot eventTimeSlot;

	/**
	 * <p>
	 * Represents the activity which the event depends on
	 * </p>
	 * 
	 * @poseidon-object-id [Im37e90f00m14bf8ad3fd2mm76af]
	 */
	private Activity eventActivity;

	/**
	 * <p>
	 * Represents the contributor responsible of this event
	 * </p>
	 * 
	 * @poseidon-object-id [Im37e90f00m14bf8ad3fd2mm769d]
	 */
	private ContributorRole eventContributor;

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
