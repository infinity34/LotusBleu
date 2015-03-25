package UI;

import javax.swing.JPanel;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class HomePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public HomePanel() {
		this.setSize(640, 480);
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnCategoryManagement = new JButton("Manage Category");
		add(btnCategoryManagement);
		
		JButton btnAccessoryManagement = new JButton("Manage Accessory");
		add(btnAccessoryManagement);
		
		JButton btnProductManagement = new JButton("Manage Product");
		add(btnProductManagement);
		
		JButton btnNewButton_3 = new JButton("New button");
		add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		add(btnNewButton_4);
		
		btnAccessoryManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new AccessoryMainView());
			}
		});
		
		btnCategoryManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new CategoryManagementMenuGUI());
			}
		});
		
		btnProductManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ProductManagementMenuGUI());
			}
		});

	}

}
