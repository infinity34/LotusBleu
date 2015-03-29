package UI;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;

import Data.User;
import Functions.RegistrationAdminFacade;

import javax.swing.JTable;

public class RegistrationAdminList extends JPanel {

	private RegistrationAdminFacade registrationAdminFacade;
	private JTable table;
	private final JScrollPane scrollPane = new JScrollPane();

	/**
	 * Create the panel.
	 */
	public RegistrationAdminList(RegistrationAdminFacade registrationAdminFacade) {

		this.registrationAdminFacade=registrationAdminFacade;

		String title[]={ "usermail", "Firstname", "lastname"};
		ArrayList<User> registrations = registrationAdminFacade.displayRegistrations();

		Object[][] data = new Object[registrations.size()][3];

		for (int i = 0; i < registrations.size(); i++){
			data[i][0] = registrations.get(i).getUsermail();
			data[i][1] = registrations.get(i).getUserfirstname();
			data[i][2] = registrations.get(i).getUsername();
		}
		scrollPane.setBounds(0, 52, 640, 282);
		add(scrollPane);
		table = new JTable(data,title);
		scrollPane.setViewportView(table);
		
	}

}
