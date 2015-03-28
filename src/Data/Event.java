package Data;

/**
 * This class represents an event
 * Designed by Maxime
 * Developed by Prisca
 * 
 */
public class Event {

	private String eventName; //Represents the name of the event
	private int eventRoomID; //Represents the room used for this event
	private TimeSlot eventTimeSlot; //Represents the time slot of the event
	private Activity eventActivity; //Represents the activity which the event depends on
	private String eventContributorName; //Represents the contributor's name responsible of this event
	private String eventContributorFirstname; //Represents the contributor's firstname responsible of this event
	private int eventActivityID;
	private String eventContributorID;
	private int eventID;

	/**
	 * Create a new Event
	 * 
	 * @param eventName
	 * @param eventRoom
	 * @param eventTimeSlot
	 * @param eventActivity
	 * @param eventContributor
	 */
	public Event(String eventName, int eventRoomID, TimeSlot eventTimeSlot,
			Activity eventActivity, String eventContributorName, String eventContributorFirstname ) {
		super();
		this.eventName = eventName;
		this.setEventRoomID(eventRoomID);
		this.eventTimeSlot = eventTimeSlot;
		this.eventActivity = eventActivity;
		this.setEventContributorName(eventContributorName);
		this.setEventContributorFirstname(eventContributorFirstname);
	}
	
	public Event(int eventID, String eventName, int eventRoomID, TimeSlot eventTimeSlot,
			int eventActivityID, String eventContributorID) {
		super();
		this.eventID = eventID;
		this.eventName = eventName;
		this.setEventRoomID(eventRoomID);
		this.eventTimeSlot = eventTimeSlot;
		this.eventActivityID = eventActivityID;
		this.setEventContributorID(eventContributorID);
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

	public String getEventContributorName() {
		return eventContributorName;
	}

	public void setEventContributorName(String eventContributorName) {
		this.eventContributorName = eventContributorName;
	}

	public String getEventContributorFirstname() {
		return eventContributorFirstname;
	}

	public void setEventContributorFirstname(String eventContributorFirstname) {
		this.eventContributorFirstname = eventContributorFirstname;
	}
	
	public void setEventContributor(String eventContributorName,String eventContributorFirstname) {
		this.setEventContributorName(eventContributorName);
		this.setEventContributorFirstname(eventContributorFirstname);
	}

	public int getEventRoomID() {
		return eventRoomID;
	}

	public void setEventRoomID(int eventRoomID) {
		this.eventRoomID = eventRoomID;
	}
	
	public String toString(){
		return this.eventID +": " +this.eventName + ": " + this.eventTimeSlot.getBeginDate() + " to " + this.eventTimeSlot.getEndDate() ;
	}

	public int getEventActivityID() {
		return eventActivityID;
	}

	public void setEventActivityID(int eventActivityID) {
		this.eventActivityID = eventActivityID;
	}

	public int getEventID() {
		return eventID;
	}

	public void setEventID(int eventID) {
		this.eventID = eventID;
	}

	public String getEventContributorID() {
		return eventContributorID;
	}

	public void setEventContributorID(String eventContributorID) {
		this.eventContributorID = eventContributorID;
	}

}
