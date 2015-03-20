package UI;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;


public class CategoryManagementDeleteCategory extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public CategoryManagementDeleteCategory() {
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
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField, -2, SpringLayout.NORTH, lblNameOfThe);
		springLayout.putConstraint(SpringLayout.WEST, textField, 28, SpringLayout.EAST, lblNameOfThe);
		add(textField);
		textField.setColumns(10);
		
		JButton btnBack = new JButton("< Back");
		springLayout.putConstraint(SpringLayout.WEST, btnBack, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnBack, -10, SpringLayout.SOUTH, this);
		add(btnBack);
		
		JButton btnDeleteCategory = new JButton("Delete Category");
		springLayout.putConstraint(SpringLayout.NORTH, btnDeleteCategory, 46, SpringLayout.SOUTH, lblNameOfThe);
		springLayout.putConstraint(SpringLayout.WEST, btnDeleteCategory, 249, SpringLayout.WEST, this);
		add(btnDeleteCategory);
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.MainFrame.getMainFrame().setMainPanel(new CategoryManagementMenu());
				}
			});

	}
}
