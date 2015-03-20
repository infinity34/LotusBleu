package UI;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JSpinner;

public class AccessoryUpdateView extends JPanel {

	/**
	 * Create the panel.
	 */
	public AccessoryUpdateView() {
		this.setSize(640, 480);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Accessory Management");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 49, 628, 35);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Choose the accessory you want to update in the list :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(6, 123, 628, 16);
		add(lblNewLabel_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(210, 164, 218, 28);
		add(spinner);
		
		
		JButton btnSubmite = new JButton("Submit");
		btnSubmite.setBounds(406, 228, 117, 29);
		add(btnSubmite);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(122, 228, 117, 29);
		add(btnCancel);
		
	}
}
