
package Functions;

import javax.swing.JOptionPane;

/**
 * 
 */
public class PaymentFacade {

<<<<<<< Updated upstream
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
=======
/**
 * <p>Does ...</p>
 * 
 * @poseidon-object-id [Im3d5f9a4em14c178ccc5bmm7d6e]
 * @param cardInformation 
 * @param amount 
 * @return 
 */
    public Boolean ProceedPayment(float amount) {        
    	JOptionPane.showInputDialog(null, "Enter your credit card number", "Payment", JOptionPane.QUESTION_MESSAGE);
        return true;
    } 
/**
 * 
 * 
 * @poseidon-object-id [Im27a4b8d9m14c215a6043mm7ce2]
 */
    public Persistence.PaymentManager paymentManager;
 }
>>>>>>> Stashed changes
