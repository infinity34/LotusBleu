
package Data;

import java.util.ArrayList;

/**
 * 
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7a9c]
 */
public class Order {

/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm792c]
 */
    private String orderID;

/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [Im37e90f00m14bf8ad3fd2mm76d3]
 */
    private java.util.Date orderDate;

/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [Im77122398m14bf8fac935mm773c]
 */
    private Data.User user;

/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [I48c9a015m14c095cecaamm737b]
 */
    private String OrderState;
/**
 * 
 * 
 * @poseidon-object-id [Im77122398m14bf8fac935mm77bd]
 */
    public Data.OrderLine orderLine;
/**
 * 
 * 
 * @poseidon-object-id [I48c9a015m14c095cecaamm730b]
 */
    public Data.Payment payment;

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I777ab4eam14bf4e91384mm7af2]
 */
    public void save() {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I777ab4eam14bf4e91384mm7acd]
 * @return 
 */
    public String getOrderID() {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I777ab4eam14bf4e91384mm7aa8]
 * @return 
 */
    public java.util.Date getOrderDate() {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im77122398m14bf8fac935mm77fe]
 * @return 
 */
    public ArrayList<OrderLine> getProductLines() {        
        // your code here
        return null;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im77122398m14bf8fac935mm7797]
 * @param Basket 
 */
    public  Order(Data.Basket Basket) {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I2d1a4d66m14c0966aad0mm7521]
 */
    public void getTotalAmount() {        
        // your code here
    } 
 }
