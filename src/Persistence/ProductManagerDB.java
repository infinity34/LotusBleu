
package Persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Data.Category;
import Data.Product;
import Functions.CategoryFacade;
import Tools.DBconnection;


public class ProductManagerDB extends Persistence.ProductManager {

	private static ProductManagerDB managerBD;

    private DBconnection connection;
    
	
	public static ProductManagerDB getManagerDB()
	{
		if (managerBD == null)
		{
			managerBD = new ProductManagerDB();
		}
		
		return managerBD;
	}

public ProductManagerDB() {
	super();
	this.connection = DBconnection.getConnection();
	}

	public DBconnection getConnection() {
		return connection;
	}

	@Override
	public boolean addProduct(String name, float price, float discount,	int quantity, String categoryName) {

		int catID = CategoryFacade.getFacade().getCategoryID(categoryName);
		try {
			connection.getState().executeUpdate("INSERT INTO lotusbleu.PRODUCT(productName,productPrice,productDiscount,productQuantity, categoryID ) " +
				"VALUES(\""+ name +"\",\""+price+"\",\""+discount+"\",\""+quantity+"\",\""+catID+"\")");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateProduct(int id, String nameSel, float priceSel, float discountSel, int quantitySel, String motherCategory) {

		try {
			int catID = CategoryFacade.getFacade().getCategoryID(motherCategory);
			int resultat = connection.getState().executeUpdate("UPDATE PRODUCT SET " +
					"productName ='"+nameSel+"'" +
							" ,productPrice ='"+priceSel+"'" +
									",productDiscount = '"+discountSel+"" +
											"',productQuantity = '"+quantitySel+"" +
													"', categoryID = '"+catID+"'"+
					"WHERE  productID =  \"" +id+"\"");
			if(resultat > 0)
				return true;
			else
				return false;
					
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteProduct(String name) {

		try {
			int resultat = connection.getState().executeUpdate("DELETE FROM lotusbleu.PRODUCT WHERE " +
					"productName = \""+name+"\"");
			if(resultat > 0)
				return true;
			else
				return false;
					
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public ArrayList<Product> getAllProduct() {
		
		ArrayList<Product> allprod = new ArrayList<Product>();
		try {
			ResultSet resultat = connection.getState().executeQuery("SELECT * FROM lotusbleu.PRODUCT");
			while (resultat.next()) {
				allprod.add(new Product(resultat.getInt("productID"),
						resultat.getString("productName"), 
						resultat.getFloat("productPrice"), 
						resultat.getFloat("productDiscount"), 
						resultat.getInt("productQuantity"), 
						resultat.getInt("categoryID")));							
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allprod;
	}

	@Override
	public Product getProduct(String name) {
		Product product;
		try {
			ResultSet resultat = connection.getState().executeQuery("SELECT * FROM lotusbleu.PRODUCT WHERE productName  = '"+name+"'");
			resultat.next();
				product = new Product(resultat.getInt("productID"),
						resultat.getString("productName"), 
						resultat.getFloat("productPrice"), 
						resultat.getFloat("productDiscount"), 
						resultat.getInt("productQuantity"), 
						resultat.getInt("categoryID"));	
				return product;
	
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public ResultSet allProducts() {
		try {
			ResultSet resultat = connection.getState().executeQuery("SELECT * FROM lotusbleu.PRODUCT");
			//resultat.last();
			return resultat;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}		
	}
	
	
}
