package UI;

import Data.Room;
import Functions.RoomManagementFacade;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JTabbedPane;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JComboBox;

public class RoomManagementGUI extends JPanel {

	private RoomManagementFacade roomManagementFacade;
	private JTextField roomMaxAttendeeTextfield;
	private JTextField roomAreaTextfield;
	private JTextField roomNameTextfield;
	private JTextField txtListAMettre;
	private JTable table;
	private JTextField roomName;
	private JTextField roomNameDelete;

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
		SpringLayout sl_panelUpdateRoom = new SpringLayout();
		panelUpdateRoom.setLayout(sl_panelUpdateRoom);
		
		JLabel lblRoomName_1 = new JLabel("Room Name:");
		panelUpdateRoom.add(lblRoomName_1);
		
		roomName = new JTextField();
		sl_panelUpdateRoom.putConstraint(SpringLayout.NORTH, roomName, 141, SpringLayout.NORTH, panelUpdateRoom);
		sl_panelUpdateRoom.putConstraint(SpringLayout.WEST, roomName, 239, SpringLayout.WEST, panelUpdateRoom);
		sl_panelUpdateRoom.putConstraint(SpringLayout.NORTH, lblRoomName_1, 6, SpringLayout.NORTH, roomName);
		sl_panelUpdateRoom.putConstraint(SpringLayout.EAST, lblRoomName_1, -59, SpringLayout.WEST, roomName);
		panelUpdateRoom.add(roomName);
		roomName.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		sl_panelUpdateRoom.putConstraint(SpringLayout.NORTH, btnSearch, 43, SpringLayout.SOUTH, roomName);
		sl_panelUpdateRoom.putConstraint(SpringLayout.WEST, btnSearch, 30, SpringLayout.WEST, roomName);
		sl_panelUpdateRoom.putConstraint(SpringLayout.EAST, btnSearch, -153, SpringLayout.EAST, panelUpdateRoom);
		panelUpdateRoom.add(btnSearch);
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = roomName.getText();
				Room room = roomManagementFacade.getRoom(name);

				panelUpdateRoom.removeAll();
				SpringLayout sl_panelUpdateRoom = new SpringLayout();
				panelUpdateRoom.setLayout(sl_panelUpdateRoom);
				
				JLabel lblNewLabel = new JLabel("Type of the room");
				sl_panelUpdateRoom.putConstraint(SpringLayout.NORTH, lblNewLabel, 43, SpringLayout.NORTH, panelAddRoom);
				sl_panelUpdateRoom.putConstraint(SpringLayout.WEST, lblNewLabel, 46, SpringLayout.WEST, panelAddRoom);
				panelUpdateRoom.add(lblNewLabel);
				
				JLabel lblRoomName = new JLabel("Room name");
				sl_panelUpdateRoom.putConstraint(SpringLayout.NORTH, lblRoomName, 44, SpringLayout.SOUTH, lblNewLabel);
				sl_panelUpdateRoom.putConstraint(SpringLayout.WEST, lblRoomName, 0, SpringLayout.WEST, lblNewLabel);
				panelUpdateRoom.add(lblRoomName);
				
				JLabel lblRoomArea = new JLabel("Room area");
				sl_panelUpdateRoom.putConstraint(SpringLayout.NORTH, lblRoomArea, 45, SpringLayout.SOUTH, lblRoomName);
				sl_panelUpdateRoom.putConstraint(SpringLayout.WEST, lblRoomArea, 0, SpringLayout.WEST, lblNewLabel);
				panelUpdateRoom.add(lblRoomArea);
				
				JLabel lblMaximalNumberOf = new JLabel("Maximal number of attendee");
				sl_panelUpdateRoom.putConstraint(SpringLayout.NORTH, lblMaximalNumberOf, 46, SpringLayout.SOUTH, lblRoomArea);
				sl_panelUpdateRoom.putConstraint(SpringLayout.WEST, lblMaximalNumberOf, 0, SpringLayout.WEST, lblNewLabel);
				panelUpdateRoom.add(lblMaximalNumberOf);
				
				JButton btnUpdateRoom = new JButton("Update the room");
				sl_panelUpdateRoom.putConstraint(SpringLayout.SOUTH, btnUpdateRoom, -39, SpringLayout.SOUTH, panelUpdateRoom);
				sl_panelUpdateRoom.putConstraint(SpringLayout.EAST, btnUpdateRoom, -174, SpringLayout.EAST, panelUpdateRoom);
				panelUpdateRoom.add(btnUpdateRoom);

				roomMaxAttendeeTextfield = new JTextField();
				sl_panelUpdateRoom.putConstraint(SpringLayout.NORTH, roomMaxAttendeeTextfield, 0, SpringLayout.NORTH, lblMaximalNumberOf);
				sl_panelUpdateRoom.putConstraint(SpringLayout.EAST, roomMaxAttendeeTextfield, -62, SpringLayout.EAST, panelUpdateRoom);
				panelUpdateRoom.add(roomMaxAttendeeTextfield);
				roomMaxAttendeeTextfield.setColumns(10);
				
				roomAreaTextfield = new JTextField(Integer.toString(room.getArea()));
				sl_panelUpdateRoom.putConstraint(SpringLayout.WEST, roomAreaTextfield, 0, SpringLayout.WEST, roomMaxAttendeeTextfield);
				sl_panelUpdateRoom.putConstraint(SpringLayout.SOUTH, roomAreaTextfield, -35, SpringLayout.NORTH, roomMaxAttendeeTextfield);
				panelUpdateRoom.add(roomAreaTextfield);
				roomAreaTextfield.setColumns(10);
				
				
				roomNameTextfield = new JTextField(room.getRoomName());
				sl_panelUpdateRoom.putConstraint(SpringLayout.NORTH, roomNameTextfield, 0, SpringLayout.NORTH, lblRoomName);
				sl_panelUpdateRoom.putConstraint(SpringLayout.EAST, roomNameTextfield, 0, SpringLayout.EAST, roomMaxAttendeeTextfield);
				panelUpdateRoom.add(roomNameTextfield);
				roomNameTextfield.setColumns(10);
				
				txtListAMettre = new JTextField();
				txtListAMettre.setText("List A mettre");
				sl_panelUpdateRoom.putConstraint(SpringLayout.NORTH, txtListAMettre, 0, SpringLayout.NORTH, lblNewLabel);
				sl_panelUpdateRoom.putConstraint(SpringLayout.EAST, txtListAMettre, 0, SpringLayout.EAST, roomMaxAttendeeTextfield);
				panelUpdateRoom.add(txtListAMettre);
				txtListAMettre.setColumns(10);
				
				panelUpdateRoom.repaint();
				
				btnUpdateRoom.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String name = roomNameTextfield.getText();
						int area = Integer.parseInt(roomAreaTextfield.getText());
						roomManagementFacade.updateRoom(name, area, room);
						}
					});
				}
			});
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JPanel panelDeleteRoom = new JPanel();
		tabbedPane.addTab("Delete a room", null, panelDeleteRoom, null);
		SpringLayout sl_panelDeleteRoom = new SpringLayout();
		panelDeleteRoom.setLayout(sl_panelDeleteRoom);
		
		JLabel lblRoomName_2 = new JLabel("Room Name :");
		sl_panelDeleteRoom.putConstraint(SpringLayout.NORTH, lblRoomName_2, 160, SpringLayout.NORTH, panelDeleteRoom);
		sl_panelDeleteRoom.putConstraint(SpringLayout.WEST, lblRoomName_2, 108, SpringLayout.WEST, panelDeleteRoom);
		panelDeleteRoom.add(lblRoomName_2);
		
		roomNameDelete = new JTextField();
		sl_panelDeleteRoom.putConstraint(SpringLayout.NORTH, roomNameDelete, -6, SpringLayout.NORTH, lblRoomName_2);
		sl_panelDeleteRoom.putConstraint(SpringLayout.WEST, roomNameDelete, 32, SpringLayout.EAST, lblRoomName_2);
		panelDeleteRoom.add(roomNameDelete);
		roomNameDelete.setColumns(10);
		
		JButton btnDeleteTheRoom = new JButton("Delete the room");
		sl_panelDeleteRoom.putConstraint(SpringLayout.NORTH, btnDeleteTheRoom, 46, SpringLayout.SOUTH, roomNameDelete);
		sl_panelDeleteRoom.putConstraint(SpringLayout.WEST, btnDeleteTheRoom, 187, SpringLayout.WEST, panelDeleteRoom);
		panelDeleteRoom.add(btnDeleteTheRoom);
		
		btnDeleteTheRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = roomNameDelete.getText();
				roomManagementFacade.deleteRoom(name);
				}
	
			});
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JPanel panelListRoom = new JPanel();
		tabbedPane.addTab("All rooms", null, panelListRoom, null);
		SpringLayout sl_roomNameTextfield = new SpringLayout();
		panelListRoom.setLayout(sl_roomNameTextfield);
		
		String title[]={"Name", "Area", "Attendee"};
		table = new JTable(roomManagementFacade.loadRooms(), title );
		sl_roomNameTextfield.putConstraint(SpringLayout.NORTH, table, 5, SpringLayout.NORTH, panelListRoom);
		sl_roomNameTextfield.putConstraint(SpringLayout.WEST, table, 253, SpringLayout.WEST, panelListRoom);
		panelListRoom.add(table);

	}
}
