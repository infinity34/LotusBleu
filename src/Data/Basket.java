package Data;

import java.util.TreeSet;

/**
 * 
 * 
 * @poseidon-object-id [Ifc4ab2m14bf8c18020mm75fe]
 */
public class Basket {

	/**
	 * <p>
	 * Represents the owner of this basket
	 * </p>
	 * 
	 * @poseidon-object-id [Im73916ddfm14bf8e24976mm78ed]
	 */
	private User user;

	/**
	 * <p>
	 * Represents the basket (Attribute which allow to implement singleton
	 * pattern)
	 * </p>
	 * 
	 * @poseidon-object-id [Im77122398m14bf8fac935mm774d]
	 */
	private static Basket basket;
	
	/**
	 * 
	 * 
	 * @poseidon-object-id [Ifc4ab2m14bf8c18020mm75a0]
	 * @poseidon-type Data.OrderLine
	 */
	private TreeSet<OrderLine> orderLine;

	/**
	 * <p>
	 * Return the current basket of the user
	 * </p>
	 * 
	 * @poseidon-object-id [Im73916ddfm14bf8e24976mm78d9]
	 * @return Basket
	 */
	public static Basket getBasket(User user) {
		if (basket == null) {
			basket = new Basket(user);
		}
		return basket;
	}

	/**
	 * <p>
	 * Create a new Basket
	 * </p>
	 * 
	 * @poseidon-object-id [Im73916ddfm14bf8e24976mm78b4]
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
	 * <p>
	 * Test if the basket is empty
	 * </p>
	 * 
	 * @poseidon-object-id [I1af2f395m14bf8ee2be3mm786c]
	 * @return boolean
	 */
	public boolean isEmpty() {
		return this.orderLine.isEmpty();
	}

	/**
	 * <p>
	 * Remove all the elements from the basket
	 * </p>
	 * 
	 * @poseidon-object-id [I1af2f395m14bf8ee2be3mm7845]
	 */
	public void empty() {
		this.orderLine = new TreeSet<OrderLine>();
	}

	/**
	 * <p>
	 * Remove a specified line from the basket
	 * </p>
	 * 
	 * @poseidon-object-id [I1af2f395m14bf8ee2be3mm7820]
	 * @param OrderLine
	 */
	public void removeLine(OrderLine line) {
		this.orderLine.remove(line);
	}

	/**
	 * <p>
	 * Add a specified line to the basket
	 * </p>
	 * 
	 * @poseidon-object-id [I1af2f395m14bf8ee2be3mm77df]
	 * @param Product
	 * @param quantity
	 */
	public void addLine(Product product, int quantity) {
		this.orderLine.add(new OrderLine(product, quantity));
	}
}
