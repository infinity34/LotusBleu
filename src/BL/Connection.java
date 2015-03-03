
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
    private Connection con;
    private String url;
    private String user;
    private String password;
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
