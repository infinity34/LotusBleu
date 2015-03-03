
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
 *
 * @param username 
 * @param oldPass 
 * @param newPass 
 * @return 
 */
    public Boolean changePassword(String username, String oldPass, String newPass);

/**
 * @param username 
 * @return 
 */
   public String createUser(String username);


/**
 * @param username 
 */
    public void deleteUser(String username);
 }
