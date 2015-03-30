package Functions;

import javax.swing.JOptionPane;

import Persistence.PaymentManagerDB;

/**
 * 
 */
public class PaymentFacade {

	/**
	 * 
	 */
	public Persistence.PaymentManager paymentManager;
	
	public PaymentFacade(){
		this.paymentManager = new PaymentManagerDB();
	}

	/**
	 * 
	 * @param cardInformation
	 * @param amount
	 */
	public Boolean ProceedPayment(String cardInformation, String CSC, float amount) {
		return paymentManager.ProceedPayment(cardInformation, CSC, amount);
	}

	/**
	 * <p>
	 * Does ...
	 * </p>
	 * @param amount
	 */
	public Boolean ProceedPayment(float amount) {
		JOptionPane.showInputDialog(null, "Enter your credit card number",
				"Payment", JOptionPane.QUESTION_MESSAGE);
		return true;
	}
}