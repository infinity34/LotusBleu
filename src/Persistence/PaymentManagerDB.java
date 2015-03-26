
package Persistence;

import Tools.DBconnection;

/**
 * 
 * 
 */
public class PaymentManagerDB extends PaymentManager {

	/**
	 * Tools alows the connection to the dataBase
	 */
	public DBconnection dBconnection;

	/**
	 * 
	 * 
	 */
	public PaymentManagerDB(){
		super();
		this.dBconnection = DBconnection.getConnection();
	}
}
