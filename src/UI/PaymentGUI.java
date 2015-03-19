package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JTable;

public class PaymentGUI extends JFrame {

	private JPanel contentPane;
	private JTextField cb;
	private JTextField txtEnterTheCryptogram;
	private JTextField txtEnterTheValidity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentGUI frame = new PaymentGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PaymentGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		JLabel lblCardNumber = new JLabel("Card Number : ");
		panel_1.add(lblCardNumber);
		lblCardNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		JLabel lblCryptogram = new JLabel("Cryptogram : ");
		panel_2.add(lblCryptogram);
		lblCryptogram.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		
		JLabel lblValidityDate = new JLabel("Validity date : ");
		panel_3.add(lblValidityDate);
		lblValidityDate.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.EAST);
		panel_4.setLayout(new GridLayout(3, 2, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5);
		
		cb = new JTextField();
		panel_5.add(cb);
		cb.setText("Enter the credit card number");
		cb.setColumns(16);
		
		JPanel panel_7 = new JPanel();
		panel_4.add(panel_7);
		
		txtEnterTheCryptogram = new JTextField();
		txtEnterTheCryptogram.setHorizontalAlignment(SwingConstants.LEFT);
		panel_7.add(txtEnterTheCryptogram);
		txtEnterTheCryptogram.setText("Cryptogram");
		txtEnterTheCryptogram.setColumns(3);
		
		JPanel panel_6 = new JPanel();
		panel_4.add(panel_6);
		
		txtEnterTheValidity = new JTextField();
		txtEnterTheValidity.setHorizontalAlignment(SwingConstants.LEFT);
		panel_6.add(txtEnterTheValidity);
		txtEnterTheValidity.setText("Enter the validity Date");
		txtEnterTheValidity.setColumns(10);
	}

}
