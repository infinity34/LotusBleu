
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
					allCat.add(new Category(
							resultat.getString("categoryName"),
							resultat.getBoolean("available")));	
			
						
				
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
		public void getCategory() {
			// TODO Auto-generated method stub
			
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
		public void getCategory(String name) {
			// TODO Auto-generated method stub
			
		} 
    
 }
