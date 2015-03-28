
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
	private ResultSet result;
	
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
			this.result = connection.getState().executeQuery("SELECT p.productName, o.orderDate, u.userName, u.userFirstName, ol.quantity, os.orderStateWording"
																	+"FROM PRODUCT p, ORDER o, USER u,ORDERLINE ol, ORDERSTATE os"
																	+"WHERE p.productID=ol.productID AND"
																	+"o.orderID=ol.orderID AND"
																	+"o.userMail=u.mail AND"
																	+"os.orderStateID=o.orderStateID AND"
																	+"os.orderStateWording='"+state+"'");
			this.result.last();
			return this.result;
			}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return this.result;
	}
 }
