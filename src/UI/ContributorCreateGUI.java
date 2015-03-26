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

import Functions.ContributorManagementFacade;

public class ContributorCreateGUI extends JPanel {

	ContributorManagementFacade myFacade = new ContributorManagementFacade();
	private JTextField txtContributorName;
	private JTextField txtContributorFirstName;
	
	/**
	 * Create the panel.
	 */
	public ContributorCreateGUI() {
		this.setSize(640, 480);
		
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contributor Management");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 49, 628, 35);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("You will add a new Contributor");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(6, 127, 628, 16);
		add(lblNewLabel_1);
		
		txtContributorName = new JTextField();
		txtContributorName.setForeground(Color.BLACK);
		txtContributorName.setText("Enter the name");
		txtContributorName.setBounds(259, 186, 282, 28);
		add(txtContributorName);
		txtContributorName.setColumns(10);
		
		JLabel lblContributorName = new JLabel("Contributor name :");
		lblContributorName.setBounds(110, 192, 137, 16);
		add(lblContributorName);
		
		txtContributorFirstName = new JTextField();
		txtContributorFirstName.setForeground(Color.BLACK);
		txtContributorFirstName.setText("Enter the first name");
		txtContributorFirstName.setBounds(259, 239, 282, 28);
		add(txtContributorFirstName);
		txtContributorFirstName.setColumns(10);
		
		JLabel lblContributorFirstName = new JLabel("Contributor first name :");
		lblContributorFirstName.setBounds(110, 245, 137, 16);
		add(lblContributorFirstName);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(410, 327, 117, 29);
		add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(140, 327, 117, 29);
		add(btnCancel);
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ContributorManagementMenuGUI());
			}});
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Boolean isAdd = myFacade.createContributor(txtContributorName.getText(), txtContributorFirstName.getText());
				
				if(!isAdd){
					//Error popup 
					JOptionPane.showMessageDialog(null, "The contributor has not been created in database!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else{
					//Information popup
					JOptionPane.showMessageDialog(null, "Contributor Added! :) :)", "Success", JOptionPane.INFORMATION_MESSAGE);
					MainFrame.getMainFrame().setMainPanel(new ContributorManagementMenuGUI());
				}
			}});

	}

}
