package Data;

import java.util.Date;

/**
 * 
 * 
 * @poseidon-object-id [I48c9a015m14c095cecaamm7327]
 */
public class Payment {

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 * 
	 * @poseidon-object-id [I48c9a015m14c095cecaamm72e5]
	 */
	private Date paymentDate;

	/**
	 * <p>
	 * Represents ...
	 * </p>
	 * 
	 * @poseidon-object-id [I48c9a015m14c095cecaamm72d4]
	 */
	private int amount;

	/**
	 * @return the paymentDate
	 */
	public Date getPaymentDate() {
		return paymentDate;
	}

	/**
	 * @param paymentDate
	 *            the paymentDate to set
	 */
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	/**
	 * <p>
	 * Creates a payment
	 * </p>
	 * 
	 * @poseidon-object-id [I3c73971m14c0964d9f6mm76e2]
	 * @param amout
	 * @param date
	 */
	public Payment(int amount, Date date) {
		super();
		this.amount = amount;
		this.paymentDate = date;
	}
}
