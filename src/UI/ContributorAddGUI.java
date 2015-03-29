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

@SuppressWarnings("serial")


public class ContributorAddGUI extends JPanel {
	
	private ContributorManagementFacade myFacade = new ContributorManagementFacade();
	private JTextField txtEventName;
	private JTextField txtName;
	private JTextField txtFirstname;
	private JTextField txtEnterTheEvent;
	
	public ContributorAddGUI() {
		this.setSize(640, 480);
		setLayout(null);
		
		JLabel title = new JLabel("Contributor Management");
		title.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(6, 49, 628, 35);
		add(title);
		
		JLabel instruct = new JLabel("You will add a contributor to an event. If the event already has a contributor, he will be changed!");
		instruct.setHorizontalAlignment(SwingConstants.CENTER);
		instruct.setBounds(6, 127, 628, 16);
		add(instruct);
		
		JLabel eventNamelabel = new JLabel("Event ID :");
		eventNamelabel.setHorizontalAlignment(SwingConstants.RIGHT);
		eventNamelabel.setBounds(56, 173, 137, 16);
		add(eventNamelabel);
		
		JLabel lblContributorName = new JLabel("Contributor name :");
		lblContributorName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContributorName.setBounds(56, 216, 137, 16);
		add(lblContributorName);
		
		JLabel lblContributorFirstName = new JLabel("Contributor first name :");
		lblContributorFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContributorFirstName.setBounds(56, 255, 137, 16);
		add(lblContributorFirstName);
		
		txtName = new JTextField();
		txtName.setForeground(Color.BLACK);
		txtName.setText("Enter the contributor's name");
		txtName.setBounds(210, 210, 231, 28);
		add(txtName);
		txtName.setColumns(10);
		
		txtFirstname = new JTextField();
		txtFirstname.setText("Enter the contributor's firstname");
		txtFirstname.setToolTipText("");
		txtFirstname.setForeground(Color.BLACK);
		txtFirstname.setText("Enter the first name");
		txtFirstname.setBounds(210, 249, 231, 28);
		add(txtFirstname);
		txtFirstname.setColumns(10);
		
		txtEnterTheEvent = new JTextField();
		txtEnterTheEvent.setText("Enter the event ID");
		txtEnterTheEvent.setForeground(Color.BLACK);
		txtEnterTheEvent.setColumns(10);
		txtEnterTheEvent.setBounds(210, 171, 231, 28);
		add(txtEnterTheEvent);
		
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(411, 311, 117, 29);
		add(btnSubmit);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(141, 311, 117, 29);
		add(btnCancel);
				
		
		//Listeners
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ContributorManagementMenuGUI());
			}});
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Boolean isAdded = myFacade.addContributorToEvent(Integer.parseInt(txtEventName.getText()),txtName.getText(),txtFirstname.getText());
				if(!isAdded){
					//Error popup 
					JOptionPane.showMessageDialog(null, "The contributor "+txtName.getText()+" "+txtFirstname.getText()+" has not been added to the event "+txtEventName.getText()+".", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else{
					//Information popup
					JOptionPane.showMessageDialog(null, txtName.getText()+" "+txtFirstname.getText()+" is now the contributor of th event "+txtEventName.getText()+".", "Success", JOptionPane.INFORMATION_MESSAGE);
					MainFrame.getMainFrame().setMainPanel(new ContributorManagementMenuGUI());
				}
			}});
	}
}
