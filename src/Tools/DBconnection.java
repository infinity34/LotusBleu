
package Tools;
import java.sql.*;
/*Class Must be Singleton*/

/**
 * 
 * 
 *
 */

public class DBconnection {

	// Static fields used for database connection
	public final static String url = "jdbc:mysql://lotusbleu.cveov0u0zsel.us-west-2.rds.amazonaws.com:3306/lotusbleu" ;
	public final static String user = "lotusbleu";
	public final static String password = "lotusbleu";
	//attributes
	private static DBconnection connection = null;
	private Statement state;
	private Connection con;

	/**
	 * 
	 */
	private DBconnection() {
		try{
			this.con = (java.sql.Connection) DriverManager.getConnection(url, user, password); //DriverManager from Java.Connection
			this.state = ((java.sql.Connection) this.con).createStatement();
		}
		catch (SQLException e)
		{
			e.printStackTrace(); // Just for the moment, we had to think about how to manga it later
		}
	}
	
	/**
	 * @return the connection
	 */
	public static DBconnection getConnection() {
		if(connection == null){
			connection = new DBconnection();
		}
		return connection;
	}

	/**
	 * 
	 * @return statement of the connection
	 */
	public Statement getState() {
		return this.state;
	}
}
