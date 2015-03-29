package Persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;

import Data.Activity;
import Data.AdminRole;
import Data.ContributorRole;
import Data.Event;
import Data.InChargeRole;
import Data.MemberRole;
import Data.Payment;
import Data.Subscription;
import Data.TimeSlot;
import Data.User;
import Data.UserRole;
import Functions.SessionFacade;
import Tools.DBconnection;
import Tools.PasswordHash;

/**
 * 
 * 
 */
public class SessionManagerDB extends Persistence.SessionManager {
	/**
	 * 
	 * 
	 */
	private DBconnection dbConnection;

	public SessionManagerDB() {
		super();
		dbConnection = DBconnection.getConnection();
	}

	/**
	 * <p>
	 * Return true if the pair mail/password is OK
	 * </p>
	 * 
	 * @author max
	 * @return
	 */
	public Boolean Login(String username, String password) {

		int numberOfRows = 0;
		try {
			// Cryptage du mot de passe
			password = PasswordHash.PasswordHash(password);
			// Récupération de l'utilisateur
			ResultSet resultat = dbConnection.getState().executeQuery(
					"SELECT * FROM lotusbleu.USER WHERE mail=\"" + username
					+ "\" AND password = \"" + password + "\"");
			resultat.last();
			numberOfRows = resultat.getRow();
			// S'il existe on créé l'objet associé
			if (numberOfRows > 0) {
				user.setUsername(resultat.getString("userName"));
				user.setUserfirstname(resultat.getString("userFirstName"));
				user.setAddress1(resultat.getString("address1"));
				user.setAddress2(resultat.getString("address2"));
				user.setCity(resultat.getString("city"));
				user.setPostcode(resultat.getString("postCode"));
				user.setUsermail(resultat.getString("mail"));

				// Création du MemberRole, de la subscription et du payment
				// associé à la subscription
				if (resultat.getInt("isMember") == 1) {
					ResultSet resultatMember = dbConnection
							.getState()
							.executeQuery(
									"SELECT * FROM lotusbleu.USER U, lotusbleu.SUBSCRIPTION S WHERE U.mail=\""
											+ user.getUsermail()
											+ "\" AND U.mail = S.userID");
					resultatMember.next();
					Date subscriptionDate = resultatMember
							.getDate("subscriptionDate");
					Date subscriptionEndDate = resultatMember
							.getDate("subscriptionEndDate");
					/*Payment payment = new Payment(
							resultatMember.getInt("paymentAmount"),
							resultatMember.getDate("paymentDate"));*/
					Payment payment = null;
					user.setUserRole(new MemberRole(new Subscription(
							subscriptionDate, subscriptionEndDate, payment)));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (numberOfRows > 0);
	}

	public void updateUser() {
		try {
			dbConnection.getState().executeQuery(
					"UPDATE User SET userName =" + user.getUsername()
					+ "AND userFirstName=" + user.getUserfirstname()
					+ "AND address1=" + user.getAddress1()
					+ "AND address2 = " + user.getAddress2()
					+ "AND city = " + user.getCity() + "AND postCode="
					+ user.getPostcode() + " WHERE  mail = "
					+ user.getUsermail());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void changePassword(String password) {
		try {
			dbConnection.getState().executeQuery(
					"UPDATE User SET password =" + password + " WHERE  mail = "
							+ user.getUsermail());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void registerForAYear(Date date, boolean firstSubscription) {
		java.util.Date current = new java.util.Date();
		Date sqlDate = new Date(current.getTime());
		try {
			dbConnection.getState().executeUpdate(
					"UPDATE SUBSCRIPTION SET subscriptionEndDate ='" + date.toString()
					+ "', subscriptionDate ='"+sqlDate.toString()+"' WHERE  userID = \""
					+ user.getUsermail()+"\"");
			String insert = "INSERT INTO PAYMENT (paymentAmount,paymentDate) VALUES (100, '"
					+ date.toString() + "')";
			System.out.println(insert);
			dbConnection.getState().execute(insert);
			if (firstSubscription) {
				String query = "INSERT INTO SUBSCRIPTION (userID, subscriptionDate, subscriptionEndDate) VALUES (\""+user.getUsermail()+"\",'"+sqlDate.toString()+"','"+date.toString()+"')";
				System.out.println(query);
				dbConnection.getState().execute(query);
			} else {
				String query = "UPDATE SUBSCRIPTION SET subscriptionEndDate = '"
						+ date.toString()
						+ "' WHERE  userID = \""
						+ user.getUsermail() + "\"";
				System.out.println(query);
				dbConnection.getState().executeUpdate(query);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * regiter a user in the database
	 * and login
	 * and send an answer for the right
	 * @param usermail
	 * @param firstname
	 * @param lastname
	 * @param address
	 * @param address2
	 * @param city
	 * @param postcode
	 * @param telephone
	 * @param password
	 * @return
	 */
	public boolean register(String usermail, String firstname, String lastname,
			String address, String address2, String city, int postcode,
			String telephone, String password,  boolean inCharge, boolean admin) {

		/*On encrypte le password*/
		String pwd;
		int statut = 0;
		try {
			pwd = PasswordHash.PasswordHash(password);
			try {
				statut = dbConnection.getState().executeUpdate(
						"INSERT INTO lotusbleu.USER (mail,password,userName,userFirstName,address1,address2,postCode,city,phone,isAdmin,isResponsible,isContributor,isMember)"
								+ "VALUES('"+ usermail+ "', '"+  pwd +"', '"+ firstname +"', '"+ lastname +"', '"+ address +"', '"+ address2 +"', '"+ postcode +"', '"+  city +"', '"+  telephone +"',"+ 0 +"," + 0 +"," + 0 +"," + 0 +")");
				
				
				if(inCharge){
					User user = SessionFacade.getSessionFacade().GetCurrentUser();
					String message = user.getUserfirstname() + " " + user.getUsername()
							+ " a fait une demande pour devenir inCharge";
					dbConnection.getState().executeUpdate(
							"INSERT INTO lotusbleu.NOTIFICATION (notificationMessage,notificationDate,userID) VALUES('"
							+ message +"' ,current_date() , '"
							+ user.getUsermail() + "')");
				}
				if(admin){
					User user = SessionFacade.getSessionFacade().GetCurrentUser();
					String message = user.getUserfirstname() + " " + user.getUsername()
							+ " a fait une demande pour devenir admin";
					dbConnection.getState().executeUpdate(
							"INSERT INTO lotusbleu.NOTIFICATION (notificationMessage,notificationDate,userID) VALUES('"
							+ message +"' ,current_date() , '"
							+ user.getUsermail() + "')");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		if(statut==1){
			this.Login(usermail, password);
			return true;
		}
		else{
			return false;
		}
	}

	public boolean setRegistration(String firstname, String lastname,
			String address, String address2, String city, int postcode,
			String telephone, String password, User oldUser) {
		
		String pwd="";
		if(password.equals("")){
			/*On encrypte le password*/
			try {
				pwd = PasswordHash.PasswordHash(password);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{ 
			pwd= oldUser.getPassword();
		}

		int statut = 0;

		try {
			statut = dbConnection.getState().executeUpdate(
					"UPDATE lotusbleu.USER SET "
					+ "password ='" + pwd 
					+ "', userName = '" + firstname 
					+"',userFirstName ='" + lastname
					+"',address1 ='" + address 
					+ "',address2 ='" + address2
					+ "',postCode =" + postcode
					+ ",city ='" + city
					+ "',phone ='"+ telephone
					+"' Where mail='"+ oldUser.getUsermail()+"'");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(statut==1){
			this.Login(oldUser.getUsermail(), password);
			return true;
		}
		else{
			return false;
		}
	}
	
	public ArrayList displayRegistrations(){
		ArrayList<User> registration = new ArrayList<User>();   
		User user;
		
		ResultSet resultat = null;
		try {
			resultat = dbConnection.getState().executeQuery(
					"SELECT * FROM lotusbleu.User");
			
			resultat.beforeFirst();
			while(resultat.next()) {
			
				String mail = resultat.getString("mail");
				String username = resultat.getString("userName");
				String userFirstName = resultat.getString("userFirstName");
				String address = resultat.getString("address1");
				String address2 = resultat.getString("address2");
				String postcode = resultat.getString("postCode");
				String city = resultat.getString("city");
				String phone = resultat.getString("phone");
				String isAdmin =  resultat.getString("isAdmin");
				String isRespo =  resultat.getString("isResponsible");
				String isContrib =  resultat.getString("isContributor");
				String isMember =  resultat.getString("isMember");
				
				UserRole userRole;
				if (isAdmin.equals("1")){
					userRole = new AdminRole();
				}
				else if(isRespo.equals("1")){
					userRole = new InChargeRole();
				}
				else if(isContrib.equals("1")){
					userRole = new ContributorRole();
				}
				else if(isMember.equals("1")){
					userRole = new MemberRole();
				}
				else{
					userRole = new UserRole();
				}

				user = new User(mail,username, userFirstName, address, address2, postcode, city, phone, userRole);
				
				//Add the user in the registration ArrayList
				registration.add(user);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				resultat.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return registration;
	}

}
