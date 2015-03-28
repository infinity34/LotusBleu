package UI;

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

@SuppressWarnings("serial")
public class MyEventsGUI extends JPanel {
	private JTable eventsTable;
	private EventTableModel model;
	private EventFacade facade;
	/**
	 * Create the panel.
	 */
	public MyEventsGUI() {
		this.setSize(640, 480);
		this.facade = EventFacade.getFacade();
		this.model = new EventTableModel(facade.getMyEvents());
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel label = new JLabel("Events");
		springLayout.putConstraint(SpringLayout.NORTH, label, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, label, 283, SpringLayout.WEST, this);
		add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 6, SpringLayout.SOUTH, label);
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 630, SpringLayout.WEST, this);
		add(scrollPane);
		
		eventsTable = new JTable(model);
		scrollPane.setViewportView(eventsTable);
		
		JButton btnInscription = new JButton("Cancel Inscription");
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, -6, SpringLayout.NORTH, btnInscription);
		springLayout.putConstraint(SpringLayout.WEST, btnInscription, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnInscription, -10, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnInscription, -316, SpringLayout.EAST, this);
		btnInscription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int option = JOptionPane.showConfirmDialog(null, "Do you to cancel your inscription?", "Cancel", JOptionPane.YES_NO_OPTION);
				if(option == JOptionPane.YES_OPTION){
					facade.cancelRegistrationToEvent(model.getEvents().get(eventsTable.getSelectedRow()));
					model = new EventTableModel(facade.getMyEvents());
					eventsTable.setModel(model);
					model.fireTableDataChanged();
				}
			}
		});
		add(btnInscription);
		
		JButton btnDetails = new JButton("Details");
		springLayout.putConstraint(SpringLayout.NORTH, btnDetails, 0, SpringLayout.NORTH, btnInscription);
		springLayout.putConstraint(SpringLayout.WEST, btnDetails, 6, SpringLayout.EAST, btnInscription);
		springLayout.putConstraint(SpringLayout.EAST, btnDetails, -10, SpringLayout.EAST, this);
		btnDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new EventDetailsView(model.getEvents().get(eventsTable.getSelectedRow())));
			}
		});
		add(btnDetails);
	}
}
