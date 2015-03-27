package UI;

import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EventMainView extends JPanel {

	/**
	 * Create the panel.
	 */
	public EventMainView() {
		this.setSize(640, 480);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblEventManagement = new JLabel("Event Management");
		lblEventManagement.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		GridBagConstraints gbc_lblEventManagement = new GridBagConstraints();
		gbc_lblEventManagement.insets = new Insets(0, 0, 5, 5);
		gbc_lblEventManagement.gridx = 5;
		gbc_lblEventManagement.gridy = 1;
		add(lblEventManagement, gbc_lblEventManagement);
		
		JLabel lblChooseTheAction = new JLabel("Choose the action you will perform");
		GridBagConstraints gbc_lblChooseTheAction = new GridBagConstraints();
		gbc_lblChooseTheAction.insets = new Insets(0, 0, 5, 5);
		gbc_lblChooseTheAction.gridx = 5;
		gbc_lblChooseTheAction.gridy = 3;
		add(lblChooseTheAction, gbc_lblChooseTheAction);
		
		JButton btnAddAnEvent = new JButton("Add an Event");
		GridBagConstraints gbc_btnAddAnEvent = new GridBagConstraints();
		gbc_btnAddAnEvent.insets = new Insets(0, 0, 5, 5);
		gbc_btnAddAnEvent.gridx = 5;
		gbc_btnAddAnEvent.gridy = 5;
		add(btnAddAnEvent, gbc_btnAddAnEvent);
		
		JButton btnUpdateAnEvent = new JButton("Update an Event");
		GridBagConstraints gbc_btnUpdateAnEvent = new GridBagConstraints();
		gbc_btnUpdateAnEvent.insets = new Insets(0, 0, 5, 5);
		gbc_btnUpdateAnEvent.gridx = 5;
		gbc_btnUpdateAnEvent.gridy = 6;
		add(btnUpdateAnEvent, gbc_btnUpdateAnEvent);
		
		JButton btnDeleteAnEvent = new JButton("Delete an Event");
		GridBagConstraints gbc_btnDeleteAnEvent = new GridBagConstraints();
		gbc_btnDeleteAnEvent.insets = new Insets(0, 0, 5, 5);
		gbc_btnDeleteAnEvent.gridx = 5;
		gbc_btnDeleteAnEvent.gridy = 7;
		add(btnDeleteAnEvent, gbc_btnDeleteAnEvent);
		
		JButton btnDisplayEvents = new JButton("Display events");
		GridBagConstraints gbc_btnDisplayEvents = new GridBagConstraints();
		gbc_btnDisplayEvents.insets = new Insets(0, 0, 0, 5);
		gbc_btnDisplayEvents.gridx = 5;
		gbc_btnDisplayEvents.gridy = 8;
		add(btnDisplayEvents, gbc_btnDisplayEvents);

		btnAddAnEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new EventAddView());
			}
		});
		
		btnUpdateAnEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new EventUpdateView());
			}
		});
		
		btnDeleteAnEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new EventDeleteView());
			}
		});
		
		btnDisplayEvents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new EventDisplayView());
			}
		});
		
	}

}
