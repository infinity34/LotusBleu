
package Persistence;

import java.util.ArrayList;

import Data.Activity;

/**
 * Activity Manager
 * Designed by Lyvia
 * Developped by Prisca
 */ 
public abstract class ActivityManager {

    public Data.Activity activity;

	/**
	 * <p> Create an activity</p>
	 * 
	 * @param name 
	 * @param inCharge 
	 * @param shortDescription 
	 * @param longDescription 
	 * @return 
	 */
    public abstract Data.Activity createActivity(String name, String description);

	/**
	 * <p> edit an activity</p>
	 *
	 * @param name 
	 * @param inCharge 
	 * @param shortDescription 
	 * @param longDescription 
	 * @return 
	 */
    public abstract Boolean editActivity(String oldName, String newName, String newDescription);

	/**
	 * <p>Delete an activity</p>
	 * @param name 
	 * @return 
	 */
    public abstract Boolean deleteActivity(String name);

	/**
	 * <p> Get all activity</p>
	 * @return list of all activity
	 */
    public abstract ArrayList<Activity> getAllActivities();
 }
