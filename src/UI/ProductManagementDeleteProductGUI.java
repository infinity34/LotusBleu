package UI;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JButton;

import Functions.ProductManagementFacade;

public class ProductManagementDeleteProductGUI extends JPanel
{
	
	private ProductManagementFacade facade;
	
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
		
		JLabel lblSelectTheProduct = new JLabel("Select the product :");
		springLayout.putConstraint(SpringLayout.NORTH, lblSelectTheProduct, 106, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblSelectTheProduct, 130, SpringLayout.WEST, this);
		add(lblSelectTheProduct);
		
		JComboBox comboBox = new JComboBox();
		springLayout.putConstraint(SpringLayout.NORTH, comboBox, -5, SpringLayout.NORTH, lblSelectTheProduct);
		springLayout.putConstraint(SpringLayout.WEST, comboBox, 28, SpringLayout.EAST, lblSelectTheProduct);
		springLayout.putConstraint(SpringLayout.EAST, comboBox, 0, SpringLayout.EAST, lblDeleteAProduct);
		add(comboBox);
		
		JButton btnDelete = new JButton("Delete");
		springLayout.putConstraint(SpringLayout.NORTH, btnDelete, 69, SpringLayout.SOUTH, comboBox);
		springLayout.putConstraint(SpringLayout.EAST, btnDelete, 0, SpringLayout.EAST, lblDeleteAProduct);
		add(btnDelete);
		
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
