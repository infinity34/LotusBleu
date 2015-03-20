package Functions;

import java.util.ArrayList;

import Data.Notification;
import Data.User;
import Persistence.NotificationManager;

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

	/**
	 * @param notificationManager
	 */
	public NotificationFacade() {
		super();
		this.notificationManager = new NotificationManager();
	}
	
	public ArrayList<Notification> getNotifications(User user){
		return this.getNotificationManager().getNotifications(user);
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
