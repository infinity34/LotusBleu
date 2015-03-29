package Persistence;

import java.util.ArrayList;

import Data.Category;
import Data.Basket;
import Data.Order;
import Data.OrderLine;
import Data.Payment;
import Data.Product;
import Functions.SessionFacade;


public abstract class ShoppingManager {

	//Variables
	private Basket basket;
	private ArrayList<Order> orders;

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
	 * Test if the basket is empty.
	 * </p>
	 * 
	 */
	public void emptyBasket() {
		this.basket.empty();
	}

	/**
	 * <p>
	 * Transform the basket into an order
	 * and empty the basket
	 * </p>
	 * 
	 */
	public Boolean validBasket(Payment payment) {
		this.orders.add(new Order(this.basket,payment));
		this.basket.empty();
		if (this.basket.isEmpty()) return true;
		else return false;
	}

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * @param order
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
