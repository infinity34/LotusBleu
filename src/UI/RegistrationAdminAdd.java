package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import Functions.RegistrationAdminFacade;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class RegistrationAdminAdd extends JPanel {

	private RegistrationAdminFacade registrationAdminFacade;
	private JTextField firstnameTexfield;
	private JTextField lastnameTexfield;
	private JTextField telephoneTexfield;
	private JTextField passwordTexfield;
	private JTextField postcodeTexfield;
	private JTextField cityTexfield;
	private JTextField address2Texfield;
	private JTextField usermailTextField;
	private JTextField address1TextField;
	

	public RegistrationAdminAdd( RegistrationAdminFacade registrationAdminFacade) {

		this.registrationAdminFacade = registrationAdminFacade;
		this.setSize(640, 480);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblFirstname = new JLabel("Firstname :");
		this.add(lblFirstname);
		
		JLabel lblPostCode = new JLabel("Post code :");
		this.add(lblPostCode);
		
		JLabel lblLastname = new JLabel("LastName :");
		springLayout.putConstraint(SpringLayout.WEST, lblFirstname, 0, SpringLayout.WEST, lblLastname);
		springLayout.putConstraint(SpringLayout.SOUTH, lblFirstname, -35, SpringLayout.NORTH, lblLastname);
		springLayout.putConstraint(SpringLayout.NORTH, lblLastname, 145, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblLastname, 125, SpringLayout.WEST, this);
		this.add(lblLastname);
		
		JLabel lblCity = new JLabel("City :");
		springLayout.putConstraint(SpringLayout.NORTH, lblCity, 0, SpringLayout.NORTH, lblFirstname);
		this.add(lblCity);
		
		JLabel lblTelephone = new JLabel("Telephone :");
		springLayout.putConstraint(SpringLayout.NORTH, lblTelephone, 40, SpringLayout.SOUTH, lblLastname);
		springLayout.putConstraint(SpringLayout.SOUTH, lblTelephone, 56, SpringLayout.SOUTH, lblLastname);
		this.add(lblTelephone);
		
		JLabel lblAddress = new JLabel("Address 2 :");
		springLayout.putConstraint(SpringLayout.NORTH, lblAddress, 201, SpringLayout.NORTH, this);
		this.add(lblAddress);
		
		JLabel lblPassword = new JLabel("Password :");
		this.add(lblPassword);
		
		JLabel lblRigth = new JLabel("Rigth:");
		springLayout.putConstraint(SpringLayout.WEST, lblCity, 0, SpringLayout.WEST, lblRigth);
		springLayout.putConstraint(SpringLayout.NORTH, lblPassword, 0, SpringLayout.NORTH, lblRigth);
		springLayout.putConstraint(SpringLayout.NORTH, lblRigth, 254, SpringLayout.NORTH, this);
		this.add(lblRigth);
		
		JLabel lblContributionPrice = new JLabel("Contribution price :");
		springLayout.putConstraint(SpringLayout.NORTH, lblContributionPrice, 71, SpringLayout.SOUTH, lblPassword);
		springLayout.putConstraint(SpringLayout.WEST, lblContributionPrice, 71, SpringLayout.WEST, this);
		this.add(lblContributionPrice);
		
		firstnameTexfield = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, firstnameTexfield, 8, SpringLayout.EAST, lblFirstname);
		add(firstnameTexfield);
		firstnameTexfield.setColumns(10);
		
		lastnameTexfield = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, firstnameTexfield, -23, SpringLayout.NORTH, lastnameTexfield);
		springLayout.putConstraint(SpringLayout.NORTH, lastnameTexfield, -6, SpringLayout.NORTH, lblLastname);
		springLayout.putConstraint(SpringLayout.WEST, lastnameTexfield, 0, SpringLayout.WEST, firstnameTexfield);
		add(lastnameTexfield);
		lastnameTexfield.setColumns(10);
		
		telephoneTexfield = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, telephoneTexfield, 200, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, lblTelephone, -6, SpringLayout.WEST, telephoneTexfield);
		add(telephoneTexfield);
		telephoneTexfield.setColumns(10);
		
		passwordTexfield = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, lblPassword, -9, SpringLayout.WEST, passwordTexfield);
		springLayout.putConstraint(SpringLayout.SOUTH, telephoneTexfield, -25, SpringLayout.NORTH, passwordTexfield);
		springLayout.putConstraint(SpringLayout.NORTH, passwordTexfield, -6, SpringLayout.NORTH, lblPassword);
		springLayout.putConstraint(SpringLayout.EAST, passwordTexfield, 0, SpringLayout.EAST, firstnameTexfield);
		add(passwordTexfield);
		passwordTexfield.setColumns(10);
		
		postcodeTexfield = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, postcodeTexfield, 450, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, lblPostCode, -17, SpringLayout.WEST, postcodeTexfield);
		springLayout.putConstraint(SpringLayout.NORTH, postcodeTexfield, -6, SpringLayout.NORTH, lblPostCode);
		add(postcodeTexfield);
		postcodeTexfield.setColumns(10);
		
		cityTexfield = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, cityTexfield, -6, SpringLayout.NORTH, lblFirstname);
		springLayout.putConstraint(SpringLayout.EAST, cityTexfield, 0, SpringLayout.EAST, postcodeTexfield);
		add(cityTexfield);
		cityTexfield.setColumns(10);
		
		address2Texfield = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, address2Texfield, 450, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, lblAddress, -17, SpringLayout.WEST, address2Texfield);
		add(address2Texfield);
		address2Texfield.setColumns(10);
		
		JLabel label = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, label, 59, SpringLayout.SOUTH, passwordTexfield);
		springLayout.putConstraint(SpringLayout.WEST, label, 226, SpringLayout.WEST, this);
		add(label);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Administrator");
		springLayout.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton, 450, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, lblRigth, -17, SpringLayout.WEST, rdbtnNewRadioButton);
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton, 250, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, address2Texfield, -27, SpringLayout.NORTH, rdbtnNewRadioButton);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnInCharge = new JRadioButton("In Charge");
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnInCharge, 21, SpringLayout.SOUTH, rdbtnNewRadioButton);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnInCharge, 450, SpringLayout.WEST, this);
		add(rdbtnInCharge);
		
		JButton btnAddUser = new JButton("Add User");
		springLayout.putConstraint(SpringLayout.SOUTH, btnAddUser, -32, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnAddUser, -207, SpringLayout.EAST, this);
		add(btnAddUser);
		
		JLabel lblUsermail = new JLabel("Usermail :");
		springLayout.putConstraint(SpringLayout.NORTH, lblFirstname, 28, SpringLayout.SOUTH, lblUsermail);
		springLayout.putConstraint(SpringLayout.NORTH, lblPostCode, 0, SpringLayout.NORTH, lblUsermail);
		springLayout.putConstraint(SpringLayout.WEST, lblUsermail, 132, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblUsermail, -204, SpringLayout.SOUTH, lblPassword);
		springLayout.putConstraint(SpringLayout.EAST, lblUsermail, 0, SpringLayout.EAST, lblFirstname);
		add(lblUsermail);
		
		usermailTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblUsermail, 6, SpringLayout.NORTH, usermailTextField);
		springLayout.putConstraint(SpringLayout.SOUTH, usermailTextField, -16, SpringLayout.NORTH, firstnameTexfield);
		springLayout.putConstraint(SpringLayout.EAST, usermailTextField, 0, SpringLayout.EAST, firstnameTexfield);
		add(usermailTextField);
		usermailTextField.setColumns(10);
		
		JLabel lblAddress_1 = new JLabel("address :");
		springLayout.putConstraint(SpringLayout.SOUTH, lblAddress_1, 0, SpringLayout.SOUTH, lblLastname);
		springLayout.putConstraint(SpringLayout.EAST, lblAddress_1, 0, SpringLayout.EAST, lblPostCode);
		add(lblAddress_1);
		
		address1TextField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, address1TextField, 0, SpringLayout.NORTH, lblLastname);
		springLayout.putConstraint(SpringLayout.EAST, address1TextField, 0, SpringLayout.EAST, postcodeTexfield);
		add(address1TextField);
		address1TextField.setColumns(10);
	
		btnAddUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstname = firstnameTexfield.getText();
				String lastname = lastnameTexfield.getText();
				String usermail = usermailTextField.getText();
				String address = address2Texfield.getText();
				String address2 = address2Texfield.getText();
				String city = cityTexfield.getText();
				String telephone = telephoneTexfield.getText();
				String password = passwordTexfield.getText();
				int postcode = Integer.parseInt(postcodeTexfield.getText());
				
				registrationAdminFacade.addRegistration(usermail, firstname, lastname, address, address2, city, postcode, telephone, password);
			}
		});
	}
}
