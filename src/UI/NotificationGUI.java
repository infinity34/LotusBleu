package UI;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Data.Notification;
import Functions.NotificationFacade;
import Functions.SessionFacade;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListModel;

@SuppressWarnings("serial")
public class NotificationGUI extends JPanel implements ListSelectionListener {

	private NotificationFacade notificationFacade;
	private Notification selectedNotification;
	private JTextPane txtpnZoneDeNotification;
	private JList<Notification> list;
	JButton btnMarkAsUnread;
	JList<Notification> list_read;
	JTextPane txtpnDate;
	JTextPane txtpnState;

	/**
	 * Create the panel.
	 */
	public NotificationGUI() {
		setNotificationFacade(new NotificationFacade());
		this.setSize(640, 480);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

		list = new JList<Notification>(
				notificationFacade.getNotificationsListModel(SessionFacade
						.getSessionFacade().GetCurrentUser(), false));
		springLayout.putConstraint(SpringLayout.NORTH, list, 10,
				SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, list, 10,
				SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, list, 235,
				SpringLayout.NORTH, this);
		list.addListSelectionListener(this);
		add(list);

		txtpnZoneDeNotification = new JTextPane();
		txtpnZoneDeNotification.setEditable(false);
		springLayout.putConstraint(SpringLayout.WEST, txtpnZoneDeNotification,
				227, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, txtpnZoneDeNotification,
				-10, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.EAST, list, -6,
				SpringLayout.WEST, txtpnZoneDeNotification);
		springLayout.putConstraint(SpringLayout.NORTH, txtpnZoneDeNotification,
				58, SpringLayout.NORTH, this);
		txtpnZoneDeNotification.setText("Zone de notification");
		springLayout.putConstraint(SpringLayout.SOUTH, txtpnZoneDeNotification,
				400, SpringLayout.NORTH, this);
		add(txtpnZoneDeNotification);

		JButton btnSupprimer = new JButton("Delete");
		springLayout.putConstraint(SpringLayout.NORTH, btnSupprimer, 6,
				SpringLayout.SOUTH, txtpnZoneDeNotification);
		springLayout.putConstraint(SpringLayout.WEST, btnSupprimer, 0,
				SpringLayout.WEST, txtpnZoneDeNotification);
		springLayout.putConstraint(SpringLayout.SOUTH, btnSupprimer, -10,
				SpringLayout.SOUTH, this);
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				notificationFacade.remove(selectedNotification);
			}
		});
		add(btnSupprimer);

		btnMarkAsUnread = new JButton("Mark as unread");
		springLayout.putConstraint(SpringLayout.EAST, btnSupprimer, -6,
				SpringLayout.WEST, btnMarkAsUnread);
		btnMarkAsUnread.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				notificationFacade.markAsUnread(list_read.getSelectedValue());
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnMarkAsUnread, 429,
				SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.NORTH, btnMarkAsUnread, 6,
				SpringLayout.SOUTH, txtpnZoneDeNotification);
		springLayout.putConstraint(SpringLayout.SOUTH, btnMarkAsUnread, -10,
				SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnMarkAsUnread, -10,
				SpringLayout.EAST, this);
		add(btnMarkAsUnread);

		txtpnDate = new JTextPane();
		springLayout.putConstraint(SpringLayout.NORTH, txtpnDate, 10,
				SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, txtpnDate, 6,
				SpringLayout.EAST, list);
		springLayout.putConstraint(SpringLayout.SOUTH, txtpnDate, -6,
				SpringLayout.NORTH, txtpnZoneDeNotification);
		springLayout.putConstraint(SpringLayout.EAST, txtpnDate, 0, SpringLayout.EAST, txtpnZoneDeNotification);
		txtpnDate.setText("Date");
		add(txtpnDate);

		list_read = new JList<Notification>(
				notificationFacade.getNotificationsListModel(SessionFacade
						.getSessionFacade().GetCurrentUser(), true));
		list_read.addListSelectionListener(this);
		springLayout.putConstraint(SpringLayout.NORTH, list_read, 6,
				SpringLayout.SOUTH, list);
		springLayout.putConstraint(SpringLayout.WEST, list_read, 10,
				SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, list_read, -10,
				SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, list_read, 0,
				SpringLayout.EAST, list);
		add(list_read);

	}

	/**
	 * @return the notificationFacade
	 */
	public NotificationFacade getNotificationFacade() {
		return notificationFacade;
	}

	/**
	 * @param notificationFacade
	 *            the notificationFacade to set
	 */
	public void setNotificationFacade(NotificationFacade notificationFacade) {
		this.notificationFacade = notificationFacade;
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		if (e.getSource() == list) {
			this.txtpnZoneDeNotification.setText(list.getSelectedValue()
					.getMessage());
			this.btnMarkAsUnread.setEnabled(false);
			this.notificationFacade.markAsRead(list.getSelectedValue());
			//this.txtpnDate.setText(list.getSelectedValue().getDate().toString());
		} else {
			this.txtpnZoneDeNotification.setText(this.list_read
					.getSelectedValue().getMessage());
			this.btnMarkAsUnread.setText("Mark as unread");
			this.btnMarkAsUnread.setEnabled(true);
			//this.txtpnDate.setText(list_read.getSelectedValue().getDate().toString());
			this.revalidate();
			this.repaint();
		}
	}
}
