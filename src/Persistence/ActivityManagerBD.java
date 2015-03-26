
package Persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Data.Accessory;
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

	public ActivityManagerBD() {
		super();
		this.connection = DBconnection.getConnection();
	}
    
	@Override
	public Boolean createActivity(String name, String description) {
		
		try {
			connection.getState().executeUpdate("INSERT INTO ACTIVITY(activityName,activityDescritption) VALUES('"+ name +"','"+description+"')");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public ArrayList<Activity> getAllActivities() {
		try {
			ResultSet resultat = connection.getState().executeQuery("SELECT * FROM ACTIVITY");
			System.out.println(resultat.getRow());
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
				connection.getState().executeUpdate(
					"UPDATE ACTIVITY SET activityName ='" + newName + "', activityDescritption= '"+ newDescription +"' WHERE  activityName = '"
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
			connection.getState().executeUpdate("DELETE FROM ACTIVITY WHERE activityName='"+ name+"'");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Activity getAnActivity(String activityName) {
		Activity activity = null;
		try {
			ResultSet resultat = connection.getState().executeQuery("SELECT * FROM ACTIVITY WHERE activityName = '"+activityName+"'" );
			resultat.last();
			if(resultat.getRow()!=0){
				activity = new Activity(resultat.getString("activityName"),resultat.getString("activityDescritption"));
				return activity;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return activity;
	}
 }
