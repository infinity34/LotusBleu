
package Persistence;

import java.util.ArrayList;

import Data.Category;
import Data.Notification;

public abstract class CategoryManager {

	protected ArrayList<Category> category;

    public ArrayList<Category> getCategory() {
		return category;
	}

    public void createCategory(String name, String motherCategoryName, Boolean available) {} 

    public void updateCategory(String name, Data.Category fatherCategory, Boolean available) {        
        // your code here
    } 

    public void deleteCategory(String name) {        
        // your code here
    } 

    public void getAllCategory() {} 
    public void getCategory(String name) {}
 }
