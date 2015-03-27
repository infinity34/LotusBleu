package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JButton;

import Functions.RegistrationAdminFacade;

public class RegistrationAdminMain extends JPanel {

	private RegistrationAdminFacade registrationAdminFacade;
	
	/**
	 * Create the panel.
	 */
	public RegistrationAdminMain() {
		
		this.registrationAdminFacade = new RegistrationAdminFacade();
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JButton btnAddRegistration = new JButton("Add registration");
		springLayout.putConstraint(SpringLayout.WEST, btnAddRegistration, 73, SpringLayout.WEST, this);
		add(btnAddRegistration);
		
		JButton btnUpdate = new JButton("Update Registration");
		springLayout.putConstraint(SpringLayout.EAST, btnAddRegistration, 0, SpringLayout.EAST, btnUpdate);
		springLayout.putConstraint(SpringLayout.WEST, btnUpdate, 73, SpringLayout.WEST, this);
		add(btnUpdate);
		
		JButton btnListRegistration = new JButton("List registration");
		springLayout.putConstraint(SpringLayout.SOUTH, btnAddRegistration, -24, SpringLayout.NORTH, btnListRegistration);
		springLayout.putConstraint(SpringLayout.SOUTH, btnListRegistration, -145, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, btnUpdate, 21, SpringLayout.SOUTH, btnListRegistration);
		springLayout.putConstraint(SpringLayout.WEST, btnListRegistration, 73, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnListRegistration, 0, SpringLayout.EAST, btnUpdate);
		add(btnListRegistration);
		
		JButton btnDeleteRegistration = new JButton("Delete registration");
		springLayout.putConstraint(SpringLayout.NORTH, btnDeleteRegistration, 20, SpringLayout.SOUTH, btnUpdate);
		springLayout.putConstraint(SpringLayout.WEST, btnDeleteRegistration, 73, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnDeleteRegistration, 0, SpringLayout.EAST, btnUpdate);
		add(btnDeleteRegistration);
		
		btnAddRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new RegistrationAdminAdd(registrationAdminFacade));
			}
		});
		
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new RegistrationAdminUpdate(registrationAdminFacade));
			}
		});
		
		btnListRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new RegistrationAdminList(registrationAdminFacade));
			}
		});
		
		btnDeleteRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new RegistrationAdminDelete(registrationAdminFacade));
			}
		});

	}
}
