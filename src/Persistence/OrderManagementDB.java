
package Persistence;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Tools.DBconnection;

/**
 * 
 * 
 * @poseidon-object-id [Im26623am14bf96eff7cmm7ba6]
 */
public class OrderManagementDB extends Persistence.OrderManager {
	DBconnection connection;

	
	public OrderManagementDB() {
		super();
		this.connection = DBconnection.getConnection();
	}
	
	
	@Override
	public Boolean cancelOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public ResultSet listOrder(String state) {
		try{
			ResultSet result = connection.getState().executeQuery("SELECT productName, orderDate, userName, userFirstName, quantity, orderStateWording "
					+"FROM lotusbleu.PRODUCT P, lotusbleu.ORDER O, lotusbleu.USER U, lotusbleu.ORDERLINE L, lotusbleu.ORDERSTATE S "
					+"WHERE P.productID = L.productID AND "
					+"O.orderID = L.orderID AND "
					+"O.userMail = U.mail AND "
					+"S.orderStateID = O.orderStateID AND "
					+"S.orderStateWording ='"+state+"'");
			return result;
			}
		catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		//return result;
	}
 }
