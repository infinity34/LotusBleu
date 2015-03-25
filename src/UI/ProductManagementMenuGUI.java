package UI;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import Functions.ProductManagementFacade;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class ProductManagementMenuGUI extends JPanel {
	
	private ProductManagementFacade facade;
	

	  public ProductManagementMenuGUI()
	  {
		  this.setSize( 640, 480);
			SpringLayout springLayout = new SpringLayout();
			setLayout(springLayout);
			
			JLabel lblProductManagement = new JLabel("Product Management");
			springLayout.putConstraint(SpringLayout.NORTH, lblProductManagement, 35, SpringLayout.NORTH, this);
			springLayout.putConstraint(SpringLayout.EAST, lblProductManagement, -168, SpringLayout.EAST, this);
			lblProductManagement.setFont(new Font("Dialog", Font.BOLD, 20));
			add(lblProductManagement);
			
			JButton btnAddProduct = new JButton("Add Product");
			springLayout.putConstraint(SpringLayout.NORTH, btnAddProduct, 114, SpringLayout.SOUTH, lblProductManagement);
			springLayout.putConstraint(SpringLayout.WEST, btnAddProduct, 129, SpringLayout.WEST, this);
			add(btnAddProduct);
			
			JButton btnUpdateProduct = new JButton("Update Product");
			springLayout.putConstraint(SpringLayout.NORTH, btnUpdateProduct, 0, SpringLayout.NORTH, btnAddProduct);
			springLayout.putConstraint(SpringLayout.WEST, btnUpdateProduct, 46, SpringLayout.EAST, btnAddProduct);
			add(btnUpdateProduct);
			
			JButton btnDeleteProduct = new JButton("Delete Product");
			springLayout.putConstraint(SpringLayout.NORTH, btnDeleteProduct, 0, SpringLayout.NORTH, btnAddProduct);
			springLayout.putConstraint(SpringLayout.EAST, btnDeleteProduct, -26, SpringLayout.EAST, this);
			add(btnDeleteProduct);
			
			JButton btnDisplayAllProdcuts = new JButton("Display All Prodcuts");
			springLayout.putConstraint(SpringLayout.NORTH, btnDisplayAllProdcuts, 87, SpringLayout.SOUTH, btnUpdateProduct);
			springLayout.putConstraint(SpringLayout.EAST, btnDisplayAllProdcuts, -201, SpringLayout.EAST, this);
			add(btnDisplayAllProdcuts);
	  }
}
