
package Tools;
import java.sql.*;
/*Class Must be Singleton*/

/**
 * 
 * 
 * @poseidon-object-id [Im7393253bm14bd0a52e7dmm7dc5]
 */

public class DBconnection {
	/**
	 * 
	 * 
	 * @poseidon-object-id [Im7393253bm14bd0a52e7dmm7d83]
	 */    
	
	/*public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://lotusbleu.cveov0u0zsel.us-west-2.rds.amazonaws.com:3306/lotusbleu";
			String user = "lotusbleu";
			String passwd = "lotusbleu";

			System.out.println("J'essaye de me co");
			java.sql.Connection con = DriverManager.getConnection(url, user, passwd);
			System.out.println("Je suis co");
			System.out.println(con.getClientInfo());

		} catch (Exception e) {
			e.printStackTrace();
		}      
	}*/
	private Statement state;
	private Connection con;
	private String url;
	private String user;
	private String password;

	public DBconnection() {
		this.url = "jdbc:mysql://lotusbleu.cveov0u0zsel.us-west-2.rds.amazonaws.com:3306/lotusbleu";
		this.user = "lotusbleu";
		this.password = "lotusbleu";
		try{
			this.con = (java.sql.Connection) DriverManager.getConnection(this.url, this.user, this.password); //DriverManager from Java.Connection
			this.state = ((java.sql.Connection) this.con).createStatement();
		}
		catch (SQLException e)
		{
			e.printStackTrace(); // Just for the moment, we had to think about how to manga it later
		}
	}

	private void Connection(String url, String user, String password) {
		this.url = url;
		this.user = user;
		this.password = password;
		try{
			this.con = (Connection) DriverManager.getConnection(this.url, this.user, this.password); //DriverManager from Java.Connection
			this.state = ((java.sql.Connection) this.con).createStatement();
		}
		catch (SQLException e)
		{
			e.printStackTrace(); // Just for the moment, we had to think about how to manga it later
		}
	}
	public Statement getState() {
		// TODO Auto-generated method stub
		return this.state;
	}
}
