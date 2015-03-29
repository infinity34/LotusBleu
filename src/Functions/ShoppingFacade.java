
package Functions;

import java.sql.ResultSet;
import java.util.ArrayList;

import Data.Basket;
import Data.Product;
import Persistence.ProductManagerDB;
import Persistence.ShoppingManager;
import Persistence.ShoppingManagerDB;

/**
 * 
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7dda]
 */
public class ShoppingFacade {

/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [I777ab4eam14bf4e91384mm7ca0]
 */
	static ShoppingFacade facade;
    private Functions.SessionFacade session;
    public Persistence.ProductManager productManager;
    public ShoppingManager shoppingManager;


    public ShoppingFacade(){
    	super();
    	this.shoppingManager = new ShoppingManagerDB();
    	this.productManager = new ProductManagerDB();
    	
    }
    
    public ResultSet getProducts() {        
		return productManager.allProducts();
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7d14]
 * @param String 
 * @return 
 */
    public ArrayList<Product> getProductByKeyword(String keyword) {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7cd3]
 * @param Product 
 * @param int 
 */
    public void addProductToBasket(Product product, int quantity) {        
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7c92]
 * @param Product 
 */
    public void removeProductFromBasket(Product productToRemove) {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7c51]
 * @param Basket 
 */
    public void validBasket(Basket basket) {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I2d1a4d66m14c0966aad0mm755e]
 * @return 
 */
    public Basket getBasket() {        
    	return Basket.getBasket(session.GetCurrentUser());
    } 
/**
 * 
 * 
 * @poseidon-object-id [I2d1a4d66m14c0966aad0mm761f]
 */
    public Functions.PaymentFacade paymentFacade;
 }
