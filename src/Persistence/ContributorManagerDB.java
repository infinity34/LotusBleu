
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
					(this.contributorList).add(fullname);
					}
			}
				catch (SQLException e) {
					e.printStackTrace();
				}
			return this.contributorList;
	    } 
	
	
	 public Boolean addContributorToEvent(int id, String name, String firstname) {
		 Event event = eventManagerDB.getAnEventWithID(id);	
		 return eventManagerDB.updateEvent(event, event.getEventName(), event.getEventRoomID(), event.getEventTimeSlot(), event.getEventActivity().getName(), name, firstname);
	}
	 
	 
	 
	 
	 public Boolean deleteContributorFromEvent(int id)  { 
		 //Retrieval of the event with its name
		 Event myEvent = eventManagerDB.getAnEventWithID(id);
		 return eventManagerDB.updateEvent(myEvent, myEvent.getEventName(), myEvent.getEventRoomID(), myEvent.getEventTimeSlot(),myEvent.getEventActivity().getName(), "", "");


	 }



	@Override
	public ResultSet listEvents(String name, String firstname) {
		ResultSet rs;
		ResultSet rs2;
		try{
				rs = connection.getState().executeQuery("SELECT U.mail FROM lotusbleu.USER U, lotusbleu.CONTRIBUTOR C WHERE username='" +name+ "' AND userfirstname='" +firstname+ "' AND U.mail = C.userMail");
				rs.last();
				String mail = rs.getString("mail");
				rs2 = connection.getState().executeQuery("SELECT eventId, eventName, beginDate, endDate FROM lotusbleu.EVENT WHERE userMail='"+mail+"'");
				rs2.last();
			return rs2;
		}
		catch (SQLException e){
			e.printStackTrace();
			return null;
		}
		
		
		
	}


	@Override
	public Boolean createContributor(String name, String firstname, String description) {
		ResultSet result= null;
		try {
			result = connection.getState().executeQuery("SELECT * FROM USER WHERE username='" +name+ "'and userfirstname='" +firstname+ "'");
			result.last();
			if (result.getInt("isContributor") == 0){
				connection.getState().executeUpdate("UPDATE USER SET isContributor = 1 WHERE mail='"+result.getString("mail")+"'");
				result = connection.getState().executeQuery("SELECT * FROM USER WHERE username='" +name+ "'and userfirstname='" +firstname+ "'");
				result.last();
				String mail = result.getString("mail");
				connection.getState().executeUpdate("INSERT INTO CONTRIBUTOR(longDesc,usermail) VALUES ('"+description+"','"+ result.getString("mail")+"')");
				result = connection.getState().executeQuery("SELECT * FROM CONTRIBUTOR WHERE userMail='"+mail+"'");
				return result.isBeforeFirst();
				}
			else {return false;}
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
				connection.getState().executeUpdate("DELETE FROM CONTRIBUTOR WHERE userMail='"+result.getString("mail")+"'");
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
