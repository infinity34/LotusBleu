
package BL;

/**
 * 
 * 
 */
public abstract class RegistrationManager {

	/**
	 * 
	 * 
	 */
	public BL.SessionManager sessionManager;

	/**
	 * 
	 * 
	 */
	public abstract boolean register(String username, String password,String userFirstName, String address1, String address2, int postCode, String city, String phone, boolean isAdmin, boolean isResponsible, boolean isContributor, boolean isMember);
}
