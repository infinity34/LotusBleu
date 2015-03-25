package UI;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

import Functions.ProductManagementFacade;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductManagementAddProductGUI extends JPanel {
	
	private JTextField productNameTextField;
	private JTextField productPriceTextField;
	private JTextField productQuantityTextField;
	private JTextField productDiscountTextField;
	
	private ProductManagementFacade facade;
	
	
	public ProductManagementAddProductGUI() {
		
		this.setSize(640, 480);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblAddAProduct = new JLabel("Add a Product");
		lblAddAProduct.setFont(new Font("Dialog", Font.BOLD, 20));
		springLayout.putConstraint(SpringLayout.NORTH, lblAddAProduct, 38, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblAddAProduct, -232, SpringLayout.EAST, this);
		add(lblAddAProduct);
		
		JLabel lblProductName = new JLabel("Product name :");
		springLayout.putConstraint(SpringLayout.NORTH, lblProductName, 132, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblProductName, 101, SpringLayout.WEST, this);
		add(lblProductName);
		
		productNameTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, productNameTextField, 0, SpringLayout.NORTH, lblProductName);
		springLayout.putConstraint(SpringLayout.WEST, productNameTextField, 0, SpringLayout.WEST, lblAddAProduct);
		add(productNameTextField);
		productNameTextField.setColumns(10);
		
		JLabel lblProductsPrice = new JLabel("Product's price");
		springLayout.putConstraint(SpringLayout.NORTH, lblProductsPrice, 33, SpringLayout.SOUTH, lblProductName);
		springLayout.putConstraint(SpringLayout.WEST, lblProductsPrice, 0, SpringLayout.WEST, lblProductName);
		add(lblProductsPrice);
		
		JLabel lblProductQuantity = new JLabel("Product quantity :");
		springLayout.putConstraint(SpringLayout.NORTH, lblProductQuantity, 34, SpringLayout.SOUTH, lblProductsPrice);
		springLayout.putConstraint(SpringLayout.WEST, lblProductQuantity, 0, SpringLayout.WEST, lblProductName);
		add(lblProductQuantity);
		
		JLabel lblProductDiscount = new JLabel("Product discount :");
		springLayout.putConstraint(SpringLayout.NORTH, lblProductDiscount, 38, SpringLayout.SOUTH, lblProductQuantity);
		springLayout.putConstraint(SpringLayout.WEST, lblProductDiscount, 0, SpringLayout.WEST, lblProductName);
		add(lblProductDiscount);
		
		productPriceTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, productPriceTextField, 0, SpringLayout.SOUTH, lblProductsPrice);
		springLayout.putConstraint(SpringLayout.EAST, productPriceTextField, 0, SpringLayout.EAST, productNameTextField);
		add(productPriceTextField);
		productPriceTextField.setColumns(10);
		
		productQuantityTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, productQuantityTextField, 0, SpringLayout.NORTH, lblProductQuantity);
		springLayout.putConstraint(SpringLayout.EAST, productQuantityTextField, 0, SpringLayout.EAST, productNameTextField);
		add(productQuantityTextField);
		productQuantityTextField.setColumns(10);
		
		productDiscountTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, productDiscountTextField, 0, SpringLayout.SOUTH, lblProductDiscount);
		springLayout.putConstraint(SpringLayout.EAST, productDiscountTextField, 0, SpringLayout.EAST, productNameTextField);
		add(productDiscountTextField);
		productDiscountTextField.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnAdd, 0, SpringLayout.WEST, lblAddAProduct);
		springLayout.putConstraint(SpringLayout.SOUTH, btnAdd, -76, SpringLayout.SOUTH, this);
		add(btnAdd);
		
		JButton btnBack = new JButton("< Back");
		springLayout.putConstraint(SpringLayout.WEST, btnBack, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnBack, -10, SpringLayout.SOUTH, this);
		add(btnBack);
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.MainFrame.getMainFrame().setMainPanel(new ProductManagementMenuGUI());
				}
			});
		
	}
}
