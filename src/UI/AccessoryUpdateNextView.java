package UI;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import Data.Accessory;
import Functions.AccessoryFacade;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccessoryUpdateNextView extends JPanel {
	private JTextField txtEnterTheNew;
	private String oldAccessoryName;
	private AccessoryFacade myFacade;

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
		txtEnterTheNew.setForeground(Color.BLACK);
		txtEnterTheNew.setText("Enter the new name");
		txtEnterTheNew.setBounds(266, 200, 243, 28);
		add(txtEnterTheNew);
		txtEnterTheNew.setColumns(10);
		
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
				myFacade.updateAccessory(new Accessory(oldAccessoryName), txtEnterTheNew.getText());
				//MainFrame.getMainFrame().setMainPanel(nextPanel);
			}});
	}

	public String getOldAccessoryName() {
		return oldAccessoryName;
	}

	public void setOldAccessoryName(String oldAccessoryName) {
		this.oldAccessoryName = oldAccessoryName;
	}

}
