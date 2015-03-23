package UI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;

import Data.User;
import Functions.ProfileManagementFacade;

public class ProfileManagementGUI extends JPanel {
	public ProfileManagementGUI() {
		profileManagementFacade = new ProfileManagementFacade();
		User user = profileManagementFacade.getUser();
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

		JLabel lblFirstname = new JLabel("Firstname :");
		add(lblFirstname);

		JLabel lblName = new JLabel("Name :");
		springLayout.putConstraint(SpringLayout.NORTH, lblFirstname, 17,
				SpringLayout.SOUTH, lblName);
		springLayout.putConstraint(SpringLayout.WEST, lblFirstname, 0,
				SpringLayout.WEST, lblName);
		springLayout.putConstraint(SpringLayout.WEST, lblName, 185,
				SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblName, -410,
				SpringLayout.SOUTH, this);
		add(lblName);

		JLabel lblDateDeFin = new JLabel("Date de fin d'abonnement :");
		springLayout.putConstraint(SpringLayout.WEST, lblDateDeFin, 0,
				SpringLayout.WEST, lblFirstname);
		add(lblDateDeFin);

		JLabel lbldate = new JLabel("XX/XX/XXXX");
		/*if(user.getMemberRole().getSubscription().getEndSubscriptionDate() != null){
			lbldate.setText(user.getMemberRole().getSubscription().getEndSubscriptionDate().toString());
		}else{
			lbldate.setText("N/A");
		}*/
		springLayout.putConstraint(SpringLayout.NORTH, lbldate, 0,
				SpringLayout.NORTH, lblDateDeFin);
		springLayout.putConstraint(SpringLayout.WEST, lbldate, 6,
				SpringLayout.EAST, lblDateDeFin);
		add(lbldate);

		nameTextfield = new JTextField();
		this.nameTextfield.setText(user.getUsername());
		springLayout.putConstraint(SpringLayout.NORTH, nameTextfield, -6,
				SpringLayout.NORTH, lblName);
		springLayout.putConstraint(SpringLayout.WEST, nameTextfield, 31,
				SpringLayout.EAST, lblName);
		add(nameTextfield);
		nameTextfield.setColumns(10);

		firstnameTextfield = new JTextField();
		this.firstnameTextfield.setText(user.getUserfirstname());
		springLayout.putConstraint(SpringLayout.NORTH, lblDateDeFin, 6,
				SpringLayout.SOUTH, firstnameTextfield);
		springLayout.putConstraint(SpringLayout.NORTH, firstnameTextfield, 6,
				SpringLayout.SOUTH, nameTextfield);
		springLayout.putConstraint(SpringLayout.WEST, firstnameTextfield, 6,
				SpringLayout.EAST, lblFirstname);
		add(firstnameTextfield);
		firstnameTextfield.setColumns(10);

		JButton btnSignIn = new JButton("Sign in");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnSignIn, -5,
				SpringLayout.NORTH, lblDateDeFin);
		springLayout.putConstraint(SpringLayout.WEST, btnSignIn, 6,
				SpringLayout.EAST, lbldate);
		add(btnSignIn);

		JLabel lblAddress1 = new JLabel("Address 1 :");
		springLayout.putConstraint(SpringLayout.WEST, lblAddress1, 10,
				SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblAddress1, -224,
				SpringLayout.SOUTH, this);
		add(lblAddress1);

		JLabel lblAddress2 = new JLabel("Address 2 :");
		springLayout.putConstraint(SpringLayout.NORTH, lblAddress2, 21,
				SpringLayout.SOUTH, lblAddress1);
		springLayout.putConstraint(SpringLayout.WEST, lblAddress2, 0,
				SpringLayout.WEST, lblAddress1);
		add(lblAddress2);

		JLabel lblPostcode = new JLabel("PostCode :");
		springLayout.putConstraint(SpringLayout.WEST, lblPostcode, 0,
				SpringLayout.WEST, lblAddress1);
		add(lblPostcode);

		JLabel lblCity = new JLabel("City :");
		springLayout.putConstraint(SpringLayout.NORTH, lblCity, 345,
				SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblPostcode, -18,
				SpringLayout.NORTH, lblCity);
		springLayout.putConstraint(SpringLayout.WEST, lblCity, 0,
				SpringLayout.WEST, lblAddress1);
		add(lblCity);

		address1Textfield = new JTextField();
		if(user.getAddress1() != null){
			this.address1Textfield.setText(user.getAddress1());
		}
		springLayout.putConstraint(SpringLayout.NORTH, address1Textfield, -6,
				SpringLayout.NORTH, lblAddress1);
		springLayout.putConstraint(SpringLayout.WEST, address1Textfield, 14,
				SpringLayout.EAST, lblAddress1);
		add(address1Textfield);
		address1Textfield.setColumns(10);

		postcodeTextfield = new JTextField();
		this.postcodeTextfield.setText(Integer.toString(user.getPostcode()));
		springLayout.putConstraint(SpringLayout.WEST, postcodeTextfield, 18,
				SpringLayout.EAST, lblPostcode);
		springLayout.putConstraint(SpringLayout.EAST, postcodeTextfield, -355,
				SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.EAST, address1Textfield, 0,
				SpringLayout.EAST, postcodeTextfield);
		springLayout.putConstraint(SpringLayout.SOUTH, postcodeTextfield, -147,
				SpringLayout.SOUTH, this);
		add(postcodeTextfield);
		postcodeTextfield.setColumns(10);

		cityTextfield = new JTextField();
		if(user.getCity() != null){
			this.cityTextfield.setText(user.getCity());
		}
		springLayout.putConstraint(SpringLayout.NORTH, cityTextfield, 6,
				SpringLayout.SOUTH, postcodeTextfield);
		springLayout.putConstraint(SpringLayout.WEST, cityTextfield, 52,
				SpringLayout.EAST, lblCity);
		springLayout.putConstraint(SpringLayout.EAST, cityTextfield, -355,
				SpringLayout.EAST, this);
		add(cityTextfield);
		cityTextfield.setColumns(10);

		address2Textfield = new JTextField();
		if(user.getAddress2() != null){
			this.address2Textfield.setText(user.getAddress2());
		}
		springLayout.putConstraint(SpringLayout.NORTH, address2Textfield, 9,
				SpringLayout.SOUTH, address1Textfield);
		springLayout.putConstraint(SpringLayout.WEST, address2Textfield, 14,
				SpringLayout.EAST, lblAddress2);
		springLayout.putConstraint(SpringLayout.EAST, address2Textfield, -355,
				SpringLayout.EAST, this);
		add(address2Textfield);
		address2Textfield.setColumns(10);

		phoneTextfield = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, phoneTextfield, 6,
				SpringLayout.SOUTH, cityTextfield);
		springLayout.putConstraint(SpringLayout.WEST, phoneTextfield, 0,
				SpringLayout.WEST, address1Textfield);
		springLayout.putConstraint(SpringLayout.EAST, phoneTextfield, 0,
				SpringLayout.EAST, address1Textfield);
		phoneTextfield.setColumns(10);
		add(phoneTextfield);

		mailTextfield = new JTextField();
		if(user.getUsermail() != null){
			this.mailTextfield.setText(user.getUsermail());
		}
		mailTextfield.setEditable(false);
		mailTextfield.setEnabled(false);
		springLayout.putConstraint(SpringLayout.NORTH, mailTextfield, 6,
				SpringLayout.SOUTH, phoneTextfield);
		springLayout.putConstraint(SpringLayout.WEST, mailTextfield, 0,
				SpringLayout.WEST, address1Textfield);
		springLayout.putConstraint(SpringLayout.EAST, mailTextfield, 0,
				SpringLayout.EAST, address1Textfield);
		mailTextfield.setColumns(10);
		add(mailTextfield);

		JLabel lblPhone = new JLabel("Phone :");
		springLayout.putConstraint(SpringLayout.NORTH, lblPhone, 6,
				SpringLayout.NORTH, phoneTextfield);
		springLayout.putConstraint(SpringLayout.WEST, lblPhone, 0,
				SpringLayout.WEST, lblAddress1);
		add(lblPhone);

		JLabel lblMail = new JLabel("Mail : ");
		springLayout.putConstraint(SpringLayout.NORTH, lblMail, 6,
				SpringLayout.NORTH, mailTextfield);
		springLayout.putConstraint(SpringLayout.WEST, lblMail, 0,
				SpringLayout.WEST, lblAddress1);
		add(lblMail);

		Component verticalStrut = Box.createVerticalStrut(20);
		springLayout.putConstraint(SpringLayout.NORTH, verticalStrut, 0,
				SpringLayout.NORTH, address1Textfield);
		springLayout.putConstraint(SpringLayout.WEST, verticalStrut, 35,
				SpringLayout.EAST, address1Textfield);
		springLayout.putConstraint(SpringLayout.SOUTH, verticalStrut, 0,
				SpringLayout.SOUTH, mailTextfield);
		add(verticalStrut);

		JButton btnSaveChanges = new JButton("Save Changes");
		springLayout.putConstraint(SpringLayout.NORTH, btnSaveChanges, -5,
				SpringLayout.NORTH, lblAddress1);
		springLayout.putConstraint(SpringLayout.WEST, btnSaveChanges, 25,
				SpringLayout.EAST, verticalStrut);
		springLayout.putConstraint(SpringLayout.EAST, btnSaveChanges, -25,
				SpringLayout.EAST, this);
		add(btnSaveChanges);

		btnSaveChanges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int option = JOptionPane.showConfirmDialog(null,
						"Voulez-vous arrêter l'animation ?",
						"Arrêt de l'animation",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				
				if(option == JOptionPane.YES_OPTION){
				profileManagementFacade.sessionManager.GetCurrentUser()
						.setAddress1(address1Textfield.getText());
				profileManagementFacade.sessionManager.GetCurrentUser()
						.setAddress1(address2Textfield.getText());
				profileManagementFacade.sessionManager.GetCurrentUser()
						.setAddress1(nameTextfield.getText());
				profileManagementFacade.sessionManager.GetCurrentUser()
						.setAddress1(firstnameTextfield.getText());
				profileManagementFacade.sessionManager.GetCurrentUser()
						.setAddress1(phoneTextfield.getText());
				profileManagementFacade.sessionManager.GetCurrentUser()
						.setAddress1(cityTextfield.getText());
				profileManagementFacade.sessionManager.GetCurrentUser()
						.setAddress1(postcodeTextfield.getText());

				profileManagementFacade.updateUser();
				
				JOptionPane.showMessageDialog(null, "Votre profil a été mis à jour", "Profil mis à jour", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		
		JButton btnChangePassword = new JButton("Change Password");
		springLayout.putConstraint(SpringLayout.NORTH, btnChangePassword, 8,
				SpringLayout.SOUTH, btnSaveChanges);
		springLayout.putConstraint(SpringLayout.WEST, btnChangePassword, 0,
				SpringLayout.WEST, btnSaveChanges);
		springLayout.putConstraint(SpringLayout.EAST, btnChangePassword, 0,
				SpringLayout.EAST, btnSaveChanges);
		add(btnChangePassword);
		
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = JOptionPane.showInputDialog(null, "Veuillez saisir le nouveau mot de passe !", "Nouveau mot de passe", JOptionPane.QUESTION_MESSAGE);
				if(password != null){
				profileManagementFacade.changePassword(password);
				JOptionPane.showMessageDialog(null, "Votre mot de passe a été mis à jour", "Mot de passe mis à jour", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		JButton btnMyEvents = new JButton("My Events");
		springLayout.putConstraint(SpringLayout.NORTH, btnMyEvents, -5,
				SpringLayout.NORTH, lblPostcode);
		springLayout.putConstraint(SpringLayout.WEST, btnMyEvents, 0,
				SpringLayout.WEST, btnSaveChanges);
		springLayout.putConstraint(SpringLayout.EAST, btnMyEvents, 0,
				SpringLayout.EAST, btnSaveChanges);
		add(btnMyEvents);
	}

	public Functions.ProfileManagementFacade profileManagementFacade;
	private JTextField nameTextfield;
	private JTextField firstnameTextfield;
	private JTextField address1Textfield;
	private JTextField postcodeTextfield;
	private JTextField cityTextfield;
	private JTextField address2Textfield;
	private JTextField phoneTextfield;
	private JTextField mailTextfield;
}
