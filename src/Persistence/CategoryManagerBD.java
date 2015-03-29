
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
	
	public ArrayList<Category> getAllCategory() {
		ArrayList<Category> allCat = new ArrayList<Category>();
		try {
			ResultSet resultat = connection.getState().executeQuery("SELECT * FROM lotusbleu.CATEGORY");
			while (resultat.next()) {
				
				if(resultat.getString("subCategoryOf").isEmpty())
				{
					allCat.add (new Category(
							resultat.getString("categoryName"),
							resultat.getBoolean("available")));	
				}
				else
				{
					boolean tmp = resultat.getBoolean("available");
					allCat.add (new Category(
							resultat.getString("categoryName"),
							resultat.getString("subCategoryOf"),
							tmp));	
				}						
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allCat;
	}
		
		public boolean createCategory(String name, String motherCategoryName, Boolean available) {   
				try {
					int avail;
					if(available)
					{
						avail= 1;
					}
					else
					{
						avail= 0;
					}					
					
					connection.getState().executeUpdate("INSERT INTO lotusbleu.CATEGORY(categoryName,available,subCategoryOf) " +
							"VALUES(\""+ name +"\",\""+avail+"\",\""+motherCategoryName+"\")");
					return true;
				} catch (SQLException e) {
					return false;
				}
				
	    }

		@Override
		public boolean updateCategory(String oldName, String name, String fatherCategory,	Boolean available) {
			try {
				int avail;
				if(available)
				{
					avail= 1;
				}
				else
				{
					avail= 0;
				}	
				int resultat = connection.getState().executeUpdate("UPDATE CATEGORY SET " +
						"categoryName = \"" +name+"\", subCategoryOf = \""+fatherCategory+"\", available =\""+avail+"\""+
						"WHERE  categoryName =  \"" +oldName+"\"");
				if(resultat > 0)
					return true;
				else
					return false;
						
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
			
		}

		@Override
		public boolean deleteCategory(String name) {
			try {
				int resultat = connection.getState().executeUpdate("DELETE FROM lotusbleu.CATEGORY WHERE " +
						"categoryName = \""+name+"\"" +
						"OR subCategoryOf = \""+name+ "\"");
				if(resultat > 0)
					return true;
				else
					return false;
						
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
			
		}

		@Override
		public Category getCategory(String name) {
			try {
				ResultSet resultat = connection.getState().executeQuery("SELECT * FROM lotusbleu.CATEGORY WHERE categoryName = \""+name+"\"");
				resultat.next();
				
				if(resultat.getString("subCategoryOf").isEmpty())
				{
					return (new Category(
							resultat.getString("categoryName"),
							resultat.getBoolean("available")));	
				}
				else
				{
					boolean tmp = resultat.getBoolean("available");
					return (new Category(
							resultat.getString("categoryName"),
							resultat.getString("subCategoryOf"),
							tmp));	
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}

		@Override
		public int getCategoryID(String name) {
			try {
				ResultSet resultat = connection.getState().executeQuery("SELECT * FROM lotusbleu.CATEGORY WHERE categoryName = '"+name+"'");
				resultat.next();
				return resultat.getInt("categoryID");
			} catch (SQLException e) {
				e.printStackTrace();
				return 0;
			}
			
			
		}

		@Override
		public Category getCategory(int id) {
		
			try {
				ResultSet resultat = connection.getState().executeQuery("SELECT * FROM lotusbleu.CATEGORY WHERE categoryID = \""+id+"\"");
				resultat.next();
				
				if(resultat.getString("subCategoryOf").isEmpty())
				{
					return (new Category(
							resultat.getString("categoryName"),
							resultat.getBoolean("available")));	
				}
				else
				{
					boolean tmp = resultat.getBoolean("available");
					return (new Category(
							resultat.getString("categoryName"),
							resultat.getString("subCategoryOf"),
							tmp));	
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		} 
    
 }
