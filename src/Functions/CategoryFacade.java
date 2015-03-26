
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
	

    public void createCategory(String name, String motherCategoryName, Boolean available) {    
    	
    	CategoryManagerBD.getManagerDB().createCategory(name, motherCategoryName, available);
    	
    } 


    public void updateCategory(String name, Data.Category fatherCategory, Boolean available) {        
        // your code here
    } 


    public void deleteCategory(String name) {        
        // your code here
    } 

    public ArrayList<Category> getAllCategory() {    
    	
    	return categoryManager.getCategory();
    } 
    
    public Category getCategory(String name) {
    	
    	return categoryManager.getCategory().get(0);
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
