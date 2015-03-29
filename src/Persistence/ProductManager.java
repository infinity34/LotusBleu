package Persistence;

import java.util.ArrayList;

import Data.Product;
import java.sql.ResultSet;
/**
 * Category facade
 * Designed by Prisca
 * Developped by Clément
 */


public abstract class ProductManager {


	/**
	 *	@param name
	 *	@param price
	 *	@param discount
	 *	@param quantity
	 *	@param categoryName
	 *	@return true true if product has been add in the data base, else return false
	 */
    public abstract boolean addProduct(String name, float price, float discount, int quantity, String categoryName);

    /**
	 *	@param id
	 *	@param nameSel
	 *	@param priceSel
	 *	@param discountSel
	 *	@param quantitySel
	 *	@param motherCategory
	 *	@return true true if product has been update in the data base, else return false
	 */
    public abstract boolean updateProduct(int id,String nameSel, float priceSel, float discountSel, int quantitySel, String motherCategory);       

    /**
   	 *	@param name
   	 *	@return true true if product has been delete from the data base, else return false
   	 */
    public abstract boolean deleteProduct(String name);

    /**
   	 *	@return all of the product in the database
   	 */
    public abstract ArrayList<Product> getAllProduct();
    /**
     * @param name
   	 *	@return return the product fetch by name
   	 */
    public abstract Product getProduct(String name);
    /**
   	 *	@return all of the product in the database
   	 */
    
	public abstract ResultSet allProducts();
    
}
