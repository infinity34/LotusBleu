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
	private ArrayList<Event> events2;
	
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
			resultatActivity.first();
			int eventActivityID = resultatActivity.getInt("activityID");
			
			ResultSet resultatContributor = connection.getState().executeQuery("SELECT mail FROM USER WHERE userName ='" + eventContributorName +"' AND userFirstName ='" + eventContributorFirstname+"'");
			resultatContributor.first();
			String eventContributorID = resultatContributor.getString("mail");
			
			if(eventTimeSlot.getLastReccurence()!=null){
				connection.getState().executeUpdate("INSERT INTO EVENT (activityID,roomID,eventName,beginDate,endDate,recurrence,lastrecurrence,usermail) VALUES("+ eventActivityID + ","+ eventRoomID + ",'" + eventName + "','" + eventTimeSlot.getBeginDate() +"','" + eventTimeSlot.getEndDate() + "'," + eventTimeSlot.isRecurrence() + ",'" +eventTimeSlot.getLastReccurence() + "','"+eventContributorID + "')");
			}
			else{
				connection.getState().executeUpdate("INSERT INTO EVENT (activityID,roomID,eventName,beginDate,endDate,recurrence,usermail) VALUES("+ eventActivityID + ","+ eventRoomID + ",'" + eventName + "','" + eventTimeSlot.getBeginDate() +"','" + eventTimeSlot.getEndDate() + "'," + eventTimeSlot.isRecurrence() + ",'"+eventContributorID + "')");
			}
			
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
				TimeSlot timeslot = new TimeSlot(resultat.getDate("beginDate"),resultat.getDate("endDate"),resultat.getInt("recurrence"),resultat.getDate("lastReccurence"));
				
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
	public ArrayList<Event> getEventsWithAName(String name) {
		events2 = new ArrayList<Event>() ;
		
		
		try {
			ResultSet resultEvent = connection.getState().executeQuery("SELECT * FROM EVENT WHERE eventName LIKE '"+ name+"%'");
			//resultEvent.first();
			String eventName;
			int eventActivityID;
			String eventContributorID; 
			TimeSlot timeSlot;
			int eventRoomID;
			while (resultEvent.next()){
				eventName = resultEvent.getString("eventName");
				timeSlot = new TimeSlot(resultEvent.getDate("beginDate"),resultEvent.getDate("endDate"),resultEvent.getInt("recurrence"),resultEvent.getDate("lastrecurrence"));
				eventActivityID = resultEvent.getInt("activityID");
				eventContributorID = resultEvent.getString("usermail");
				eventRoomID = resultEvent.getInt("roomID");
				
				events2.add(new Event(eventName,eventRoomID,timeSlot, eventActivityID, eventContributorID));

				System.out.println("Result");
				}
			return events2;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return events2;
	}

	@Override
	public Boolean removeEvent(Event eventToRemove) {
		
		try {
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
