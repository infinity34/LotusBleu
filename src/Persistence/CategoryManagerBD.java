
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
				/*if(resultat.getString("subCategoryOf") != "")
				{
					ResultSet resultTmp = connection.getState().executeQuery("SELECT * FROM lotusbleu.CATEGORY WHERE categoryName = \""+resultat.getString("subCategoryOf")+"\"");
					Category cateTmp = new Category(
							resultTmp.getString("categoryName"),
							resultTmp.getBoolean("available"));
					
					allCat.add(new Category(
							resultat.getString("categoryName"),
							cateTmp,
							resultat.getBoolean("available")));
				}
				else
				{*/
					allCat.add(new Category(
							resultat.getString("categoryName"),
							resultat.getBoolean("available")));					
				//}
			
						
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allCat;
	}
		
		public boolean createCategory(String name, String motherCategoryName, Boolean available) {   
				try {
					System.out.println(motherCategoryName);
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
					//e.printStackTrace();
					return false;
				}
				
	    }

		@Override
		public void getCategory() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void updateCategory(String name, Category fatherCategory,
				Boolean available) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteCategory(String name) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void getCategory(String name) {
			// TODO Auto-generated method stub
			
		} 
    
 }
