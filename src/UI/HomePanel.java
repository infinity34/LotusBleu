package UI;

import javax.swing.JPanel;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.SpringLayout;

public class HomePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public HomePanel() {
		this.setSize(640, 480);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JButton btnCategoryManagement = new JButton("Manage Category");
		springLayout.putConstraint(SpringLayout.NORTH, btnCategoryManagement, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnCategoryManagement, 11, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnCategoryManagement, -449, SpringLayout.EAST, this);
		add(btnCategoryManagement);
		
		JButton btnAccessoryManagement = new JButton("Manage Accessory");
		springLayout.putConstraint(SpringLayout.NORTH, btnAccessoryManagement, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnAccessoryManagement, -214, SpringLayout.EAST, this);
		add(btnAccessoryManagement);
		
		JButton btnManageRoom = new JButton("Manage Room");
		springLayout.putConstraint(SpringLayout.NORTH, btnManageRoom, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnManageRoom, -10, SpringLayout.EAST, this);
		add(btnManageRoom);
		
		JButton btnProductManagement = new JButton("Manage Product");
		springLayout.putConstraint(SpringLayout.WEST, btnProductManagement, 0, SpringLayout.WEST, btnCategoryManagement);
		springLayout.putConstraint(SpringLayout.EAST, btnProductManagement, 0, SpringLayout.EAST, btnCategoryManagement);
		add(btnProductManagement);
		
		JButton btnContributorManagement = new JButton("Manage Contributor");
		springLayout.putConstraint(SpringLayout.NORTH, btnProductManagement, 6, SpringLayout.SOUTH, btnContributorManagement);
		springLayout.putConstraint(SpringLayout.NORTH, btnContributorManagement, 10, SpringLayout.SOUTH, btnCategoryManagement);
		springLayout.putConstraint(SpringLayout.WEST, btnContributorManagement, 11, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnContributorManagement, 0, SpringLayout.EAST, btnCategoryManagement);
		add(btnContributorManagement);
		
		JButton btnActivityManagement = new JButton("Manage Activity");
		springLayout.putConstraint(SpringLayout.NORTH, btnActivityManagement, 6, SpringLayout.SOUTH, btnAccessoryManagement);
		springLayout.putConstraint(SpringLayout.WEST, btnActivityManagement, 55, SpringLayout.EAST, btnContributorManagement);
		springLayout.putConstraint(SpringLayout.WEST, btnAccessoryManagement, 0, SpringLayout.WEST, btnActivityManagement);
		add(btnActivityManagement);
		
		JButton btnNewButton = new JButton("Manage TRUC");
		springLayout.putConstraint(SpringLayout.EAST, btnActivityManagement, -24, SpringLayout.WEST, btnNewButton);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 6, SpringLayout.SOUTH, btnManageRoom);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 450, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -10, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.WEST, btnManageRoom, 0, SpringLayout.WEST, btnNewButton);
		add(btnNewButton);
		
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
		
		btnContributorManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ContributorManagementMenuGUI());
			}
		});
		
		btnManageRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new RoomManagementGUI());
			}
		});
		
		btnActivityManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ActivityMainView());
			}
		});

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}

}