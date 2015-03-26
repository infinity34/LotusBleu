
package Functions;

public class ProductManagementFacade {
	
	private ProductManagementFacade facade;
	
	private ProductManagementFacade()
	{
		
	}
	
	public ProductManagementFacade getFacade()
	{
		if (facade == null)
		{
			facade = new ProductManagementFacade();
		}
		
		return facade;
	}

    private boolean addProduct() {        
        // your code here
        return false;
    } 


    private boolean updateProduct() {        
        // your code here
        return false;
    } 


    private boolean deleteProduct() {        
        // your code here
        return false;
    } 


    private void displayAllProduct() {        
        // your code here
    } 

    
 }
