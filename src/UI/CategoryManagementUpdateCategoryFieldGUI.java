package UI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Data.Category;
import Functions.CategoryFacade;
import javax.swing.JComboBox;


public class CategoryManagementUpdateCategoryFieldGUI extends JPanel {

	/**
	 * Create the panel.
	 */
	private JCheckBox chckbxAvailable;
	private JComboBox listCategory;
	private JTextField categoryName;
	private final String oldName;

	public CategoryManagementUpdateCategoryFieldGUI(Category category) {
		oldName = category.getCategoryName();
		this.setSize( 640, 480);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblAddACategory = new JLabel("Update a Category or a Subcategory");
		springLayout.putConstraint(SpringLayout.NORTH, lblAddACategory, 61, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblAddACategory, -101, SpringLayout.EAST, this);
		lblAddACategory.setFont(new Font("Dialog", Font.BOLD, 20));
		add(lblAddACategory);
		
		JLabel lblNameOfThe = new JLabel("Rename the Category :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNameOfThe, 72, SpringLayout.SOUTH, lblAddACategory);
		springLayout.putConstraint(SpringLayout.WEST, lblNameOfThe, 71, SpringLayout.WEST, this);
		add(lblNameOfThe);
		
		JLabel lblNameOfThe_1 = new JLabel("Set the father's Category :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNameOfThe_1, 43, SpringLayout.SOUTH, lblNameOfThe);
		springLayout.putConstraint(SpringLayout.EAST, lblNameOfThe_1, 0, SpringLayout.EAST, lblNameOfThe);
		add(lblNameOfThe_1);
		
		
		JButton btnBack = new JButton("< Back");
		springLayout.putConstraint(SpringLayout.WEST, btnBack, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnBack, -10, SpringLayout.SOUTH, this);
		add(btnBack);
		
		categoryName = new JTextField(oldName);
		springLayout.putConstraint(SpringLayout.NORTH, categoryName, 0, SpringLayout.NORTH, lblNameOfThe);
		springLayout.putConstraint(SpringLayout.WEST, categoryName, 63, SpringLayout.EAST, lblNameOfThe);
		add(categoryName);
		categoryName.setColumns(10);
		
		listCategory = new JComboBox();
		
		listCategory.addItem("");		
		ArrayList<Category> allCategory =  Functions.CategoryFacade.getFacade().getAllCategory();		
		for(int i = 0 ; i< allCategory.size(); i++)
		{	if(! allCategory.get(i).getCategoryName().equals(oldName))
			{
				listCategory.addItem(allCategory.get(i).getCategoryName());
			}
		}
		
		springLayout.putConstraint(SpringLayout.NORTH, listCategory, -5, SpringLayout.NORTH, lblNameOfThe_1);
		springLayout.putConstraint(SpringLayout.WEST, listCategory, 49, SpringLayout.EAST, lblNameOfThe_1);
		springLayout.putConstraint(SpringLayout.EAST, listCategory, 0, SpringLayout.EAST, categoryName);
		add(listCategory);
		
		chckbxAvailable = new JCheckBox("Available");
		springLayout.putConstraint(SpringLayout.NORTH, chckbxAvailable, 35, SpringLayout.SOUTH, listCategory);
		springLayout.putConstraint(SpringLayout.WEST, chckbxAvailable, 0, SpringLayout.WEST, categoryName);
		add(chckbxAvailable);
		
		JButton btnUpdate = new JButton("Update");
		springLayout.putConstraint(SpringLayout.SOUTH, btnUpdate, -79, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnUpdate, 0, SpringLayout.EAST, categoryName);
		add(btnUpdate);
		
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.MainFrame.getMainFrame().setMainPanel(new CategoryManagementUpdateCategoryGUI());
				}
			});
		
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String motherCategory = (String)listCategory.getSelectedItem();
				
				if(CategoryFacade.getFacade().updateCategory(oldName,categoryName.getText(), motherCategory , chckbxAvailable.isSelected()))
				{
					JOptionPane.showMessageDialog(new CategoryManagementMenuGUI(),"Category updated !");
					UI.MainFrame.getMainFrame().setMainPanel(new CategoryManagementMenuGUI());
				}
				else
				{
					JOptionPane.showMessageDialog(new CategoryManagementAddCategoryGUI(),"Update Failed !");
				}
				
				UI.MainFrame.getMainFrame().setMainPanel(new CategoryManagementUpdateCategoryGUI());
				}
			});

	}
}
