/**
 * 
 */
package Data;

import java.sql.Date;

/**
 * @author Maxime Clerix
 *
 * Represents a Notification Message
 */
public class Notification {

	private String message;
	
	private boolean read;
	
	private Date date;
	
	private int notificationID;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the read
	 */
	public boolean isRead() {
		return read;
	}

	/**
	 * @param read the read to set
	 */
	private void setRead(boolean read) {
		this.read = read;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	private void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the notificationID
	 */
	public int getNotificationID() {
		return notificationID;
	}

	/**
	 * @param notificationID the notificationID to set
	 */
	public void setNotificationID(int notificationID) {
		this.notificationID = notificationID;
	}

	/**
	 * @param message
	 * @param read
	 * @param date
	 */
	public Notification(String message, boolean read, Date date, int ID) {
		super();
		this.message = message;
		this.read = read;
		this.date = date;
		this.notificationID = ID;
	}

	public String toString() {
		return message;
	}
	
	/**
	 * 
	 */
	public void markAsRead(){
		this.setRead(true);
	}
	
	/**
	 * 
	 */
	public void markAsUnread(){
		this.setRead(false);
	}
}
