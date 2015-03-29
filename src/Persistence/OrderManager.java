
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
 */
public abstract class OrderManager {

	public Data.Order order;

	
	//Instance methods ******************************************************

	/**
	 * this method allows to cancel an order
	 * 
	 */
	public abstract Boolean cancelOrder(int orderId); 


	public abstract Boolean confirmPurchase(int orderId);



	/**
	 * <p>Does ...</p>
	 * 
	 */
	public abstract Boolean removeOrder(int id);        

	/**
	 * <p>Does ...</p>
	 * 
	 */
    public abstract Boolean sendPurchase(int orderId);
    

	/**
	 * <p>Return a table with the information of the orders which are in the given state</p>
	 * 
	 * @param state 
	 */
	public abstract ResultSet listOrder(String state);
	
	public abstract ResultSet getCancelledOrders();
	
	public abstract ResultSet getConfirmedOrders();
	
	public abstract ResultSet getSentOrders();
	
	public abstract ResultSet getPendingOrders();
	

}
