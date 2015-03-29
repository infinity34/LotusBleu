
package Persistence;

import java.sql.ResultSet;


/**
 * This class allows to manage order
 * 
 * @author Clerix Maxime
 * @author Pavy Lyvia
 * @author Relique Prisca
 * @author Roque Clément
 * @author Tartière Rémy
 * 
 * @poseidon-object-id [Im26623am14bf96eff7cmm7be8]
 */
public abstract class OrderManager {

	/**
	 * 
	 * 
	 * @poseidon-object-id [Im26623am14bf96eff7cmm7bcc]
	 */
	public Data.Order order;

	
	//Instance methods ******************************************************

	/**
	 * this method allows to cancel an order
	 * 
	 * @poseidon-object-id [I610a0d25m14bffb8994amm7172]
	 */
	public abstract Boolean cancelOrder(int orderId); 

	/**
	 * 
	 * 
	 * @poseidon-object-id [I610a0d25m14bffb8994amm714d]
	 */
	public abstract Boolean confirmPurchase(int orderId);

	/**
	 * <p>Does ...</p>
	 * 
	 * @poseidon-object-id [I610a0d25m14bffb8994amm7128]
	 */
	public void rejectPurchase() {        
		// your code here
	} 

	/**
	 * <p>Does ...</p>
	 * 
	 * @poseidon-object-id [I610a0d25m14bffb8994amm7103]
	 */
	public void removeOrder() {        
		// your code here
	} 

	/**
	 * <p>Does ...</p>
	 * 
	 * @poseidon-object-id [I610a0d25m14bffb8994amm70de]
	 */
    public abstract Boolean sendPurchase(int orderId);
    

	/**
	 * <p>Return a table with the information of the orders which are in the given state</p>
	 * 
	 * @poseidon-object-id [I610a0d25m14bffb8994amm70b9]
	 * @param state 
	 */
	public abstract ResultSet listOrder(String state);
	
	public abstract ResultSet getCancelledOrders();
	
	public abstract ResultSet getConfirmedOrders();
	
	public abstract ResultSet getSentOrders();
	
	public abstract ResultSet getPendingOrders();
	

}
