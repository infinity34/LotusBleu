
package Functions;

import java.util.ArrayList;

import Data.Accessory;
import Persistence.AccessoryManagerDB;

/**
 * Accessory
 * Designed by Maxime
 * Developed by Prisca
 */
	public class AccessoryFacade {

    private static AccessoryFacade facade;
    private Persistence.AccessoryManager accessoryManager;
    
    private AccessoryFacade(){
    	super();
    	this.accessoryManager = new AccessoryManagerDB();
    }
    
    public static AccessoryFacade getAccessoryFacade(){
		if(facade == null)
			facade = new AccessoryFacade();
		return facade;
    }

/**
 * <p> Get all accessories</p>
 */
    public ArrayList<Accessory> getAccessories() {        
        return accessoryManager.getAccessories();
    } 


/**
 * <p>Add an accessory</p>
 * @param name 
 */
    public Boolean addAccessory(String name) {        
    	return accessoryManager.addAccessory(name);
    } 

/**
 * <p> Remove an accessory</p>
 * @param accessory 
 */
    public Boolean removeAccessory(Accessory accessory) {        
    	return accessoryManager.deleteAccessory(accessory);
    } 

/**
 * <p>Update an accessory</p>
 * @param accessory 
 * @param newName 
 */
    public Boolean updateAccessory(Accessory accessory, String newName) {        
    	return accessoryManager.setAccessory(accessory,newName);
    } 
    
    public Accessory getAnAccessory(String accessoryName){
    	return accessoryManager.getAnAccessory(accessoryName);
    }
 }
