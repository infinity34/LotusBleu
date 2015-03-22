package Persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import Data.Notification;
import Data.User;
import Tools.DBconnection;

public class NotificationManagerDB extends NotificationManager {

	private DBconnection connection;

	/**
	 * @return the connection
	 */
	public DBconnection getConnection() {
		return connection;
	}

	/**
	 * @param connection
	 *            the connection to set
	 */
	public void setConnection(DBconnection connection) {
		this.connection = connection;
	}

	public NotificationManagerDB() {
		super();
		this.connection = DBconnection.getConnection();
	}

	public void markAsRead(Notification notification) {
		try {
			connection.getState().executeUpdate(
					"UPDATE NOTIFICATION SET notificationRead = 1 WHERE  notificationID = "
							+ notification.getNotificationID());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void markAsUnread(Notification notification) {
		try {
			String query = "UPDATE lotusbleu.NOTIFICATION SET notificationRead = '0' WHERE notificationID = '"
					+ notification.getNotificationID()+"';";
			System.out.println(query);
			connection.getState().executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void loadNotifications(User user) {
		try {
			ResultSet resultat = connection.getState().executeQuery(
					"SELECT * FROM lotusbleu.NOTIFICATION WHERE userID=\""
							+ user.getUsermail() + "\"");
			while (resultat.next()) {
				this.notifications.add(new Notification(resultat
						.getString("notificationMessage"), resultat
						.getBoolean("notificationRead"), null, resultat
						.getInt("notificationID")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void removeNotification(Notification notification) {
		try {
			connection.getState().executeUpdate(
					"DELETE FROM NOTIFICATION WHERE notificationID = "
							+ notification.getNotificationID());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
