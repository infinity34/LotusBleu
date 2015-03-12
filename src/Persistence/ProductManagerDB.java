
package Persistence;

import Tools.DBconnection;

/**
 * 
 * 
 * @poseidon-object-id [I2d1a4d66m14c0966aad0mm767f]
 */
public class ProductManagerDB extends Persistence.ProductManager {

/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [I2d1a4d66m14c0966aad0mm7633]
 */
    private DBconnection connection;

public ProductManagerDB() {
	super();
	this.connection = DBconnection.getConnection();
}
 }
