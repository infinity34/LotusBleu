package Persistence;

import Tools.DBconnection;

/**
 * 
 * 
 * @poseidon-object-id [I777ab4eam14bf4e91384mm7b86]
 */
public class AccessoryManagerDB extends Persistence.AccessoryManager {

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 * 
	 * @poseidon-object-id [I777ab4eam14bf4e91384mm7b38]
	 */
	private DBconnection connection;

	/**
	 * @return the connection
	 */
	public DBconnection getConnection() {
		return connection;
	}

	/**
	 * @param connection
	 *            the connection to set
	 */
	public void setConnection(DBconnection connection) {
		this.connection = connection;
	}
}
