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
import javax.swing.JTable;
import javax.swing.JComboBox;

public class AddContributorGUI extends JPanel {
	private JTextField txtEventName;
	private ContributorManagementFacade myFacade = new ContributorManagementFacade();
	private JTable table;
	private JComboBox contributorList;
	
	public AddContributorGUI() {
		this.setSize(640, 480);
		
		setLayout(null);
		
		JLabel title = new JLabel("Contributor Management");
		title.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(6, 49, 628, 35);
		add(title);
		
		JLabel instruct = new JLabel("You will add a contributor to an event");
		instruct.setHorizontalAlignment(SwingConstants.CENTER);
		instruct.setBounds(6, 127, 628, 16);
		add(instruct);
		
		/*txtEventName = new JTextField();
		txtEventName.setForeground(Color.BLACK);
		txtEventName.setText("Enter the name");
		txtEventName.setBounds(259, 186, 282, 28);
		add(txtEventName);
		txtEventName.setColumns(10);*/
		
		JLabel eventNamelabel = new JLabel("Event name :");
		eventNamelabel.setHorizontalAlignment(SwingConstants.RIGHT);
		eventNamelabel.setBounds(56, 190, 137, 16);
		add(eventNamelabel);
		
		JComboBox eventList = new JComboBox();
		eventList.setEditable(true);
		eventList.setBounds(203, 238, 310, 20);
		add(eventList);
				
		JLabel contributorNamelabel = new JLabel("Contributor name :");
		contributorNamelabel.setHorizontalAlignment(SwingConstants.RIGHT);
		contributorNamelabel.setBounds(56, 238, 137, 16);
		add(contributorNamelabel);
		
		JComboBox contributorList;
		contributorList = new JComboBox();
		contributorList.setEditable(true);
		contributorList.setBounds(203, 190, 310, 20);
		add(contributorList);
				
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(413, 278, 117, 29);
		add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(143, 278, 117, 29);
		add(btnCancel);
		
		
		

		/*
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ContributorManagementMenuGUI());
			}});
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Boolean isAdded = myFacade.addContributorToEvent(txtEventName.getText());
				
				if(!isAdded){
					//Error popup 
					JOptionPane.showMessageDialog(null, "The event is not added in the database!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else{
					//Information popup
					JOptionPane.showMessageDialog(null, " Added! :) :)", "Success", JOptionPane.INFORMATION_MESSAGE);
					MainFrame.getMainFrame().setMainPanel(new AccessoryMainView());
				}
			}});
*/
	}
}
