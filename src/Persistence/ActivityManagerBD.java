
package Persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Data.Activity;
import Tools.DBconnection;

/**
 * Activity
 * Designed by Lyvia
 * Developped by Prisca
 */
public class ActivityManagerBD extends Persistence.ActivityManager {
/**
 * 
 * 
 * @poseidon-object-id [I74c1c3dfm14c22193038mm7421]
 */
    public DBconnection connection;
    private ArrayList<Activity> activities;

	@Override
	public Activity createActivity(String name, String description) {
		// TODO Auto-generated method stub
		try {
			
			//INSERT INTO ACTIVITY(activityName,activityDescritption) VALUES('Yoga','We will do yoga');
			connection.getState().executeQuery("INSERT INTO ACTIVITY(activityName,activityDescritption) VALUES("+ name +","+description+")");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Activity(name,description);
	}
	
	@Override
	public ArrayList<Activity> getAllActivities() {
		// TODO Auto-generated method stub
		try {
			ResultSet resultat = connection.getState().executeQuery("SELECT * FROM lotusbleu.ACTIVITY");
			
			do {
				//Add the activity in the events arraylist
				this.activities.add(new Activity(resultat.getString("activityName"),resultat.getString("activityDescritption")));
			} while (resultat.next());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return activities;
	}
	
	@Override
	public void editActivity(String name, String description) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void deleteActivity(String name) {
		// TODO Auto-generated method stub
	try {
		//delete FROM ACTIVITY WHERE activityID=2;
		connection.getState().executeQuery("DELETE INTO ACTIVITY WHERE activityName="+ name+")");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 }
