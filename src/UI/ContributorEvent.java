package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


import Data.Event;
import Functions.ContributorManagementFacade;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class ContributorEvent extends JPanel {
	private JTable table;
	private final JScrollPane scrollPane = new JScrollPane();
	private JTextField txtName;
	private JTextField txtFirstname;
	private JButton btnCancel;
	
	
	public ContributorEvent()
	  {
		this.setSize(640, 480);
		setLayout(null);
		
		JLabel lblEventManagement = new JLabel("Contributor Management");
		lblEventManagement.setHorizontalAlignment(SwingConstants.CENTER);
		lblEventManagement.setBounds(167, 13, 297, 26);
		lblEventManagement.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		add(lblEventManagement);
		

	    
	    
		txtName = new JTextField();
		txtName.setForeground(Color.BLACK);
		txtName.setText("Enter the contributor's name");
		txtName.setBounds(210, 69, 231, 28);
		add(txtName, BorderLayout.NORTH);
		txtName.setColumns(10);
		
		txtFirstname = new JTextField();
		txtFirstname.setText("Enter the contributor's firstname");
		txtFirstname.setToolTipText("");
		txtFirstname.setForeground(Color.BLACK);
		txtFirstname.setText("Enter the first name");
		txtFirstname.setBounds(210, 124, 231, 28);
		add(txtFirstname, BorderLayout.WEST);
		txtFirstname.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(210, 186, 117, 29);
		add(btnSubmit);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(337, 186, 117, 29);
		add(btnCancel);
		
		
		//Listener
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Event> events = ContributorManagementFacade.getContributorManagementFacade().listEvents(txtName.getText(),txtFirstname.getText());
				String[] columnNames = {"Event Name","Activity Name","Room","Begin Date","End Date","Recurrence","Last recurrence","Contributor"};
				Object[][] data = new Object[events.size()][8];
				
				for (int i = 0; i < events.size(); i++){
					data[i][0]=events.get(i).getEventName();
					data[i][1]=events.get(i).getEventActivity().getName();
					data[i][2]=events.get(i).getEventRoomID();
					data[i][3]=events.get(i).getEventTimeSlot().getBeginDate();
					data[i][4]=events.get(i).getEventTimeSlot().getEndDate();
					data[i][5]=events.get(i).getEventTimeSlot().isRecurrence();
					data[i][6]=events.get(i).getEventTimeSlot().getLastReccurence();
					data[i][7]=events.get(i).getEventContributorFirstname()+""+events.get(i).getEventContributorName();
				}
				scrollPane.setBounds(30, 244, 571, 158);
				scrollPane.setViewportView(table);
				table = new JTable(data,columnNames);	
				add(scrollPane);
				
		}}); 
		        
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ContributorManagementMenuGUI());
			}
		});


			
			
	    
	    
	    
	    
	    
	    
	  }
}
