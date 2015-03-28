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
import javax.swing.JRadioButton;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;

import Data.Activity;
import Data.Event;
import Data.TimeSlot;
import Functions.EventFacade;

import javax.swing.JButton;
import javax.swing.JSpinner;

public class EventUpdateLastView extends JPanel {
	private JTextField textNewEventName;
	private JTextField textNewActivityName;
	private JTextField textNewContributorFirstName;
	private JTextField textNewContributorName;
	private JTextField textNewBeginDate;
	private JTextField textNewEndDate;
	private JTextField textNewLastReccurence;
	private Event eventToUpdate;
	
	private JSpinner spinner;
	private JTextField textNewRoomID;
	/**
	 * Create the panel.
	 */
	public EventUpdateLastView(final Event eventToUpdate) {
		this.eventToUpdate = eventToUpdate;
		this.setSize(640, 480);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblEventManagement = new JLabel("Event Management");
		lblEventManagement.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		GridBagConstraints gbc_lblEventManagement = new GridBagConstraints();
		gbc_lblEventManagement.insets = new Insets(0, 0, 5, 5);
		gbc_lblEventManagement.gridx = 5;
		gbc_lblEventManagement.gridy = 1;
		add(lblEventManagement, gbc_lblEventManagement);
		
		JLabel lblUpdateInformationsOf = new JLabel("Update informations of");
		GridBagConstraints gbc_lblUpdateInformationsOf = new GridBagConstraints();
		gbc_lblUpdateInformationsOf.insets = new Insets(0, 0, 5, 5);
		gbc_lblUpdateInformationsOf.gridx = 5;
		gbc_lblUpdateInformationsOf.gridy = 3;
		add(lblUpdateInformationsOf, gbc_lblUpdateInformationsOf);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setText(this.eventToUpdate.getEventName());
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 5;
		gbc_lblNewLabel.gridy = 4;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblEventName = new JLabel("Event Name :");
		GridBagConstraints gbc_lblEventName = new GridBagConstraints();
		gbc_lblEventName.anchor = GridBagConstraints.EAST;
		gbc_lblEventName.insets = new Insets(0, 0, 5, 5);
		gbc_lblEventName.gridx = 3;
		gbc_lblEventName.gridy = 6;
		add(lblEventName, gbc_lblEventName);
		
		textNewEventName = new JTextField();
		GridBagConstraints gbc_textNewEventName = new GridBagConstraints();
		gbc_textNewEventName.insets = new Insets(0, 0, 5, 5);
		gbc_textNewEventName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNewEventName.gridx = 5;
		gbc_textNewEventName.gridy = 6;
		add(textNewEventName, gbc_textNewEventName);
		textNewEventName.setColumns(10);
		
		JLabel lblActivityName = new JLabel("Activity Name :");
		GridBagConstraints gbc_lblActivityName = new GridBagConstraints();
		gbc_lblActivityName.anchor = GridBagConstraints.EAST;
		gbc_lblActivityName.insets = new Insets(0, 0, 5, 5);
		gbc_lblActivityName.gridx = 3;
		gbc_lblActivityName.gridy = 7;
		add(lblActivityName, gbc_lblActivityName);
		
		textNewActivityName = new JTextField();
		GridBagConstraints gbc_textNewActivityName = new GridBagConstraints();
		gbc_textNewActivityName.insets = new Insets(0, 0, 5, 5);
		gbc_textNewActivityName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNewActivityName.gridx = 5;
		gbc_textNewActivityName.gridy = 7;
		add(textNewActivityName, gbc_textNewActivityName);
		textNewActivityName.setColumns(10);
		
		JLabel lblRoomId = new JLabel("Room ID : ");
		GridBagConstraints gbc_lblRoomId = new GridBagConstraints();
		gbc_lblRoomId.anchor = GridBagConstraints.EAST;
		gbc_lblRoomId.insets = new Insets(0, 0, 5, 5);
		gbc_lblRoomId.gridx = 3;
		gbc_lblRoomId.gridy = 8;
		add(lblRoomId, gbc_lblRoomId);
		
		textNewRoomID = new JTextField();
		GridBagConstraints gbc_textNewRoomID = new GridBagConstraints();
		gbc_textNewRoomID.insets = new Insets(0, 0, 5, 5);
		gbc_textNewRoomID.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNewRoomID.gridx = 5;
		gbc_textNewRoomID.gridy = 8;
		add(textNewRoomID, gbc_textNewRoomID);
		textNewRoomID.setColumns(10);
		
		JLabel lblContributorFirstname = new JLabel("Contributor Firstname :");
		GridBagConstraints gbc_lblContributorFirstname = new GridBagConstraints();
		gbc_lblContributorFirstname.anchor = GridBagConstraints.EAST;
		gbc_lblContributorFirstname.insets = new Insets(0, 0, 5, 5);
		gbc_lblContributorFirstname.gridx = 3;
		gbc_lblContributorFirstname.gridy = 9;
		add(lblContributorFirstname, gbc_lblContributorFirstname);
		
		textNewContributorFirstName = new JTextField();
		GridBagConstraints gbc_textNewContributorFirstName = new GridBagConstraints();
		gbc_textNewContributorFirstName.insets = new Insets(0, 0, 5, 5);
		gbc_textNewContributorFirstName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNewContributorFirstName.gridx = 5;
		gbc_textNewContributorFirstName.gridy = 9;
		add(textNewContributorFirstName, gbc_textNewContributorFirstName);
		textNewContributorFirstName.setColumns(10);
		
		JLabel lblContributorName = new JLabel("Contributor Name :");
		GridBagConstraints gbc_lblContributorName = new GridBagConstraints();
		gbc_lblContributorName.anchor = GridBagConstraints.EAST;
		gbc_lblContributorName.insets = new Insets(0, 0, 5, 5);
		gbc_lblContributorName.gridx = 3;
		gbc_lblContributorName.gridy = 10;
		add(lblContributorName, gbc_lblContributorName);
		
		textNewContributorName = new JTextField();
		GridBagConstraints gbc_textNewContributorName = new GridBagConstraints();
		gbc_textNewContributorName.insets = new Insets(0, 0, 5, 5);
		gbc_textNewContributorName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNewContributorName.gridx = 5;
		gbc_textNewContributorName.gridy = 10;
		add(textNewContributorName, gbc_textNewContributorName);
		textNewContributorName.setColumns(10);
		
		JLabel lblBeginDate = new JLabel("Begin Date :");
		GridBagConstraints gbc_lblBeginDate = new GridBagConstraints();
		gbc_lblBeginDate.anchor = GridBagConstraints.EAST;
		gbc_lblBeginDate.insets = new Insets(0, 0, 5, 5);
		gbc_lblBeginDate.gridx = 3;
		gbc_lblBeginDate.gridy = 11;
		add(lblBeginDate, gbc_lblBeginDate);
		
		textNewBeginDate = new JTextField();
		GridBagConstraints gbc_textNewBeginDate = new GridBagConstraints();
		gbc_textNewBeginDate.insets = new Insets(0, 0, 5, 5);
		gbc_textNewBeginDate.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNewBeginDate.gridx = 5;
		gbc_textNewBeginDate.gridy = 11;
		add(textNewBeginDate, gbc_textNewBeginDate);
		textNewBeginDate.setColumns(10);
		
		JLabel lblEndDate = new JLabel("End Date :");
		GridBagConstraints gbc_lblEndDate = new GridBagConstraints();
		gbc_lblEndDate.anchor = GridBagConstraints.EAST;
		gbc_lblEndDate.insets = new Insets(0, 0, 5, 5);
		gbc_lblEndDate.gridx = 3;
		gbc_lblEndDate.gridy = 12;
		add(lblEndDate, gbc_lblEndDate);
		
		textNewEndDate = new JTextField();
		GridBagConstraints gbc_textNewEndDate = new GridBagConstraints();
		gbc_textNewEndDate.insets = new Insets(0, 0, 5, 5);
		gbc_textNewEndDate.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNewEndDate.gridx = 5;
		gbc_textNewEndDate.gridy = 12;
		add(textNewEndDate, gbc_textNewEndDate);
		textNewEndDate.setColumns(10);
		
		JLabel lblReccurence = new JLabel("Reccurence :");
		GridBagConstraints gbc_lblReccurence = new GridBagConstraints();
		gbc_lblReccurence.insets = new Insets(0, 0, 5, 5);
		gbc_lblReccurence.gridx = 3;
		gbc_lblReccurence.gridy = 13;
		add(lblReccurence, gbc_lblReccurence);
		
		Object[] values = {0,1,2,3,4};
		SpinnerModel spinnerModel = new SpinnerListModel(values);
		spinner = new JSpinner(spinnerModel);
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.insets = new Insets(0, 0, 5, 5);
		gbc_spinner.gridx = 5;
		gbc_spinner.gridy = 13;
		add(spinner, gbc_spinner);
		
		JLabel lblWeeks = new JLabel("Weeks");
		GridBagConstraints gbc_lblWeeks = new GridBagConstraints();
		gbc_lblWeeks.insets = new Insets(0, 0, 5, 5);
		gbc_lblWeeks.gridx = 6;
		gbc_lblWeeks.gridy = 13;
		add(lblWeeks, gbc_lblWeeks);
		
		JLabel lblLastReccurence = new JLabel("Last Reccurence :");
		GridBagConstraints gbc_lblLastReccurence = new GridBagConstraints();
		gbc_lblLastReccurence.anchor = GridBagConstraints.EAST;
		gbc_lblLastReccurence.insets = new Insets(0, 0, 5, 5);
		gbc_lblLastReccurence.gridx = 3;
		gbc_lblLastReccurence.gridy = 14;
		add(lblLastReccurence, gbc_lblLastReccurence);
		
		textNewLastReccurence = new JTextField();
		GridBagConstraints gbc_textNewLastReccurence = new GridBagConstraints();
		gbc_textNewLastReccurence.insets = new Insets(0, 0, 5, 5);
		gbc_textNewLastReccurence.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNewLastReccurence.gridx = 5;
		gbc_textNewLastReccurence.gridy = 14;
		add(textNewLastReccurence, gbc_textNewLastReccurence);
		textNewLastReccurence.setColumns(10);
		
		//Change text with eventtoupdate values
		textNewEventName.setText(this.eventToUpdate.getEventName());
		textNewActivityName.setText(this.eventToUpdate.getEventActivity().getName());
		textNewContributorFirstName.setText(this.eventToUpdate.getEventContributorFirstname());
		textNewContributorName.setText(this.eventToUpdate.getEventContributorName());
		spinner.setValue(this.eventToUpdate.getEventTimeSlot().isRecurrence());
		textNewBeginDate.setText(this.eventToUpdate.getEventTimeSlot().getBeginDate().toString());
		textNewEndDate.setText(this.eventToUpdate.getEventTimeSlot().getEndDate().toString());
		textNewRoomID.setText(Integer.toString(this.eventToUpdate.getEventRoomID()));
		
		if(this.eventToUpdate.getEventTimeSlot().isRecurrence() != 0){
			textNewLastReccurence.setText(this.eventToUpdate.getEventTimeSlot().getLastReccurence().toString());
		}
		
		JButton btnCancel = new JButton("Cancel");
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancel.gridx = 3;
		gbc_btnCancel.gridy = 15;
		add(btnCancel, gbc_btnCancel);
		
		JButton btnSubmit = new JButton("Submit");
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.insets = new Insets(0, 0, 0, 5);
		gbc_btnSubmit.gridx = 5;
		gbc_btnSubmit.gridy = 15;
		add(btnSubmit, gbc_btnSubmit);
		
		//Listeners
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new EventMainView());
			}});
		
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (verifDate(textNewBeginDate.getText()) && verifDate(textNewEndDate.getText()) ){
					//TODO creer Event
					Date beginDate = null;
					Date endDate = null;

					beginDate = Date.valueOf(textNewBeginDate.getText());
					//System.out.println("begin date: "+beginDate);
					endDate = Date.valueOf(textNewEndDate.getText());
					//System.out.println("end date: "+endDate);
					
					Date lastRecurrence = null;
					if(!((int)spinner.getValue() == 0) && verifDate(textNewLastReccurence.getText())){
						
						lastRecurrence = Date.valueOf(textNewLastReccurence.getText());
					}
					TimeSlot aTimeSlot = new TimeSlot(beginDate,endDate,(int)spinner.getValue(),lastRecurrence);
					boolean isUpdated = EventFacade.getFacade().updateEvent(eventToUpdate,textNewEventName.getText(), Integer.parseInt(textNewRoomID.getText()), aTimeSlot, textNewActivityName.getText(), textNewContributorName.getText(), textNewContributorFirstName.getText());
					if(isUpdated){
						//Information popup
						JOptionPane.showMessageDialog(null, "Event Updated! :) :)", "Success", JOptionPane.INFORMATION_MESSAGE);
						MainFrame.getMainFrame().setMainPanel(new EventMainView());
					}
					else{
						//Error popup 
						JOptionPane.showMessageDialog(null, "The Event wasn't updated!", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}else{
					JOptionPane.showMessageDialog(null, "An invalid date was specified", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}});
		
		

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
