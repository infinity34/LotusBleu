
package Persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Data.Category;
import Data.Notification;
import Data.User;
import Tools.DBconnection;


public class CategoryManagerBD extends Persistence.CategoryManager {

    public DBconnection connection;
    
    public DBconnection getConnection() {
		return connection;
	}

	/**
	 * @param connection
	 *            the connection to set
	 */
	public void setConnection(DBconnection connection) {
		this.connection = connection;
	}
	
	public void getAllCategory() {
		this.category = new ArrayList<Category>();
		try {
			ResultSet resultat = connection.getState().executeQuery(
					"SELECT * FROM lotusbleu.CATEGORY");
			while (resultat.next()) {
				/*
				this.category.add(new Category(resultat
						.getString("Name"), resultat
						.getBoolean("available"),resultat.getDate("notificationDate"), resultat
						.getInt("notificationID")));
						*/
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
		public void getCategory(String name) {
			this.category = new ArrayList<Category>();
			try {
				ResultSet resultat = connection.getState().executeQuery(
						"SELECT * FROM lotusbleu.CATEGORY WHERE name = ");
				while (resultat.next()) {
					/*
					this.category.add(new Category(resultat
							.getString("Name"), resultat
							.getBoolean("available"),resultat.getDate("notificationDate"), resultat
							.getInt("notificationID")));
							*/
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
		
		public Data.Category createCategory(String name, Data.Category fatherCategory, Boolean available) {        
			try {
				ResultSet resultat = connection.getState().executeQuery(""
						//"SELECT * FROM lotusbleu.CATEGORY WHERE name = "
						);
				while (resultat.next()) {
					/*
					this.category.add(new Category(resultat
							.getString("Name"), resultat
							.getBoolean("available"),resultat.getDate("notificationDate"), resultat
							.getInt("notificationID")));
							*/
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
	        return null;
	    } 
    
 }
