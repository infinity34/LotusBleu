package Persistence;

import java.util.ArrayList;

import Data.Accessory;

/**
 * Accessory
 * Designed by Maxime
 * Developed by Prisca
 */

public abstract class AccessoryManager {

	/**
	 * @return the accessories
	 */
	public abstract ArrayList<Accessory> getAccessories();
	

	/**
	 * <p> Add an accessory </p>
	 *
	 * @param String
	 * @return 
	 */
	public abstract Boolean addAccessory(String name);
	
	/**
	 * <p> Set an accessory </p>
	 *
	 * @param String
	 * @return 
	 */
	public abstract Boolean setAccessory(Accessory accessory,String newName);
	
	/**
	 * <p> Delete an accessory </p>
	 *
	 * @param String
	 * @return 
	 */
	public abstract Boolean deleteAccessory(Accessory accessory);


	public abstract Accessory getAnAccessory(String accessoryName);



}
