package Persistence;

import java.util.ArrayList;

import Data.Notification;
import Data.User;

public class NotificationManager {

	protected ArrayList<Notification> notifications;
	
	/**
	 * @return the notifications
	 */
	public ArrayList<Notification> getNotifications(User user) {
		this.loadNotifications(user);
		return notifications;
	}
	
	public void loadNotifications(User user){}
	
	public void markAsRead(Notification notification){}
	
	public void markAsUnread(Notification notification){}
}
