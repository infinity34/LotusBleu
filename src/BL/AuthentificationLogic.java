
package BL;
import BL.IUserStore;

/**
 * 
 * 
 * @poseidon-object-id [Im7393253bm14bd0a52e7dmm7e20]
 */
public class AuthentificationLogic implements IUser {
/**
 * 
 * 
 * @poseidon-object-id [Im7393253bm14bd0a52e7dmm7e07]
 */
    private Data.DataBase database;
    


@Override
public Boolean checkCredentials(String username, String password) {
	// TODO Auto-generated method stub
	return database.checkCredentials(username,password);
}

@Override
public Boolean changePassword(String username, String oldPass, String newPass) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String createUser(String username) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deleteUser(String username) {
	// TODO Auto-generated method stub
	
}
 }
