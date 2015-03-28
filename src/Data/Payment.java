package Data;

import java.util.Date;


 /**
  * 
  * @author remy
  *
  */
public class Payment {

	/**
	 * This is the date of the payment
	 * for the purchase
	 */
	private Date paymentDate;

	/**
	 * the purchase amount
	 */
	private double amount;
	
	/**
	 * Constructor
	 * create an object payment
	 * with an amount and a date
	 * @param amout
	 * @param date
	 */
	public Payment(int amount, Date date) {
		super();
		this.amount = amount;
		this.paymentDate = date;
	}

	/**
	 * @return the paymentDate
	 */
	public Date getPaymentDate() {
		return paymentDate;
	}

	/**
	 * set the date with the date in parameter
	 * @param paymentDate
	 */
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * set the amount with the argument
	 * @param amount
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
