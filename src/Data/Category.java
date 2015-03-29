
package Data;


public class Category {


	//private int categoryID;
    private String categoryName;
    private int categoryID;
    private Category motherCategory;
    private Boolean available;
    
	public Category(String categoryName,Category motherCategory, Boolean available) {
		super();
		this.categoryName = categoryName;
		this.available = available;
		this.motherCategory = motherCategory;
	}
	
	public Category(String categoryName, Boolean available) {
		super();
		this.categoryName = categoryName;
		this.available = available;
	}
	
	public Category(String categoryName, Boolean available, int categoryID) {
		super();
		this.categoryName = categoryName;
		this.available = available;
		this.categoryID = categoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}
	
	
	@Override
	public String toString(){
		return this.getCategoryName();
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	
    
    
    
 }
