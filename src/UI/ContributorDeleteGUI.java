package UI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Data.Accessory;
import Data.ContributorRole;
import Functions.ContributorManagementFacade;
import Functions.EventFacade;

public class ContributorDeleteGUI extends JPanel {

	/**
	 * Create the panel.
	 */
	
	private JTextField txtEnterTheName;
	private JTextField txtEnterTheFirstName;
	private JTextField txtEnterTheEvent;
	private ContributorManagementFacade myFacade = new ContributorManagementFacade();
	
	
	public ContributorDeleteGUI() {
		this.setSize(640, 480);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contributor Management");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 49, 628, 35);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the contributor you want to delete :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(6, 123, 628, 16);
		add(lblNewLabel_1);
		
		txtEnterTheEvent = new JTextField();
		txtEnterTheEvent.setForeground(Color.BLACK);
		txtEnterTheEvent.setText("Enter the event name");
		txtEnterTheEvent.setBounds(210, 185, 231, 28);
		add(txtEnterTheEvent);
		txtEnterTheEvent.setColumns(10);
		
		txtEnterTheName = new JTextField();
		txtEnterTheName.setForeground(Color.BLACK);
		txtEnterTheName.setText("Enter the contributor's name");
		txtEnterTheName.setBounds(210, 224, 231, 28);
		add(txtEnterTheName);
		txtEnterTheName.setColumns(10);
		
		txtEnterTheFirstName = new JTextField();
		txtEnterTheFirstName.setText("Enter the contributor's firstname");
		txtEnterTheFirstName.setToolTipText("");
		txtEnterTheFirstName.setForeground(Color.BLACK);
		txtEnterTheFirstName.setText("Enter the first name");
		txtEnterTheFirstName.setBounds(210, 263, 231, 28);
		add(txtEnterTheFirstName);
		txtEnterTheFirstName.setColumns(10);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(405, 338, 117, 29);
		add(btnDelete);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(121, 338, 117, 29);
		add(btnCancel);
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ContributorManagementMenuGUI());
			}});
		
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Boolean isDeleted = myFacade.deleteContributorFromEvent(txtEnterTheEvent.getText());
				
				if(!isDeleted){
					//Error popup 
					JOptionPane.showMessageDialog(null, "The contributor is not deleted! :(", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else{
					//Information popup
					JOptionPane.showMessageDialog(null, "Contributor Deleted! :)", "Success", JOptionPane.INFORMATION_MESSAGE);
					MainFrame.getMainFrame().setMainPanel(new AccessoryMainView());
				}
			}});
	}

}
