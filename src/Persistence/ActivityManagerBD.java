
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

    public DBconnection connection;
    private ArrayList<Activity> activities;

	@Override
	public Activity createActivity(String name, String description) {
		
		try {
			connection.getState().executeQuery("INSERT INTO ACTIVITY(activityName,activityDescritption) VALUES('"+ name +"','"+description+"')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new Activity(name,description);
	}
	
	@Override
	public ArrayList<Activity> getAllActivities() {
		
		try {
			ResultSet resultat = connection.getState().executeQuery("SELECT * FROM lotusbleu.ACTIVITY");
			this.activities = new ArrayList<Activity>();
			while (resultat.next()){
				this.activities.add(new Activity(resultat.getString("activityName"),resultat.getString("activityDescritption")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return this.activities;
	}
	
	@Override
	public Boolean editActivity(String oldName, String newName, String newDescription) {
		try {
				connection.getState().executeQuery(
					"UPDATE ACTIVITY SET activityName ='" + newName + "' AND activityDescritption= '"+ newDescription +"' WHERE  activityName = '"
							+ oldName +"'");
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public Boolean deleteActivity(String name) {
		
		try {
			connection.getState().executeQuery("DELETE INTO ACTIVITY WHERE activityName='"+ name+"'");
			return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}
 }
