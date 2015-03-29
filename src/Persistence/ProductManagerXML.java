
package Persistence;

import java.sql.ResultSet;
import java.util.ArrayList;

import Data.Product;

/**
 * 
 * 
 * @poseidon-object-id [I2d1a4d66m14c0966aad0mm7666]
 */
public class ProductManagerXML extends Persistence.ProductManager {

	@Override
	public boolean addProduct(String name, float price, float discount,
			int quantity, String categoryName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(int id, String nameSel, float priceSel,
			float discountSel, int quantitySel, String motherCategory) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProduct(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProduct(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet allProducts() {
		// TODO Auto-generated method stub
		return null;
	}
 }
