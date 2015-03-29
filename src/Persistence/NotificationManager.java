package Persistence;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.DefaultListModel;

import Data.Notification;
import Data.User;

/**
 * The notificationManager manage a list of notifications
 * 
 * @author Maxime Clerix
 *
 */
public abstract class NotificationManager {

	/**
	 * the list of notifications to manage
	 */
	protected ArrayList<Notification> notifications;
	
	/**
	 * @return the notifications
	 */
	public ArrayList<Notification> getNotifications(User user) {
		this.loadNotifications(user);
		return notifications;
	}
	
	/**
	 * Return an array of notifications
	 * 
	 * @param user
	 * @return
	 */
	public Notification[] getNotificationsArray(User user){
		this.loadNotifications(user);
		Notification[] array = new Notification[notifications.size()];
		Iterator<Notification> it = notifications.iterator();
		int i = 0;
		while(it.hasNext()){
			array[i] = it.next();
		}
		return array;
	}
	
	/**
	 * return the DefaultListModel of notifications (used to fill a JList)
	 * 
	 * @param user
	 * @param state
	 * @return the DefaultListModel
	 */
	public DefaultListModel<Notification> getNotificationsListModel(User user, boolean state){
		this.loadNotifications(user);
		Notification current;
		DefaultListModel<Notification> dlm = new DefaultListModel<Notification>();
		Iterator<Notification> it = notifications.iterator();
		while(it.hasNext()){
			current = it.next();
			if(current.isRead() == state){
					dlm.addElement(current);
			}
		}
		return dlm;
	}
	
	/**
	 * @return the notifications
	 */
	public ArrayList<Notification> getNotifications() {
		return notifications;
	}

	public NotificationManager(){
		this.notifications = new ArrayList<Notification>();
	}
	
	/**
	 * load the notifications in the private attribute notifications
	 * 
	 * @param user
	 */
	public abstract void loadNotifications(User user);
	
	/**
	 * Mark a selected notification as read
	 * 
	 * @param notification
	 */
	public abstract void markAsRead(Notification notification);
	
	/**
	 * Mark a selected notification as unread
	 * 
	 * @param notification
	 */
	public abstract void markAsUnread(Notification notification);
	
	/**
	 * delete a selected notification
	 * 
	 * @param notification
	 */
	public abstract void removeNotification(Notification notification);
}
