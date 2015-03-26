
package Persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import Data.ClassRoom;
import Tools.DBconnection;

/**
 * 
 */
public class RegistrationAdminManagerDB extends RegistrationAdminManager {

	/**
	 * Tools allows the connection to the dataBase
	 */
	public DBconnection dBconnection;

	/**
	 * 
	 */
	public RegistrationAdminManagerDB() {
		super();
		this.dBconnection = DBconnection.getConnection();
	}

	/**
	 * 
	 */
	public void loadRegistrationAdmins() {

	}


}
