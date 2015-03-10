package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;

public class RegistrationGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationGUI window = new RegistrationGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegistrationGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel field = new JPanel();
		frame.getContentPane().add(field, "name_6601029046566");
		field.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblFirstname = new JLabel("Firstname :");
		field.add(lblFirstname);
		
		JLabel lblPostCode = new JLabel("Post code :");
		field.add(lblPostCode);
		
		JLabel lblLastname = new JLabel("LastName :");
		field.add(lblLastname);
		
		JLabel lblCity = new JLabel("City :");
		field.add(lblCity);
		
		JLabel lblTelephone = new JLabel("Telephone :");
		field.add(lblTelephone);
		
		JLabel lblAddress = new JLabel("Address 1 :");
		field.add(lblAddress);
		
		JLabel lblNewLabel = new JLabel("Password :");
		field.add(lblNewLabel);
		
		JLabel lblRigth = new JLabel("Rigth:");
		field.add(lblRigth);
		
		JLabel lblContributionPrice = new JLabel("Contribution price :");
		field.add(lblContributionPrice);
		
		JPanel button = new JPanel();
		frame.getContentPane().add(button, "name_6985144499586");
		button.setLayout(new GridLayout(1, 0, 0, 0));
	}

}
