package Data;

import java.util.ArrayList;

/**
 * 
 * 
 */
public class User {

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 * 
	 */
	private String username;
	
	/**
	 * <p>
	 * Represents ...
	 * </p>
	 * 
	 */
	private String userfirstname;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 * 
	 */
	private String address1;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 * 
	 */
	private String address2;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 * 
	 */
	private int postcode;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 * 
	 */
	private String city;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 * 
	 */
	private String usermail;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 * 
	 */
	private String password;
	
	private ArrayList<UserRole> roles;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the userfirstname
	 */
	public String getUserfirstname() {
		return userfirstname;
	}

	/**
	 * @param userfirstname
	 *            the userfirstname to set
	 */
	public void setUserfirstname(String userfirstname) {
		this.userfirstname = userfirstname;
	}

	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * @param address1
	 *            the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * @param address2
	 *            the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	/**
	 * @return the postcode
	 */
	public int getPostcode() {
		return postcode;
	}

	/**
	 * @param postcode
	 *            the postcode to set
	 */
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the usermail
	 */
	public String getUsermail() {
		return usermail;
	}

	/**
	 * @param usermail
	 *            the usermail to set
	 */
	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the roles
	 */
	public ArrayList<UserRole> getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(ArrayList<UserRole> roles) {
		this.roles = roles;
	}

	/**
	 * @param role, the role to add
	 */
	public void addRole(UserRole role){
		this.roles.add(role);
	}
	
	/**
	 * @param role, the roll to remove
	 */
	public void removeRole(UserRole role){
		this.roles.remove(role);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [username=" + username + ", userfirstname="
				+ userfirstname + ", address1=" + address1 + ", address2="
				+ address2 + ", postcode=" + postcode + ", city=" + city
				+ ", usermail=" + usermail + ", password=" + password + "]";
	}
}
