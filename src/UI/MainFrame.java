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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private SessionFacade session;
	private JPanel mainPanel;
	private static MainFrame mainFrame;

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
	private MainFrame() {
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
		btnNotifications.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new NotificationGUI());
			}
		});
		menuPanel.add(btnNotifications);
		
		JButton lblLoggedAs = new JButton("Logged as : "+ session.GetCurrentUser().getUsername());
		lblLoggedAs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ProfileManagementGUI());
			}
		});
		menuPanel.add(lblLoggedAs);
		
		JButton btnDisconnect = new JButton("Disconnect");
		btnDisconnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				session.Logout();
				getMainFrame().setVisible(false);
				LoginGUI window = new LoginGUI();
				window.getFrmLotusBleu().setVisible(true);
				window.getFrmLotusBleu().requestFocus();
			}
		});
		menuPanel.add(btnDisconnect);
		
		mainPanel = new JPanel();
		contentPane.add(mainPanel, BorderLayout.CENTER);
		this.setVisible(true);
	}
	
	public static MainFrame getMainFrame()
	{
		if (mainFrame == null)
		{
			mainFrame = new MainFrame();
		}
		mainFrame.setVisible(true);
		return mainFrame;
	}
	
	/**
	 * @return the session
	 */
	public SessionFacade getSession() {
		return session;
	}

	public void setMainPanel(JPanel panel)
	{
		contentPane.remove(mainPanel);
		mainPanel = panel;
		contentPane.add(mainPanel, BorderLayout.CENTER);
		this.setVisible(true);
	}

}
