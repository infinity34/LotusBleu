package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Functions.SessionFacade;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;

public class RoomManagementGUI extends JFrame {

	private JPanel contentPane;
	private SessionFacade session;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RoomManagementGUI frame = new RoomManagementGUI();
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
	public RoomManagementGUI() {
		//session = SessionFacade.getSessionFacade();
		setTitle("Lotus Bleu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel menuPanel = new JPanel();
		contentPane.add(menuPanel, BorderLayout.NORTH);
		menuPanel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton btnHome = new JButton("Home");
		menuPanel.add(btnHome);
		
		JButton btnNotifications = new JButton("Notifications");
		menuPanel.add(btnNotifications);
		
		//JLabel lblLoggedAs = new JLabel("Logged as : "+ session.GetCurrentUser().getUsername());
		JLabel lblLoggedAs = new JLabel("Logged as : ");
		menuPanel.add(lblLoggedAs);
		
		JButton btnDisconnect = new JButton("Disconnect");
		menuPanel.add(btnDisconnect);
		
		JPanel mainPanel = new JPanel();
		contentPane.add(mainPanel, BorderLayout.CENTER);
		SpringLayout sl_mainPanel = new SpringLayout();
		mainPanel.setLayout(sl_mainPanel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sl_mainPanel.putConstraint(SpringLayout.NORTH, btnNewButton, 103, SpringLayout.NORTH, mainPanel);
		sl_mainPanel.putConstraint(SpringLayout.WEST, btnNewButton, 10, SpringLayout.WEST, mainPanel);
		mainPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		sl_mainPanel.putConstraint(SpringLayout.NORTH, btnNewButton_1, 6, SpringLayout.SOUTH, btnNewButton);
		sl_mainPanel.putConstraint(SpringLayout.WEST, btnNewButton_1, 0, SpringLayout.WEST, btnNewButton);
		mainPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		sl_mainPanel.putConstraint(SpringLayout.NORTH, btnNewButton_2, 6, SpringLayout.SOUTH, btnNewButton_1);
		sl_mainPanel.putConstraint(SpringLayout.WEST, btnNewButton_2, 0, SpringLayout.WEST, btnNewButton);
		mainPanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		sl_mainPanel.putConstraint(SpringLayout.NORTH, btnNewButton_3, 6, SpringLayout.SOUTH, btnNewButton_2);
		sl_mainPanel.putConstraint(SpringLayout.WEST, btnNewButton_3, 0, SpringLayout.WEST, btnNewButton);
		mainPanel.add(btnNewButton_3);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		contentPane.add(layeredPane_1, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 61, 436);
		layeredPane_1.add(lblNewLabel);
		sl_mainPanel.putConstraint(SpringLayout.NORTH, lblNewLabel, 40, SpringLayout.NORTH, mainPanel);
		sl_mainPanel.putConstraint(SpringLayout.WEST, lblNewLabel, 136, SpringLayout.WEST, mainPanel);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		contentPane.add(layeredPane_2, BorderLayout.WEST);
		this.setVisible(true);
	}
}
