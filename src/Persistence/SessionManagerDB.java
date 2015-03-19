package Persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

import Data.MemberRole;
import Data.Payment;
import Data.Subscription;
import Tools.DBconnection;

/**
 * 
 * 
 <<<<<<< HEAD
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
				user.setPostcode(resultat.getInt("postCode"));
				user.setUsermail(resultat.getString("mail"));

				// Création du MemberRole, de la subscription et du payment
				// associé à la subscription
				if (resultat.getInt("isMember") == 1) {
					ResultSet resultatMember = dbConnection
							.getState()
							.executeQuery(
									"SELECT  FROM lotusbleu.USER U, lotusbleu.SUBSCRIPTION S, lotusbleu.PAYMENT P WHERE U.mail=\""
											+ username
											+ "\" AND U.mail = S.userID AND S.paymentID = P.paymentID");

					Date subscriptionDate = resultatMember
							.getDate("subscriptionDate");
					Date subscriptionEndDate = resultatMember
							.getDate("subscriptionEndDate");
					Payment payment = new Payment(
							resultatMember.getInt("paymentAmount"),
							resultatMember.getDate("paymentDate"));
					user.setMemberRole(new MemberRole(new Subscription(
							subscriptionDate, subscriptionEndDate, payment)));
				}
			}
		} catch (SQLException e) {
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

	public void registerForAYear(Date date) {
		try {
			dbConnection.getState().executeQuery(
					"UPDATE Subscription SET endDate =" + date.toString()
							+ " WHERE  userID = "
							+ user.getUsermail());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}