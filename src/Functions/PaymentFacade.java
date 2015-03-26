
package Functions;

/**
 * 
 */
public class PaymentFacade {

	/**
	 * 
	 */
	public Persistence.PaymentManager paymentManager;

	/**
	 * 
	 * @param cardInformation 
	 * @param amount 
	 * @return 
	 */
	public Boolean ProceedPayment(String cardInformation, float amount) {
		return paymentManager.ProceedPayment(cardInformation, amount);
	} 

}
