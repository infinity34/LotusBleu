
package Persistence;

import java.util.ArrayList;

import Data.Category;
import Data.Notification;

public abstract class CategoryManager {


    public abstract boolean createCategory(String name, String motherCategoryName, Boolean available);

    public abstract boolean updateCategory(String oldName, String name, String fatherCategory, Boolean available);       

    public abstract boolean deleteCategory(String name);

    public abstract ArrayList<Category> getAllCategory();
    public abstract Category getCategory(String name);
    public abstract int getCategoryID(String name);
    
 }
