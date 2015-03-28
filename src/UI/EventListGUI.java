package UI;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import Data.EventTableModel;
import Functions.EventFacade;

public class EventListGUI extends JPanel {
	private JTable eventsTable;
	private EventTableModel model;
	private EventFacade facade;
	/**
	 * Create the panel.
	 */
	public EventListGUI() {
		this.facade = EventFacade.getFacade();
		this.model = new EventTableModel(facade.getEventsForUser());
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel label = new JLabel("Events");
		springLayout.putConstraint(SpringLayout.NORTH, label, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, label, 283, SpringLayout.WEST, this);
		add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 6, SpringLayout.SOUTH, label);
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, 470, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 630, SpringLayout.WEST, this);
		add(scrollPane);
		
		eventsTable = new JTable(model);
		scrollPane.setViewportView(eventsTable);
	}
}
