package UI;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

import Data.Category;
import Functions.CategoryFacade;
import javax.swing.JComboBox;


public class CategoryManagementDeleteCategoryGUI extends JPanel {
	
	private JComboBox listCategory;
	private JButton btnBack;
	private JButton btnDeleteCategory;

	/**
	 * Create the panel.
	 */
	public CategoryManagementDeleteCategoryGUI() {
		this.setSize( 640, 480);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblDeleteACategory = new JLabel("Delete a Category or a Subcategory");
		springLayout.putConstraint(SpringLayout.NORTH, lblDeleteACategory, 30, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblDeleteACategory, -97, SpringLayout.EAST, this);
		lblDeleteACategory.setFont(new Font("Dialog", Font.BOLD, 20));
		add(lblDeleteACategory);
		
		JLabel lblNameOfThe = new JLabel("Name of the Category you wish to delete :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNameOfThe, 59, SpringLayout.SOUTH, lblDeleteACategory);
		springLayout.putConstraint(SpringLayout.WEST, lblNameOfThe, 86, SpringLayout.WEST, this);
		add(lblNameOfThe);
		
		btnBack = new JButton("< Back");
		springLayout.putConstraint(SpringLayout.WEST, btnBack, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnBack, -10, SpringLayout.SOUTH, this);
		add(btnBack);
		
		btnDeleteCategory = new JButton("Delete Category");
		springLayout.putConstraint(SpringLayout.NORTH, btnDeleteCategory, 46, SpringLayout.SOUTH, lblNameOfThe);
		springLayout.putConstraint(SpringLayout.WEST, btnDeleteCategory, 249, SpringLayout.WEST, this);
		add(btnDeleteCategory);
		
		listCategory = new JComboBox();
		ArrayList<Category> allCategory =  Functions.CategoryFacade.getFacade().getAllCategory();
		
		for(int i = 0 ; i< allCategory.size(); i++)
		{
			listCategory.addItem(allCategory.get(i).getCategoryName());
		}
		springLayout.putConstraint(SpringLayout.NORTH, listCategory, -5, SpringLayout.NORTH, lblNameOfThe);
		springLayout.putConstraint(SpringLayout.WEST, listCategory, 16, SpringLayout.EAST, lblNameOfThe);
		springLayout.putConstraint(SpringLayout.EAST, listCategory, 140, SpringLayout.EAST, lblNameOfThe);
		add(listCategory);
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.MainFrame.getMainFrame().setMainPanel(new CategoryManagementMenuGUI());
				}
			});
		
		btnDeleteCategory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String choosenCategory = (String)listCategory.getSelectedItem();
				if(CategoryFacade.getFacade().deleteCategory(choosenCategory))
				{
					JOptionPane.showMessageDialog(new CategoryManagementMenuGUI(),"Category deleted !");
					UI.MainFrame.getMainFrame().setMainPanel(new CategoryManagementMenuGUI());
				}
				else
				{
					JOptionPane.showMessageDialog(new CategoryManagementAddCategoryGUI(),"Delete failed !");
				}
				
				}
			});

	}
}
