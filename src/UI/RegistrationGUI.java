package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;


import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import javax.swing.SpringLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

import Functions.SessionFacade;

public class RegistrationGUI extends JFrame {
	private JTextField name;
	private JTextField firstName;
	private JTextField address1;
	private JTextField address2;
	private JSpinner postCode;
	private JTextField city;
	private JTextField phone;
	private JTextField mail;
	private JPasswordField password;
	private JPasswordField passwordB;
	/**
	 * @return create a Jframe for registration
	 * 
	 * */
	
	public RegistrationGUI() {

		this.setResizable(false);
		this.setTitle("ZEN LOUNGE REGISTRATION");
		this.setBounds(100, 100, 350, 400);
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
		springLayout.putConstraint(SpringLayout.NORTH, lblAdress, 237, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblAdress, 11, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblAdress);
		
		JLabel lblPostCode = new JLabel("Post code :");
		springLayout.putConstraint(SpringLayout.NORTH, lblPostCode, 262, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblPostCode, 11, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblPostCode);
		
		JLabel lblCity = new JLabel("City :");
		springLayout.putConstraint(SpringLayout.WEST, lblCity, 10, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblCity);
		
		JLabel lblPhone = new JLabel("Phone :");
		springLayout.putConstraint(SpringLayout.NORTH, lblPhone, 313, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblCity, -10, SpringLayout.NORTH, lblPhone);
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
		springLayout.putConstraint(SpringLayout.WEST, address2, 43, SpringLayout.EAST, lblAdress);
		springLayout.putConstraint(SpringLayout.SOUTH, address2, -117, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, address1, -6, SpringLayout.NORTH, address2);
		springLayout.putConstraint(SpringLayout.EAST, address1, 0, SpringLayout.EAST, address2);
		getContentPane().add(address2);
		address2.setColumns(10);
		
		postCode = new JSpinner(new SpinnerNumberModel(0,
                0, 
                100000, 
                1));
		springLayout.putConstraint(SpringLayout.NORTH, postCode, -2, SpringLayout.NORTH, lblPostCode);
		springLayout.putConstraint(SpringLayout.WEST, postCode, 0, SpringLayout.WEST, btnSubmit);
		springLayout.putConstraint(SpringLayout.EAST, postCode, 0, SpringLayout.EAST, name);
		JFormattedTextField quantityForm = ((JSpinner.NumberEditor) postCode.getEditor()).getTextField();
		((NumberFormatter)quantityForm.getFormatter()).setAllowsInvalid(false);
		getContentPane().add(postCode);
		
		city = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, city, -2, SpringLayout.NORTH, lblCity);
		springLayout.putConstraint(SpringLayout.EAST, city, 0, SpringLayout.EAST, name);
		getContentPane().add(city);
		city.setColumns(10);
		
		phone = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, phone, -2, SpringLayout.NORTH, lblPhone);
		springLayout.putConstraint(SpringLayout.EAST, phone, 0, SpringLayout.EAST, name);
		getContentPane().add(phone);
		phone.setColumns(10);
		
		JLabel lblMail = new JLabel("Mail :");
		getContentPane().add(lblMail);
		
		mail = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, mail, -2, SpringLayout.NORTH, lblMail);
		getContentPane().add(mail);
		mail.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password :");
		springLayout.putConstraint(SpringLayout.SOUTH, lblPassword, -275, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblMail, -6, SpringLayout.NORTH, lblPassword);
		springLayout.putConstraint(SpringLayout.EAST, lblMail, 0, SpringLayout.EAST, lblPassword);
		getContentPane().add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password :");
		springLayout.putConstraint(SpringLayout.NORTH, lblConfirmPassword, 6, SpringLayout.SOUTH, lblPassword);
		springLayout.putConstraint(SpringLayout.EAST, lblConfirmPassword, 0, SpringLayout.EAST, lblMail);
		getContentPane().add(lblConfirmPassword);
		
		password = new JPasswordField();
		springLayout.putConstraint(SpringLayout.WEST, password, 173, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, mail, 0, SpringLayout.EAST, password);
		springLayout.putConstraint(SpringLayout.EAST, lblPassword, -26, SpringLayout.WEST, password);
		springLayout.putConstraint(SpringLayout.NORTH, password, -2, SpringLayout.NORTH, lblPassword);
		getContentPane().add(password);
		password.setColumns(10);
		
		passwordB = new JPasswordField();
		springLayout.putConstraint(SpringLayout.NORTH, passwordB, 2, SpringLayout.SOUTH, password);
		springLayout.putConstraint(SpringLayout.WEST, passwordB, 0, SpringLayout.WEST, mail);
		getContentPane().add(passwordB);
		passwordB.setColumns(10);
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!(Arrays.equals(password.getPassword(), passwordB.getPassword()))) 
				{
					JOptionPane.showMessageDialog(new JPanel(),"passwords must be the same !");
				}
				else
				{
					if(SessionFacade.getSessionFacade().registration(name.getText(),
							mail.getText(),
							password.getText(), 
							firstName.getText(), 
							address1.getText(), address2.getText(), 
							(int)postCode.getValue(), city.getText(),
							phone.getText(), false, false))
					{
						JOptionPane.showMessageDialog(new JPanel(),"registration completed !");
						dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(new JPanel(),"email address already used !");
					}
							
				}
			
				
				}
			});
	}
}
