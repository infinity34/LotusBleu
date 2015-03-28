
package Functions;

import java.sql.ResultSet;

/**
 * 
 * 
 * @poseidon-object-id [Im26623am14bf96eff7cmm7af6]
 */
public class OrderManagementFacade {

	
	
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I610a0d25m14bffb8994amm71af]
 */
    public Boolean cancelOrder() {        
    	return orderManager.cancelOrder();
    } 
    
    
    /**
     * <p>Display all the information about the purchase request</p>
     * @return 
     * 
     * @poseidon-object-id [I610a0d25m14bffb8994amm71af]
     */
    public ResultSet listOrder(String state){
    	return orderManager.listOrder(state);
    }
    
/**
 * 
 * 
 * @poseidon-object-id [Im26623am14bf96eff7cmm7aaf]
 */
    public Persistence.OrderManager orderManager;
/**
 * 
 * 
 * @poseidon-object-id [Ima570141m14bf9c09221mm694d]
 */
    public Persistence.SessionManager sessionManager;
 }
