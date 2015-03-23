package Persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Data.Accessory;
import Data.Activity;
import Tools.DBconnection;

/**
 * Accessory
 * Designed by Maxime
 * Developed by Prisca
 */

public class AccessoryManagerDB extends Persistence.AccessoryManager {

	DBconnection connection;
	private ArrayList<Accessory> accessories;
	
	public AccessoryManagerDB() {
		super();
		this.connection = DBconnection.getConnection();
	}

	@Override
	public ArrayList<Accessory> getAccessories() {
		try {
			ResultSet resultat = connection.getState().executeQuery("SELECT * FROM lotusbleu.ACCESSORY");
			this.accessories = new ArrayList<Accessory>();
			do {
				//Add the activity in the events ArrayList
				this.accessories.add(new Accessory(resultat.getString("accessoryName")));
			} while (resultat.next());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.accessories;
	}


	@Override
	public Boolean addAccessory(String name) {
		try {
			connection.getState().executeUpdate("INSERT INTO ACCESSORY(accessoryID,accessoryName) VALUE( DEFAULT,'"+ name +"')");
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Boolean setAccessory(Accessory accessory, String newName) {
		try {
			connection.getState().executeUpdate(
					"UPDATE ACCESSORY SET accessoryName = '" + newName + "' WHERE accessoryName= '"+ accessory.getAccessoryName()+"'");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Boolean deleteAccessory(Accessory accessory) {
		try {
			connection.getState().executeUpdate("DELETE FROM ACCESSORY WHERE accessoryName= '"+ accessory.getAccessoryName()+"'");
			return true;
		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}	
		return false;
	}
}
