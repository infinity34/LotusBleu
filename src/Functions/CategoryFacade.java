
package Functions;

import java.util.ArrayList;

import Data.Category;


public class CategoryFacade {
	

    public Data.Category createCategory(String name, Data.Category motherCategory, Boolean available) {    
    	
    	categoryManager.createCategory(name, motherCategory, available);
    	
        return null;
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
    

    

    public Persistence.CategoryManager categoryManager;

	public static CategoryFacade getFacade() {
		// TODO Auto-generated method stub
		return null;
	}
 }
