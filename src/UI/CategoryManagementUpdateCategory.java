package UI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

import Functions.CategoryFacade;
import javax.swing.JComboBox;


public class CategoryManagementUpdateCategory extends JPanel {
	
	private CategoryFacade facade;
	private JButton btnUpdateCategory;
	private JButton btnBack;
	private JComboBox listeCategory;


	public CategoryManagementUpdateCategory() {
		this.setSize( 640, 480);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblUpdateACategory = new JLabel("Update a Category or a SubCategory");
		springLayout.putConstraint(SpringLayout.NORTH, lblUpdateACategory, 22, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblUpdateACategory, -10, SpringLayout.EAST, this);
		lblUpdateACategory.setFont(new Font("Dialog", Font.BOLD, 20));
		add(lblUpdateACategory);
		
		JLabel lblNameOfThe = new JLabel("Name of the Category :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNameOfThe, 40, SpringLayout.SOUTH, lblUpdateACategory);
		springLayout.putConstraint(SpringLayout.WEST, lblNameOfThe, 46, SpringLayout.WEST, this);
		add(lblNameOfThe);
		
		btnUpdateCategory = new JButton("Update Category");
		springLayout.putConstraint(SpringLayout.NORTH, btnUpdateCategory, 25, SpringLayout.SOUTH, lblNameOfThe);
		springLayout.putConstraint(SpringLayout.WEST, btnUpdateCategory, 155, SpringLayout.WEST, this);
		add(btnUpdateCategory);
		
		btnBack = new JButton("< Back");
		springLayout.putConstraint(SpringLayout.WEST, btnBack, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnBack, -10, SpringLayout.SOUTH, this);
		add(btnBack);
		
		listeCategory = new JComboBox();
		//ArrayList<Category> allCategory =  facade.getAllCategory();
				/*
				for(int i = 0 ; i< allCategory.size(); i++)
				{
					listCategory.addItem(allCategory.get(i));
				}*/
		springLayout.putConstraint(SpringLayout.NORTH, listeCategory, -5, SpringLayout.NORTH, lblNameOfThe);
		springLayout.putConstraint(SpringLayout.WEST, listeCategory, 22, SpringLayout.EAST, lblNameOfThe);
		springLayout.putConstraint(SpringLayout.EAST, listeCategory, 163, SpringLayout.EAST, lblNameOfThe);
		add(listeCategory);
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.MainFrame.getMainFrame().setMainPanel(new CategoryManagementMenuGUI());
				}
			});
	

	}

}
