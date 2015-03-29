
package Persistence;

/**
 * @author remy
 * @author maxime
 * @author Design Clément
 */
public class PaymentManager {

	/**
	 * need in reality to validate the payment
	 * but this tools isn't implemented yet
	 */
	public Tools.PaymentExt paymentExt;

	/**
	 * 
	 * @param cardInformation 
	 * @param amount 
	 * @return 
	 */
	public Boolean ProceedPayment(String cardInformation, float amount) {
		return this.paymentExt.checkProceedPayment(cardInformation);
	}


}
