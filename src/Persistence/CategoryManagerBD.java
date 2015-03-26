
package Persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Data.Category;
import Data.Notification;
import Data.User;
import Functions.CategoryFacade;
import Tools.DBconnection;


public class CategoryManagerBD extends Persistence.CategoryManager {
	
	private static CategoryManagerBD managerBD;

    private DBconnection connection;
    
	
	private CategoryManagerBD()
	{
		this.connection = DBconnection.getConnection();
	}
	
	public static CategoryManagerBD getManagerDB()
	{
		if (managerBD == null)
		{
			managerBD = new CategoryManagerBD();
		}
		
		return managerBD;
	}
	
	public void getAllCategory() {
		this.category = new ArrayList<Category>();
		try {
			ResultSet resultat = connection.getState().executeQuery("SELECT * FROM lotusbleu.CATEGORY");
			while (resultat.next()) {/*
				this.category.add(new Category(resultat
						.getString("Name", resultat
						.getBoolean("available"),resultat.getDate("notificationDate"), resultat
						.getInt("notificationID")));*/
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
		
		public void createCategory(String name, String motherCategoryName, Boolean available) {   
				try {
					
					connection.getState().executeQuery("INSERT INTO lotusbleu.CATEGORY(categoryName,available,subCategoryOf) " +
							"VALUES(\""+ name +"\",\""+motherCategoryName+"\","+available+")");
				} catch (SQLException e) {
					e.printStackTrace();
				}
	    } 
    
 }
