
package Persistence;

import Tools.DBconnection;

/**
 * 
 * 
 * @poseidon-object-id [I777ab4eam14bf4e91384mm7b86]
 */
public class ShoppingManagerDB extends Persistence.ShoppingManager {

/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [I777ab4eam14bf4e91384mm7b38]
 */
    private DBconnection connection;

public ShoppingManagerDB() {
	super();
	this.connection = DBconnection.getConnection();
}
 }
