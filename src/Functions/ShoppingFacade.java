
package Functions;

import java.util.ArrayList;

import Data.Basket;
import Data.Product;

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
    private Functions.SessionFacade session;
/**
 * 
 * 
 * @poseidon-object-id [I2d1a4d66m14c0966aad0mm76a5]
 */
    public Persistence.ProductManager productManager;
/**
 * 
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7952]
 */
    public Persistence.ShoppingManager shoppingManager;

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7d5a]
 * @return 
 */
    public ArrayList<Product> getProducts() {        
        // your code here
        return null;
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
        // your code here
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
        // your code here
        return null;
    } 
/**
 * 
 * 
 * @poseidon-object-id [I2d1a4d66m14c0966aad0mm761f]
 */
    public Tools.PaymentFacade paymentFacade;
 }
