package Persistence;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Data.Activity;
import Data.Event;
import Data.TimeSlot;
import Tools.DBconnection;

/**
 * Event manager DB class
 * Designed by Maxime
 * Developped by Prisca
 */
public class EventManagerDB extends Persistence.EventManager {
	
	//Variables
	private DBconnection connection;
	private ArrayList<Data.Event> events;
	
	//Constructor
	public EventManagerDB() {
		super();
		this.connection = DBconnection.getConnection();
	}

	//Getter
	/**
	 * @return the connection
	 */
	public DBconnection getConnection() {
		return connection;
	}

	//Methods
	/**
	 * <p>Add an event with its name</p>
	 * 
	 * @param String 
	 */
	public Boolean addEvent(String eventName, int eventRoomID, TimeSlot eventTimeSlot,
			String eventActivity, String eventContributorName, String eventContributorFirstname ) {        
		
		try {
			ResultSet resultatActivity = connection.getState().executeQuery("SELECT activityID FROM ACTIVITY WHERE activityName ='" + eventActivity+"'");

			int eventActivityID = resultatActivity.getInt("activityID");
			
			ResultSet resultatContributor = connection.getState().executeQuery("SELECT usermail FROM lotusbleu.USER WHERE userName =" + eventContributorName +"AND userFirstName =" + eventContributorFirstname);
			String eventContributorID = resultatContributor.getString("usermail");
			
			connection.getState().executeQuery("INSERT INTO EVENT (activityID,usermail,roomID,eventName,beginDate,endDate,recurrence,lastrecurrence) VALUES("+ eventActivityID +",'"+ eventContributorID + "',"+ eventRoomID + ",'" + eventName + "'," + eventTimeSlot.getBeginDate() +"," + eventTimeSlot.getEndDate() + "," + eventTimeSlot.isRecurrence() + "," +eventTimeSlot.getLastReccurence() + ")");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	} 

	/**
	 * <p>Load all events</p>
	 * 
	 */
	public ArrayList<Event> getEvents() {        
	       // your code here
		try {
			ResultSet resultat = connection.getState().executeQuery(
					"SELECT * FROM lotusbleu.EVENT");
			
			
			do {
				//Create the TimeSlot object
				TimeSlot timeslot = new TimeSlot(resultat.getDate("beginDate"),resultat.getDate("endDate"),resultat.getBoolean("recurrence"),resultat.getDate("lastReccurence"));
				
				//Create the activity object
				ResultSet resultatActivity = connection.getState().executeQuery("SELECT * FROM lotusbleu.ACTIVITY WHERE activityID =" + resultat.getInt("activityID"));
				Activity activity = new Activity(resultatActivity.getString("activityName"),resultatActivity.getString("activityDescritption"));
				
				//Get the contributorRole
				ResultSet resultatContributor = connection.getState().executeQuery("SELECT * FROM lotusbleu.USER WHERE userID =" + resultat.getInt("contributorID"));
				
				
				//Add the event in the events ArrayList
				this.events.add(new Event(resultat.getString("eventName"),resultat.getInt("roomID"), timeslot, activity, resultatContributor.getString("userName"), resultatContributor.getString("userFirstName")));
			} while (resultat.next());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return events;
	} 

	/**
	 * <p>Get all events with keyword</p>
	 * 
	 * @param String 
	 * @return 
	 */
	public ArrayList<Event> getEventsByKeyword(String keyword) {
		return events;        
	        // your code here
	}

	@Override
	public Event getAnEventWithName(String name) {
		Event event = null;
		try {
			ResultSet resultEvent = connection.getState().executeQuery("SELECT * FROM EVENT WHERE eventName='"+ name+"'");
			
			//Create the activity object
			ResultSet resultatActivity = connection.getState().executeQuery("SELECT * FROM ACTIVITY WHERE activityID =" + resultEvent.getInt("activityID"));
			Activity activity = new Activity(resultatActivity.getString("activityName"),resultatActivity.getString("activityDescritption"));
			
			//Get the contributorRole
			ResultSet resultatContributor = connection.getState().executeQuery("SELECT * FROM USER WHERE mail ='" + resultEvent.getInt("usermail")+"'");
			
			
			event = new Event(resultEvent.getString("eventName"),resultEvent.getInt("eventRoomID"), new TimeSlot(resultEvent.getDate("beginDate"),resultEvent.getDate("endDate"),resultEvent.getBoolean("recurrence"),resultEvent.getDate("lastReccurence")), activity,resultatContributor.getString("userName"), resultatContributor.getString("userFirstName") );
			return event;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return event;
	}

	@Override
	public Boolean removeEvent(Event eventToRemove) {
		
		try {
			//delete FROM ACTIVITY WHERE activityID=2;
			connection.getState().executeQuery("DELETE INTO EVENT WHERE eventName="+ eventToRemove.getEventName());
			return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return false;
	}

	@Override
	public Boolean updateEvent(Event eventToUpdate, String eventName, int eventRoomID, TimeSlot eventTimeSlot,
			String eventActivity, String eventContributorName, String eventContributorFirstname) {
		
		try {
			//Get the activity with its name
			ResultSet resultActivity = connection.getState().executeQuery("SELECT * FROM lotusbleu.ACTIVITY WHERE activityName ='" + eventActivity+"'");
			
		
			int contributorID = (Integer) null;
			if (!(eventContributorName =="")&&(eventContributorFirstname=="")){
				//Get the contributorID
				ResultSet resultContributor = connection.getState().executeQuery("SELECT * FROM lotusbleu.USER WHERE userName ='" + eventContributorName + "' AND userFirstName ='"+ eventContributorFirstname +"' AND isContributor=1");
				contributorID = resultContributor.getInt("contributorID");
			}
			
			//Update the event
			connection.getState().executeUpdate(
					"UPDATE EVENT SET eventName ='" + eventName 
									+ "' AND roomID ="+ eventRoomID
									+ "' AND activityID ="+ resultActivity.getInt("activityID")
									+ "' AND contributorID ="+ contributorID
									+ " AND beginDate ="+ eventTimeSlot.getBeginDate()
									+ " AND endDate ="+ eventTimeSlot.getEndDate()
									+ " AND recurrence ="+ eventTimeSlot.getLastReccurence()
									+ " AND lastrecurrence ="+ eventTimeSlot.isRecurrence()
									+"WHERE  eventName = " + eventToUpdate.getEventName());
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	
}
