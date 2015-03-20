package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;

import Functions.SessionFacade;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private SessionFacade session;
	private JPanel mainPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		session = SessionFacade.getSessionFacade();
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
		
		JLabel lblLoggedAs = new JLabel("Logged as : "+ session.GetCurrentUser().getUsername());
		menuPanel.add(lblLoggedAs);
		
		JButton btnDisconnect = new JButton("Disconnect");
		menuPanel.add(btnDisconnect);
		
		mainPanel = new JPanel();
		contentPane.add(mainPanel, BorderLayout.CENTER);
		this.setVisible(true);
	}
	
	public void setMainPanel(JPanel panel)
	{
		contentPane.remove(mainPanel);
		mainPanel = panel;
		contentPane.add(mainPanel, BorderLayout.CENTER);
		this.setVisible(true);
	}

}
