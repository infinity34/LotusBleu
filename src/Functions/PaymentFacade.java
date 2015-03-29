package Functions;

import javax.swing.JOptionPane;

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
	public Boolean ProceedPayment(String cardInformation, String CSC, float amount) {
		return paymentManager.ProceedPayment(cardInformation, CSC, amount);
	}

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * @param cardInformation
	 * @param amount
	 * @return
	 */
	public Boolean ProceedPayment(float amount) {
		JOptionPane.showInputDialog(null, "Enter your credit card number",
				"Payment", JOptionPane.QUESTION_MESSAGE);
		return true;
	}
}