package Persistence;

import java.util.ArrayList;

import Data.Category;
import Data.Product;



public abstract class ProductManager {


    public abstract boolean addProduct(String name, float price, float discount, int quantity, String categoryName);

    public abstract boolean updateProduct(int id,String nameSel, float priceSel, float discountSel, int quantitySel, String motherCategory);       

    public abstract boolean deleteProduct(String name);

    public abstract ArrayList<Product> getAllProduct();
    public abstract Product getProduct(String name);
    
}
