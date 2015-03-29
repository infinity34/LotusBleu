package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import Data.Category;

public class CategoryManagementDisplayCategoryGUI extends JPanel {
	private JTable table;
	private JButton btnback;
	public CategoryManagementDisplayCategoryGUI()
	{
		this.setSize( 640, 480);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		btnback = new JButton("< Back");
		springLayout.putConstraint(SpringLayout.WEST, btnback, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnback, -10, SpringLayout.SOUTH, this);
		add(btnback);
		
		ArrayList<Category> allCategory =  Functions.CategoryFacade.getFacade().getAllCategory();
		String[] headers = {"Name", "Available", "Mother category"};
		String [][] category = new String [allCategory.size()-1][3];
		for (int i = 0 ; i<allCategory.size()-1; i++)
		{
			category[i][0] = allCategory.get(i).getCategoryName();
			if(allCategory.get(i).getAvailable())
				category[i][1] = "Yes";
			else
				category[i][1] = "No";
			category[i][2] = allCategory.get(i).getMotherCategoryName();
		}
		
		table = new JTable(category, headers);
		
		springLayout.putConstraint(SpringLayout.NORTH, table, 154, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, table, 295, SpringLayout.WEST, this);
		add(new JScrollPane(table));
		
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.MainFrame.getMainFrame().setMainPanel(new CategoryManagementMenuGUI());
				}
			});
		
	}
	

}
