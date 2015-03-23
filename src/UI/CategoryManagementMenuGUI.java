package UI;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Functions.CategoryFacade;


public class CategoryManagementMenuGUI extends JPanel {
	
	private JButton btnAddACategory;
	private JButton btnUpdateACategory;
	private JButton btnDeleteACategory;
	private JButton btnDisplayCategory;
	private JButton btnBack;
	
	private CategoryFacade facade;
	
	
	//Getter for the JButton
	public JButton getBtnAddACategory() {
		return btnAddACategory;
	}



	public JButton getBtnUpdateACategory() {
		return btnUpdateACategory;
	}



	public JButton getBtnDeleteACategory() {
		return btnDeleteACategory;
	}
	
	public JButton getBtnDisplayCategory() {
		return btnDisplayCategory;
	}


	public JButton getBtnBack() {
		return btnBack;
	}
	
	

	

	
	public CategoryManagementMenuGUI() {
		
		this.setSize( 640, 480);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblCategorySub = new JLabel("Category / Subcategory Management");
		springLayout.putConstraint(SpringLayout.NORTH, lblCategorySub, 25, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblCategorySub, 90, SpringLayout.WEST, this);
		lblCategorySub.setFont(new Font("Dialog", Font.BOLD, 20));
		add(lblCategorySub);
		
		JLabel lblHereYouCan = new JLabel("Here you can manage your category and subcategory");
		springLayout.putConstraint(SpringLayout.NORTH, lblHereYouCan, 25, SpringLayout.SOUTH, lblCategorySub);
		springLayout.putConstraint(SpringLayout.WEST, lblHereYouCan, 120, SpringLayout.WEST, this);
		add(lblHereYouCan);
		
		btnAddACategory = new JButton("Add a Category");
		springLayout.putConstraint(SpringLayout.WEST, btnAddACategory, 40, SpringLayout.WEST, this);
		add(btnAddACategory);
		
		btnUpdateACategory = new JButton("Udate a Category");
		springLayout.putConstraint(SpringLayout.NORTH, btnAddACategory, 0, SpringLayout.NORTH, btnUpdateACategory);
		springLayout.putConstraint(SpringLayout.NORTH, btnUpdateACategory, 45, SpringLayout.SOUTH, lblHereYouCan);
		springLayout.putConstraint(SpringLayout.WEST, btnUpdateACategory, 236, SpringLayout.WEST, this);
		add(btnUpdateACategory);
		
		btnDeleteACategory = new JButton("Delete a Category");
		springLayout.putConstraint(SpringLayout.NORTH, btnDeleteACategory, 0, SpringLayout.NORTH, btnAddACategory);
		springLayout.putConstraint(SpringLayout.EAST, btnDeleteACategory, -25, SpringLayout.EAST, this);
		add(btnDeleteACategory);
		
		btnBack = new JButton("< Back");
		springLayout.putConstraint(SpringLayout.WEST, btnBack, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnBack, -10, SpringLayout.SOUTH, this);
		add(btnBack);
		
		btnDisplayCategory = new JButton("Display all Categories");
		springLayout.putConstraint(SpringLayout.NORTH, btnDisplayCategory, 66, SpringLayout.SOUTH, btnUpdateACategory);
		springLayout.putConstraint(SpringLayout.EAST, btnDisplayCategory, -225, SpringLayout.EAST, this);
		add(btnDisplayCategory);
		
		btnAddACategory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.MainFrame.getMainFrame().setMainPanel(new CategoryManagementAddCategoryGUI());
				}
			});
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.MainFrame.getMainFrame().setMainPanel(new HomePanel());
				}
			});
		
		btnDeleteACategory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.MainFrame.getMainFrame().setMainPanel(new CategoryManagementDeleteCategory());
				}
			});
		/*
		btnDisplayCategory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.MainFrame.getMainFrame().setMainPanel(new CategoryManagementDeleteCategory());
				}
			});*/
		
		btnUpdateACategory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.MainFrame.getMainFrame().setMainPanel(new CategoryManagementUpdateCategory());
				}
			});

	}
}
