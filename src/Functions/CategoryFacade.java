
package Functions;

import java.util.ArrayList;

import Data.Category;

/**
 * 
 * 
 * @poseidon-object-id [I2299bb83m14c1d5ce94bmm797a]
 */
public class CategoryFacade {

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I2299bb83m14c1d5ce94bmm7818]
 * @param name 
 * @param fatherCategory 
 * @param available 
 * @return 
 */
    public Data.Category createCategory(String name, Data.Category fatherCategory, Boolean available) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I2299bb83m14c1d5ce94bmm774f]
 * @param name 
 * @param fatherCategory 
 * @param available 
 */
    public void updateCategory(String name, Data.Category fatherCategory, Boolean available) {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I2299bb83m14c1d5ce94bmm76b1]
 * @param name 
 */
    public void deleteCategory(String name) {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I2299bb83m14c1d5ce94bmm7671]
 * @return 
 */
    public ArrayList<Category> getAllCategory() {        
        // your code here
        return null;
    } 
/**
 * 
 * 
 * @poseidon-object-id [I2299bb83m14c1d5ce94bmm795e]
 */
    public UI.CategoryGUI categoryGUI;
/**
 * 
 * 
 * @poseidon-object-id [I2299bb83m14c1d5ce94bmm7922]
 */
    public Persistence.CategoryManager categoryManager;
 }
