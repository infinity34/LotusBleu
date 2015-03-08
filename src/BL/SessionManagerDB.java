
package BL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Tools.DBconnection;

/**
 * 
 * 
<<<<<<< HEAD
 */
public class SessionManagerDB extends BL.SessionManager {
	/**
	 * 
	 * 
	 */
	private Tools.DBconnection dbConnection;


	public SessionManagerDB(){
		
		dbConnection = DBconnection.getConnection();
		System.out.println(dbConnection);
		
	}

	/**
	 * <p>Does ...</p>
	 * 
	 * 
	 * @return 
	 */
	public Boolean Login(String username, String password) {        

		Statement statement = dbConnection.getState();
		System.out.println(statement);
		
		/* Exécution d'une requête de lecture */
		try {
			ResultSet resultat = statement.executeQuery( "SELECT mail, password, username  FROM USER" );

			/* Récupération des données du résultat de la requête de lecture */
			/*while ( resultat.next() ) {
				String userMail = resultat.getString( "mail" );
				String pwd = resultat.getString( "password" );
				String userName = resultat.getString( "username" );

				/* Traiter ici les valeurs récupérées. */
			/*}*/

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	} 
}