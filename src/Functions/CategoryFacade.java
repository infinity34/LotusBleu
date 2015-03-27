
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


    public void updateCategory(String name, Data.Category fatherCategory, Boolean available) {        
        // your code here
    } 


    public void deleteCategory(String name) {        
        // your code here
    } 

    public ArrayList<Category> getAllCategory() {    
    	
    	return Persistence.CategoryManagerBD.getManagerDB().getAllCategory();
    } 
    
    public Category getCategory(String name) {
		return null;
    	
    	//return categoryManager.getCategory().get(0);
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
