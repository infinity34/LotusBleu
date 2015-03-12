
package Functions;

import java.util.ArrayList;

import Data.Accessory;
import Persistence.SessionManager;

/**
 * 
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7dda]
 */
public class AccessoryFacade {

/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [I777ab4eam14bf4e91384mm7ca0]
 */
    private SessionManager session;
/**
 * 
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7952]
 */
    public Persistence.AccessoryManager accessoryManager;

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7d5a]
 * @return 
 */
    public ArrayList<Accessory> getAccessories() {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7d14]
 * @param String 
 * @return 
 */
    public ArrayList<Accessory> getAccessoriesByKeyword(String keyword) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7cd3]
 * @param String 
 */
    public void addAccessory(String name) {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7c92]
 * @param Accessory 
 */
    public void removeAccessory(Accessory accessory) {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7c51]
 * @param Accessory 
 */
    public void updateAccessory(Accessory accessory) {        
        // your code here
    } 
 }
