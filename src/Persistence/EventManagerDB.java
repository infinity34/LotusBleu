package Persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Data.Activity;
import Data.ContributorRole;
import Data.Event;
import Data.Room;
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
	public void addEvent(String eventName, Room eventRoom, TimeSlot eventTimeSlot,
			Activity eventActivity, ContributorRole eventContributor) {        
	        // your code heres
		
		/*try {
			connection.getState().executeQuery("INSERT INTO EVENT VALUES("+ eventName +","+ eventRoom.getRoomID() + ","+?,?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	} 

	/**
	 * <p>Load all events</p>
	 * 
	 */
	public void loadEvents() {        
	 /**       // your code here
		try {
			ResultSet resultat = connection.getState().executeQuery(
					"SELECT * FROM lotusbleu.EVENT");
			
			
			do {
				//Create the room object
				ResultSet resultatRoom = connection.getState().executeQuery("SELECT * FROM lotusbleu.ROOM WHERE roomID =" + resultat.getInt("roomID"));
				Room room = new Room(resultatRoom.getInt("roomID"),resultatRoom.getInt("roomArea"),resultatRoom.getInt("numberOfParticipant"),resultatRoom.getString("roomType"));
				//Create the timeslot object
				TimeSlot timeslot = new TimeSlot(resultat.getDate("beginDate"),resultat.getDate("endDate"),resultat.getBoolean("recurrence"),resultat.getDate("lastReccurence"));
				
				//Create the activity object
				ResultSet resultatActivity = connection.getState().executeQuery("SELECT * FROM lotusbleu.ACTIVITY WHERE activityID =" + resultat.getInt("activityID"));

				//Create the contributorRole object
				
				//Add the event in the events arraylist
				this.events.add(new Event(resultat.getString("eventName"),room, timeslot, activity, contributor));
			} while (resultat.next());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		**/
	} 

	/**
	 * <p>Get all events with keyword</p>
	 * 
	 * @param String 
	 */
	public void getEventsByKeyword(String keyword) {        
	        // your code here
	} 
	
}
