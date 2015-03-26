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
			ResultSet resultat = connection.getState().executeQuery("SELECT * FROM ACCESSORY");
			this.accessories = new ArrayList<Accessory>();
			while (resultat.next()){
				//Add the accessory in the arrayList
				this.accessories.add(new Accessory(resultat.getString("accessoryName")));
			}
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

	@Override
	public Accessory getAnAccessory(String accessoryName) {
		Accessory accessory = null;
		try {
			ResultSet resultat = connection.getState().executeQuery("SELECT * FROM ACCESSORY WHERE accessoryName = \""+accessoryName+"\"" );
			resultat.last();
			//System.out.println(resultat.getRow());
			if(resultat.getRow()!=0){
				accessory = new Accessory(resultat.getString("accessoryName"));
				return accessory;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accessory;
	}
}
