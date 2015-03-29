package UI;

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
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

import Data.Basket;
import Functions.SessionFacade;


public class LoginGUI {

	private JFrame frmLotusBleu;
	private JTextField txtUserid;
	private JPasswordField pwdPassword;
	private SessionFacade facade;
	static Basket basket;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI window = new LoginGUI();
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
	public LoginGUI() {
		facade = SessionFacade.getSessionFacade();
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
		btnLogin.setBounds(128, 169, 117, 29);
		frmLotusBleu.getContentPane().add(btnLogin);
		
		txtUserid = new JTextField();
		txtUserid.setText("UserID");
		txtUserid.setToolTipText("\n");
		txtUserid.setBounds(122, 77, 134, 28);
		frmLotusBleu.getContentPane().add(txtUserid);
		txtUserid.setColumns(10);
		
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
		lblUser.setBounds(6, 198, 338, 16);
		frmLotusBleu.getContentPane().add(lblUser);
		
		JCheckBox chckbxRemember = new JCheckBox("Remember me");
		chckbxRemember.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRemember.setBounds(6, 145, 338, 23);
		frmLotusBleu.getContentPane().add(chckbxRemember);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setText("Password");
		pwdPassword.setBounds(121, 117, 134, 28);
		frmLotusBleu.getContentPane().add(pwdPassword);
		
		JButton btnSignIn = new JButton("Sign in");
		btnSignIn.setBounds(128, 216, 117, 25);
		frmLotusBleu.getContentPane().add(btnSignIn);
		
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userId = txtUserid.getText();
				String password = pwdPassword.getText();
								
				if(facade.Login(userId,password)){
					// lance l'interface principale
					MainFrame.getMainFrame().setMainPanel(new HomePanel());;
					getFrmLotusBleu().dispose();
					Basket basket = new Basket(facade.GetCurrentUser());
				}
				else {
					JOptionPane.showMessageDialog(null, "wrong login/password ");
				}
			}
		});
		
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationGUI registr = new RegistrationGUI();
				registr.setVisible(true);
			}
		});
	}

	/**
	 * @return the frmLotusBleu
	 */
	public JFrame getFrmLotusBleu() {
		return frmLotusBleu;
	}
}
