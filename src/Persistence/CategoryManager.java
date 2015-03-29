
package Persistence;

import java.util.ArrayList;

import Data.Category;

/**
 * Category Manager
 * Designed by Lyvia
 * Developped by Clément
 */

public abstract class CategoryManager {


	/**
	 *	@param name
	 *	@param motherCategoryName
	 *	@param available
	 *	@return true if the category has been created, false else
	 */
    public abstract boolean createCategory(String name, String motherCategoryName, Boolean available);
    /**
	 *	@param oldName
	 *	@param name
	 *	@param fatherCategory
	 *	@param available
	 *	@return true if the category has been updated, false else
	 */
    public abstract boolean updateCategory(String oldName, String name, String fatherCategory, Boolean available);       
    /**
   	 *	@param name   	
   	 *	@return true if the category has been deleted, false else
   	 */
    public abstract boolean deleteCategory(String name);
    /**
   	 *	   	
   	 *	@return a list of all the category present in database
   	 */
    public abstract ArrayList<Category> getAllCategory();
    /**
   	 *	@param name   	
   	 *	@return return a category fetch by his name
   	 */
    public abstract Category getCategory(String name);
    /**
   	 *	@param name   	
   	 *	@return return a categoryID fetch by his name
   	 */
    public abstract int getCategoryID(String name);
    /**
   	 *	@param id   	
   	 *	@return return a category fetch by his id
   	 */
    public abstract Category getCategory(int id);
    
 }
