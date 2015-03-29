
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

	public boolean addProduct(String name, float price, float discount, int quantity, String categoryName) {        
        return ProductManagerDB.getManagerDB().addProduct(name, price, discount, quantity, categoryName);
    } 


	public boolean updateProduct(int id ,String nameSel, float priceSel, float discountSel, int quantitySel, String motherCategory) {        
        return ProductManagerDB.getManagerDB().updateProduct(id, nameSel, priceSel, discountSel, quantitySel, motherCategory);
    } 


	public boolean deleteProduct(String name) {        
       return ProductManagerDB.getManagerDB().deleteProduct(name);
    }
	
	public Product getProduct(String name)
	{
		return ProductManagerDB.getManagerDB().getProduct(name);
	}


	public void displayAllProduct() {        
        // your code here
    } 
	
	public ArrayList<Product> getAllProduct() {        
        return ProductManagerDB.getManagerDB().getAllProduct();
    } 

	public ResultSet allProducts(){
		return ProductManagerDB.getManagerDB().allProducts();
	}
    
 }
