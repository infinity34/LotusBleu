package Persistence;

import Data.Basket;
import Data.Product;
import Data.User;
import Functions.SessionFacade;
import Tools.DBconnection;

/**
 * 
 * 
 * @poseidon-object-id [I777ab4eam14bf4e91384mm7b86]
 */
public class ShoppingManagerDB extends Persistence.ShoppingManager {

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 * 
	 * @poseidon-object-id [I777ab4eam14bf4e91384mm7b38]
	 */
	private DBconnection connection;
	public ShoppingManagerDB() {
		super();
		this.setConnection(DBconnection.getConnection());
	}

	/**
	 * @return the connection
	 */
	public DBconnection getConnection() {
		return connection;
	}

	/**
	 * @param connection
	 *            the connection to set
	 */
	public void setConnection(DBconnection connection) {
		this.connection = connection;
	}

	@Override
	public void addProductToBasket(Product product, int quantity) {
		addOrderLine(product, quantity);
	}

	@Override
	public Basket getBasket(User user) {
		return getBasket(user);
	}
}
