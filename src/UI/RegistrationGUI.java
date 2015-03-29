package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class RegistrationGUI extends JFrame {
	private JTextField name;
	private JTextField firstName;
	private JTextField address1;
	private JTextField address2;
	private JTextField postCode;
	private JTextField city;
	private JTextField phone;
	private JTextField mail;
	
	public RegistrationGUI() {

		this.setResizable(false);
		this.setTitle("ZEN LOUNGE REGISTRATION");
		this.setBounds(100, 100, 350, 320);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel lblRegistration = new JLabel("Registration");
		springLayout.putConstraint(SpringLayout.NORTH, lblRegistration, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblRegistration, -133, SpringLayout.EAST, getContentPane());
		lblRegistration.setFont(new Font("Dialog", Font.BOLD, 20));
		getContentPane().add(lblRegistration);
		
		JLabel lblName = new JLabel("Name :");
		getContentPane().add(lblName);
		
		JLabel lblFirstname = new JLabel("Firstname :");
		springLayout.putConstraint(SpringLayout.WEST, lblName, 0, SpringLayout.WEST, lblFirstname);
		getContentPane().add(lblFirstname);
		
		JLabel lblAddress = new JLabel("Address 1 :");
		springLayout.putConstraint(SpringLayout.WEST, lblAddress, 11, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblFirstname, 0, SpringLayout.EAST, lblAddress);
		getContentPane().add(lblAddress);
		
		JLabel lblAdress = new JLabel("Address 2 :");
		springLayout.putConstraint(SpringLayout.WEST, lblAdress, 11, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblAdress);
		
		JLabel lblPostCode = new JLabel("Post code :");
		springLayout.putConstraint(SpringLayout.WEST, lblPostCode, 11, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblPostCode);
		
		JLabel lblCity = new JLabel("City :");
		springLayout.putConstraint(SpringLayout.WEST, lblCity, 10, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblCity);
		
		JLabel lblPhone = new JLabel("Phone :");
		springLayout.putConstraint(SpringLayout.WEST, lblPhone, 10, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblPhone);
		
		JButton btnSubmit = new JButton("Submit");
		springLayout.putConstraint(SpringLayout.SOUTH, btnSubmit, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnSubmit, 0, SpringLayout.EAST, lblRegistration);
		getContentPane().add(btnSubmit);
		
		name = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblFirstname, 2, SpringLayout.NORTH, name);
		getContentPane().add(name);
		name.setColumns(10);
		
		firstName = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblName, 2, SpringLayout.NORTH, firstName);
		springLayout.putConstraint(SpringLayout.WEST, firstName, 0, SpringLayout.WEST, name);
		springLayout.putConstraint(SpringLayout.SOUTH, firstName, -6, SpringLayout.NORTH, name);
		getContentPane().add(firstName);
		firstName.setColumns(10);
		
		address1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblAddress, 2, SpringLayout.NORTH, address1);
		springLayout.putConstraint(SpringLayout.SOUTH, name, -6, SpringLayout.NORTH, address1);
		springLayout.putConstraint(SpringLayout.EAST, name, 0, SpringLayout.EAST, address1);
		getContentPane().add(address1);
		address1.setColumns(10);
		
		address2 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblAdress, 2, SpringLayout.NORTH, address2);
		springLayout.putConstraint(SpringLayout.SOUTH, address1, -6, SpringLayout.NORTH, address2);
		springLayout.putConstraint(SpringLayout.EAST, address1, 0, SpringLayout.EAST, address2);
		getContentPane().add(address2);
		address2.setColumns(10);
		
		postCode = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, address2, 0, SpringLayout.WEST, postCode);
		springLayout.putConstraint(SpringLayout.SOUTH, address2, -6, SpringLayout.NORTH, postCode);
		springLayout.putConstraint(SpringLayout.NORTH, lblPostCode, 2, SpringLayout.NORTH, postCode);
		getContentPane().add(postCode);
		postCode.setColumns(10);
		
		city = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblCity, 2, SpringLayout.NORTH, city);
		springLayout.putConstraint(SpringLayout.SOUTH, postCode, -6, SpringLayout.NORTH, city);
		springLayout.putConstraint(SpringLayout.EAST, postCode, 0, SpringLayout.EAST, city);
		getContentPane().add(city);
		city.setColumns(10);
		
		phone = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblPhone, 2, SpringLayout.NORTH, phone);
		springLayout.putConstraint(SpringLayout.SOUTH, city, -6, SpringLayout.NORTH, phone);
		springLayout.putConstraint(SpringLayout.EAST, city, 0, SpringLayout.EAST, phone);
		springLayout.putConstraint(SpringLayout.WEST, phone, 116, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, phone, -6, SpringLayout.NORTH, btnSubmit);
		getContentPane().add(phone);
		phone.setColumns(10);
		
		JLabel lblMail = new JLabel("Mail :");
		springLayout.putConstraint(SpringLayout.WEST, lblMail, 0, SpringLayout.WEST, lblName);
		getContentPane().add(lblMail);
		
		mail = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblMail, 2, SpringLayout.NORTH, mail);
		springLayout.putConstraint(SpringLayout.SOUTH, mail, -6, SpringLayout.NORTH, firstName);
		springLayout.putConstraint(SpringLayout.EAST, mail, 0, SpringLayout.EAST, name);
		getContentPane().add(mail);
		mail.setColumns(10);
	}
}
