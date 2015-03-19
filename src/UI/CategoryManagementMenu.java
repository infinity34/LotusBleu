import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;


public class CategoryManagementMenu extends JPanel {

	
	public CategoryManagementMenu() {
		
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
		
		JButton btnAddACategory = new JButton("Add a Category");
		springLayout.putConstraint(SpringLayout.WEST, btnAddACategory, 40, SpringLayout.WEST, this);
		add(btnAddACategory);
		
		JButton btnNewButton = new JButton("Udate a Category");
		springLayout.putConstraint(SpringLayout.NORTH, btnAddACategory, 0, SpringLayout.NORTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 45, SpringLayout.SOUTH, lblHereYouCan);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 236, SpringLayout.WEST, this);
		add(btnNewButton);
		
		JButton btnDeleteACategory = new JButton("Delete a Category");
		springLayout.putConstraint(SpringLayout.NORTH, btnDeleteACategory, 0, SpringLayout.NORTH, btnAddACategory);
		springLayout.putConstraint(SpringLayout.EAST, btnDeleteACategory, -25, SpringLayout.EAST, this);
		add(btnDeleteACategory);
		
		JButton button = new JButton("< Back");
		springLayout.putConstraint(SpringLayout.WEST, button, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, button, -10, SpringLayout.SOUTH, this);
		add(button);
		
		JButton btnDisplayCategory = new JButton("Display all Categories");
		springLayout.putConstraint(SpringLayout.NORTH, btnDisplayCategory, 66, SpringLayout.SOUTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.EAST, btnDisplayCategory, -225, SpringLayout.EAST, this);
		add(btnDisplayCategory);

	}
}
