package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import Functions.RegistrationAdminFacade;

public class RegistrationAdminDelete extends JPanel {
	
	private RegistrationAdminFacade registrationAdminFacade;
	private JTextField usermailTextfield;

	/**
	 * Create the panel.
	 */
	
	public RegistrationAdminDelete(RegistrationAdminFacade registrationAdminFacade) {
		
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
		
		JButton btnDeleteUser = new JButton("Delete User");
		springLayout.putConstraint(SpringLayout.NORTH, btnDeleteUser, 39, SpringLayout.SOUTH, usermailTextfield);
		springLayout.putConstraint(SpringLayout.WEST, btnDeleteUser, 145, SpringLayout.WEST, this);
		add(btnDeleteUser);
		
		btnDeleteUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usermail = usermailTextfield.getText();
				
				boolean result = registrationAdminFacade.deleteRegistration(usermail);
				if( result){
					JOptionPane.showMessageDialog(new JPanel(),"deletion completed !");
				}
				else
				{
					JOptionPane.showMessageDialog(new JPanel(),"you can't delete the user, we wan't to stock the old information");
				}

			}
		});

	}
}
