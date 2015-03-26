
package Persistence;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Data.Accessory;
import Data.Activity;
import Data.ContributorRole;
import Data.Event;
import Data.MemberRole;
import Data.TimeSlot;
import Data.User;
import Tools.DBconnection;


public class ContributorManagerDB extends Persistence.ContributorManager {
	DBconnection connection;
	private ArrayList contributorList;
	private ArrayList<Event> eventList;
	public EventManagerDB eventManagerDB;
	private ContributorRole myContributor;
	
	public ContributorManagerDB() {
		super();
		this.connection = DBconnection.getConnection();
	}
	
	
	 public ArrayList<String> listContributor() {        
		 this.contributorList = null;
			try {
				ResultSet result = connection.getState().executeQuery("SELECT * FROM USER WHERE isContributor=1");
				this.contributorList = new ArrayList();
				//Add the contributor in the contributors ArrayList
				String name;
				String firstname;
				String fullname;
				result.beforeFirst();
				while (result.next())
					{
					 name = result.getString("userName");
					 firstname = result.getString("userFirstName");
					 fullname = name+firstname;
				     (this.contributorList).add(fullname);
					}
			}
				catch (SQLException e) {
					e.printStackTrace();
				}
			return this.contributorList;
	    } 
	
	
	 public Boolean addContributorToEvent(Event myEvent, ContributorRole myContributor) {
		 return eventManagerDB.updateEvent(myEvent, myEvent.getEventName(), myEvent.getEventRoomID(), myEvent.getEventTimeSlot(),myEvent.getEventActivity(), myContributor.getUsername(), myContributor.getUserfirstname());
	 }
	 
	 
	 public Boolean deleteContributorFromEvent(String eventName, String name, String firstname) { 
		 Event myEvent = eventManagerDB.getAnEventWithName(eventName);
		 return eventManagerDB.updateEvent(myEvent, myEvent.getEventName(), myEvent.getEventRoomID(), myEvent.getEventTimeSlot(),myEvent.getEventActivity(), name, firstname);
		/* try{
			 ResultSet resultEvent = connection.getState().executeQuery("SELECT * FROM EVENT WHERE eventName ='"+eventName+"'");
			 
		 }*/
	 
	 }


	@Override
	public boolean addContributor(User contributor) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public ArrayList<Event> listEvents(User contributor) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Boolean createContributor(String name, String firstname) {
		try {
			ResultSet result = connection.getState().executeQuery("SELECT * FROM USER WHERE username='" +name+ "'and userfirstname='" +firstname+ "'");
			result.last();
			if (!(result.getInt("isContributor") == 1)){
				connection.getState().executeUpdate("UPDATE USER SET isContributor = 1");
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
			}
		return true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	} 
 }
