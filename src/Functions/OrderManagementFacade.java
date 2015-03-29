
package Functions;

import java.sql.ResultSet;

import Persistence.OrderManagementDB;


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

    
    public Persistence.SessionManager sessionManager;
 }
