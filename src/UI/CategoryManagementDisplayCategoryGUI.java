package UI;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import Data.Category;

public class CategoryManagementDisplayCategoryGUI extends JPanel {
	private JTable table;
	
	public CategoryManagementDisplayCategoryGUI()
	{
		this.setSize( 640, 480);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JButton button = new JButton("< Back");
		springLayout.putConstraint(SpringLayout.WEST, button, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, button, -10, SpringLayout.SOUTH, this);
		add(button);
		
		table = new JTable();
		springLayout.putConstraint(SpringLayout.NORTH, table, 154, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, table, 295, SpringLayout.WEST, this);
		add(table);
		
		ArrayList<Category> allCategory =  Functions.CategoryFacade.getFacade().getAllCategory();
		String[] headers = allCategory.get(0)
	}
	

}
