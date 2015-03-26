
package Persistence;

import Tools.DBconnection;


public class ProductManagerDB extends Persistence.ProductManager {

	private static ProductManagerDB managerBD;

    private DBconnection connection;
    
	
	public static ProductManagerDB getManagerDB()
	{
		if (managerBD == null)
		{
			managerBD = new ProductManagerDB();
		}
		
		return managerBD;
	}

private ProductManagerDB() {
	super();
	this.connection = DBconnection.getConnection();
	}

	public DBconnection getConnection() {
		return connection;
	}
}
