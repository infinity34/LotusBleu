
package Persistence;

import java.sql.ResultSet;

/**
 * 
 * 
 * @poseidon-object-id [Im26623am14bf96eff7cmm7b80]
 */
public class OrderManagementXML extends Persistence.OrderManager {
	
	public ResultSet listOrder(String state){
		return null;
	}

	@Override
	public Boolean cancelOrder(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean confirmPurchase(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean sendPurchase(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}
	
 }
