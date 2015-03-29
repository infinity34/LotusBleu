
package Persistence;

import java.sql.Date;
import java.util.ArrayList;

import Data.User;

/**
 * 
 * 
 */
public class SessionManagerXML extends Persistence.SessionManager {

	@Override
	public Boolean Login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePassword(String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerForAYear(Date date, boolean firstSubscription) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean register(String usermail, String firstname, String lastname,
			String address, String address2, String city, int postcode,
			String telephone, String password, boolean inCharge, boolean admin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setRegistration(String firstname, String lastname,
			String address, String address2, String city, int postcode,
			String telephone, String password, User oldUser) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<User> displayRegistrations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteRegistration(String usermail) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getRegistration(String usermail) {
		// TODO Auto-generated method stub
		return null;
	}
 }
