
package Data;

/**
 * 
 * @author remy
 *
 */
public class Product {
	
	private int productID;
	private String productName;
	private double productPrice;
	private double productDiscount;
	private int productQuantity;
	private  Category categoryProduct;
	
	/**
	 * @return the product name
	 */
	public String getProductName() {
		return productName;
	}
	
	/**
	 * Set the product name with the parameter productName
	 * @param productName
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	/**
	 * @return the product price
	 */
	public double getProductPrice() {
		return productPrice;
	}
	
	/**
	 * set the product price with the argument
	 * @param productPrice
	 */
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	/**
	 * @return the product discount
	 */
	public double getProductDiscount() {
		return productDiscount;
	}
	
	/**
	 * set the Discount
	 * @param productDiscount
	 */
	public void setProductDiscount(double productDiscount) {
		this.productDiscount = productDiscount;
	}
	
	/**
	 * @return the product Quantity
	 */
	public int getProductQuantity() {
		return productQuantity;
	}
	
	
	/**
	 * set the product quantity with the 
	 * quantity in parameter
	 * @param productQuantity
	 */
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	/**
	 * @return the product category 
	 */
	public Category getCategoryProduct() {
		return categoryProduct;
	}
	
	/**
	 * set the Category of the product with the
	 * category in parameter
	 * @param categoryProduct
	 */
	public void setCategoryProduct(Category categoryProduct) {
		this.categoryProduct = categoryProduct;
	}
	
 }
