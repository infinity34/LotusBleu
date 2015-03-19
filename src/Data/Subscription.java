/**
 * 
 */
package Data;

import java.util.Date;

/**
 * @author max
 *
 */
public class Subscription {

	private Date subscriptionDate;
	private Date endSubscriptionDate;
	private Payment payment;
	
	/**
	 * @param subscriptionDate
	 * @param endSubscriptionDate
	 * @param payment
	 */
	public Subscription(Date subscriptionDate, Date endSubscriptionDate,
			Payment payment) {
		super();
		this.subscriptionDate = subscriptionDate;
		this.endSubscriptionDate = endSubscriptionDate;
		this.payment = payment;
	}
	/**
	 * @return the subscriptionDate
	 */
	public Date getSubscriptionDate() {
		return subscriptionDate;
	}
	/**
	 * @param subscriptionDate the subscriptionDate to set
	 */
	public void setSubscriptionDate(Date subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}
	/**
	 * @return the endSubscriptionDate
	 */
	public Date getEndSubscriptionDate() {
		return endSubscriptionDate;
	}
	/**
	 * @param endSubscriptionDate the endSubscriptionDate to set
	 */
	public void setEndSubscriptionDate(Date endSubscriptionDate) {
		this.endSubscriptionDate = endSubscriptionDate;
	}
	/**
	 * @return the payment
	 */
	public Payment getPayment() {
		return payment;
	}
	/**
	 * @param payment the payment to set
	 */
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Subscription [subscriptionDate=" + subscriptionDate
				+ ", endSubscriptionDate=" + endSubscriptionDate + ", payment="
				+ payment + "]";
	}
}
