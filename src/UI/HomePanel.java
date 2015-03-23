package UI;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class HomePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public HomePanel() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnCategoryManagement = new JButton("Manage Category");
		add(btnCategoryManagement);
		
		JButton btnNewButton = new JButton("New button");
		add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("New button");
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		add(btnNewButton_4);

	}

}
