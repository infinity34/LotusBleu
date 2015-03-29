package Persistence;

import java.util.ArrayList;
import java.util.List;

import Data.Category;
import Data.Basket;
import Data.Order;
import Data.OrderLine;
import Data.Payment;
import Data.Product;
import Data.User;
import Functions.SessionFacade;


public abstract class ShoppingManager {

	//Variables
	private Basket basket;
	private ArrayList<Order> orders;

	/**
	 * @param orders
	 * @param basket
	 */
	public ShoppingManager() {
		super();
		this.basket = Basket.getBasket(SessionFacade.getSessionFacade().GetCurrentUser());
		this.orders = new ArrayList<Order>();
	}

	/**
	 * @return the basket
	 */
	public Basket getBasket() {
		return basket;
	}

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * 
	 */
	public void emptyBasket() {
		this.basket.empty();
	}

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * 
	 */
	public void validBasket(Payment payment) {
		this.orders.add(new Order(this.basket,payment));
		this.basket.empty();
	}

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * @param Order
	 */
	public void cancelOrder(Order order) {
		// your code here
	}


	public abstract ArrayList<Category> getMainCategories();

	public abstract ArrayList<Category> getSubCategories(String parentCat);

	public abstract ArrayList<Product> getProductsByCat(int category);
	
	public void addProductToBasket(Product product, int quantity){
		this.basket.addLine(product, quantity);
	}
	
	public void removeProductFromBasket(OrderLine orderline){
		this.basket.removeLine(orderline);
	}

}
