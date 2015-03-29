
package Persistence;

import java.sql.ResultSet;
import java.util.ArrayList;

import Data.Product;

/**
 * Product Manager XML
 * Designed by Prisca
 * Developped by Clément
 */
public class ProductManagerXML extends ProductManager {

	@Override
	/**
	 *	@param name
	 *	@param price
	 *	@param discount
	 *	@param quantity
	 **	@param categoryName
	 *	@return true true if product has been add in the data base, else return false
	 */
	public boolean addProduct(String name, float price, float discount,
			int quantity, String categoryName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	 /**
		 *	@param id
		 *	@param name
		 *	@param price
		 *	@param discount
		 *	@param quantity
		 **	@param categoryName
		 *	@return true true if product has been update in the data base, else return false
		 */
	public boolean updateProduct(int id, String nameSel, float priceSel,
			float discountSel, int quantitySel, String motherCategory) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	/**
   	 *	@param name
   	 *	@return true true if product has been delete from the data base, else return false
   	 */
	public boolean deleteProduct(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	/**
   	 *	@return all of the product in the database
   	 */
	public ArrayList<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	 /**
     * @param name
   	 *	@return return the product fetch by name
   	 */
	public Product getProduct(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	 /**
   	 *	@return all of the product in the database
   	 */
	public ResultSet allProducts() {
		// TODO Auto-generated method stub
		return null;
	}
 }
