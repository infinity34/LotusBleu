
/*Class Must be Singleton*/
package BL;
<<<<<<< HEAD

import java.sql.*;

=======
import java.sql.*;
>>>>>>> origin/conception_login
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
<<<<<<< HEAD
    
    public static void main(String[] args) {
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
    	}
=======
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
>>>>>>> origin/conception_login
 }
