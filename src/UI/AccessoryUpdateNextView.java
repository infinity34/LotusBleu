package UI;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import java.awt.Color;

public class AccessoryUpdateNextView extends JPanel {
	private JTextField txtEnterTheNew;

	/**
	 * Create the panel.
	 */
	public AccessoryUpdateNextView() {
		this.setSize(640, 480);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Accessory Management");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 49, 628, 35);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the new name for this accessory :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(6, 123, 628, 16);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Old Accessory Name");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(6, 151, 628, 16);
		add(lblNewLabel_2);
		
		JLabel lblNewName = new JLabel("New Name :");
		lblNewName.setBounds(172, 206, 105, 16);
		add(lblNewName);
		
		txtEnterTheNew = new JTextField();
		txtEnterTheNew.setForeground(Color.LIGHT_GRAY);
		txtEnterTheNew.setText("Enter the new name");
		txtEnterTheNew.setBounds(266, 200, 243, 28);
		add(txtEnterTheNew);
		txtEnterTheNew.setColumns(10);
		
		JButton btnSubmite = new JButton("Submit");
		btnSubmite.setBounds(413, 278, 117, 29);
		add(btnSubmite);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(143, 278, 117, 29);
		add(btnCancel);
	}

}
