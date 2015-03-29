
package Functions;

import java.util.ArrayList;

import Data.Category;
import Persistence.CategoryManagerBD;
/**
 * Category facade
 * Designed by Lyvia
 * Developped by Clément
 */

public class CategoryFacade {
	
	private static CategoryFacade facade;
	
	private CategoryFacade()
	{
		
	}
	
	/**
	 *	@param name
	 *	@param motherCategoryName
	 *	@param available
	 *	@return true if the category has been created, false else
	 */
    public boolean createCategory(String name, String motherCategoryName, Boolean available) {    
    	
    	return CategoryManagerBD.getManagerDB().createCategory(name, motherCategoryName, available);
    	
    } 

    /**
	 *	@param oldName
	 *	@param name
	 *	@param fatherCategory
	 *	@param available
	 *	@return true if the category has been updated, false else
	 */

    public boolean updateCategory(String oldName, String name, String fatherCategory, Boolean available) {        
    	return CategoryManagerBD.getManagerDB().updateCategory(oldName, name, fatherCategory, available);
    } 

    /**
   	 *	@param name   	
   	 *	@return true if the category has been deleted, false else
   	 */

    public boolean deleteCategory(String name) {        
        return CategoryManagerBD.getManagerDB().deleteCategory(name);
    } 

    /**
   	 *	   	
   	 *	@return a list of all the category present in database
   	 */
    public ArrayList<Category> getAllCategory() {    
    	
    	return Persistence.CategoryManagerBD.getManagerDB().getAllCategory();
    } 
    /**
   	 *	@param name   	
   	 *	@return return a category fetch by his name
   	 */
    public Category getCategory(String name) {
		return CategoryManagerBD.getManagerDB().getCategory(name);
    }
    
    /**
   	 *	@param name   	
   	 *	@return return a categoryID fetch by his name
   	 */
    public int getCategoryID(String name) {
		return CategoryManagerBD.getManagerDB().getCategoryID(name);	
    	
    }
    
    /**
   	 *	@param id   	
   	 *	@return return a category fetch by his id
   	 */
    public Category getCategory(int id) {
		return CategoryManagerBD.getManagerDB().getCategory(id);
    	
    	
    }
    

    /**
   	 *  	
   	 *	@return return a facade (singleton way)
   	 */
	public static CategoryFacade getFacade() {
		if (facade == null)
		{
			facade = new CategoryFacade();
		}		
		return facade;
		
	}
 }
