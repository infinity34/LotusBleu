
package Functions;

import java.util.ArrayList;

import Data.Activity;
import Persistence.AccessoryManagerDB;
import Persistence.ActivityManagerBD;

/**
 * Activity facade
 * Designed by Lyvia
 * Developped by Prisca
 */
public class ActivityFacade {
	
private Persistence.ActivityManager activityManager;
	
	public ActivityFacade(){
		super();
		this.activityManager = new ActivityManagerBD();
	}
	
	/**
	 * <p>Create an activity</p>
	 * 
	 * @param name 
	 * @param description 
	 * @return Boolean
	 */
    public Data.Activity createActivity(String name, String description) {        
        return activityManager.createActivity(name, description);
    } 

	/**
	 * <p> Update an activity</p>
	 * 
	 * @param name 
	 * @param inCharge 
	 * @param shortDescription 
	 * @param longDescription 
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

	public Persistence.ActivityManager getActivityManager() {
		return activityManager;
	}
	
	public void setActivityManager(Persistence.ActivityManager activityManager) {
		this.activityManager = activityManager;
	} 

    
 }
