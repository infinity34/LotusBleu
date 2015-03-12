
package Data;

/**
 * 
 * 
 * @poseidon-object-id [Ifc4ab2m14bf8c18020mm75fe]
 */
public class Basket {

/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [Im73916ddfm14bf8e24976mm78ed]
 */
    private Data.User user;

/**
 * <p>Represents ...</p>
 * 
 * @poseidon-object-id [Im77122398m14bf8fac935mm774d]
 */
    private Data.Basket basket;
/**
 * 
 * 
 * @poseidon-object-id [Ifc4ab2m14bf8c18020mm75a0]
 * @poseidon-type Data.OrderLine
 */
    public java.util.Collection orderLine = new java.util.TreeSet();

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im73916ddfm14bf8e24976mm78d9]
 */
    public void getBasket() {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im73916ddfm14bf8e24976mm78b4]
 */
    private  Basket() {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I1af2f395m14bf8ee2be3mm786c]
 * @return 
 */
    public boolean isEmpty() {        
        // your code here
        return false;
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I1af2f395m14bf8ee2be3mm7845]
 */
    public void empty() {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I1af2f395m14bf8ee2be3mm7820]
 * @param OrderLine 
 */
    public void removeLine(Data.line OrderLine) {        
        // your code here
    } 

/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I1af2f395m14bf8ee2be3mm77df]
 * @param Product 
 * @param quantity 
 */
    public void addLine(Product product, int quantity) {        
        // your code here
    } 
 }
