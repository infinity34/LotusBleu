
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
    private ArrayList<Activity> activities;

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
 */
    public abstract void editActivity(String name, String description);

/**
 * <p>Delete an activity</p>
 * @param name 
 */
    public abstract void deleteActivity(String name);

/**
 * <p> Get all activity</p>
 * @return list of all activity
 */
    public abstract ArrayList<Activity> getAllActivities();
 }
