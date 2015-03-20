package UI;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class AccessoryAddView extends JPanel {
	private JTextField txtAccessoryName;

	/**
	 * Create the panel.
	 */
	public AccessoryAddView() {
		this.setSize(640, 480);
		
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Accessory Management");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 49, 628, 35);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("You will add an accessory");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(6, 127, 628, 16);
		add(lblNewLabel_1);
		
		txtAccessoryName = new JTextField();
		txtAccessoryName.setForeground(Color.LIGHT_GRAY);
		txtAccessoryName.setText("Enter the name");
		txtAccessoryName.setBounds(259, 186, 282, 28);
		add(txtAccessoryName);
		txtAccessoryName.setColumns(10);
		
		JLabel lblAccessoryName = new JLabel("Accessory name :");
		lblAccessoryName.setBounds(110, 192, 137, 16);
		add(lblAccessoryName);
		
		JButton btnSubmite = new JButton("Submit");
		btnSubmite.setBounds(413, 278, 117, 29);
		add(btnSubmite);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(143, 278, 117, 29);
		add(btnCancel);

	}
}
