package Presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

import BL.IUser;


public class UserLoginGUI {

	private JFrame frmLotusBleu;
	private JTextField txtUserId;
	private JPasswordField pwdPassword;
	private IUser user = new IUser();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLoginGUI window = new UserLoginGUI();
					window.frmLotusBleu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserLoginGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLotusBleu = new JFrame();
		frmLotusBleu.setResizable(false);
		frmLotusBleu.setTitle("ZEN LOUNGE");
		frmLotusBleu.setBounds(100, 100, 350, 282);
		frmLotusBleu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLotusBleu.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Welcome to Zen Lounge");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblLogin.setBounds(6, 25, 338, 29);
		frmLotusBleu.getContentPane().add(lblLogin);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userId = txtUserId.getText();
				String password = pwdPassword.getText();
				if(user.checkCredentials(userId,password)){
					//display user interface
				}
				else {
					JLabel errorMsg = new JLabel("UserID or password incorrect!");
					errorMsg.setVisible(true);
					errorMsg.setHorizontalAlignment(SwingConstants.CENTER);
					errorMsg.setForeground(Color.RED);
					errorMsg.setBounds(6, 55, 338, 16);
					frmLotusBleu.getContentPane().add(errorMsg);
				}
					;
			}
		});
		btnLogin.setBounds(128, 169, 117, 29);
		frmLotusBleu.getContentPane().add(btnLogin);
		
		txtUserId = new JTextField();
		txtUserId.setText("UserID");
		txtUserId.setToolTipText("\n");
		txtUserId.setBounds(122, 77, 134, 28);
		frmLotusBleu.getContentPane().add(txtUserId);
		txtUserId.setColumns(10);
		
		JLabel lblUserid = new JLabel("UserID :");
		lblUserid.setBounds(49, 83, 61, 16);
		frmLotusBleu.getContentPane().add(lblUserid);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setBounds(49, 123, 78, 16);
		frmLotusBleu.getContentPane().add(lblPassword);
		
		JLabel lblUser = new JLabel("Forget password?");
		lblUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser.setForeground(Color.BLUE);
		lblUser.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblUser.setBounds(6, 210, 338, 16);
		frmLotusBleu.getContentPane().add(lblUser);
		
		JLabel lblSignIn = new JLabel("Sign in");
		lblSignIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignIn.setForeground(Color.BLUE);
		lblSignIn.setBounds(0, 238, 344, 16);
		frmLotusBleu.getContentPane().add(lblSignIn);
		
		JCheckBox chckbxRemember = new JCheckBox("Remember me");
		chckbxRemember.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRemember.setBounds(6, 145, 338, 23);
		frmLotusBleu.getContentPane().add(chckbxRemember);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setText("Password");
		pwdPassword.setBounds(121, 117, 134, 28);
		frmLotusBleu.getContentPane().add(pwdPassword);
		
		
	}
}