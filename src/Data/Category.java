
package Data;


public class Category {
	/**
	 * 
	 * @author Clément
	 * @author Design Lyvia
	 *
	 */

    private String categoryName;
    private String motherCategory;

    private int categoryID;

    private Boolean available;
    
	public Category(String categoryName,String motherCategory, Boolean available) {
		super();
		this.categoryName = categoryName;
		this.available = available;
		this.motherCategory = motherCategory;
	}
	
	public Category(String categoryName, Boolean available) {
		super();
		this.motherCategory = "";
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
	
	public String getMotherCategoryName() {
		return motherCategory;
	}
	
	public boolean getAvailable() {
		return available;
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
