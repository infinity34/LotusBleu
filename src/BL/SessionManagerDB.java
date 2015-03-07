
package BL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Tools.DBconnection;

/**
 * 
 * 
 */
public class SessionManagerDB extends BL.SessionManager {
/**
 * 
 * 
 */
    public Tools.DBconnection dbConnection;
    
    
    public SessionManagerDB(){
    	dbConnection = DBconnection.getConnection();
    	Statement statement = dbConnection.getState();
    	
    	/* Exécution d'une requête de lecture */
    	try {
			ResultSet resultat = statement.executeQuery( "SELECT mail, password, username  FROM USER;" );
		
			/* Récupération des données du résultat de la requête de lecture */
			while ( resultat.next() ) {
			    String userMail = resultat.getString( "mail" );
			    String password = resultat.getString( "password" );
			    String userName = resultat.getString( "username" );

			    /* Traiter ici les valeurs récupérées. */
			}
			
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	/* Exécution d'une requête d'écriture */
    	try {
			int statut = statement.executeUpdate( "INSERT INTO Utilisateur (email, mot_de_passe, nom, date_inscription) VALUES ('jmarc@mail.fr', MD5('lavieestbelle78'), 'jean-marc', NOW());" );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
 }
