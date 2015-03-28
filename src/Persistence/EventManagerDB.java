package Persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Data.Activity;
import Data.Event;
import Data.TimeSlot;
import Functions.SessionFacade;
import Tools.DBconnection;

/**
 * Event manager DB class Designed by Maxime Developped by Prisca
 */
public class EventManagerDB extends Persistence.EventManager {

	// Variables
	private DBconnection connection;
	private ArrayList<Data.Event> events;

	public EventManagerDB() {
		super();
		this.connection = DBconnection.getConnection();
	}

	// Getter
	/**
	 * @return the connection
	 */
	public DBconnection getConnection() {
		return connection;
	}

	// Methods
	/**
	 * <p>
	 * Add an event with its name
	 * </p>
	 * 
	 * @param String
	 */
	public Boolean addEvent(String eventName, int eventRoomID,
			TimeSlot eventTimeSlot, String eventActivity,
			String eventContributorName, String eventContributorFirstname) {

		try {
			ResultSet resultatActivity = connection.getState().executeQuery(
					"SELECT activityID FROM ACTIVITY WHERE activityName ='"
							+ eventActivity + "'");

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
	 * <p>
	 * Load all events
	 * </p>
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
	 * <p>
	 * Get all events with keyword
	 * </p>
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
		events = new ArrayList<Event>() ;
		
		
		try {
			ResultSet resultEvent = connection.getState().executeQuery("SELECT * FROM EVENT WHERE eventName LIKE '"+ name+"%'");
			//resultEvent.first();
			String eventName;
			int eventActivityID;
			String eventContributorID; 
			TimeSlot timeSlot;
			int eventRoomID;
			int eventID;
			while (resultEvent.next()){
				eventName = resultEvent.getString("eventName");
				timeSlot = new TimeSlot(resultEvent.getDate("beginDate"),resultEvent.getDate("endDate"),resultEvent.getInt("recurrence"),resultEvent.getDate("lastrecurrence"));
				eventActivityID = resultEvent.getInt("activityID");
				eventContributorID = resultEvent.getString("usermail");
				eventRoomID = resultEvent.getInt("roomID");
				eventID = resultEvent.getInt("eventID");
				
				events.add(new Event(eventID,eventName,eventRoomID,timeSlot, eventActivityID, eventContributorID));
				}
			return events;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return events;
	}
	
	@Override
	public Event getAnEventWithID(int evenIDreceived){
		
		Event event = null ;
		
		
		try {
			ResultSet resultEvent = connection.getState().executeQuery("SELECT * FROM EVENT WHERE eventID = "+ evenIDreceived );
			resultEvent.first();
			
			String eventName = resultEvent.getString("eventName");
			TimeSlot timeSlot = new TimeSlot(resultEvent.getDate("beginDate"),resultEvent.getDate("endDate"),resultEvent.getInt("recurrence"),resultEvent.getDate("lastrecurrence"));
			int eventActivityID = resultEvent.getInt("activityID");
			String eventContributorID = resultEvent.getString("usermail");
			int eventRoomID = resultEvent.getInt("roomID");
			int eventID = resultEvent.getInt("eventID");
			
			ResultSet resultActivity = connection.getState().executeQuery("SELECT * FROM ACTIVITY WHERE activityID = "+ eventActivityID );
			resultActivity.first();
			Activity activity = new Activity(resultActivity.getString("activityName"), resultActivity.getString("activityDescritption"));
			
			ResultSet resultContributor = connection.getState().executeQuery("SELECT * FROM USER WHERE mail = '"+ eventContributorID +"'" );
			resultContributor.first();
			String contributorName = resultContributor.getString("userName");
			String contributorFirstName = resultContributor.getString("userFirstName");
			event = new Event(eventID,eventName,eventRoomID,timeSlot,eventActivityID, activity, eventContributorID,contributorName,contributorFirstName);
				
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
			connection.getState().executeUpdate("DELETE FROM EVENT WHERE eventID="+ eventToRemove.getEventID());

			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}


	public Boolean updateEvent(Event eventToUpdate, String eventName, int eventRoomID, TimeSlot eventTimeSlot,
			String eventActivity, String eventContributorName, String eventContributorFirstname) {
		
		try {
			//Get the activity with its name
			ResultSet resultActivity = connection.getState().executeQuery("SELECT * FROM lotusbleu.ACTIVITY WHERE activityName ='" + eventActivity+"'");
			resultActivity.first();
			int activityID = resultActivity.getInt("activityID");
			
			String contributorID = null;
			if (!(eventContributorName == null)&&(eventContributorFirstname== null)){
				//Get the contributorID
				ResultSet resultContributor = connection.getState().executeQuery("SELECT * FROM USER WHERE userName ='" + eventContributorName + "' AND userFirstName ='"+ eventContributorFirstname +"' AND isContributor=1");
				resultContributor.first();
				contributorID = resultContributor.getString("mail");
			}
			
			
			//Update the event
			//UPDATE EVENT SET eventName ='Step Stage', roomID =4, activityID = 5 
			//, usermail = 'b', beginDate = '2015-12-25', endDate = '2015-12-26'
			//, recurrence = 4, lastrecurrence = '2016-12-25' WHERE  eventID = 4;
			connection.getState().executeUpdate("UPDATE EVENT SET eventName ='" + eventName 
									+ "', roomID ="+ eventRoomID
									+ " , activityID ="+ activityID
									+ " , usermail = '"+ contributorID
									+ "' , beginDate = '"+ eventTimeSlot.getBeginDate()
									+ "' , endDate = '"+ eventTimeSlot.getEndDate()
									+ "' , recurrence ="+ eventTimeSlot.isRecurrence()
									+ " , lastrecurrence = '"+ eventTimeSlot.getLastReccurence()
									+"' WHERE  eventID = " + eventToUpdate.getEventID());
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * Retourne la liste des evenements auxquels l'utilisateur ne participe pas et qui ont lieu à partir de la date courrante
	 * 
	 * @return ArrayList<Event> the list of events
	 * @author Maxime Clerix
	 */
	public ArrayList<Event> getEventsForUser() {
		ArrayList<Event> events = new ArrayList<Event>();
		Event event;
		try {
			String query = "SELECT * FROM lotusbleu.EVENT e WHERE eventID NOT IN (select eventID from lotusbleu.REGISTRATION where userID = \""
					+ SessionFacade.getSessionFacade().GetCurrentUser()
							.getUsermail()
					+ "\") and beginDate > current_date() ORDER BY beginDate asc";
			ResultSet resultat = connection.getState().executeQuery(query);
			Statement state;
			while (resultat.next()) {
				// Create the activity object
				state = connection.getCon().createStatement();
				ResultSet resultatActivity = state
						.executeQuery("SELECT * FROM ACTIVITY WHERE activityID ="
								+ resultat.getInt("activityID"));
				Activity activity = null;
				if (resultatActivity.next()) {
					activity = new Activity(
							resultatActivity.getString("activityName"),
							resultatActivity.getString("activityDescritption"));
				}

				// Get the contributorRole
				state = connection.getCon().createStatement();
				ResultSet resultatContributor = state
						.executeQuery("SELECT * FROM USER WHERE mail =\""
								+ resultat.getString("usermail")+"\"");
				resultatContributor.next();

				event = new Event(resultat.getString("eventName"),
						resultat.getInt("eventID"),
						resultat.getInt("roomID"), new TimeSlot(
								resultat.getDate("beginDate"),
								resultat.getDate("endDate"),
								resultat.getInt("recurrence"),
								resultat.getDate("lastrecurrence")), activity,
						resultatContributor.getString("userName"),
						resultatContributor.getString("userFirstName"));

				events.add(event);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return events;
	}

	/**
	 * Register an user to an event
	 * 
	 * @author Maxime Clerix
	 * @param the event to register
	 */
	public void registerToEvent(Event event) {
		System.out.println(event.toString());
		try {
			connection.getState().executeUpdate(
					"INSERT INTO REGISTRATION (eventID,userID) VALUES("
							+ event.getEventID()
							+ ",\""
							+ SessionFacade.getSessionFacade().GetCurrentUser()
									.getUsermail() + "\")");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Retourne la liste des evenements auxquels participe un utilisateur
	 * 
	 * @author Maxime Clerix
	 * @return An arraylist of the events
	 */
	public ArrayList<Event> getMyEvents() {
		ArrayList<Event> events = new ArrayList<Event>();
		Event event;
		try {
			String query = "SELECT * FROM lotusbleu.EVENT e WHERE eventID IN (select eventID from lotusbleu.REGISTRATION where userID = \""
					+ SessionFacade.getSessionFacade().GetCurrentUser()
							.getUsermail()
					+ "\") and beginDate > current_date() ORDER BY beginDate asc";
			ResultSet resultat = connection.getState().executeQuery(query);
			Statement state;
			while (resultat.next()) {
				// Create the activity object
				state = connection.getCon().createStatement();
				ResultSet resultatActivity = state
						.executeQuery("SELECT * FROM ACTIVITY WHERE activityID ="
								+ resultat.getInt("activityID"));
				Activity activity = null;
				if (resultatActivity.next()) {
					activity = new Activity(
							resultatActivity.getString("activityName"),
							resultatActivity.getString("activityDescritption"));
				}

				// Get the contributorRole
				state = connection.getCon().createStatement();
				ResultSet resultatContributor = state
						.executeQuery("SELECT * FROM USER WHERE mail =\""
								+ resultat.getString("usermail")+"\"");
				resultatContributor.next();

				event = new Event(resultat.getString("eventName"),
						resultat.getInt("eventID"),
						resultat.getInt("roomID"), new TimeSlot(
								resultat.getDate("beginDate"),
								resultat.getDate("endDate"),
								resultat.getInt("recurrence"),
								resultat.getDate("lastrecurrence")), activity,
						resultatContributor.getString("userName"),
						resultatContributor.getString("userFirstName"));

				events.add(event);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return events;
	}

	@Override
	public void cancelRegistrationToEvent(Event event) {
		System.out.println(event.toString());
		try {
			connection.getState().executeUpdate(
					"DELETE FROM REGISTRATION (eventID,userID) WHERE eventID = "
							+ event.getEventID()
							+ " AND userID =\""
							+ SessionFacade.getSessionFacade().GetCurrentUser()
									.getUsermail() + "\"");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
