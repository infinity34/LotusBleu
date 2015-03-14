package Data;

/**
 * 
 * 
 * @poseidon-object-id [Ifc4ab2m14bf8c18020mm75e5]
 */
public class OrderLine {

	/**
	 * <p>
	 * Represents the product bought
	 * </p>
	 * 
	 * @poseidon-object-id [Ifc4ab2m14bf8c18020mm7578]
	 */
	private Product product;

	/**
	 * <p>
	 * Represents the quantity to buy
	 * </p>
	 * 
	 * @poseidon-object-id [Ifc4ab2m14bf8c18020mm7567]
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
}
