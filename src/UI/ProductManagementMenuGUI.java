package UI;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import Functions.ProductManagementFacade;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ProductManagementMenuGUI extends JPanel {
	
	private JButton btnAddProduct;
	private JButton btnUpdateProduct;
	private JButton btnDeleteProduct;
	private JButton btnDisplayAllProducts;
	private JButton btnBack;
	
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
			
			btnAddProduct = new JButton("Add Product");
			springLayout.putConstraint(SpringLayout.NORTH, btnAddProduct, 114, SpringLayout.SOUTH, lblProductManagement);
			springLayout.putConstraint(SpringLayout.WEST, btnAddProduct, 129, SpringLayout.WEST, this);
			add(btnAddProduct);
			
			btnUpdateProduct = new JButton("Update Product");
			springLayout.putConstraint(SpringLayout.NORTH, btnUpdateProduct, 0, SpringLayout.NORTH, btnAddProduct);
			springLayout.putConstraint(SpringLayout.WEST, btnUpdateProduct, 46, SpringLayout.EAST, btnAddProduct);
			add(btnUpdateProduct);
			
			btnDeleteProduct = new JButton("Delete Product");
			springLayout.putConstraint(SpringLayout.NORTH, btnDeleteProduct, 0, SpringLayout.NORTH, btnAddProduct);
			springLayout.putConstraint(SpringLayout.EAST, btnDeleteProduct, -26, SpringLayout.EAST, this);
			add(btnDeleteProduct);
			
			btnDisplayAllProducts = new JButton("Display All Prodcuts");
			springLayout.putConstraint(SpringLayout.NORTH, btnDisplayAllProducts, 87, SpringLayout.SOUTH, btnUpdateProduct);
			springLayout.putConstraint(SpringLayout.EAST, btnDisplayAllProducts, -201, SpringLayout.EAST, this);
			add(btnDisplayAllProducts);
			
			btnBack = new JButton("< Back");
			springLayout.putConstraint(SpringLayout.WEST, btnBack, 10, SpringLayout.WEST, this);
			springLayout.putConstraint(SpringLayout.SOUTH, btnBack, -10, SpringLayout.SOUTH, this);
			add(btnBack);
			
			btnAddProduct.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					UI.MainFrame.getMainFrame().setMainPanel(new ProductManagementAddProductGUI());
					}
				});
			
			btnDeleteProduct.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					UI.MainFrame.getMainFrame().setMainPanel(new ProductManagementDeleteProductGUI());
					}
				});
			
			btnUpdateProduct.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					UI.MainFrame.getMainFrame().setMainPanel(new ProductManagementUpdateProductGUI());
					}
				});
			
			btnDisplayAllProducts.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					UI.MainFrame.getMainFrame().setMainPanel(new ProductManagementDisplayAllProductsGUI());
					}
				});
			
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					UI.MainFrame.getMainFrame().setMainPanel(new HomePanel());
					}
				});
	  }
}
