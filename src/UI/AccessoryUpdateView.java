package UI;

import java.awt.Font;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


import Data.Accessory;
import Functions.AccessoryFacade;

import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccessoryUpdateView extends JPanel {

	
	private JTextField txtEnterTheName;
	private AccessoryFacade myFacade = AccessoryFacade.getAccessoryFacade();
	
	
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
		
		JLabel lblNewLabel_1 = new JLabel("Enter the accessory you want to update :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(6, 123, 628, 16);
		add(lblNewLabel_1);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(406, 228, 117, 29);
		add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(122, 228, 117, 29);
		add(btnCancel);
		
		txtEnterTheName = new JTextField();
		txtEnterTheName.setForeground(Color.BLACK);
		txtEnterTheName.setText("Enter the name");
		txtEnterTheName.setBounds(210, 166, 231, 28);
		add(txtEnterTheName);
		txtEnterTheName.setColumns(10);
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new AccessoryMainView());
			}});
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Accessory accessory = myFacade.getAnAccessory(txtEnterTheName.getText());
				if(accessory != null){
					AccessoryUpdateNextView nextPanel = new AccessoryUpdateNextView();
					nextPanel.setOldAccessoryName(txtEnterTheName.getText());
					MainFrame.getMainFrame().setMainPanel(nextPanel);
				}
				else{
					JOptionPane.showMessageDialog(null, "This accessory doesn't exist! Try with another name", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}});
	}
}
