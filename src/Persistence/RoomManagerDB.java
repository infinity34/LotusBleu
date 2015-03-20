
package Persistence;

import Tools.DBconnection;

/**
 * 
 * 
 * @poseidon-object-id [I64875daam14c1cbbcc52mm7c13]
 */
public class RoomManagerDB extends RoomManager {
	/**
	 * 
	 * 
	 * @poseidon-object-id [I64875daam14c1cbbcc52mm7a6b]
	 */
	public DBconnection dBconnection;

	/**
	 * @return the connection
	 */
	public DBconnection getConnection() {
		return dBconnection;
	}

	/**
	 * @param connection
	 *            the connection to set
	 */
	public void setConnection(DBconnection connection) {
		this.dBconnection = connection;
	}
}
