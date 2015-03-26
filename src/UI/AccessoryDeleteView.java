package UI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Data.Accessory;
import Functions.AccessoryFacade;

public class AccessoryDeleteView extends JPanel {

	private JTextField txtEnterTheName;
	private AccessoryFacade myFacade = new AccessoryFacade();
	
	/**
	 * Create the panel.
	 */
	public AccessoryDeleteView() {
		this.setSize(640, 480);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Accessory Management");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 49, 628, 35);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the accessory you want to delete :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(6, 123, 628, 16);
		add(lblNewLabel_1);
		
		txtEnterTheName = new JTextField();
		txtEnterTheName.setForeground(Color.BLACK);
		txtEnterTheName.setText("Enter the name");
		txtEnterTheName.setBounds(210, 166, 231, 28);
		add(txtEnterTheName);
		txtEnterTheName.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(406, 228, 117, 29);
		add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(122, 228, 117, 29);
		add(btnCancel);
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new AccessoryMainView());
			}});
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Accessory accessory = myFacade.getAnAccessory(txtEnterTheName.getText());
				if(accessory != null){
					Boolean isDeleted = myFacade.removeAccessory(new Accessory(txtEnterTheName.getText()));
					
					if(!isDeleted){
						//Error popup 
						JOptionPane.showMessageDialog(null, "The accessory doesn't delete! :(", "Error", JOptionPane.ERROR_MESSAGE);
					}
					else{
						//Information popup
						JOptionPane.showMessageDialog(null, "Accessory Deleted! :)", "Success", JOptionPane.INFORMATION_MESSAGE);
						MainFrame.getMainFrame().setMainPanel(new AccessoryMainView());
					}
				}
				else{
					JOptionPane.showMessageDialog(null, "This accessory doesn't exist! Try with another name", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}});
	}

}
