package UI;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;

import Data.Event;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EventDetailsView extends JPanel {

	private Event event;
	/**
	 * Create the panel.
	 */
	public EventDetailsView(Event event) {
		this.event = event;
		this.setSize(640, 480);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblEventName = new JLabel("Event name :");
		springLayout.putConstraint(SpringLayout.NORTH, lblEventName, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblEventName, 20, SpringLayout.WEST, this);
		add(lblEventName);
		
		JLabel lblActivityName = new JLabel("Activity Name :");
		springLayout.putConstraint(SpringLayout.NORTH, lblActivityName, 6, SpringLayout.SOUTH, lblEventName);
		springLayout.putConstraint(SpringLayout.WEST, lblActivityName, 0, SpringLayout.WEST, lblEventName);
		add(lblActivityName);
		
		JLabel lblBeginDate = new JLabel("Begin date :");
		springLayout.putConstraint(SpringLayout.NORTH, lblBeginDate, 6, SpringLayout.SOUTH, lblActivityName);
		springLayout.putConstraint(SpringLayout.WEST, lblBeginDate, 0, SpringLayout.WEST, lblEventName);
		add(lblBeginDate);
		
		JLabel lblEndDate = new JLabel("End Date : ");
		springLayout.putConstraint(SpringLayout.NORTH, lblEndDate, 6, SpringLayout.SOUTH, lblBeginDate);
		springLayout.putConstraint(SpringLayout.WEST, lblEndDate, 0, SpringLayout.WEST, lblEventName);
		add(lblEndDate);
		
		JLabel lblContributorName = new JLabel("Contributor Name :");
		springLayout.putConstraint(SpringLayout.NORTH, lblContributorName, 6, SpringLayout.SOUTH, lblEndDate);
		springLayout.putConstraint(SpringLayout.WEST, lblContributorName, 0, SpringLayout.WEST, lblEventName);
		add(lblContributorName);
		
		JLabel lblContributorFirstname = new JLabel("Contributor Firstname :");
		springLayout.putConstraint(SpringLayout.NORTH, lblContributorFirstname, 6, SpringLayout.SOUTH, lblContributorName);
		springLayout.putConstraint(SpringLayout.WEST, lblContributorFirstname, 0, SpringLayout.WEST, lblEventName);
		add(lblContributorFirstname);
		
		JLabel contributorFTlbl = new JLabel(event.getEventContributorFirstname());
		springLayout.putConstraint(SpringLayout.NORTH, contributorFTlbl, 0, SpringLayout.NORTH, lblContributorFirstname);
		springLayout.putConstraint(SpringLayout.WEST, contributorFTlbl, 6, SpringLayout.EAST, lblContributorFirstname);
		add(contributorFTlbl);
		
		JLabel contributorNamelbl = new JLabel(event.getEventContributorName());
		springLayout.putConstraint(SpringLayout.WEST, contributorNamelbl, 0, SpringLayout.WEST, contributorFTlbl);
		springLayout.putConstraint(SpringLayout.SOUTH, contributorNamelbl, 0, SpringLayout.SOUTH, lblContributorName);
		add(contributorNamelbl);
		
		JLabel endDatelbl = new JLabel(event.getEventTimeSlot().getEndDate().toString());
		springLayout.putConstraint(SpringLayout.WEST, endDatelbl, 0, SpringLayout.WEST, contributorFTlbl);
		springLayout.putConstraint(SpringLayout.SOUTH, endDatelbl, 0, SpringLayout.SOUTH, lblEndDate);
		add(endDatelbl);
		
		JLabel begindatelbl = new JLabel(event.getEventTimeSlot().getBeginDate().toString());
		springLayout.putConstraint(SpringLayout.WEST, begindatelbl, 0, SpringLayout.WEST, contributorFTlbl);
		springLayout.putConstraint(SpringLayout.SOUTH, begindatelbl, 0, SpringLayout.SOUTH, lblBeginDate);
		add(begindatelbl);
		
		JLabel activityNamelbl = new JLabel(event.getEventActivity().getName());
		springLayout.putConstraint(SpringLayout.NORTH, activityNamelbl, 0, SpringLayout.NORTH, lblActivityName);
		springLayout.putConstraint(SpringLayout.WEST, activityNamelbl, 0, SpringLayout.WEST, contributorFTlbl);
		add(activityNamelbl);
		
		JLabel eventNamelbl = new JLabel(event.getEventName());
		springLayout.putConstraint(SpringLayout.NORTH, eventNamelbl, 0, SpringLayout.NORTH, lblEventName);
		springLayout.putConstraint(SpringLayout.WEST, eventNamelbl, 0, SpringLayout.WEST, contributorFTlbl);
		add(eventNamelbl);
		
		JButton btnBackToEvents = new JButton("Back to events");
		btnBackToEvents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new EventListGUI());
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnBackToEvents, 0, SpringLayout.NORTH, lblEventName);
		springLayout.putConstraint(SpringLayout.EAST, btnBackToEvents, -10, SpringLayout.EAST, this);
		add(btnBackToEvents);
	}

}
