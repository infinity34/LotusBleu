
package Functions;

import java.sql.ResultSet;
import java.util.ArrayList;

import Data.Product;
import Persistence.ProductManagerDB;

public class ProductManagementFacade {
	
	private static ProductManagementFacade facade;
	
	public ProductManagementFacade()
	{
		
	}
	
	public static ProductManagementFacade getFacade()
	{
		if (facade == null)
		{
			facade = new ProductManagementFacade();
		}
		
		return facade;
	}

	/**
	 *	@param name
	 *	@param price
	 *	@param discount
	 *	@param quantity
	 **	@param categoryName
	 *	@return true true if product has been add in the data base, else return false
	 */
	public boolean addProduct(String name, float price, float discount, int quantity, String categoryName) {        
        return ProductManagerDB.getManagerDB().addProduct(name, price, discount, quantity, categoryName);
    } 

	/**
	 *	@param id
	 *	@param name
	 *	@param price
	 *	@param discount
	 *	@param quantity
	 **	@param categoryName
	 *	@return true true if product has been update in the data base, else return false
	 */
	public boolean updateProduct(int id ,String nameSel, float priceSel, float discountSel, int quantitySel, String motherCategory) {        
        return ProductManagerDB.getManagerDB().updateProduct(id, nameSel, priceSel, discountSel, quantitySel, motherCategory);
    } 

	 /**
   	 *	@param name
   	 *	@return true true if product has been delete from the data base, else return false
   	 */
	public boolean deleteProduct(String name) {        
       return ProductManagerDB.getManagerDB().deleteProduct(name);
    }
	/**
     * @param name
   	 *	@return return the product fetch by name
   	 */
	public Product getProduct(String name)
	{
		return ProductManagerDB.getManagerDB().getProduct(name);
	}

	
	/**
   	 *	@return all of the product in the database
   	 */
	public ArrayList<Product> getAllProduct() {        
        return ProductManagerDB.getManagerDB().getAllProduct();
    } 
	 /**
   	 *	@return all of the product in the database
   	 */
	public ResultSet allProducts(){
		return ProductManagerDB.getManagerDB().allProducts();
	}
    
 }
