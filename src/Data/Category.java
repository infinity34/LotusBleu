
package Data;


public class Category {


    private String categoryName;
    private Category motherCategory;
    private Boolean available;
    
	public Category(String categoryName,Category motherCategory, Boolean available) {
		super();
		this.categoryName = categoryName;
		this.available = available;
	}

	public String getCategoryName() {
		return categoryName;
	}
	
	
	
	
    
    
    
 }
