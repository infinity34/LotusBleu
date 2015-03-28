package UI;

import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTable;

import Data.Event;
import Functions.EventFacade;

import javax.swing.JScrollPane;
import javax.swing.JButton;

public class EventDisplayView extends JPanel implements ActionListener {
	private JTable table;
	private final JScrollPane scrollPane = new JScrollPane();

	/**
	 * Create the panel.
	 */
	public EventDisplayView() {
		this.setSize(640, 480);
		setLayout(null);
		
		JLabel lblEventManagement = new JLabel("Event Management");
		lblEventManagement.setBounds(233, 13, 169, 26);
		lblEventManagement.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		add(lblEventManagement);
		
		ArrayList<Event> events = EventFacade.getFacade().getEvents();
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
		scrollPane.setBounds(0, 52, 640, 282);
		add(scrollPane);
		table = new JTable(data,columnNames);
		scrollPane.setViewportView(table);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(this);
		btnCancel.setBounds(271, 347, 97, 25);
		add(btnCancel);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		MainFrame.getMainFrame().setMainPanel(new EventMainView());
		
	}
}
