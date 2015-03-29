
package Persistence;

import java.util.ArrayList;

import Data.Category;

/**
 * Category Manager XML
 * Designed by Lyvia
 * Developped by Clément
 */
class CategoryManagerXML extends Persistence.CategoryManager {

	@Override
	/**
	 *	@param name
	 *	@param motherCategoryName
	 *	@param available
	 *	@return true if the category has been created, false else
	 */
	public boolean createCategory(String name, String motherCategoryName,
			Boolean available) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
    /**
	 *	@param oldName
	 *	@param name
	 *	@param fatherCategory
	 *	@param available
	 *	@return true if the category has been updated, false else
	 */
	public boolean updateCategory(String oldName, String name,
			String fatherCategory, Boolean available) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
    /**
   	 *	@param name   	
   	 *	@return true if the category has been deleted, false else
   	 */
	public boolean deleteCategory(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
    /**
   	 *	   	
   	 *	@return a list of all the category present in database
   	 */
	public ArrayList<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    /**
   	 *	@param name   	
   	 *	@return return a category fetch by his name
   	 */
	public Category getCategory(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    /**
   	 *	@param name   	
   	 *	@return return a categoryID fetch by his name
   	 */
	public int getCategoryID(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
    /**
   	 *	@param name   	
   	 *	@return return a category fetch by his id
   	 */
	public Category getCategory(int id) {
		// TODO Auto-generated method stub
		return null;
	}
 }
