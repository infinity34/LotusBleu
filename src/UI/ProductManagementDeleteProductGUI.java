package UI;

import javax.swing.JOptionPane;
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
import Functions.CategoryFacade;
import Functions.ProductManagementFacade;

public class ProductManagementDeleteProductGUI extends JPanel
{
	private JComboBox listProduct;
	
	public ProductManagementDeleteProductGUI()
	{
		this.setSize( 640, 480);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblDeleteAProduct = new JLabel("Delete a Product");
		springLayout.putConstraint(SpringLayout.NORTH, lblDeleteAProduct, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblDeleteAProduct, -202, SpringLayout.EAST, this);
		lblDeleteAProduct.setFont(new Font("Dialog", Font.BOLD, 20));
		add(lblDeleteAProduct);
		
		
		JButton btnDelete = new JButton("Delete");
		springLayout.putConstraint(SpringLayout.NORTH, btnDelete, 152, SpringLayout.SOUTH, lblDeleteAProduct);
		springLayout.putConstraint(SpringLayout.EAST, btnDelete, -257, SpringLayout.EAST, this);
		add(btnDelete);
		
		JButton btnBack = new JButton("< Back");
		springLayout.putConstraint(SpringLayout.WEST, btnBack, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnBack, -10, SpringLayout.SOUTH, this);
		add(btnBack);
		
		listProduct = new JComboBox();
		springLayout.putConstraint(SpringLayout.NORTH, listProduct, 67, SpringLayout.SOUTH, lblDeleteAProduct);
		springLayout.putConstraint(SpringLayout.WEST, listProduct, 313, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, listProduct, -223, SpringLayout.EAST, this);
		add(listProduct);
		
		ArrayList<Product> allProduct =  ProductManagementFacade.getFacade().getAllProduct();
		
		for(int i = 0 ; i< allProduct.size(); i++)
		{
			listProduct.addItem(allProduct.get(i).getProductName());
		}
		
		JLabel lblSelectAProduct = new JLabel("Select a Product to delete :");
		springLayout.putConstraint(SpringLayout.NORTH, lblSelectAProduct, 5, SpringLayout.NORTH, listProduct);
		springLayout.putConstraint(SpringLayout.EAST, lblSelectAProduct, -34, SpringLayout.WEST, listProduct);
		add(lblSelectAProduct);
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.MainFrame.getMainFrame().setMainPanel(new ProductManagementMenuGUI());
				}
			});
		
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String choosenProduct = (String)listProduct.getSelectedItem();
				if(ProductManagementFacade.getFacade().deleteProduct(choosenProduct))
				{
					JOptionPane.showMessageDialog(new ProductManagementMenuGUI(),"Product deleted !");
					UI.MainFrame.getMainFrame().setMainPanel(new ProductManagementMenuGUI());
				}
				else
				{
					JOptionPane.showMessageDialog(new ProductManagementMenuGUI(),"Delete failed !");
				}
				
				}
			
			});
		
	}
}
