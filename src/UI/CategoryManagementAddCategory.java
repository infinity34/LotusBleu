package UI;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JButton;

import Data.Category;
import Functions.CategoryFacade;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;


public class CategoryManagementAddCategory extends JPanel {
	
	private JTextField categoryName;
	private JButton btnCreateCategory;
	private JComboBox<Category> listCategory;
	private JCheckBox chckbxAvailable;
	
	private JButton btnBack;
	
	private CategoryFacade facade;

	public CategoryManagementAddCategory() {
		this.setSize(640, 480);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblAddACategory = new JLabel("Add a Category or a Subcategory");
		springLayout.putConstraint(SpringLayout.NORTH, lblAddACategory, 36, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblAddACategory, 36, SpringLayout.WEST, this);
		lblAddACategory.setFont(new Font("Dialog", Font.BOLD, 20));
		add(lblAddACategory);
		
		JLabel lblNameOfThe = new JLabel("Name of the new Category :");
		add(lblNameOfThe);
		
		categoryName = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, categoryName, 22, SpringLayout.EAST, lblNameOfThe);
		springLayout.putConstraint(SpringLayout.NORTH, lblNameOfThe, 2, SpringLayout.NORTH, categoryName);
		springLayout.putConstraint(SpringLayout.NORTH, categoryName, 33, SpringLayout.SOUTH, lblAddACategory);
		add(categoryName);
		categoryName.setColumns(10);
		
		JLabel lblNameOfThe_1 = new JLabel("Name of the mother's Category :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNameOfThe_1, 25, SpringLayout.SOUTH, lblNameOfThe);
		springLayout.putConstraint(SpringLayout.EAST, lblNameOfThe, 0, SpringLayout.EAST, lblNameOfThe_1);
		springLayout.putConstraint(SpringLayout.WEST, lblNameOfThe_1, 10, SpringLayout.WEST, this);
		add(lblNameOfThe_1);
		
		btnCreateCategory = new JButton("Create Category");
		springLayout.putConstraint(SpringLayout.WEST, btnCreateCategory, 234, SpringLayout.WEST, this);
		add(btnCreateCategory);
		
		btnBack = new JButton("< Back");
		springLayout.putConstraint(SpringLayout.WEST, btnBack, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnBack, -10, SpringLayout.SOUTH, this);
		add(btnBack);
		
		listCategory = new JComboBox<Category>();
		ArrayList<Category> allCategory =  facade.getAllCategory();
		for(int i = 0 ; i< allCategory.size(); i++)
		{
			listCategory.addItem(allCategory.get(i));
		}
		
		springLayout.putConstraint(SpringLayout.NORTH, btnCreateCategory, 52, SpringLayout.SOUTH, listCategory);
		springLayout.putConstraint(SpringLayout.NORTH, listCategory, -5, SpringLayout.NORTH, lblNameOfThe_1);
		springLayout.putConstraint(SpringLayout.WEST, listCategory, 260, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, listCategory, 0, SpringLayout.EAST, lblAddACategory);
		add(listCategory);
		
		chckbxAvailable = new JCheckBox("Available");
		springLayout.putConstraint(SpringLayout.NORTH, chckbxAvailable, 9, SpringLayout.SOUTH, listCategory);
		springLayout.putConstraint(SpringLayout.WEST, chckbxAvailable, 0, SpringLayout.WEST, categoryName);
		add(chckbxAvailable);
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.MainFrame.getMainFrame().setMainPanel(new CategoryManagementMenu());
				}
			});
		
		btnCreateCategory.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Data.Category motherCategory = (Category) listCategory.getSelectedItem();
				
				
				facade.createCategory(categoryName.getText(), motherCategory, true);
				}
			});

	}
}
