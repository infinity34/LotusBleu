
package Persistence;

import java.util.ArrayList;

import Data.Activity;

/**
 * 
 * 
 * @poseidon-object-id [I3abaef47m14c1a7d7d62mm5ed5]
 */
public class ActivityManager {
/**
 * 
 * 
 * @poseidon-object-id [I3abaef47m14c1a7d7d62mm5e2b]
 */
    public Data.Activity activity;

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I3abaef47m14c1a7d7d62mm58ac]
 * @param name 
 * @param inCharge 
 * @param shortDescription 
 * @param longDescription 
 * @return 
 */
    public Data.Activity createActivity(String name, Data.InCharge inCharge, String shortDescription, String longDescription) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I3abaef47m14c1a7d7d62mm57cd]
 * @param name 
 * @param inCharge 
 * @param shortDescription 
 * @param longDescription 
 */
    public void editActivity(String name, Data.InCharge inCharge, String shortDescription, String longDescription) {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I3abaef47m14c1a7d7d62mm56ee]
 * @param name 
 */
    public void deleteActivity(String name) {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I3abaef47m14c1a7d7d62mm56ae]
 * @return 
 */
    public ArrayList<Activity> getAllActivity() {        
        // your code here
        return null;
    } 
 }
