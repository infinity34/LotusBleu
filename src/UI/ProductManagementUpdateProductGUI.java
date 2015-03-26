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

public class ProductManagementUpdateProductGUI extends JPanel
{
	private JButton btnBack;
	private ProductManagementFacade facade;
	private JButton btnUpdate;

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
		
		JComboBox comboBox = new JComboBox();
		springLayout.putConstraint(SpringLayout.NORTH, comboBox, 66, SpringLayout.SOUTH, lblUpdateAProduct);
		springLayout.putConstraint(SpringLayout.WEST, comboBox, 25, SpringLayout.EAST, lblSelectAProduct);
		springLayout.putConstraint(SpringLayout.EAST, comboBox, 187, SpringLayout.EAST, lblSelectAProduct);
		add(comboBox);
		
		btnUpdate = new JButton("Update");
		springLayout.putConstraint(SpringLayout.NORTH, btnUpdate, 87, SpringLayout.SOUTH, comboBox);
		springLayout.putConstraint(SpringLayout.WEST, btnUpdate, 0, SpringLayout.WEST, comboBox);
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
	}
}
