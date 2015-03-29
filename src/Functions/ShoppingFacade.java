
package Functions;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Data.Basket;
import Data.Category;
import Data.OrderLine;
import Data.Payment;
import Data.Product;
import Persistence.ProductManagerDB;
import Persistence.ShoppingManagerDB;

public class ShoppingFacade {

	private static ShoppingFacade shopFacade;
    private Functions.SessionFacade session;
    private Persistence.ProductManager productManager;
    private Persistence.ShoppingManager shoppingManager;
    public Functions.PaymentFacade paymentFacade;

    private ShoppingFacade(){
    	shoppingManager = new ShoppingManagerDB();
    	session = SessionFacade.getSessionFacade();
    	this.productManager = new ProductManagerDB();
    }
    
    public static ShoppingFacade getShoppingFacade(){
    	if (shopFacade == null){
    		shopFacade = new ShoppingFacade();
    	}
    	return shopFacade;
    }
    public ResultSet getProducts() {        
    	return productManager.allProducts();
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
    	this.shoppingManager.getBasket().addLine(product, quantity);
    } 


    public void removeProductFromBasket(OrderLine orderline) {        
        // your code here
    } 


    public Boolean validBasket(Payment payment) {        
    	return shoppingManager.validBasket(payment);
    } 


    public Basket getBasket() {        
    	return Basket.getBasket(session.GetCurrentUser());
    } 
 }
