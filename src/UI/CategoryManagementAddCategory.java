package UI;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;


public class CategoryManagementAddCategory extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

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
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textField, 22, SpringLayout.EAST, lblNameOfThe);
		springLayout.putConstraint(SpringLayout.NORTH, lblNameOfThe, 2, SpringLayout.NORTH, textField);
		springLayout.putConstraint(SpringLayout.NORTH, textField, 33, SpringLayout.SOUTH, lblAddACategory);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNameOfThe_1 = new JLabel("Name of the father's Category :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNameOfThe_1, 25, SpringLayout.SOUTH, lblNameOfThe);
		springLayout.putConstraint(SpringLayout.EAST, lblNameOfThe, 0, SpringLayout.EAST, lblNameOfThe_1);
		springLayout.putConstraint(SpringLayout.WEST, lblNameOfThe_1, 10, SpringLayout.WEST, this);
		add(lblNameOfThe_1);
		
		textField_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_1, 0, SpringLayout.NORTH, lblNameOfThe_1);
		springLayout.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, textField);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnCreateCategory = new JButton("Create Category");
		springLayout.putConstraint(SpringLayout.NORTH, btnCreateCategory, 47, SpringLayout.SOUTH, textField_1);
		springLayout.putConstraint(SpringLayout.WEST, btnCreateCategory, 160, SpringLayout.WEST, this);
		add(btnCreateCategory);
		
		JButton button = new JButton("< Back");
		springLayout.putConstraint(SpringLayout.WEST, button, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, button, -10, SpringLayout.SOUTH, this);
		add(button);

	}
}
