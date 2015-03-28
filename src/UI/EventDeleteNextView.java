package UI;

import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import java.awt.ItemSelectable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import Data.Event;
import Functions.EventFacade;

public class EventDeleteNextView extends JPanel {

	private ArrayList<Event> events;
	private String eventSelected;
	private JComboBox comboBox;
	
	/**
	 * Create the panel.
	 */
	public EventDeleteNextView(ArrayList<Event> events) {
		this.events = events;
		this.setSize(640, 480);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblEventManagement = new JLabel("Event Management");
		lblEventManagement.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		GridBagConstraints gbc_lblEventManagement = new GridBagConstraints();
		gbc_lblEventManagement.insets = new Insets(0, 0, 5, 5);
		gbc_lblEventManagement.gridx = 5;
		gbc_lblEventManagement.gridy = 1;
		add(lblEventManagement, gbc_lblEventManagement);
		
		JLabel lblChooseTheEvent = new JLabel("Choose the event you want to delete :");
		GridBagConstraints gbc_lblChooseTheEvent = new GridBagConstraints();
		gbc_lblChooseTheEvent.anchor = GridBagConstraints.WEST;
		gbc_lblChooseTheEvent.gridwidth = 2;
		gbc_lblChooseTheEvent.insets = new Insets(0, 0, 5, 5);
		gbc_lblChooseTheEvent.gridx = 5;
		gbc_lblChooseTheEvent.gridy = 4;
		add(lblChooseTheEvent, gbc_lblChooseTheEvent);
		
		int nbEvents = this.events.size();
		String[] eventsName = new String[nbEvents];
		for(int i = 0; i<nbEvents; i++){
			eventsName[i] = events.get(i).toString();
		}
		
		this.comboBox = new JComboBox(eventsName);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 5;
		gbc_comboBox.gridy = 6;
		add(comboBox, gbc_comboBox);
		
		/*
		ItemListener itemListener = new ItemListener() {
		      public void itemStateChanged(ItemEvent itemEvent) {
		        int state = itemEvent.getStateChange();
		        //System.out.println((state == ItemEvent.SELECTED) ? "Selected" : "Deselected");
		        //System.out.println("Item: " + itemEvent.getItem());
		        ItemSelectable is = itemEvent.getItemSelectable();
		        eventSelected = selectedString(is);
		        //System.out.println(" Selected: " + eventSelected);
		      }
		    };
		comboBox.addItemListener(itemListener);
		*/
		
		JButton btnCancel = new JButton("Cancel");
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancel.gridx = 4;
		gbc_btnCancel.gridy = 8;
		add(btnCancel, gbc_btnCancel);
		
		JButton btnSubmit = new JButton("Submit");
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.insets = new Insets(0, 0, 0, 5);
		gbc_btnSubmit.gridx = 6;
		gbc_btnSubmit.gridy = 8;
		add(btnSubmit, gbc_btnSubmit);
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new EventMainView());
			}});
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object objectEvent = comboBox.getSelectedItem(); 
				eventSelected = (String) objectEvent;
				Event eventToDelete = EventFacade.getFacade().getAnEventWithID(getEventIDinString(eventSelected));
				if(eventToDelete != null){
					boolean isDeleted = EventFacade.getFacade().removeEvent(eventToDelete);
					if(isDeleted){
						//Information popup
						JOptionPane.showMessageDialog(null, "Event Deleted! :)", "Success", JOptionPane.INFORMATION_MESSAGE);
						MainFrame.getMainFrame().setMainPanel(new EventMainView());
					}
					else{
						//Error popup 
						JOptionPane.showMessageDialog(null, "The event doesn't deleted! :(", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
				else{
					//Error popup 
					JOptionPane.showMessageDialog(null, "The event doesn't deleted! :(", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}});
	}
	
	public ArrayList<Event> getEvents(){
		return this.events;
	}
	
	public void setEvents(ArrayList<Event> alist){
		this.events = alist;
	}
	
	public int getEventIDinString(String eventDescription){
		String[] stringEvent = eventDescription.split(":");
		return  Integer.parseInt(stringEvent[0]);
	}
	

}
