
package Persistence;




import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;








import Data.Activity;
import Data.Event;
import Data.TimeSlot;
import Tools.DBconnection;


public class ContributorManagerDB extends Persistence.ContributorManager {
	DBconnection connection;
	private ArrayList<String> contributorList;
	public EventManagerDB eventManagerDB = new EventManagerDB();
	
	public ContributorManagerDB() {
		super();
		this.connection = DBconnection.getConnection();
	}
	
	
	 public ArrayList<String> listContributor() {        
		 this.contributorList = null;
			try {
				ResultSet result = connection.getState().executeQuery("SELECT * FROM USER WHERE isContributor=1");
				this.contributorList = new ArrayList<String>();
				//Add the contributor in the contributors ArrayList
				String name;
				String firstname;
				String fullname = null;
				result.beforeFirst();
				while (result.next())
					{
					name = result.getString("userName");
					firstname = result.getString("userFirstName");
					fullname = name+" "+firstname;
					}
				     (this.contributorList).add(fullname);
			}
				catch (SQLException e) {
					e.printStackTrace();
				}
			return this.contributorList;
	    } 
	
	
	 public Boolean addContributorToEvent(String myEvent,String begin,String end, String name, String firstname) {
		 try {
			 //retrieval of the time slot
			 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
			 java.util.Date beginDate;
			 java.util.Date endDate;
			try {
				beginDate = sdf.parse(begin);
				endDate = sdf.parse(end);
				 ResultSet resultTimeslot = connection.getState().executeQuery("SELECT * FROM TIMESLOT WHERE begindate="+beginDate+"AND enddate="+end);
				 TimeSlot ts = new TimeSlot(beginDate, endDate, resultTimeslot.getBoolean("recurrence"),resultTimeslot.getDate("lastReccurence"));
				 
				 //Retrieval of the activity
				 ResultSet resultActivity = connection.getState().executeQuery("SELECT eventActivity FROM EVENT WHERE eventname="+myEvent);
				 Activity act = new Activity(resultActivity.getString("name"), resultActivity.getString("description"));
				 
				 //retrieval of the event
				 ResultSet result =  connection.getState().executeQuery("SELECT * FROM USER WHERE eventname="+myEvent);
				 int roomID = result.getInt("roomID");
				 Event event = new Event(myEvent, roomID, ts, act, name, firstname);	
				 
				 return eventManagerDB.updateEvent(event, myEvent, roomID, ts, act.getName(), name, firstname);
			
				} 
			catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			
			 }
		 catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
	}
	 
	 
	 
	 
	 public Boolean deleteContributorFromEvent(String eventName) { 
		 //Retrieval of the event with its name
		 Event myEvent = eventManagerDB.getAnEventWithName(eventName);
		 return eventManagerDB.updateEvent(myEvent, myEvent.getEventName(), myEvent.getEventRoomID(), myEvent.getEventTimeSlot(),myEvent.getEventActivity().getName(), "", "");
	
	 }



	@Override
	public ResultSet listEvents(String name, String firstname) {
		
		try{
			ResultSet resultContributor = connection.getState().executeQuery("SELECT * FROM USER WHERE username='" +name+ "'and userfirstname='" +firstname+ "'");
			int id = resultContributor.getInt("userID");
			ResultSet result = connection.getState().executeQuery("SELECT * FROM EVENT WHERE contributorID='"+id);
			/*int size = result.getFetchSize();
			String[][] Tableau = new String[size][6];
			String eventName = result.getString("eventName");
			int room = result.getInt("eventRoomID");
			Date beginD = result.getDate("beginDate");
			Date endD = result.getDate("endDate");
			int recurrence = result.getInt("recurrence");
			//get the activity name
			ResultSet resultAct = connection.getState().executeQuery("SELECT name FROM ACTIVITY WHERE activityID='" +result.getInt("activityID"));
			String activityName = resultAct.getString("name");
			String fullEvent = "Event name : "+eventName+" Activity : "+activityName+" Room : "+room+" Time slot : "+beginD+"/"+endD);
			for(int index=0;index<size;++){
				
			}*/
			return result;
		}
		catch (SQLException e){
			e.printStackTrace();
			return null;
		}
		
		
		
	}


	@Override
	public Boolean createContributor(String name, String firstname, String description) {
		try {
			ResultSet result = connection.getState().executeQuery("SELECT * FROM USER WHERE username='" +name+ "'and userfirstname='" +firstname+ "'");
			result.last();
			if (!(result.getInt("isContributor") == 1)){
				connection.getState().executeUpdate("UPDATE USER SET isContributor = 1 WHERE mail='"+result.getString("mail")+"'");
				result = connection.getState().executeQuery("SELECT * FROM USER WHERE username='" +name+ "'and userfirstname='" +firstname+ "'");
				result.last();
				connection.getState().executeUpdate("INSERT INTO CONTRIBUTOR(longDesc,usermail) VALUES ('"+description+"','"+ result.getString("mail")+"')");
			}
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}


	@Override
	public Boolean deleteContributor(String name, String firstname) {
		try{
			ResultSet result = connection.getState().executeQuery("SELECT * FROM USER WHERE username='" +name+ "'and userfirstname='" +firstname+ "'");
			result.last();
			if ((result.getInt("isContributor") == 1)){
				connection.getState().executeUpdate("UPDATE USER SET isContributor = 0");
				result = connection.getState().executeQuery("SELECT * FROM USER WHERE username='" +name+ "'and userfirstname='" +firstname+ "'");
				result.last();
				connection.getState().executeUpdate("DELETE FROM CONTRITOR WHERE userMail='"+result.getString("mail")+"'");
			}
		return true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	public ArrayList<String> searchContributor(String name, String firstname){

		try {
				ResultSet result = connection.getState().executeQuery("SELECT longDesc FROM USER u,CONTRIBUTOR c WHERE username='" +name+ "'and userfirstname='" +firstname+ "'and u.mail=c.userMail");
				result.last();
				String longDescription;
				//String fullContributor;
				//result.beforeFirst();
				
					longDescription = result.getString("longDesc");
					this.contributorList = new ArrayList<String>() ;
					contributorList.add("Name : "+name);
					contributorList.add("");
					contributorList.add("First name : "+firstname);
					contributorList.add("");
					contributorList.add("Description : "+longDescription);
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		return this.contributorList;
	   } 
	
 }
