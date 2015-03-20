package UI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
/**
 * 
 * 
 * @poseidon-object-id [Im3d5f9a4em14c178ccc5bmm7e32]
 */
public class PaymentUI extends JPanel  {


    private String cardInformation;
    private float amount;
    
    private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public PaymentUI(float amount) {
		
		this.amount = amount; 
		
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("Card Number :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 92, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 39, SpringLayout.WEST, this);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CSC :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 6, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 103, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, 21, SpringLayout.SOUTH, lblNewLabel);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textField, 33, SpringLayout.EAST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, textField, 0, SpringLayout.SOUTH, lblNewLabel);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, textField_1, 0, SpringLayout.SOUTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, textField);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnPaid = new JButton("Paid");
		springLayout.putConstraint(SpringLayout.NORTH, btnPaid, 14, SpringLayout.SOUTH, textField_1);
		springLayout.putConstraint(SpringLayout.EAST, btnPaid, -186, SpringLayout.EAST, this);
		add(btnPaid);
		
		JLabel lblAmount = new JLabel("Amount : "+this.amount);
		springLayout.putConstraint(SpringLayout.NORTH, lblAmount, 32, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblAmount, 0, SpringLayout.EAST, btnPaid);
		add(lblAmount);

	}

    public Functions.PaymentFacade paymentFacade;
 }