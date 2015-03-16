
package Functions;

import java.util.ArrayList;

import Data.Activity;

/**
 * 
 * 
 * @poseidon-object-id [I3abaef47m14c1a7d7d62mm5f3f]
 */
public class ActivityFacade {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I3abaef47m14c1a7d7d62mm5d82]
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
 * @poseidon-object-id [I3abaef47m14c1a7d7d62mm5b94]
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
 * @poseidon-object-id [I3abaef47m14c1a7d7d62mm5ab4]
 * @param name 
 */
    public void deleteActivity(String name) {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I3abaef47m14c1a7d7d62mm59ad]
 * @return 
 */
    public ArrayList<Activity> getAllActivity() {        
        // your code here
        return null;
    } 
/**
 * 
 * 
 * @poseidon-object-id [I3abaef47m14c1a7d7d62mm5ebf]
 */
    public Persistence.ActivityManager activityManager;
 }
