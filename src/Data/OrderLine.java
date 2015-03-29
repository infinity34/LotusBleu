package Data;

public class OrderLine implements Comparable<OrderLine> {

	/**
	 * <p>
	 * Represents the product bought
	 * </p>
	 */
	private Product product;

	/**
	 * <p>
	 * Represents the quantity to buy
	 * </p>
	 */
	private int quantity;

	public OrderLine(Product product, int quantity) {
		super();
		this.setProduct(product);
		this.setQuantity(quantity);
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int compareTo(OrderLine o) {
		return (int) ((this.quantity*this.product.getProductPrice()) - (o.quantity*o.product.getProductPrice()));
	}
}
