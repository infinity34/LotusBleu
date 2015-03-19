import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;


public class CategoryManagementUpdateCategory extends JPanel {
	
	private JTextField textField;


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
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textField, 17, SpringLayout.EAST, lblNameOfThe);
		springLayout.putConstraint(SpringLayout.SOUTH, textField, 0, SpringLayout.SOUTH, lblNameOfThe);
		add(textField);
		textField.setColumns(10);
		
		JButton btnUpdateCategory = new JButton("Update Category");
		springLayout.putConstraint(SpringLayout.NORTH, btnUpdateCategory, 25, SpringLayout.SOUTH, lblNameOfThe);
		springLayout.putConstraint(SpringLayout.WEST, btnUpdateCategory, 155, SpringLayout.WEST, this);
		add(btnUpdateCategory);
		
		JButton button = new JButton("< Back");
		springLayout.putConstraint(SpringLayout.WEST, button, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, button, -10, SpringLayout.SOUTH, this);
		add(button);
	

	}

}
