/**
 * 
 */
package Test.Persistence;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Data.User;
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
		assertNotEquals("La liste n'est plus null", 0, notificationManager.getNotifications().size());
	}
	
	@Test
	public void testMarkAsUnread(){
		
	}
	
	@Test
	public void testMarkAsRead(){
		
	}
	
	@Test
	public void testRemoveNotification(){
		
	}
}
