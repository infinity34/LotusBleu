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
	private JTextField addressTexfield;
	private JTextField usermailTextField;
	

	public RegistrationAdminAdd( RegistrationAdminFacade registrationAdminFacade) {

		this.registrationAdminFacade = registrationAdminFacade;
		this.setSize(640, 480);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblFirstname = new JLabel("Firstname :");
		springLayout.putConstraint(SpringLayout.WEST, lblFirstname, 124, SpringLayout.WEST, this);
		this.add(lblFirstname);
		
		JLabel lblPostCode = new JLabel("Post code :");
		springLayout.putConstraint(SpringLayout.NORTH, lblPostCode, 0, SpringLayout.NORTH, lblFirstname);
		springLayout.putConstraint(SpringLayout.WEST, lblPostCode, 170, SpringLayout.EAST, lblFirstname);
		this.add(lblPostCode);
		
		JLabel lblLastname = new JLabel("LastName :");
		springLayout.putConstraint(SpringLayout.NORTH, lblLastname, 145, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblLastname, 125, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblFirstname, -35, SpringLayout.NORTH, lblLastname);
		this.add(lblLastname);
		
		JLabel lblCity = new JLabel("City :");
		springLayout.putConstraint(SpringLayout.NORTH, lblCity, 0, SpringLayout.NORTH, lblLastname);
		springLayout.putConstraint(SpringLayout.EAST, lblCity, 0, SpringLayout.EAST, lblPostCode);
		this.add(lblCity);
		
		JLabel lblTelephone = new JLabel("Telephone :");
		springLayout.putConstraint(SpringLayout.SOUTH, lblTelephone, -263, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblTelephone, 0, SpringLayout.EAST, lblFirstname);
		this.add(lblTelephone);
		
		JLabel lblAddress = new JLabel("Address :");
		springLayout.putConstraint(SpringLayout.NORTH, lblAddress, 201, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblAddress, 0, SpringLayout.EAST, lblPostCode);
		this.add(lblAddress);
		
		JLabel lblPassword = new JLabel("Password :");
		springLayout.putConstraint(SpringLayout.EAST, lblPassword, 0, SpringLayout.EAST, lblFirstname);
		this.add(lblPassword);
		
		JLabel lblRigth = new JLabel("Rigth:");
		springLayout.putConstraint(SpringLayout.NORTH, lblPassword, 0, SpringLayout.NORTH, lblRigth);
		springLayout.putConstraint(SpringLayout.NORTH, lblRigth, 254, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblRigth, 0, SpringLayout.EAST, lblPostCode);
		this.add(lblRigth);
		
		JLabel lblContributionPrice = new JLabel("Contribution price :");
		springLayout.putConstraint(SpringLayout.EAST, lblContributionPrice, 0, SpringLayout.EAST, lblFirstname);
		this.add(lblContributionPrice);
		
		firstnameTexfield = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, firstnameTexfield, -6, SpringLayout.NORTH, lblFirstname);
		springLayout.putConstraint(SpringLayout.WEST, firstnameTexfield, 9, SpringLayout.EAST, lblFirstname);
		add(firstnameTexfield);
		firstnameTexfield.setColumns(10);
		
		lastnameTexfield = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lastnameTexfield, -6, SpringLayout.NORTH, lblLastname);
		springLayout.putConstraint(SpringLayout.WEST, lastnameTexfield, 0, SpringLayout.WEST, firstnameTexfield);
		add(lastnameTexfield);
		lastnameTexfield.setColumns(10);
		
		telephoneTexfield = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, telephoneTexfield, -6, SpringLayout.NORTH, lblTelephone);
		springLayout.putConstraint(SpringLayout.WEST, telephoneTexfield, 6, SpringLayout.EAST, lblTelephone);
		add(telephoneTexfield);
		telephoneTexfield.setColumns(10);
		
		passwordTexfield = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, passwordTexfield, -6, SpringLayout.NORTH, lblPassword);
		springLayout.putConstraint(SpringLayout.EAST, passwordTexfield, 0, SpringLayout.EAST, firstnameTexfield);
		add(passwordTexfield);
		passwordTexfield.setColumns(10);
		
		postcodeTexfield = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, postcodeTexfield, 0, SpringLayout.NORTH, lblFirstname);
		springLayout.putConstraint(SpringLayout.WEST, postcodeTexfield, 17, SpringLayout.EAST, lblPostCode);
		add(postcodeTexfield);
		postcodeTexfield.setColumns(10);
		
		cityTexfield = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, cityTexfield, 0, SpringLayout.SOUTH, lastnameTexfield);
		springLayout.putConstraint(SpringLayout.EAST, cityTexfield, 0, SpringLayout.EAST, postcodeTexfield);
		add(cityTexfield);
		cityTexfield.setColumns(10);
		
		addressTexfield = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, addressTexfield, -6, SpringLayout.NORTH, lblTelephone);
		springLayout.putConstraint(SpringLayout.WEST, addressTexfield, 0, SpringLayout.WEST, postcodeTexfield);
		add(addressTexfield);
		addressTexfield.setColumns(10);
		
		JLabel label = new JLabel("");
		springLayout.putConstraint(SpringLayout.WEST, label, 226, SpringLayout.WEST, this);
		add(label);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Administrator");
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton, 27, SpringLayout.SOUTH, addressTexfield);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton, 0, SpringLayout.WEST, postcodeTexfield);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnInCharge = new JRadioButton("In Charge");
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnInCharge, 21, SpringLayout.SOUTH, rdbtnNewRadioButton);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnInCharge, 0, SpringLayout.WEST, postcodeTexfield);
		add(rdbtnInCharge);
		
		JButton btnAddUser = new JButton("Add User");
		springLayout.putConstraint(SpringLayout.SOUTH, btnAddUser, -32, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnAddUser, 0, SpringLayout.EAST, lblPostCode);
		add(btnAddUser);
		
		JLabel lblUsermail = new JLabel("Usermail :");
		springLayout.putConstraint(SpringLayout.NORTH, lblContributionPrice, 24, SpringLayout.SOUTH, lblUsermail);
		springLayout.putConstraint(SpringLayout.SOUTH, lblUsermail, 0, SpringLayout.SOUTH, rdbtnInCharge);
		springLayout.putConstraint(SpringLayout.EAST, lblUsermail, 0, SpringLayout.EAST, lblFirstname);
		add(lblUsermail);
		
		usermailTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, label, 15, SpringLayout.SOUTH, usermailTextField);
		springLayout.putConstraint(SpringLayout.NORTH, usermailTextField, -2, SpringLayout.NORTH, rdbtnInCharge);
		springLayout.putConstraint(SpringLayout.WEST, usermailTextField, 0, SpringLayout.WEST, firstnameTexfield);
		add(usermailTextField);
		usermailTextField.setColumns(10);
	
		btnAddUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstname = firstnameTexfield.getText();
				String lastname = lastnameTexfield.getText();
				String usermail = usermailTextField.getText();
				String address = addressTexfield.getText();
				String city = cityTexfield.getText();
				String telephone = telephoneTexfield.getText();
				String password = passwordTexfield.getText();
				int postcode = Integer.parseInt(postcodeTexfield.getText());
				
				registrationAdminFacade.addRegistration(usermail, firstname, lastname, address, city, postcode, telephone, password);
			}
		});
	}
}
