package Data;

import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Represents an order
 * 
 * @author remy
 * @author ??
 */
public class Order {

	/**
	 * Id of an order
	 */
	private String orderID;

	/**
	 * Represents the date of an order
	 */
	private Date orderDate;

	/**
	 * represents the user who has passed
	 * this order
	 */
	private Data.User user;

	/**
	 * Represents the State of the Order:
	 * Pending, Confirmed, Sent, Cancelled
	 */
	private OrderState orderState;

	/**
	 * Represents the set of the order line
	 * i.e the quantity and the product
	 */
	public TreeSet<OrderLine> orderLine;

	/**
	 * Represents the payment of the order
	 * the date and the amount
	 */
	public Data.Payment payment;

	/**
	 * Constructor
	 * Create an order thanks to the basket
	 * and a payment
	 * @param basket
	 * @param payment
	 */
	public Order(Basket basket, Payment payment) {
		super();
		this.orderDate = new Date();
		this.orderLine = basket.getOrderLine();
		this.orderState = OrderState.pending;
		this.user = basket.getUser();
		this.payment = payment;
	}

	/**
	 * @return the orderID
	 */
	public String getOrderID() {
		return orderID;
	}

	/**
	 * @param orderID
	 * the orderID to set
	 */
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	/**
	 * @return the orderDate
	 */
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate
	 * the orderDate to set
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the user
	 */
	public Data.User getUser() {
		return user;
	}

	/**
	 * @param user
	 * the user to set
	 */
	public void setUser(Data.User user) {
		this.user = user;
	}

	/**
	 * @return the orderState
	 */
	public OrderState getOrderState() {
		return orderState;
	}

	/**
	 * @param orderState
	 * the orderState to set
	 */
	public void setOrderState(OrderState orderState) {
		this.orderState = orderState;
	}

	/**
	 * @return the payment
	 */
	public Data.Payment getPayment() {
		return payment;
	}

	/**
	 * @param payment
	 * the payment to set
	 */
	public void setPayment(Data.Payment payment) {
		this.payment = payment;
	}

	/**
	 * @return the orderLine
	 */
	public TreeSet<OrderLine> getOrderLine() {
		return orderLine;
	}

	/**
	 * calculates the amount of the order
	 * @return double The amount of this order
	 */
	public double getTotalAmount() {
		float amount = 0;
		OrderLine currentOrderLine;
		Iterator<OrderLine> it = orderLine.iterator();
		while(it.hasNext()){
			currentOrderLine = it.next();
			amount = (currentOrderLine.getQuantity()*currentOrderLine.getProduct().getProductPrice()) + amount;
		}
		return amount;
	}
}
