package UI;
import Functions.CategoryFacade;
import Functions.RoomManagementFacade;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JTabbedPane;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTable;

public class RoomManagementGUI extends JPanel {

	private RoomManagementFacade roomManagementFacade;
	private JTextField roomMaxAttendeeTextfield;
	private JTextField roomAreaTextfield;
	private JTextField roomNameTextfield;
	private JTextField txtListAMettre;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public RoomManagementGUI() {
		this.roomManagementFacade = new RoomManagementFacade();
		this.setSize(640, 480);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		springLayout.putConstraint(SpringLayout.NORTH, tabbedPane, 20, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, tabbedPane, 66, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, tabbedPane, -27, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, tabbedPane, -21, SpringLayout.EAST, this);
		add(tabbedPane);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JPanel panelAddRoom = new JPanel();
		tabbedPane.addTab("add a room", null, panelAddRoom, null);
		SpringLayout sl_panelAddRoom = new SpringLayout();
		panelAddRoom.setLayout(sl_panelAddRoom);
		
		JLabel lblNewLabel = new JLabel("Type of the room");
		sl_panelAddRoom.putConstraint(SpringLayout.NORTH, lblNewLabel, 43, SpringLayout.NORTH, panelAddRoom);
		sl_panelAddRoom.putConstraint(SpringLayout.WEST, lblNewLabel, 46, SpringLayout.WEST, panelAddRoom);
		panelAddRoom.add(lblNewLabel);
		
		JLabel lblRoomName = new JLabel("Room name");
		sl_panelAddRoom.putConstraint(SpringLayout.NORTH, lblRoomName, 44, SpringLayout.SOUTH, lblNewLabel);
		sl_panelAddRoom.putConstraint(SpringLayout.WEST, lblRoomName, 0, SpringLayout.WEST, lblNewLabel);
		panelAddRoom.add(lblRoomName);
		
		JLabel lblRoomArea = new JLabel("Room area");
		sl_panelAddRoom.putConstraint(SpringLayout.NORTH, lblRoomArea, 45, SpringLayout.SOUTH, lblRoomName);
		sl_panelAddRoom.putConstraint(SpringLayout.WEST, lblRoomArea, 0, SpringLayout.WEST, lblNewLabel);
		panelAddRoom.add(lblRoomArea);
		
		JLabel lblMaximalNumberOf = new JLabel("Maximal number of attendee");
		sl_panelAddRoom.putConstraint(SpringLayout.NORTH, lblMaximalNumberOf, 46, SpringLayout.SOUTH, lblRoomArea);
		sl_panelAddRoom.putConstraint(SpringLayout.WEST, lblMaximalNumberOf, 0, SpringLayout.WEST, lblNewLabel);
		panelAddRoom.add(lblMaximalNumberOf);
		
		JButton btnAddARoom = new JButton("Add a room");
		sl_panelAddRoom.putConstraint(SpringLayout.SOUTH, btnAddARoom, -39, SpringLayout.SOUTH, panelAddRoom);
		sl_panelAddRoom.putConstraint(SpringLayout.EAST, btnAddARoom, -174, SpringLayout.EAST, panelAddRoom);
		panelAddRoom.add(btnAddARoom);
		
		roomMaxAttendeeTextfield = new JTextField();
		sl_panelAddRoom.putConstraint(SpringLayout.NORTH, roomMaxAttendeeTextfield, 0, SpringLayout.NORTH, lblMaximalNumberOf);
		sl_panelAddRoom.putConstraint(SpringLayout.EAST, roomMaxAttendeeTextfield, -62, SpringLayout.EAST, panelAddRoom);
		panelAddRoom.add(roomMaxAttendeeTextfield);
		roomMaxAttendeeTextfield.setColumns(10);
		
		roomAreaTextfield = new JTextField();
		sl_panelAddRoom.putConstraint(SpringLayout.WEST, roomAreaTextfield, 0, SpringLayout.WEST, roomMaxAttendeeTextfield);
		sl_panelAddRoom.putConstraint(SpringLayout.SOUTH, roomAreaTextfield, -35, SpringLayout.NORTH, roomMaxAttendeeTextfield);
		panelAddRoom.add(roomAreaTextfield);
		roomAreaTextfield.setColumns(10);
		
		roomNameTextfield = new JTextField();
		sl_panelAddRoom.putConstraint(SpringLayout.NORTH, roomNameTextfield, 0, SpringLayout.NORTH, lblRoomName);
		sl_panelAddRoom.putConstraint(SpringLayout.EAST, roomNameTextfield, 0, SpringLayout.EAST, roomMaxAttendeeTextfield);
		panelAddRoom.add(roomNameTextfield);
		roomNameTextfield.setColumns(10);
		
		txtListAMettre = new JTextField();
		txtListAMettre.setText("List A mettre");
		sl_panelAddRoom.putConstraint(SpringLayout.NORTH, txtListAMettre, 0, SpringLayout.NORTH, lblNewLabel);
		sl_panelAddRoom.putConstraint(SpringLayout.EAST, txtListAMettre, 0, SpringLayout.EAST, roomMaxAttendeeTextfield);
		panelAddRoom.add(txtListAMettre);
		txtListAMettre.setColumns(10);
		
		btnAddARoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = roomNameTextfield.getText();
				int area = Integer.parseInt(roomAreaTextfield.getText());
				int NBAttendee = Integer.parseInt(roomMaxAttendeeTextfield.getText());
				roomManagementFacade.addRoom(name, area, NBAttendee);
				}
	
			});
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JPanel panelUpdateRoom = new JPanel();
		tabbedPane.addTab("Update a room", null, panelUpdateRoom, null);
		panelUpdateRoom.setLayout(new SpringLayout());
		
		JPanel panelDeleteRoom = new JPanel();
		tabbedPane.addTab("Delete a room", null, panelDeleteRoom, null);
		panelDeleteRoom.setLayout(new SpringLayout());
		
		JPanel panelListRoom = new JPanel();
		tabbedPane.addTab("All rooms", null, panelListRoom, null);
		SpringLayout sl_roomNameTextfield = new SpringLayout();
		panelListRoom.setLayout(sl_roomNameTextfield);
		
		table = new JTable();
		sl_roomNameTextfield.putConstraint(SpringLayout.NORTH, table, 5, SpringLayout.NORTH, panelListRoom);
		sl_roomNameTextfield.putConstraint(SpringLayout.WEST, table, 253, SpringLayout.WEST, panelListRoom);
		panelListRoom.add(table);

	}
}
