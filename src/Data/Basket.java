package Data;

import java.util.TreeSet;

/**
 * 
 * @author Lyvia
 * @author Design Maxime
 * @author Design Clément
 *
 */
public class Basket {

	/**
	 * the user assciated at this basket
	 */
	private User user;

	/**
	 * Represents the basket (Attribute which allow to implement singleton
	 * pattern)
	 */
	private static Basket basket;

	/**
	 * a set of orderLine
	 * i.e the quantity and the product
	 */
	private TreeSet<OrderLine> orderLine;

	/**
	 * Return the current basket of the user
	 * @return Basket
	 */
	public static Basket getBasket(User user) {
		if (basket == null) {
			basket = new Basket(user);
		}
		return basket;
	}

	/**
	 * Create a new Basket
	 */
	public Basket(User user) {
		super();
		this.orderLine = new TreeSet<OrderLine>();
		this.setUser(user);
	}

	/**
	 * @return the orderLine
	 */
	public TreeSet<OrderLine> getOrderLine() {
		return orderLine;
	}

	/**
	 * @param orderLine the orderLine to set
	 */
	public void setOrderLine(TreeSet<OrderLine> orderLine) {
		this.orderLine = orderLine;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Test if the basket is empty
	 * @return boolean
	 */
	public boolean isEmpty() {
		return this.orderLine.isEmpty();
	}

	/**
	 * Remove all the elements from the basket
	 */
	public void empty() {
		this.orderLine = new TreeSet<OrderLine>();
	}

	/**
	 * Remove a specified line from the basket
	 * @param line
	 */
	public void removeLine(OrderLine line) {
		this.orderLine.remove(line);
	}

	/**
	 * Add a specified line to the basket
	 * @param product
	 * @param quantity
	 */
	public void addLine(Product product, int quantity) {
		this.orderLine.add(new OrderLine(product, quantity));
	}
}
