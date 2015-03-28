package UI;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JButton;

import Data.Product;
import Functions.ProductManagementFacade;

public class ProductManagementUpdateProductGUI extends JPanel
{
	private JButton btnBack;
	private JButton btnUpdate;
	private JComboBox listProduct ;

	public ProductManagementUpdateProductGUI()
	{
		this.setSize( 640, 480);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblUpdateAProduct = new JLabel("Update a Product");
		lblUpdateAProduct.setFont(new Font("Dialog", Font.BOLD, 20));
		springLayout.putConstraint(SpringLayout.NORTH, lblUpdateAProduct, 32, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblUpdateAProduct, -255, SpringLayout.EAST, this);
		add(lblUpdateAProduct);
		
		JLabel lblSelectAProduct = new JLabel("Select a product :");
		springLayout.putConstraint(SpringLayout.NORTH, lblSelectAProduct, 75, SpringLayout.SOUTH, lblUpdateAProduct);
		springLayout.putConstraint(SpringLayout.WEST, lblSelectAProduct, 127, SpringLayout.WEST, this);
		add(lblSelectAProduct);
		
		listProduct = new JComboBox();
		
		ArrayList<Product> allProduct =  ProductManagementFacade.getFacade().getAllProduct();
		
		for(int i = 0 ; i< allProduct.size(); i++)
		{
			listProduct.addItem(allProduct.get(i).getProductName());
		}
		springLayout.putConstraint(SpringLayout.NORTH, listProduct, 66, SpringLayout.SOUTH, lblUpdateAProduct);
		springLayout.putConstraint(SpringLayout.WEST, listProduct, 25, SpringLayout.EAST, lblSelectAProduct);
		springLayout.putConstraint(SpringLayout.EAST, listProduct, 187, SpringLayout.EAST, lblSelectAProduct);
		add(listProduct);
		
		btnUpdate = new JButton("Update");
		springLayout.putConstraint(SpringLayout.NORTH, btnUpdate, 87, SpringLayout.SOUTH, listProduct);
		springLayout.putConstraint(SpringLayout.WEST, btnUpdate, 0, SpringLayout.WEST, listProduct);
		add(btnUpdate);
		
		btnBack = new JButton("< Back");
		springLayout.putConstraint(SpringLayout.WEST, btnBack, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnBack, -10, SpringLayout.SOUTH, this);
		add(btnBack);
		

		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.MainFrame.getMainFrame().setMainPanel(new ProductManagementMenuGUI());
				}
			});
		
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Product product = ProductManagementFacade.getFacade().getProduct((String)listProduct.getSelectedItem());
				UI.MainFrame.getMainFrame().setMainPanel(new ProductManagementUpdateProductFieldGUI(product));
				}
			});
	}
}
