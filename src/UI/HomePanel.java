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
		springLayout.putConstraint(SpringLayout.WEST, btnAccessoryManagement, 55, SpringLayout.EAST, btnCategoryManagement);
		add(btnAccessoryManagement);
		
		JButton btnManageRoom = new JButton("Manage Room");
		springLayout.putConstraint(SpringLayout.WEST, btnManageRoom, 450, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnManageRoom, -10, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnAccessoryManagement, -24, SpringLayout.WEST, btnManageRoom);
		springLayout.putConstraint(SpringLayout.NORTH, btnManageRoom, 10, SpringLayout.NORTH, this);
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
		springLayout.putConstraint(SpringLayout.EAST, btnActivityManagement, -214, SpringLayout.EAST, this);
		add(btnActivityManagement);
		
		JButton btnRegistration = new JButton("Manage Registration");
		springLayout.putConstraint(SpringLayout.NORTH, btnRegistration, 0, SpringLayout.NORTH, btnContributorManagement);
		springLayout.putConstraint(SpringLayout.WEST, btnRegistration, 0, SpringLayout.WEST, btnManageRoom);
		springLayout.putConstraint(SpringLayout.EAST, btnRegistration, -10, SpringLayout.EAST, this);
		add(btnRegistration);
		
		JButton btnManageEvent_1 = new JButton("Manage Event");
		springLayout.putConstraint(SpringLayout.NORTH, btnManageEvent_1, 6, SpringLayout.SOUTH, btnProductManagement);
		springLayout.putConstraint(SpringLayout.WEST, btnManageEvent_1, 0, SpringLayout.WEST, btnCategoryManagement);
		springLayout.putConstraint(SpringLayout.EAST, btnManageEvent_1, 0, SpringLayout.EAST, btnCategoryManagement);
		add(btnManageEvent_1);
		
		JButton btnManageOrder = new JButton("Manage Orders");
		springLayout.putConstraint(SpringLayout.NORTH, btnManageOrder, 0, SpringLayout.NORTH, btnProductManagement);
		springLayout.putConstraint(SpringLayout.WEST, btnManageOrder, 0, SpringLayout.WEST, btnAccessoryManagement);
		springLayout.putConstraint(SpringLayout.EAST, btnManageOrder, 0, SpringLayout.EAST, btnAccessoryManagement);
		add(btnManageOrder);
		
		JButton btnNewButton_1 = new JButton("Events");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, btnProductManagement);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 0, SpringLayout.WEST, btnManageRoom);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1, 0, SpringLayout.EAST, btnManageRoom);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new EventListGUI());
			}
		});
		add(btnNewButton_1);
		
		JButton btnBasket = new JButton("Basket");
		btnBasket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new BasketManagementMenuGUI());
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnBasket, 0, SpringLayout.WEST, btnAccessoryManagement);
		springLayout.putConstraint(SpringLayout.SOUTH, btnBasket, 0, SpringLayout.SOUTH, btnManageEvent_1);
		springLayout.putConstraint(SpringLayout.EAST, btnBasket, 0, SpringLayout.EAST, btnAccessoryManagement);
		add(btnBasket);
		
		btnAccessoryManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new AccessoryMainView());
			}
		});
		
		btnManageOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new OrderManagementMenuGUI());
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

		btnRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnManageEvent_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new EventMainView());
			}
		});
		
		btnRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new RegistrationAdminMain());
			}
		});
	}
}