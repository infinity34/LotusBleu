package Persistence;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.DefaultListModel;

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
	
	public NotificationManager(){
		this.notifications = new ArrayList<Notification>();
	}
	
	public void loadNotifications(User user){}
	
	public void markAsRead(Notification notification){}
	
	public void markAsUnread(Notification notification){}
	
	public void removeNotification(Notification notification){}
}
