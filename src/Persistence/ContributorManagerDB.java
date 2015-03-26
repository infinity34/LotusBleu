
package Persistence;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Data.Accessory;
import Data.Activity;
import Data.ContributorRole;
import Data.Event;
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
				ResultSet result = connection.getState().executeQuery("SELECT * FROM CONTRIBUTOR");
				this.contributorList = new ArrayList();
				//Add the contributor in the contributors ArrayList
				String name;
				String firstname;
				String fullname;
				while (result.next())
					{
					 name = result.getString("username");
					 firstname = result.getString("userfirtname");
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
	public void createContributor() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteContributorEvent(Event myEvent,
			ContributorRole myContributor) {
		// TODO Auto-generated method stub
		
	} 
 }
