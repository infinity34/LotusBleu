
package Functions;

import java.util.ArrayList;

import Data.Accessory;
import Persistence.AccessoryManager;
import Persistence.AccessoryManagerDB;
import Persistence.SessionManager;

/**
 * Accessory
 * Designed by Maxime
 * Developed by Prisca
 */
public class AccessoryFacade {

    //private SessionManager session;
    public Persistence.AccessoryManager accessoryManager;
    
    public AccessoryFacade(){
    	super();
    	this.accessoryManager = new AccessoryManagerDB();
    }

/**
 * <p> Get all accessories</p>
 * @return 
 */
    public ArrayList<Accessory> getAccessories() {        
        return accessoryManager.getAccessories();
    } 


/**
 * <p>Add an accessory</p>
 * @param String 
 * @return 
 */
    public Boolean addAccessory(String name) {        
    	return accessoryManager.addAccessory(name);
    } 

/**
 * <p> Remove an accessory</p>
 * @param Accessory 
 */
    public Boolean removeAccessory(Accessory accessory) {        
    	return accessoryManager.deleteAccessory(accessory);
    } 

/**
 * <p>Update an accessory</p>
 * @param Accessory 
 * @param String 
 */
    public Boolean updateAccessory(Accessory accessory, String newName) {        
    	return accessoryManager.setAccessory(accessory,newName);
    } 
 }
