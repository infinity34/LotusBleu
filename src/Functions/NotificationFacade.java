package Functions;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

import Data.Notification;
import Data.User;
import Persistence.NotificationManager;
import Persistence.NotificationManagerDB;

public class NotificationFacade {

	private NotificationManager notificationManager;

	/**
	 * @return the notificationManager
	 */
	public NotificationManager getNotificationManager() {
		return notificationManager;
	}

	/**
	 * @param notificationManager the notificationManager to set
	 */
	public void setNotificationManager(NotificationManager notificationManager) {
		this.notificationManager = notificationManager;
	}


	public NotificationFacade() {
		super();
		this.notificationManager = new NotificationManagerDB();
	}
	
	public ArrayList<Notification> getNotifications(User user){
		return this.getNotificationManager().getNotifications(user);
	}
	
	public Notification[] getNotificationsArray(User user){
		return this.getNotificationManager().getNotificationsArray(user);
	}
	
	public DefaultListModel<Notification> getNotificationsListModel(User user, boolean state){
		return this.getNotificationManager().getNotificationsListModel(user, state);
	}
	
	public void markAsRead(Notification notification){
		this.notificationManager.markAsRead(notification);
	}
	
	public void markAsUnread(Notification notification){
		this.notificationManager.markAsUnread(notification);
	}
	
	public void remove(Notification notification){
		this.notificationManager.removeNotification(notification);
	}
}
