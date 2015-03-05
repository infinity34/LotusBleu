/*Class Must be Singleton*/
package BL;

import java.sql.*;

/**
 * 
 * 
 * @poseidon-object-id [Im7393253bm14bd0a52e7dmm7dc5]
 */
public class Connection {
	/**
	 * 
	 * 
	 * @poseidon-object-id [Im7393253bm14bd0a52e7dmm7d83]
	 */
	public Data.DataBase dataBase;
	private Statement state;
	private java.sql.Connection con;
	
	final static String url = "jdbc:mysql://lotusbleu.cveov0u0zsel.us-west-2.rds.amazonaws.com:3306/lotusbleu";
	final static String user = "lotusbleu";
	final static String password = "lotusbleu";

	public static void main(String[] args) {
		Connection con = new Connection();
	}

	public Connection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.con = DriverManager.getConnection(url,
					user, password);
			this.state = ((java.sql.Connection) this.con).createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Statement getState() {
		return this.state;
	}
}
