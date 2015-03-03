
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
		}
		catch (SQLException e)
		{
			e.printStackTrace(); // Just for the moment, we had to think about how to manga it later
		}
	}
 }
