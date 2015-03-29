
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
	 * check the payment 
	 * @param cardInformation 
	 * @param amount 
	 * @return true if the card informations are "true" 
	 */
	public Boolean ProceedPayment(String cardInformation, String CSC, float amount) {
		return this.paymentExt.checkProceedPayment(cardInformation, CSC);
	}


}
