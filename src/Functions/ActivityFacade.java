
package Functions;

import java.util.ArrayList;

import Data.Activity;

/**
 * Activity facade
 * Designed by Lyvia
 * Developped by Prisca
 */
public class ActivityFacade {
	
private Persistence.ActivityManager activityManager;
	
/**
 * <p>Create an activity</p>
 * 
 * @poseidon-object-id [I3abaef47m14c1a7d7d62mm5d82]
 * @param name 
 * @param inCharge 
 * @param shortDescription 
 * @param longDescription 
 * @return 
 */
    public Data.Activity createActivity(String name, String description) {        
        // your code here
        return activityManager.createActivity(name, description);
    } 

/**
 * <p>Does ...</p>
 * 
 * @param name 
 * @param inCharge 
 * @param shortDescription 
 * @param longDescription 
 */
    public Boolean editActivity(String oldName, String newName, String newDescription) {        
       return activityManager.editActivity(oldName, newName, newDescription);
    } 

/**
 * <p>Does ...</p>
 * 
 * @param name 
 */
    public Boolean deleteActivity(String name) {        
       return activityManager.deleteActivity(name);
    } 

/**
 * <p>Does ...</p>
 * 
 * @return 
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
