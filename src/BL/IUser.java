
package BL;



/**
 * 
 * 
 * @poseidon-object-id [Im7393253bm14bd0a52e7dmm7e46]
 */
public interface IUser {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Icc33101m14bdb5d6dd4mm7acd]
 * @param username 
 * @param password 
 * @return 
 */
    public Boolean checkCredentials(String username, String password);

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Icc33101m14bdb5d6dd4mm7a61]
 * @param username 
 * @param oldPass 
 * @param newPass 
 * @return 
 */
    public Boolean changePassword(String username, String oldPass, String newPass);

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Icc33101m14bdb5d6dd4mm79bf]
 * @param username 
 * @return 
 */
<<<<<<< HEAD
    public String createUser(String username) {        
        // your code here
    	
        return null;
    } 
=======
    public String createUser(String username);
>>>>>>> FETCH_HEAD

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Icc33101m14bdb5d6dd4mm797f]
 * @param username 
 */
    public void deleteUser(String username);
 }
