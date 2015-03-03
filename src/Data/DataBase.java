
package Data;

/**
 * 
 * 
 * @poseidon-object-id [Im7393253bm14bd0a52e7dmm7d9f]
 */
public class DataBase {
/**
 * 
 * 
 * @poseidon-object-id [Im7393253bm14bd0a52e7dmm7d86]
 */
    public BL.Connection connection;
    
    
    
    //Check id and password in the database
    public Boolean checkCredentials(String username, String password) throws SQLException{

    //La requete a faire : 
    //SELECT UserID,Password FROM USER WHERE Password=password AND UserID=username
    //Renvoie true si ya un User qui a ete trouve
    // Renvoie false sinon
        String query = "SELECT count(*) FROM USER WHERE userID="+username+" AND password="+password+"";
        ResultSet result = connection.getState().executeQuery(query);
        
        int nbCouple = result.getInt(1);
        if(nbCouple == 1 )
        {
            return true;
        }
        else
            return false;
    	
    }
    
 }


