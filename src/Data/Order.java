package Data;

import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Represents an order
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm7a9c]
 */
public class Order {

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 * 
	 * @poseidon-object-id [I5c276a37m14bf4d9e555mm792c]
	 */
	private String orderID;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 * 
	 * @poseidon-object-id [Im37e90f00m14bf8ad3fd2mm76d3]
	 */
	private Date orderDate;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 * 
	 * @poseidon-object-id [Im77122398m14bf8fac935mm773c]
	 */
	private Data.User user;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 * 
	 * @poseidon-object-id [I48c9a015m14c095cecaamm737b]
	 */
	private OrderState orderState;
	/**
	 * 
	 * 
	 * @poseidon-object-id [Im77122398m14bf8fac935mm77bd]
	 */
	public TreeSet<OrderLine> orderLine;
	/**
	 * 
	 * 
	 * @poseidon-object-id [I48c9a015m14c095cecaamm730b]
	 */
	public Data.Payment payment;

	/**
	 * 
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
	 *            the orderID to set
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
	 *            the orderDate to set
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
	 *            the user to set
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
	 *            the orderState to set
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
	 *            the payment to set
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
	 * @return double The amount of this order
	 */
	public double getTotalAmount() {
		double amount = 0;
		OrderLine currentOrderLine;
		
		Iterator<OrderLine> it = orderLine.iterator();
		while(it.hasNext()){
			currentOrderLine = it.next();
			amount = (currentOrderLine.getQuantity()*currentOrderLine.getProduct().getPrice()) + amount;
		}
		
		return amount;
		
	}
}
