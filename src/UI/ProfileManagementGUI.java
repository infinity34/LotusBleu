
package UI;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JFormattedTextField;
import javax.swing.SpringLayout;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import java.awt.Component;
import javax.swing.Box;

/**
 * 
 * 
 * @poseidon-object-id [Im21c582b6m14bfa1dcb70mm7834]
 */
public class ProfileManagementGUI extends JPanel {
	public ProfileManagementGUI() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblFirstname = new JLabel("Firstname :");
		add(lblFirstname);
		
		JLabel lblName = new JLabel("Name :");
		springLayout.putConstraint(SpringLayout.NORTH, lblFirstname, 17, SpringLayout.SOUTH, lblName);
		springLayout.putConstraint(SpringLayout.WEST, lblFirstname, 0, SpringLayout.WEST, lblName);
		springLayout.putConstraint(SpringLayout.WEST, lblName, 185, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblName, -410, SpringLayout.SOUTH, this);
		add(lblName);
		
		JLabel lblDateDeFin = new JLabel("Date de fin d'abonnement :");
		springLayout.putConstraint(SpringLayout.WEST, lblDateDeFin, 0, SpringLayout.WEST, lblFirstname);
		add(lblDateDeFin);
		
		JLabel lbldate = new JLabel("XX/XX/XXXX");
		springLayout.putConstraint(SpringLayout.NORTH, lbldate, 0, SpringLayout.NORTH, lblDateDeFin);
		springLayout.putConstraint(SpringLayout.WEST, lbldate, 6, SpringLayout.EAST, lblDateDeFin);
		add(lbldate);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField, -6, SpringLayout.NORTH, lblName);
		springLayout.putConstraint(SpringLayout.WEST, textField, 31, SpringLayout.EAST, lblName);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblDateDeFin, 6, SpringLayout.SOUTH, textField_1);
		springLayout.putConstraint(SpringLayout.NORTH, textField_1, 6, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.WEST, textField_1, 6, SpringLayout.EAST, lblFirstname);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSignIn = new JButton("Sign in");
		springLayout.putConstraint(SpringLayout.NORTH, btnSignIn, -5, SpringLayout.NORTH, lblDateDeFin);
		springLayout.putConstraint(SpringLayout.WEST, btnSignIn, 6, SpringLayout.EAST, lbldate);
		add(btnSignIn);
		
		JLabel lblNewLabel = new JLabel("Address 1 :");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -224, SpringLayout.SOUTH, this);
		add(lblNewLabel);
		
		JLabel lblAddress = new JLabel("Address 2 :");
		springLayout.putConstraint(SpringLayout.NORTH, lblAddress, 21, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, lblAddress, 0, SpringLayout.WEST, lblNewLabel);
		add(lblAddress);
		
		JLabel lblPostcode = new JLabel("PostCode :");
		springLayout.putConstraint(SpringLayout.WEST, lblPostcode, 0, SpringLayout.WEST, lblNewLabel);
		add(lblPostcode);
		
		JLabel lblNewLabel_1 = new JLabel("City :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 345, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblPostcode, -18, SpringLayout.NORTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel);
		add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_2, -6, SpringLayout.NORTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, textField_2, 14, SpringLayout.EAST, lblNewLabel);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textField_4, 18, SpringLayout.EAST, lblPostcode);
		springLayout.putConstraint(SpringLayout.EAST, textField_4, -355, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, textField_4);
		springLayout.putConstraint(SpringLayout.SOUTH, textField_4, -147, SpringLayout.SOUTH, this);
		add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_5, 6, SpringLayout.SOUTH, textField_4);
		springLayout.putConstraint(SpringLayout.WEST, textField_5, 52, SpringLayout.EAST, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.EAST, textField_5, -355, SpringLayout.EAST, this);
		add(textField_5);
		textField_5.setColumns(10);
		
		textField_3 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_3, 9, SpringLayout.SOUTH, textField_2);
		springLayout.putConstraint(SpringLayout.WEST, textField_3, 14, SpringLayout.EAST, lblAddress);
		springLayout.putConstraint(SpringLayout.EAST, textField_3, -355, SpringLayout.EAST, this);
		add(textField_3);
		textField_3.setColumns(10);
		
		textField_6 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_6, 6, SpringLayout.SOUTH, textField_5);
		springLayout.putConstraint(SpringLayout.WEST, textField_6, 0, SpringLayout.WEST, textField_2);
		springLayout.putConstraint(SpringLayout.EAST, textField_6, 0, SpringLayout.EAST, textField_2);
		textField_6.setColumns(10);
		add(textField_6);
		
		textField_7 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_7, 6, SpringLayout.SOUTH, textField_6);
		springLayout.putConstraint(SpringLayout.WEST, textField_7, 0, SpringLayout.WEST, textField_2);
		springLayout.putConstraint(SpringLayout.EAST, textField_7, 0, SpringLayout.EAST, textField_2);
		textField_7.setColumns(10);
		add(textField_7);
		
		JLabel lblNewLabel_2 = new JLabel("Phone :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 6, SpringLayout.NORTH, textField_6);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mail : ");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 6, SpringLayout.NORTH, textField_7);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, lblNewLabel);
		add(lblNewLabel_3);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		springLayout.putConstraint(SpringLayout.NORTH, verticalStrut, 0, SpringLayout.NORTH, textField_2);
		springLayout.putConstraint(SpringLayout.WEST, verticalStrut, 35, SpringLayout.EAST, textField_2);
		springLayout.putConstraint(SpringLayout.SOUTH, verticalStrut, 0, SpringLayout.SOUTH, textField_7);
		add(verticalStrut);
		
		JButton btnSaveChanges = new JButton("Save Changes");
		springLayout.putConstraint(SpringLayout.NORTH, btnSaveChanges, -5, SpringLayout.NORTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, btnSaveChanges, 25, SpringLayout.EAST, verticalStrut);
		springLayout.putConstraint(SpringLayout.EAST, btnSaveChanges, -25, SpringLayout.EAST, this);
		add(btnSaveChanges);
		
		JButton btnChangePassword = new JButton("Change Password");
		springLayout.putConstraint(SpringLayout.NORTH, btnChangePassword, 8, SpringLayout.SOUTH, btnSaveChanges);
		springLayout.putConstraint(SpringLayout.WEST, btnChangePassword, 0, SpringLayout.WEST, btnSaveChanges);
		springLayout.putConstraint(SpringLayout.EAST, btnChangePassword, 0, SpringLayout.EAST, btnSaveChanges);
		add(btnChangePassword);
		
		JButton btnMyEvents = new JButton("My Events");
		springLayout.putConstraint(SpringLayout.NORTH, btnMyEvents, -5, SpringLayout.NORTH, lblPostcode);
		springLayout.putConstraint(SpringLayout.WEST, btnMyEvents, 0, SpringLayout.WEST, btnSaveChanges);
		springLayout.putConstraint(SpringLayout.EAST, btnMyEvents, 0, SpringLayout.EAST, btnSaveChanges);
		add(btnMyEvents);
	}
/**
 * 
 * 
 * @poseidon-object-id [I89643acm14bfa232d8dmm77ce]
 */
    public Functions.ProfileManagementFacade profileManagementFacade;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_4;
private JTextField textField_5;
private JTextField textField_3;
private JTextField textField_6;
private JTextField textField_7;
 }
