/**
 * 
 */
package Test.Persistence;

import static org.junit.Assert.*;

import javax.swing.DefaultListModel;

import org.junit.Before;
import org.junit.Test;

import Data.Notification;
import Data.User;
import Persistence.NotificationManager;
import Persistence.NotificationManagerDB;

/**
 * This class tests how NotificationMangagerDB works
 * 
 * @author Maxime Clerix
 *
 */
public class NotificationManagerDBTest {

	private NotificationManagerDB notificationManager;
	private User user;

	@Before
	public void setUp(){
		this.notificationManager = new NotificationManagerDB();
		user = new User();
		user.setUsermail("a");
	}
	
	@Test
	public void testLoadNotifications(){
		assertEquals("La taille de la liste est invalide", 0 ,notificationManager.getNotifications().size());
		notificationManager.loadNotifications(user);
		// sous-réserve qu'il y ait des notifications
		assertNotEquals("La liste n'est plus null", 0, notificationManager.getNotifications().size());
	}
	
	@Test
	public void testMarkAsUnread(){
		NotificationManager manager = new NotificationManagerDB();
		DefaultListModel<Notification> notifs = manager.getNotificationsListModel(user, true);
		int initialSize = notifs.getSize();
		assertEquals("La taille de la liste est invalide", initialSize, notifs.getSize());
		manager.markAsUnread(notifs.getElementAt(0));
		notifs = manager.getNotificationsListModel(user, true);
		assertEquals("La taille de la liste est invalide", initialSize-1, notifs.getSize());
	}
	
	@Test
	public void testMarkAsRead(){
		NotificationManager manager = new NotificationManagerDB();
		DefaultListModel<Notification> notifs = manager.getNotificationsListModel(user, false);
		int initialSize = notifs.getSize();
		assertEquals("La taille de la liste est invalide", initialSize, notifs.getSize());
		manager.markAsRead(notifs.getElementAt(0));
		notifs = manager.getNotificationsListModel(user, false);
		assertEquals("La taille de la liste est invalide", initialSize-1, notifs.getSize());
	}
	
	@Test
	public void testRemoveNotification(){

		NotificationManager manager = new NotificationManagerDB();
		DefaultListModel<Notification> notifs = manager.getNotificationsListModel(user, true);
		int initialSize = notifs.getSize();
		assertEquals("La taille de la liste est invalide", initialSize, notifs.getSize());
		manager.removeNotification(notifs.getElementAt(0));
		notifs = manager.getNotificationsListModel(user, true);
		assertEquals("La taille de la liste est invalide", initialSize-1, notifs.getSize());
	}
}
