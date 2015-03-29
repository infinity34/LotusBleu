package Data;

/**
 * this class allows to create an user
 * we can associate a role to the user
 * all getter and setter are presents
 * 
 * @author remy
 * 
 */
public class User {


	// Instance Variables ***********************************************
	/**
	 * Represents the username of an user 
	 */
	private String username;

	/**
	 * Represents user first name of an user
	 */
	private String userfirstname;

	/**
	 * Represents the first part of the user address
	 */
	private String address1;

	/**
	 * Represents the second part of the user address
	 * if the first field can't support all characters
	 */
	private String address2;

	/**
	 * Represents the post code of an user
	 */
	private String postcode;

	/**
	 * Represents the city name of the user
	 */
	private String city;

	/**
	 * Represents the mail of an user
	 * two users can't have the same mail
	 */
	private String usermail;
	
	/**
	 * Represents the phone of the user
	 */
	private String phone;

	/**
	 * Represents the password encrypted of an user
	 */
	private String password;
	

	/**
	 * represents the role of an user
	 * (admin, incharge, member)
	 */
	private UserRole userRole;

	// Constructor ******************************************************

	public User(){

	}

	/**
	 * Construct the user
	 * 
	 * @param mail
	 * @param username
	 * @param userFirstName
	 * @param address
	 * @param address2
	 * @param postcode
	 * @param city
	 * @param phone
	 * @param userRole
	 */
	public User(String mail, String username, String userFirstName,
				String address, String address2, String postcode,
				String city, String phone, UserRole userRole){

		this.usermail = mail;
		this.username = username;
		this.userfirstname = userFirstName;
		this.address1 = address;
		this.address2 = address2;
		this.postcode = postcode;
		this.city = city;
		this.phone = phone;
		this.userRole = userRole;
	}

	// Accessing methods ************************************************

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * set the user name
	 * 
	 * @param username
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
	 * set the firstname of the user
	 * 
	 * @param userfirstname
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
	 * set the address of the user
	 * 
	 * @param address1
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
	 * set the second part of the 
	 * address of the user
	 * 
	 * @param address2
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
	 * set the post code of the user
	 * @param postcode
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
	 * set the city name of the user
	 * 
	 * @param city
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
	 * set the email of the user
	 * @param usermail
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
	 * set the password of the user
	 * the password must be encrypted
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * set the phone of the user
	 * 
	 * @param password
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/**
	 * @return the userRole
	 */
	public UserRole geUserRole() {
		return userRole;
	}

	/**
	 * set the user role of the user
	 * the user can be member, in charge or admin 
	 * @param userRole
	 */
	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
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
