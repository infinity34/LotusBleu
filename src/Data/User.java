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
	private String postcode;

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
	
	private MemberRole memberRole;
	
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
	public String getPostcode() {
		return postcode;
	}

	/**
	 * @param postcode
	 *            the postcode to set
	 */
	public void setPostcode(String postcode) {
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
	 * @return the memberRole
	 */
	public MemberRole getMemberRole() {
		return memberRole;
	}

	/**
	 * @param memberRole the memberRole to set
	 */
	public void setMemberRole(MemberRole memberRole) {
		this.memberRole = memberRole;
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
