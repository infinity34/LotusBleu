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
	private JTextField txtBegin;
	private JTextField txtEnd;
	private JTextField txtName;
	private JTextField txtFirstname;
	private JTextField txtEnterTheEvent;
	private JTextField txtBegining;
	private JTextField txtEnd_1;
	
	public ContributorAddGUI() {
		this.setSize(640, 480);
		setLayout(null);
		
		JLabel title = new JLabel("Contributor Management");
		title.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(6, 49, 628, 35);
		add(title);
		
		JLabel instruct = new JLabel("You will add a contributor to an event/n If the event already has a contributor, he will be changed!");
		instruct.setHorizontalAlignment(SwingConstants.CENTER);
		instruct.setBounds(6, 127, 628, 16);
		add(instruct);
		
		JLabel eventNamelabel = new JLabel("Event name :");
		eventNamelabel.setHorizontalAlignment(SwingConstants.RIGHT);
		eventNamelabel.setBounds(56, 173, 137, 16);
		add(eventNamelabel);
		
		JLabel beginLabel = new JLabel("Begining date:");
		beginLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		beginLabel.setBounds(56, 213, 137, 16);
		add(beginLabel);
		
		JLabel endLabel = new JLabel("Ending date :");
		endLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		endLabel.setBounds(56, 251, 137, 16);
		add(endLabel);
		
		txtName = new JTextField();
		txtName.setForeground(Color.BLACK);
		txtName.setText("Enter the contributor's name");
		txtName.setBounds(210, 289, 231, 28);
		add(txtName);
		txtName.setColumns(10);
		
		txtFirstname = new JTextField();
		txtFirstname.setText("Enter the contributor's firstname");
		txtFirstname.setToolTipText("");
		txtFirstname.setForeground(Color.BLACK);
		txtFirstname.setText("Enter the first name");
		txtFirstname.setBounds(210, 328, 231, 28);
		add(txtFirstname);
		txtFirstname.setColumns(10);
		
				
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(413, 376, 117, 29);
		add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(143, 376, 117, 29);
		add(btnCancel);
		
		JLabel lblContributorName = new JLabel("Contributor name :");
		lblContributorName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContributorName.setBounds(56, 295, 137, 16);
		add(lblContributorName);
		
		JLabel lblContributorFirstName = new JLabel("Contributor first name :");
		lblContributorFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContributorFirstName.setBounds(56, 334, 137, 16);
		add(lblContributorFirstName);
		
		txtEnterTheEvent = new JTextField();
		txtEnterTheEvent.setText("Enter the event name");
		txtEnterTheEvent.setForeground(Color.BLACK);
		txtEnterTheEvent.setColumns(10);
		txtEnterTheEvent.setBounds(210, 171, 231, 28);
		add(txtEnterTheEvent);
		
		txtBegining = new JTextField();
		txtBegining.setText("dd/mm/aa");
		txtBegining.setForeground(Color.BLACK);
		txtBegining.setColumns(10);
		txtBegining.setBounds(210, 207, 231, 28);
		add(txtBegining);
		
		txtEnd_1 = new JTextField();
		txtEnd_1.setText("dd/mm/aa");
		txtEnd_1.setForeground(Color.BLACK);
		txtEnd_1.setColumns(10);
		txtEnd_1.setBounds(210, 245, 231, 28);
		add(txtEnd_1);
		
		
		//Listeners
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ContributorManagementMenuGUI());
			}});
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Boolean isAdded = myFacade.addContributorToEvent(txtEventName.getText(),txtBegin.getText(),txtEnd.getText(),txtName.getText(),txtFirstname.getText());
				
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
