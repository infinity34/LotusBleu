
package Persistence;

import java.util.ArrayList;

import Data.Category;
import Data.Notification;

public abstract class CategoryManager {


    public abstract void getCategory();

    public abstract boolean createCategory(String name, String motherCategoryName, Boolean available);

    public abstract void updateCategory(String name, Data.Category fatherCategory, Boolean available);       

    public abstract void deleteCategory(String name);

    public abstract ArrayList<Category> getAllCategory();
    public abstract void getCategory(String name);
    
 }
