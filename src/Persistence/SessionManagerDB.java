package Persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Tools.DBconnection;

/**
 * 
 * 
 <<<<<<< HEAD
 */
public class SessionManagerDB extends Persistence.SessionManager {
	/**
	 * 
	 * 
	 */
	private Tools.DBconnection dbConnection;

	public SessionManagerDB() {

		dbConnection = DBconnection.getConnection();
		System.out.println(dbConnection);

	}

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * 
	 * 
	 * @return
	 */
	public Boolean Login(String username, String password) {

		int test = 0;
		/* Exécution d'une requête de lecture */
		try {
			ResultSet resultat = dbConnection.getState().executeQuery(
					"SELECT * FROM lotusbleu.USER WHERE mail=\"" + username
							+ "\" AND password = \"" + password + "\"");
			resultat.last();
			test = resultat.getRow();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (test > 0);
	}
}