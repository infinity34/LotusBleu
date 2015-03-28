
package Functions;

import java.util.ArrayList;

import Data.Category;
import Persistence.CategoryManagerBD;
import UI.MainFrame;


public class CategoryFacade {
	
	private static CategoryFacade facade;
	
	private CategoryFacade()
	{
		
	}
	

    public boolean createCategory(String name, String motherCategoryName, Boolean available) {    
    	
    	return CategoryManagerBD.getManagerDB().createCategory(name, motherCategoryName, available);
    	
    } 


    public boolean updateCategory(String oldName, String name, String fatherCategory, Boolean available) {        
    	return CategoryManagerBD.getManagerDB().updateCategory(oldName, name, fatherCategory, available);
    } 


    public boolean deleteCategory(String name) {        
        return CategoryManagerBD.getManagerDB().deleteCategory(name);
    } 

    public ArrayList<Category> getAllCategory() {    
    	
    	return Persistence.CategoryManagerBD.getManagerDB().getAllCategory();
    } 
    
    public Category getCategory(String name) {
		return CategoryManagerBD.getManagerDB().getCategory(name);
    	
    	//return categoryManager.getCategory().get(0);
    }
    
    public int getCategoryID(String name) {
		return CategoryManagerBD.getManagerDB().getCategoryID(name);
    	
    	
    }
    

    

    private CategoryManagerBD categoryManager;

	public static CategoryFacade getFacade() {
		if (facade == null)
		{
			facade = new CategoryFacade();
		}
		
		return facade;
		
	}
 }
