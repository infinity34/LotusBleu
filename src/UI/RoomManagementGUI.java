package UI;
import Functions.RoomManagementFacade;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTable;

public class RoomManagementGUI extends JPanel {

	private RoomManagementFacade roomManagementFacade;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
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
		
		textField = new JTextField();
		sl_panelAddRoom.putConstraint(SpringLayout.NORTH, textField, 0, SpringLayout.NORTH, lblMaximalNumberOf);
		sl_panelAddRoom.putConstraint(SpringLayout.EAST, textField, -62, SpringLayout.EAST, panelAddRoom);
		panelAddRoom.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		sl_panelAddRoom.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, textField);
		sl_panelAddRoom.putConstraint(SpringLayout.SOUTH, textField_1, -35, SpringLayout.NORTH, textField);
		panelAddRoom.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		sl_panelAddRoom.putConstraint(SpringLayout.NORTH, textField_2, 0, SpringLayout.NORTH, lblRoomName);
		sl_panelAddRoom.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, textField);
		panelAddRoom.add(textField_2);
		textField_2.setColumns(10);
		
		txtListAMettre = new JTextField();
		txtListAMettre.setText("List A mettre");
		sl_panelAddRoom.putConstraint(SpringLayout.NORTH, txtListAMettre, 0, SpringLayout.NORTH, lblNewLabel);
		sl_panelAddRoom.putConstraint(SpringLayout.EAST, txtListAMettre, 0, SpringLayout.EAST, textField);
		panelAddRoom.add(txtListAMettre);
		txtListAMettre.setColumns(10);
		
		JPanel panelUpdateRoom = new JPanel();
		tabbedPane.addTab("Update a room", null, panelUpdateRoom, null);
		panelUpdateRoom.setLayout(new SpringLayout());
		
		JPanel panelDeleteRoom = new JPanel();
		tabbedPane.addTab("Delete a room", null, panelDeleteRoom, null);
		panelDeleteRoom.setLayout(new SpringLayout());
		
		JPanel panelAllRooms = new JPanel();
		tabbedPane.addTab("All rooms", null, panelAllRooms, null);
		SpringLayout sl_panelAllRooms = new SpringLayout();
		panelAllRooms.setLayout(sl_panelAllRooms);
		
		table = new JTable();
		sl_panelAllRooms.putConstraint(SpringLayout.NORTH, table, 5, SpringLayout.NORTH, panelAllRooms);
		sl_panelAllRooms.putConstraint(SpringLayout.WEST, table, 253, SpringLayout.WEST, panelAllRooms);
		panelAllRooms.add(table);

	}
}
