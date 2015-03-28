
package Data;
/**
 * 
 * @author Clément Roque
 *
 */

public class Product {
	
	private int productID;
	private String productName;

	private float productPrice;
	private float productDiscount;
	private int productQuantity;
	private int productCategoryID;
	
	public Product(int id, String name, float price, float discount, int quantity, int categoryID)
	{
		this.productCategoryID = categoryID;
		this.productDiscount = discount;
		this.productID = id;
		this.productName = name;
		this.productPrice = price;
		this.productQuantity = quantity;
	}

	public int getProductID() {
		return productID;
	}

	public String getProductName() {
		return productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public float getProductDiscount() {
		return productDiscount;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public int getProductCategoryID() {
		return productCategoryID;
	}
}
