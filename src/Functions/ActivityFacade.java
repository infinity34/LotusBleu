
package Functions;

import java.util.ArrayList;

import Data.Activity;
import Persistence.ActivityManagerBD;

/**
 * Activity facade
 * Designed by Lyvia
 * Developped by Prisca
 */
public class ActivityFacade {
	
private Persistence.ActivityManager activityManager;
private static ActivityFacade facade;
	
	private ActivityFacade(){
		this.activityManager = new ActivityManagerBD();
	}
	
	public static ActivityFacade getFacade() {
		if (facade == null)
		{
			facade = new ActivityFacade();
		}
		
		return facade;
		
	}
	
	/**
	 * <p>Create an activity</p>
	 * 
	 * @param name 
	 * @param description 
	 * @return Boolean
	 */
    public Boolean createActivity(String name, String description) {        
        return activityManager.createActivity(name, description);
    } 

	/**
	 * <p> Update an activity</p>
	 * 
	 * @param oldName 
	 * @param newName 
	 * @param newDescription 
	 * @return Boolean
	 */
    public Boolean editActivity(String oldName, String newName, String newDescription) {        
       return activityManager.editActivity(oldName, newName, newDescription);
    } 

	/**
	 * <p>Delete an activity</p>
	 * 
	 * @param name 
	 * @return Boolean
	 */
    public Boolean deleteActivity(String name) {        
       return activityManager.deleteActivity(name);
    } 

	/**
	 * <p> Get all activities</p>
	 * 
	 * @return the list of all activities existing in the database
	 */
    public ArrayList<Activity> getAllActivities() {        
        // your code here
        return activityManager.getAllActivities();
    }

    /**
	 * <p> Get an activity</p>
	 * @return list of all activity
	 */
    public Activity getAnActivity(String activityName){
    	return activityManager.getAnActivity(activityName);
    }
    
    
	public Persistence.ActivityManager getActivityManager() {
		return activityManager;
	}
	
	public void setActivityManager(Persistence.ActivityManager activityManager) {
		this.activityManager = activityManager;
	} 

    
 }
