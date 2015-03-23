package UI;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Functions.AccessoryFacade;

public class AccessoryAddView extends JPanel {
	private JTextField txtAccessoryName;
	private AccessoryFacade myFacade;
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
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(413, 278, 117, 29);
		add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(143, 278, 117, 29);
		add(btnCancel);
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new AccessoryMainView());
			}});
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Boolean isAdd = myFacade.addAccessory(txtAccessoryName.getText());
				
				if(!isAdd){
					//Error popup 
					JOptionPane.showMessageDialog(null, "The accessory doesn't add in the database", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else{
					//Information popup
					JOptionPane.showMessageDialog(null, "Accessory Added", "Well done", JOptionPane.INFORMATION_MESSAGE);
					MainFrame.getMainFrame().setMainPanel(new AccessoryMainView());
				}
			}});

	}
}
