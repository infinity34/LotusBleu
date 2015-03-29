
package Functions;

import java.util.ArrayList;
import java.util.List;

import Data.Basket;
import Data.Category;
import Data.Product;
import Persistence.ShoppingManager;
import Persistence.ShoppingManagerDB;

public class ShoppingFacade {

	private static ShoppingFacade shopFacade;
    private Functions.SessionFacade session;
    private Persistence.ProductManager productManager;
    private Persistence.ShoppingManager shoppingManager;
    public Functions.PaymentFacade paymentFacade;

    private ShoppingFacade(){
    	shoppingManager = new ShoppingManagerDB();
    }
    
    public static ShoppingFacade getShoppingFacade(){
    	if (shopFacade == null){
    		shopFacade = new ShoppingFacade();
    	}
    	return shopFacade;
    }
    public ArrayList<Product> getProducts() {        
        // your code here
        return null;
    } 

    public ArrayList<Category> getMainCategories(){
		return shoppingManager.getMainCategories();
    	
    }
    
    public ArrayList<Category> getSubCategories(String parentCat){
		return shoppingManager.getSubCategories(parentCat);
    	
    }
    
	public List<Product> getProductsByCat(int category) {
		return shoppingManager.getProductsByCat(category);
	}
    
    public ArrayList<Product> getProductByKeyword(String keyword) {        
        // your code here
        return null;
    } 


    public void addProductToBasket(Product product, int quantity) {        
        // your code here
    } 


    public void removeProductFromBasket(Product productToRemove) {        
        // your code here
    } 


    public void validBasket(Basket basket) {        
        // your code here
    } 


    public Basket getBasket() {        
        // your code here
        return null;
    } 
 }
