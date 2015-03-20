/**
 * 
 */
package Data;

import java.sql.Date;

/**
 * @author max
 *
 * Represents a Notification Message
 */
public class Notification {

	private String message;
	
	private boolean read;
	
	private Date date;

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
	 * @param message
	 * @param read
	 * @param date
	 */
	public Notification(String message, boolean read, Date date) {
		super();
		this.message = message;
		this.read = read;
		this.date = date;
	}

	public String toString() {
		return "Notification [message=" + message + ", read=" + read
				+ ", date=" + date + "]";
	}
	
	public void markAsRead(){
		this.setRead(true);
	}
	
	public void markAsUnread(){
		this.setRead(false);
	}
}
