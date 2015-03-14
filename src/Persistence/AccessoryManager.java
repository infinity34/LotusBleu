package Persistence;

import java.util.ArrayList;

import Data.Accessory;

/**
 * 
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm79b9]
 */
public class AccessoryManager {

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 * 
	 * @poseidon-object-id [I5c276a37m14bf4d9e555mm79a0]
	 */
	private ArrayList<Accessory> accessories;

	public AccessoryManager() {
		super();
		this.setAccessories(new ArrayList<Accessory>());
	}

	/**
	 * @return the accessories
	 */
	public ArrayList<Accessory> getAccessories() {
		return accessories;
	}

	/**
	 * @param accessories the accessories to set
	 */
	public void setAccessories(ArrayList<Accessory> accessories) {
		this.accessories = accessories;
	}

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * 
	 * @poseidon-object-id [I777ab4eam14bf4e91384mm7c7d]
	 * @param String
	 */
	public void addAccessory(String name) {
		// your code here
	}

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * 
	 * @poseidon-object-id [I777ab4eam14bf4e91384mm7c3c]
	 */
	public void loadAccessories() {
		// your code here
	}

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * 
	 * @poseidon-object-id [I777ab4eam14bf4e91384mm7c17]
	 * @param String
	 */
	public void getAccessoriesByKeyword(String keyword) {
		// your code here
	}
}
