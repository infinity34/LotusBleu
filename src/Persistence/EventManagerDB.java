package Persistence;

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
			Activity eventActivity, String eventContributorName, String eventContributorFirstname ) {        
		
		try {
			ResultSet resultatActivity = connection.getState().executeQuery("SELECT activityID FROM ACTIVITY WHERE activityName ='" + eventActivity.getName()+"'");
			int eventActivityID = resultatActivity.getInt("activityID");
			
			ResultSet resultatContributor = connection.getState().executeQuery("SELECT userID FROM lotusbleu.USER WHERE userName ='" + eventContributorName +"' AND userFirstName = '" + eventContributorFirstname+"'");
			int eventContributorID = resultatContributor.getInt("userID");
			
			connection.getState().executeUpdate("INSERT INTO EVENT (activityID,contributorID,roomID,eventName,beginDate,endDate,recurrence,lastrecurrence) VALUES("+ eventActivityID +","+ eventContributorID + ","+ eventRoomID + ",'" + eventName + "'," + eventTimeSlot.getBeginDate() +"," + eventTimeSlot.getEndDate() + "," + eventTimeSlot.isRecurrence() + "," +eventTimeSlot.getLastReccurence() + ")");
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
			
			
			while (resultat.next()) {
				//Create the TimeSlot object
				TimeSlot timeslot = new TimeSlot(resultat.getDate("beginDate"),resultat.getDate("endDate"),resultat.getBoolean("recurrence"),resultat.getDate("lastReccurence"));
				
				//Create the activity object
				ResultSet resultatActivity = connection.getState().executeQuery("SELECT * FROM ACTIVITY WHERE activityID = '" + resultat.getInt("activityID")+"'");
				Activity activity = new Activity(resultatActivity.getString("activityName"),resultatActivity.getString("activityDescritption"));
				
				//Get the contributorRole
				ResultSet resultatContributor = connection.getState().executeQuery("SELECT * FROM USER WHERE userID ='" + resultat.getInt("contributorID")+"'");
				
				
				//Add the event in the events ArrayList
				this.events.add(new Event(resultat.getString("eventName"),resultat.getInt("roomID"), timeslot, activity, resultatContributor.getString("userName"), resultatContributor.getString("userFirstName")));
			}
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
			ResultSet resultEvent = connection.getState().executeQuery("SELECT * FROM EVENT WHERE eventName= '"+ name+"'");
			
			//Create the activity object
			ResultSet resultatActivity = connection.getState().executeQuery("SELECT * FROM ACTIVITY WHERE activityID ='" + resultEvent.getInt("activityID")+"'");
			Activity activity = new Activity(resultatActivity.getString("activityName"),resultatActivity.getString("activityDescritption"));
			
			//Get the contributorRole
			ResultSet resultatContributor = connection.getState().executeQuery("SELECT * FROM USER WHERE userID = '" + resultEvent.getInt("contributorID")+"'");
			
			
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
			connection.getState().executeUpdate("DELETE FROM EVENT WHERE eventName='"+ eventToRemove.getEventName()+"'");
			return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return false;
	}

	@Override
	public Boolean updateEvent(Event eventToUpdate, String eventName, int eventRoomID, TimeSlot eventTimeSlot,
			Activity eventActivity, String eventContributorName, String eventContributorFirstname) {
		
		try {
			//Get the activityID
			ResultSet resultatActivity = connection.getState().executeQuery("SELECT * FROM ACTIVITY WHERE activityName ='" + eventActivity.getName()+"'");
			
			//Get the contributorID
			ResultSet resultatContributor = connection.getState().executeQuery("SELECT * FROM USER WHERE userName = '" + eventContributorName + "' AND userFirstName = '"+ eventContributorFirstname +"'");
			
			connection.getState().executeUpdate(
					"UPDATE EVENT SET eventName = '" + eventName 
									+ "' AND roomID ="+ eventRoomID
									+ " AND activityID ="+ resultatActivity.getString("activityID")
									+ " AND contributorID ="+ resultatContributor.getString("userID")
									+ " AND beginDate ="+ eventTimeSlot.getBeginDate()
									+ " AND endDate ="+ eventTimeSlot.getEndDate()
									+ " AND recurrence ="+ eventTimeSlot.getLastReccurence()
									+ " AND lastrecurrence ="+ eventTimeSlot.isRecurrence()
									+"WHERE  eventName = '" + eventToUpdate.getEventName()+"'");
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	
}
