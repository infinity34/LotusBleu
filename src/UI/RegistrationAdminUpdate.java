package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Data.User;
import Functions.RegistrationAdminFacade;

public class RegistrationAdminUpdate extends JPanel {

	private RegistrationAdminFacade registrationAdminFacade;
	private JTextField usermailTextfield;
	/**
	 * Create the panel.
	 * this panel allows to modify a registration
	 * the facade allows to access the different function needed
	 * 
	 * @param registrationAdminFacade
	 */
	public RegistrationAdminUpdate(RegistrationAdminFacade registrationAdminFacade) {

		this.registrationAdminFacade = registrationAdminFacade;
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblusermail = new JLabel("Usermail :");
		springLayout.putConstraint(SpringLayout.NORTH, lblusermail, 108, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblusermail, 76, SpringLayout.WEST, this);
		add(lblusermail);
		
		usermailTextfield = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, usermailTextfield, -6, SpringLayout.NORTH, lblusermail);
		springLayout.putConstraint(SpringLayout.WEST, usermailTextfield, 44, SpringLayout.EAST, lblusermail);
		add(usermailTextfield);
		usermailTextfield.setColumns(10);
		
		JButton btnSearchUser = new JButton("Search User");
		springLayout.putConstraint(SpringLayout.NORTH, btnSearchUser, 39, SpringLayout.SOUTH, usermailTextfield);
		springLayout.putConstraint(SpringLayout.WEST, btnSearchUser, 145, SpringLayout.WEST, this);
		add(btnSearchUser);
		
		/*search the user and display the other panel to update field */
		btnSearchUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usermail = usermailTextfield.getText();
				User user = registrationAdminFacade.getRegistration(usermail);
				MainFrame.getMainFrame().setMainPanel(new RegistrationAdminUpdateField(user, registrationAdminFacade));
			}
		});

	}

}
