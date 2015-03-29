package Persistence;

import java.sql.SQLException;

import Tools.DBconnection;
/**
 * 
 * 
 */
public class RegisterForClassSessionManagerRegistrationManagerDB {
	/**
	 * 
	 * 
	 */
	private Tools.DBconnection dbConnection;

	public RegisterForClassSessionManagerRegistrationManagerDB() {

		dbConnection = DBconnection.getConnection();

	}

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * 
	 * 
	 */
	
	public boolean register(String username, String password,String userFirstName, String address1, String address2, int postCode, String city, String phone, boolean isAdmin, boolean isResponsible, boolean isContributor, boolean isMember) {

		try {
			int statut = dbConnection.getState().executeUpdate(
					"INSERT INTO lotusbleu.USER (password,userName,userFirstName,address1,address2,postCode,city,phone,isAdmin,isResponsible,isContributor,isMember)"
					+ "VALUES(\""+  password +","+ username +","+ userFirstName +","+ address1 +","+ address2 +","+ postCode +","+  city +","+  phone +","+  isAdmin +","+  isResponsible +","+  isContributor +","+  isMember);
			System.out.println("resultat insertion : "+ statut);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
		//SessionManager.Login(username, password)
	}
}