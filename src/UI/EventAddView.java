package UI;

import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;

import Data.TimeSlot;
import Functions.EventFacade;

public class EventAddView extends JPanel implements ActionListener {
	private JTextField txtEventName;
	private JTextField txtActivityName;
	private JTextField txtContributorName;
	private JTextField txtContributorName_1;
	private JTextField txtBeginDate;
	private JTextField txtEndDate;
	private JTextField txtLastReccurence;
	private JLabel lblEventname;
	private JLabel lblActivityName;
	private JLabel lblContributorFirstname;
	private JLabel lblContributorName;
	private JLabel lblBeginDate;
	private JLabel lblEndDate;
	private JLabel lblLastReccurence;
	private JButton btnCancel;
	private JButton btnSubmit;
	private JLabel lblReccurence;
	private JSpinner spinner;
	private JLabel lblWeeks;
	private JTextField txtRoomid;
	private JLabel lblRoomId;


	/**
	 * Create the panel.
	 */
	public EventAddView() {
		this.setSize(640, 480);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblEventManagement = new JLabel("Event Management");
		lblEventManagement.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		GridBagConstraints gbc_lblEventManagement = new GridBagConstraints();
		gbc_lblEventManagement.insets = new Insets(0, 0, 5, 5);
		gbc_lblEventManagement.gridx = 5;
		gbc_lblEventManagement.gridy = 1;
		add(lblEventManagement, gbc_lblEventManagement);
		
		JLabel lblFillOutThe = new JLabel("Fill out the form to add an event :");
		GridBagConstraints gbc_lblFillOutThe = new GridBagConstraints();
		gbc_lblFillOutThe.insets = new Insets(0, 0, 5, 5);
		gbc_lblFillOutThe.gridx = 5;
		gbc_lblFillOutThe.gridy = 3;
		add(lblFillOutThe, gbc_lblFillOutThe);
		
		lblEventname = new JLabel("EventName :");
		GridBagConstraints gbc_lblEventname = new GridBagConstraints();
		gbc_lblEventname.anchor = GridBagConstraints.EAST;
		gbc_lblEventname.insets = new Insets(0, 0, 5, 5);
		gbc_lblEventname.gridx = 3;
		gbc_lblEventname.gridy = 5;
		add(lblEventname, gbc_lblEventname);
		
		txtEventName = new JTextField();
		txtEventName.setText("Event name");
		GridBagConstraints gbc_txtEventName = new GridBagConstraints();
		gbc_txtEventName.insets = new Insets(0, 0, 5, 5);
		gbc_txtEventName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEventName.gridx = 5;
		gbc_txtEventName.gridy = 5;
		add(txtEventName, gbc_txtEventName);
		txtEventName.setColumns(10);
		
		lblActivityName = new JLabel("Activity Name :");
		GridBagConstraints gbc_lblActivityName = new GridBagConstraints();
		gbc_lblActivityName.anchor = GridBagConstraints.EAST;
		gbc_lblActivityName.insets = new Insets(0, 0, 5, 5);
		gbc_lblActivityName.gridx = 3;
		gbc_lblActivityName.gridy = 6;
		add(lblActivityName, gbc_lblActivityName);
		
		txtActivityName = new JTextField();
		txtActivityName.setText("Activity Name");
		GridBagConstraints gbc_txtActivityName = new GridBagConstraints();
		gbc_txtActivityName.insets = new Insets(0, 0, 5, 5);
		gbc_txtActivityName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtActivityName.gridx = 5;
		gbc_txtActivityName.gridy = 6;
		add(txtActivityName, gbc_txtActivityName);
		txtActivityName.setColumns(10);
		
		lblRoomId = new JLabel("Room ID :");
		GridBagConstraints gbc_lblRoomId = new GridBagConstraints();
		gbc_lblRoomId.anchor = GridBagConstraints.EAST;
		gbc_lblRoomId.insets = new Insets(0, 0, 5, 5);
		gbc_lblRoomId.gridx = 3;
		gbc_lblRoomId.gridy = 7;
		add(lblRoomId, gbc_lblRoomId);
		
		txtRoomid = new JTextField();
		txtRoomid.setText("RoomID");
		GridBagConstraints gbc_txtRoomid = new GridBagConstraints();
		gbc_txtRoomid.insets = new Insets(0, 0, 5, 5);
		gbc_txtRoomid.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtRoomid.gridx = 5;
		gbc_txtRoomid.gridy = 7;
		add(txtRoomid, gbc_txtRoomid);
		txtRoomid.setColumns(10);
		
		lblContributorFirstname = new JLabel("Contributor FirstName :");
		GridBagConstraints gbc_lblContributorFirstname = new GridBagConstraints();
		gbc_lblContributorFirstname.anchor = GridBagConstraints.EAST;
		gbc_lblContributorFirstname.insets = new Insets(0, 0, 5, 5);
		gbc_lblContributorFirstname.gridx = 3;
		gbc_lblContributorFirstname.gridy = 8;
		add(lblContributorFirstname, gbc_lblContributorFirstname);
		
		txtContributorName = new JTextField();
		txtContributorName.setText("Contributor Firstname");
		GridBagConstraints gbc_txtContributorName = new GridBagConstraints();
		gbc_txtContributorName.insets = new Insets(0, 0, 5, 5);
		gbc_txtContributorName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtContributorName.gridx = 5;
		gbc_txtContributorName.gridy = 8;
		add(txtContributorName, gbc_txtContributorName);
		txtContributorName.setColumns(10);
		
		lblContributorName = new JLabel("Contributor Name :");
		GridBagConstraints gbc_lblContributorName = new GridBagConstraints();
		gbc_lblContributorName.anchor = GridBagConstraints.EAST;
		gbc_lblContributorName.insets = new Insets(0, 0, 5, 5);
		gbc_lblContributorName.gridx = 3;
		gbc_lblContributorName.gridy = 9;
		add(lblContributorName, gbc_lblContributorName);
		
		txtContributorName_1 = new JTextField();
		txtContributorName_1.setText("Contributor Name");
		GridBagConstraints gbc_txtContributorName_1 = new GridBagConstraints();
		gbc_txtContributorName_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtContributorName_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtContributorName_1.gridx = 5;
		gbc_txtContributorName_1.gridy = 9;
		add(txtContributorName_1, gbc_txtContributorName_1);
		txtContributorName_1.setColumns(10);
		
		lblBeginDate = new JLabel("Begin Date :");
		GridBagConstraints gbc_lblBeginDate = new GridBagConstraints();
		gbc_lblBeginDate.anchor = GridBagConstraints.EAST;
		gbc_lblBeginDate.insets = new Insets(0, 0, 5, 5);
		gbc_lblBeginDate.gridx = 3;
		gbc_lblBeginDate.gridy = 10;
		add(lblBeginDate, gbc_lblBeginDate);
		
		txtBeginDate = new JTextField();
		txtBeginDate.setText("YYYY-MM-DD");
		GridBagConstraints gbc_txtBeginDate = new GridBagConstraints();
		gbc_txtBeginDate.insets = new Insets(0, 0, 5, 5);
		gbc_txtBeginDate.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBeginDate.gridx = 5;
		gbc_txtBeginDate.gridy = 10;
		add(txtBeginDate, gbc_txtBeginDate);
		txtBeginDate.setColumns(10);
		
		lblEndDate = new JLabel("End Date :");
		GridBagConstraints gbc_lblEndDate = new GridBagConstraints();
		gbc_lblEndDate.anchor = GridBagConstraints.EAST;
		gbc_lblEndDate.insets = new Insets(0, 0, 5, 5);
		gbc_lblEndDate.gridx = 3;
		gbc_lblEndDate.gridy = 11;
		add(lblEndDate, gbc_lblEndDate);
		
		txtEndDate = new JTextField();
		txtEndDate.setText("YYYY-MM-DD");
		GridBagConstraints gbc_txtEndDate = new GridBagConstraints();
		gbc_txtEndDate.insets = new Insets(0, 0, 5, 5);
		gbc_txtEndDate.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEndDate.gridx = 5;
		gbc_txtEndDate.gridy = 11;
		add(txtEndDate, gbc_txtEndDate);
		txtEndDate.setColumns(10);
		
		lblReccurence = new JLabel("Reccurence :");
		GridBagConstraints gbc_lblReccurence = new GridBagConstraints();
		gbc_lblReccurence.anchor = GridBagConstraints.EAST;
		gbc_lblReccurence.insets = new Insets(0, 0, 5, 5);
		gbc_lblReccurence.gridx = 3;
		gbc_lblReccurence.gridy = 12;
		add(lblReccurence, gbc_lblReccurence);
		
		
		Object[] values = {0,1,2,3,4};
		SpinnerModel spinnerModel = new SpinnerListModel(values);
		spinner = new JSpinner(spinnerModel);
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.insets = new Insets(0, 0, 5, 5);
		gbc_spinner.gridx = 5;
		gbc_spinner.gridy = 12;
		add(spinner, gbc_spinner);
		
		lblWeeks = new JLabel("Weeks");
		GridBagConstraints gbc_lblWeeks = new GridBagConstraints();
		gbc_lblWeeks.gridwidth = 2;
		gbc_lblWeeks.insets = new Insets(0, 0, 5, 5);
		gbc_lblWeeks.gridx = 6;
		gbc_lblWeeks.gridy = 12;
		add(lblWeeks, gbc_lblWeeks);
		
		lblLastReccurence = new JLabel("Last Reccurence :");
		GridBagConstraints gbc_lblLastReccurence = new GridBagConstraints();
		gbc_lblLastReccurence.anchor = GridBagConstraints.EAST;
		gbc_lblLastReccurence.insets = new Insets(0, 0, 5, 5);
		gbc_lblLastReccurence.gridx = 3;
		gbc_lblLastReccurence.gridy = 13;
		add(lblLastReccurence, gbc_lblLastReccurence);
		
		txtLastReccurence = new JTextField();
		txtLastReccurence.setText("YYYY-MM-DD");
		GridBagConstraints gbc_txtLastReccurence = new GridBagConstraints();
		gbc_txtLastReccurence.insets = new Insets(0, 0, 5, 5);
		gbc_txtLastReccurence.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLastReccurence.gridx = 5;
		gbc_txtLastReccurence.gridy = 13;
		add(txtLastReccurence, gbc_txtLastReccurence);
		txtLastReccurence.setColumns(10);
		
		btnCancel = new JButton("Cancel");
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.anchor = GridBagConstraints.EAST;
		gbc_btnCancel.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancel.gridx = 3;
		gbc_btnCancel.gridy = 15;
		add(btnCancel, gbc_btnCancel);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(this);
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.anchor = GridBagConstraints.WEST;
		gbc_btnSubmit.insets = new Insets(0, 0, 0, 5);
		gbc_btnSubmit.gridx = 5;
		gbc_btnSubmit.gridy = 15;
		add(btnSubmit, gbc_btnSubmit);
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new EventMainView());
			}});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (verifDate(txtBeginDate.getText()) && verifDate(txtEndDate.getText()) ){
			//TODO creer Event
			Date beginDate = null;
			Date endDate = null;

			beginDate = Date.valueOf(txtBeginDate.getText());
			//System.out.println("begin date: "+beginDate);
			endDate = Date.valueOf(txtEndDate.getText());
			//System.out.println("end date: "+endDate);
			
			Date lastRecurrence = null;
			if(!((int)spinner.getValue() == 0) && verifDate(txtLastReccurence.getText())){
				
				lastRecurrence = Date.valueOf(txtLastReccurence.getText());
			}
			
			TimeSlot aTimeSlot = new TimeSlot(beginDate,endDate,(int)spinner.getValue(),lastRecurrence);
			boolean isAdded = EventFacade.getFacade().addEvent(txtEventName.getText(), Integer.parseInt(txtRoomid.getText()), aTimeSlot, txtActivityName.getText(), txtContributorName.getText(), txtContributorName_1.getText());
			if(isAdded){
				//Information popup
				JOptionPane.showMessageDialog(null, "Event Added! :) :)", "Success", JOptionPane.INFORMATION_MESSAGE);
				MainFrame.getMainFrame().setMainPanel(new EventMainView());
			}
			else{
				//Error popup 
				JOptionPane.showMessageDialog(null, "The Event doesn't add in the database!", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}else{
			JOptionPane.showMessageDialog(null, "An invalid date was specified", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	public boolean verifDate(String date){
		String[] stringDate = date.split("-");
		if (stringDate.length == 3){		
			if ((stringDate[0].length() == 4)&&(stringDate[1].length() == 2)&&(stringDate[2].length() == 2)){
				
				int[] intDate = new int[3];
				for (int i = 0; i < stringDate.length; i++){
					try{
						intDate[i] = Integer.parseInt(stringDate[i]);
					}catch(NumberFormatException e){
						return false;
					}
				}
				
				if (intDate[0] > 2014 && intDate[1] <= 12 && intDate[2] <= 31){
					return true;
				}else{
					return false;
				}
			}else{
				return false;
			}
		
		}else{
			return false;
		}
	}

}
