package UI;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import Functions.RegistrationAdminFacade;

import javax.swing.JTable;

public class RegistrationAdminList extends JPanel {

	private RegistrationAdminFacade registrationAdminFacade;
	private JTable table;
	
	/**
	 * Create the panel.
	 */
	public RegistrationAdminList(RegistrationAdminFacade registrationAdminFacade) {

		this.registrationAdminFacade=registrationAdminFacade;
		
		String title[]={"Firstname", "lastname", "usermail"};

		table = new JTable(registrationAdminFacade.displayRegistrations(), title );
		add(table);
	}

}
