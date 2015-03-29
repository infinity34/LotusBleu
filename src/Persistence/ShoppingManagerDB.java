package Persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Data.Category;
import Data.Product;
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
	public ArrayList<Category> getMainCategories() {
		ArrayList<Category> cats = new ArrayList<Category>();
		try {
			ResultSet resultat = connection.getState().executeQuery("SELECT * FROM lotusbleu.CATEGORY WHERE subCategoryOf=''");
			while (resultat.next()) {
				cats.add(new Category(
							resultat.getString("categoryName"),
							resultat.getBoolean("available"),
							resultat.getInt("categoryID")));							
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(cats.size());
		return cats;
	}

	@Override
	public ArrayList<Category> getSubCategories(String parentCat) {
		ArrayList<Category> cats = new ArrayList<Category>();
		try {
			ResultSet resultat = connection.getState().executeQuery("SELECT * FROM lotusbleu.CATEGORY WHERE subCategoryOf='"+parentCat+"'");
			while (resultat.next()) {
				cats.add(new Category(
							resultat.getString("categoryName"),
							resultat.getBoolean("available"),
							resultat.getInt("categoryID")));							
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(cats.size());
		return cats;
	}

	@Override
	public ArrayList<Product> getProductsByCat(int category) {
		ArrayList<Product> products = new ArrayList<Product>();
		try {
			ResultSet resultat = connection.getState().executeQuery("SELECT * FROM lotusbleu.PRODUCT WHERE categoryID='"+category+"'");
			while (resultat.next()) {
				products.add(new Product(resultat.getInt("productID"),resultat.getString("productName"),
						resultat.getFloat("productPrice"),resultat.getFloat("productDiscount"),
						resultat.getInt("productQuantity"),resultat.getInt("categoryID")));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(products.size());
		return products;
	}
}
