
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
	ArrayList userInfo;
	
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


	@Override
	public ArrayList displayOrderOwner(int orderId) {
		this.userInfo = null;
		try {
			ResultSet result = connection.getState().executeQuery("SELECT userName, userFirstname, address1, address2, postCode, city, phone "
					+"FROM lotusbleu.USER U, lotusbleu.ORDER O "
					+"WHERE U.mail = O.userMail AND "
					+"O.orderID ='"+ orderId+"'");
			this.userInfo = new ArrayList<String>();
			result.beforeFirst();
			this.userInfo.add(result.getObject("userName"));
			this.userInfo.add(result.getObject("userFirstName"));
			this.userInfo.add(result.getObject("address1"));
			this.userInfo.add(result.getObject("address2"));
			this.userInfo.add(result.getObject("postCode"));
			this.userInfo.add(result.getObject("city"));
			this.userInfo.add(result.getObject("phone"));
			     
		}
			catch (SQLException e) {
				e.printStackTrace();
			}
		return this.userInfo;
		
		
	
	}
 }
