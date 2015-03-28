package UI;

import java.awt.BorderLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import Data.EventTableModel;
import Functions.EventFacade;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, 392, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 630, SpringLayout.WEST, this);
		add(scrollPane);
		
		eventsTable = new JTable(model);
		scrollPane.setViewportView(eventsTable);
		
		JButton btnInscription = new JButton("Inscription");
		springLayout.putConstraint(SpringLayout.NORTH, btnInscription, 6, SpringLayout.SOUTH, scrollPane);
		springLayout.putConstraint(SpringLayout.WEST, btnInscription, 10, SpringLayout.WEST, this);
		btnInscription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vous inscrire ?", "Inscription", JOptionPane.YES_NO_OPTION);
				if(option == JOptionPane.YES_OPTION){
					facade.registerToEvent(model.getEvents().get(eventsTable.getSelectedRow()));
				}
			}
		});
		add(btnInscription);
		
		JButton btnDetails = new JButton("Details");
		btnDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new EventDetailsView(model.getEvents().get(eventsTable.getSelectedRow())));
			}
		});
		springLayout.putConstraint(SpringLayout.EAST, btnInscription, -6, SpringLayout.WEST, btnDetails);
		springLayout.putConstraint(SpringLayout.NORTH, btnDetails, 6, SpringLayout.SOUTH, scrollPane);
		springLayout.putConstraint(SpringLayout.WEST, btnDetails, 330, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnDetails, 0, SpringLayout.EAST, scrollPane);
		add(btnDetails);
	}
}
