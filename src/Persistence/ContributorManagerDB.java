
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
	private ArrayList<User> contributorList;
	private ArrayList<Event> eventList;
	public EventManagerDB eventManagerDB;
	
	public ContributorManagerDB() {
		super();
		this.connection = DBconnection.getConnection();
	}
	
	
	 public ArrayList<User> listContributor() {        
		 this.contributorList = null;
			try {
				ResultSet resultContributors = connection.getState().executeQuery("SELECT * FROM CONTRIBUTORROLE");
				resultContributors.beforeFirst();	//Moves the cursor to the front of this ResultSet 
					do {
						this.contributorList.add((User) resultContributors.getObject(resultContributors.getRow()));
					}
					while(resultContributors.next());					
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			return this.contributorList;
	    } 
	
	
	 public Boolean addContributorToEvent(Event myEvent, ContributorRole myContributor) {
		 return eventManagerDB.updateEvent(myEvent, myEvent.getEventName(), myEvent.getEventRoomID(), myEvent.getEventTimeSlot(),myEvent.getEventActivity(), myContributor.getUsername(), myContributor.getUserfirstname());
	 }
 }
