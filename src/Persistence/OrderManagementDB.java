
package Persistence;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

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
	public Boolean cancelOrder(int orderId) {
		try {
			ResultSet rs = connection.getState().executeQuery("SELECT U.mail FROM lotusbleu.USER U, lotusbleu.ORDER O "
						+"WHERE U.mail=O.userMail AND O.orderId='"+orderId+"'");
			rs.last();
			String mail = rs.getString("mail");
			connection.getState().executeUpdate("UPDATE lotusbleu.ORDER SET orderStateID=16 WHERE orderId='"+orderId+"'");
			connection.getState().executeUpdate("INSERT INTO lotusbleu.NOTIFICATION(notificationRead,notificationMessage,notificationDate,userID) "
					+"values (0,\"Your order number "+orderId+" have been cancelled!\",CURRENT_DATE(),'"+mail+"')");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public ResultSet getCancelledOrders(){
		ResultSet rs = null;
		try {
			rs = connection.getState().executeQuery("SELECT O.orderID, productName, orderDate, userName, userFirstName, quantity, orderStateWording "
					+"FROM lotusbleu.PRODUCT P, lotusbleu.ORDER O, lotusbleu.USER U, lotusbleu.ORDERLINE L, lotusbleu.ORDERSTATE S "
					+"WHERE P.productID = L.productID AND "
					+"O.orderID = L.orderID AND "
					+"O.userMail = U.mail AND "
					+"S.orderStateID = O.orderStateID AND "
					+"S.orderStateWording = 'Cancelled/Rejected';");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public ResultSet getSentOrders(){
		ResultSet rs = null;
		try {
			rs = connection.getState().executeQuery("SELECT O.orderID, productName, orderDate, userName, userFirstName, quantity, orderStateWording "
					+"FROM lotusbleu.PRODUCT P, lotusbleu.ORDER O, lotusbleu.USER U, lotusbleu.ORDERLINE L, lotusbleu.ORDERSTATE S "
					+"WHERE P.productID = L.productID AND "
					+"O.orderID = L.orderID AND "
					+"O.userMail = U.mail AND "
					+"S.orderStateID = O.orderStateID AND "
					+"S.orderStateWording = 'Sent';");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public ResultSet getConfirmedOrders(){
		ResultSet rs = null;
		try {
			rs = connection.getState().executeQuery("SELECT O.orderID, productName, orderDate, userName, userFirstName, quantity, orderStateWording "
					+"FROM lotusbleu.PRODUCT P, lotusbleu.ORDER O, lotusbleu.USER U, lotusbleu.ORDERLINE L, lotusbleu.ORDERSTATE S "
					+"WHERE P.productID = L.productID AND "
					+"O.orderID = L.orderID AND "
					+"O.userMail = U.mail AND "
					+"S.orderStateID = O.orderStateID AND "
					+"S.orderStateWording = 'Confirmed';");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public ResultSet getPendingOrders(){
		ResultSet rs = null;
		try {
			rs = connection.getState().executeQuery("SELECT O.orderID, productName, orderDate, userName, userFirstName, quantity, orderStateWording "
					+"FROM lotusbleu.PRODUCT P, lotusbleu.ORDER O, lotusbleu.USER U, lotusbleu.ORDERLINE L, lotusbleu.ORDERSTATE S "
					+"WHERE P.productID = L.productID AND "
					+"O.orderID = L.orderID AND "
					+"O.userMail = U.mail AND "
					+"S.orderStateID = O.orderStateID AND "
					+"S.orderStateWording = 'Pending';");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
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
	public Boolean confirmPurchase(int orderId) {
		try {
			ResultSet rs = connection.getState().executeQuery("SELECT U.mail FROM lotusbleu.USER U, lotusbleu.ORDER O "
					+"WHERE U.mail=O.userMail AND O.orderId='"+orderId+"'");
			rs.last();
			String mail = rs.getString("mail");
			connection.getState().executeUpdate("UPDATE lotusbleu.ORDER SET orderStateID=14 WHERE orderId='"+orderId+"'");
			connection.getState().executeUpdate("INSERT INTO lotusbleu.NOTIFICATION(notificationRead,notificationMessage,notificationDate,userID) "
					+"values (0,\"Your order number "+orderId+" have been confirmed!\",CURRENT_DATE(),'"+mail+"')");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}


	@Override
	public Boolean sendPurchase(int orderId) {
		try {
			ResultSet rs = connection.getState().executeQuery("SELECT U.mail FROM lotusbleu.USER U, lotusbleu.ORDER O "
					+"WHERE U.mail=O.userMail AND O.orderId='"+orderId+"'");
			rs.last();
			String mail = rs.getString("mail");
			connection.getState().executeUpdate("UPDATE lotusbleu.ORDER SET orderStateID=15 WHERE orderId='"+orderId+"'");
			connection.getState().executeUpdate("INSERT INTO lotusbleu.NOTIFICATION(notificationRead,notificationMessage,notificationDate,userID) "
					+"values (0,\"Your order number '"+orderId+"' have been sent!\",CURRENT_DATE(),'"+mail+"')");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}		
	}



		
		
	
	
 }
