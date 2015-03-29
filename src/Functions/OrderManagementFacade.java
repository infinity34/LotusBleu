
package Functions;

import java.sql.ResultSet;

import Persistence.OrderManagementDB;

/**
 * 
 * 
 * @poseidon-object-id [Im26623am14bf96eff7cmm7af6]
 */
public class OrderManagementFacade {
	private static OrderManagementFacade facade;
    private Persistence.OrderManagementDB orderManager;
    
    public OrderManagementFacade(){
    	super();
    	this.orderManager = new OrderManagementDB();
    }
	
    public static OrderManagementFacade getOrderManagementFacade(){
		if(facade == null)
			facade = new OrderManagementFacade();
		return facade;
    }
	
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [I610a0d25m14bffb8994amm71af]
 */
    public Boolean cancelOrder(int orderId) {        
    	return orderManager.cancelOrder(orderId);
    } 
    
    
    public ResultSet getCancelledOrders(){
    	return orderManager.getCancelledOrders();
    }
    
    public ResultSet getConfirmedOrders(){
    	return orderManager.getConfirmedOrders();
    }
    
    public ResultSet getSentOrders(){
    	return orderManager.getSentOrders();
    }
    
    public ResultSet getPendingOrders(){
    	return orderManager.getPendingOrders();
    }
    
	public Boolean deleteOrder(int id){
		return orderManager.removeOrder(id);	}

    
    /**
     * <p>Display all the information about the purchase request</p>
     * @return 
     * 
     * @poseidon-object-id [I610a0d25m14bffb8994amm71af]
     */
    public ResultSet listOrder(String state){
    	return orderManager.listOrder(state);
    }
    
    public Boolean confirmPurchase(int orderId){
    	return orderManager.confirmPurchase(orderId);
    }
    
    public Boolean sendPurchase(int orderId){
    	return orderManager.sendPurchase(orderId);
    }

    
/**
 * 
 * 
 * @poseidon-object-id [Im26623am14bf96eff7cmm7aaf]
 */

/**
 * 
 * 
 * @poseidon-object-id [Ima570141m14bf9c09221mm694d]
 */
    public Persistence.SessionManager sessionManager;
 }
