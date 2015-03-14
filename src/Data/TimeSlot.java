
package Data;

import java.util.Date;

/**
 * 
 * 
 * @poseidon-object-id [Im37e90f00m14bf8ad3fd2mm76b0]
 */
public class TimeSlot {
	
	private Date beginDate;
	private Date endDate;
	private boolean recurrence;
	private Date lastReccurence;
	
	/**
	 * @param beginDate
	 * @param endDate
	 * @param recurrence
	 * @param lastReccurence
	 */
	public TimeSlot(Date beginDate, Date endDate, boolean recurrence,
			Date lastReccurence) {
		super();
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.recurrence = recurrence;
		this.lastReccurence = lastReccurence;
	}
	/**
	 * @return the beginDate
	 */
	public Date getBeginDate() {
		return beginDate;
	}
	/**
	 * @param beginDate the beginDate to set
	 */
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	/**
	 * @return the recurrence
	 */
	public boolean isRecurrence() {
		return recurrence;
	}
	/**
	 * @param recurrence the recurrence to set
	 */
	public void setRecurrence(boolean recurrence) {
		this.recurrence = recurrence;
	}
	/**
	 * @return the lastReccurence
	 */
	public Date getLastReccurence() {
		return lastReccurence;
	}
	/**
	 * @param lastReccurence the lastReccurence to set
	 */
	public void setLastReccurence(Date lastReccurence) {
		this.lastReccurence = lastReccurence;
	}
	
	
 }
