package Persistence;

import java.util.ArrayList;
import java.util.List;

import Data.Category;

import Data.Basket;

import Data.Order;
import Data.OrderLine;
import Data.Product;
import Data.User;
import Functions.SessionFacade;

/**
 * 
 * 
 * @poseidon-object-id [I5c276a37m14bf4d9e555mm79b9]
 */
public abstract class ShoppingManager {

	//Variables
	private ArrayList<Order> orders;

	//Methods
	public ArrayList<Order> getOrders() {
		return this.orders;
	}

	/**
	 * @param orders
	 *            the orders to set
	 */
	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * 
	 * @poseidon-object-id [I777ab4eam14bf4e91384mm7c7d]
	 * @param Product
	 * @param quantity
	 */
	public void addOrderLine(Product product, int quantity) {
		// your code here
	}

	/**
	 * <p>
	 * Return the basket of the current user
	 * </p>
	 * 
	 * @poseidon-object-id [I1af2f395m14bf8ee2be3mm78a9]
	 * @return
	 */
	public abstract Data.Basket getBasket(User user);

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * 
	 * @poseidon-object-id [I1af2f395m14bf8ee2be3mm7884]
	 * @param OrderLine
	 */
	public void removeOrderLine(OrderLine line) {
		// your code here
	}

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * 
	 * @poseidon-object-id [I1af2f395m14bf8ee2be3mm76e5]
	 */
	public void emptyBasket() {
		// your code here
	}

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * 
	 * @poseidon-object-id [I1af2f395m14bf8ee2be3mm76c0]
	 */
	public void validBasket() {
		// your code here
	}

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * 
	 * @poseidon-object-id [I2d1a4d66m14c0966aad0mm7438]
	 * @param Order
	 */
	public void cancelOrder(Order order) {
		// your code here
	}


	public abstract ArrayList<Category> getMainCategories();

	public abstract ArrayList<Category> getSubCategories(String parentCat);

	public abstract ArrayList<Product> getProductsByCat(int category);

	
	public abstract void addProductToBasket(Product product, int quantity);

}
