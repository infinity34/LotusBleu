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

	}

	public void markAsUnread(Notification notification) {

	}

	public void loadNotifications(User user) {
		try {
			ResultSet resultat = connection.getState().executeQuery(
					"SELECT * FROM lotusbleu.NOTIFICATION WHERE userID=\""
							+ user.getUsermail() + "");
			do {
				this.notifications.add(new Notification(resultat
						.getString("notificationMessage"), resultat
						.getBoolean("read"), resultat.getDate("notificationDate")));
			} while (resultat.next());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
