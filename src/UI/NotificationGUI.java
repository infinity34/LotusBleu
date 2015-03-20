package UI;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;
import javax.swing.BoxLayout;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JButton;

import Data.Notification;
import Functions.NotificationFacade;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NotificationGUI extends JPanel {

	private NotificationFacade notificationFacade;
	private Notification selectedNotification;
	/**
	 * Create the panel.
	 */
	public NotificationGUI() {
		setNotificationFacade(new NotificationFacade());
		this.setSize(640, 480);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JList list = new JList();
		springLayout.putConstraint(SpringLayout.NORTH, list, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, list, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, list, 470, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, list, 221, SpringLayout.WEST, this);
		add(list);
		
		JTextPane txtpnZoneDeNotification = new JTextPane();
		txtpnZoneDeNotification.setEditable(false);
		txtpnZoneDeNotification.setText("Zone de notification");
		springLayout.putConstraint(SpringLayout.NORTH, txtpnZoneDeNotification, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, txtpnZoneDeNotification, 6, SpringLayout.EAST, list);
		springLayout.putConstraint(SpringLayout.SOUTH, txtpnZoneDeNotification, 400, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, txtpnZoneDeNotification, 409, SpringLayout.EAST, list);
		add(txtpnZoneDeNotification);
		
		JButton btnSupprimer = new JButton("Delete");
		springLayout.putConstraint(SpringLayout.NORTH, btnSupprimer, 6, SpringLayout.SOUTH, txtpnZoneDeNotification);
		springLayout.putConstraint(SpringLayout.WEST, btnSupprimer, 6, SpringLayout.EAST, list);
		springLayout.putConstraint(SpringLayout.SOUTH, btnSupprimer, 70, SpringLayout.SOUTH, txtpnZoneDeNotification);
		springLayout.putConstraint(SpringLayout.EAST, btnSupprimer, 202, SpringLayout.EAST, list);
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//notificationFacade.remove(notification);
			}
		});
		add(btnSupprimer);
		
		JButton btnMarkAsUnread = new JButton("Mark as unread");
		springLayout.putConstraint(SpringLayout.NORTH, btnMarkAsUnread, 6, SpringLayout.SOUTH, txtpnZoneDeNotification);
		springLayout.putConstraint(SpringLayout.WEST, btnMarkAsUnread, 6, SpringLayout.EAST, btnSupprimer);
		springLayout.putConstraint(SpringLayout.SOUTH, btnMarkAsUnread, 0, SpringLayout.SOUTH, list);
		springLayout.putConstraint(SpringLayout.EAST, btnMarkAsUnread, 0, SpringLayout.EAST, txtpnZoneDeNotification);
		add(btnMarkAsUnread);

	}
	
	/**
	 * @return the notificationFacade
	 */
	public NotificationFacade getNotificationFacade() {
		return notificationFacade;
	}
	/**
	 * @param notificationFacade the notificationFacade to set
	 */
	public void setNotificationFacade(NotificationFacade notificationFacade) {
		this.notificationFacade = notificationFacade;
	}
}
