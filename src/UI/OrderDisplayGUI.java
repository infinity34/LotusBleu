package UI;

import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;
import Functions.OrderManagementFacade;
import Tools.DBconnection;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.AbstractListModel;

public class OrderDisplayGUI extends JPanel {
	
	public OrderManagementFacade myFacade = new OrderManagementFacade();
	private JTable table;
	private JTable tableUser;
	DBconnection connection;
	int orderID = Integer.parseInt(OrderManagementMenuGUI.txtOrderId.getText());
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JButton btnSeeUserInformation;
	private JButton btnCancel;

	/**
	 * Create the panel.
	 */
	public OrderDisplayGUI() {
		this.connection = DBconnection.getConnection();
		this.setSize(640, 480);
		setLayout(null);
		
		JLabel title = new JLabel("Order ID :"+ OrderManagementMenuGUI.txtOrderId.getText());
		title.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(10, 49, 628, 35);
		add(title);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 196, 584, 188);
		add(scrollPane);
		
		table = new JTable();
	
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Product name","Price($)", "Discount(%)", "Date", "Quantity", "State"
			}
		));
		scrollPane.setViewportView(table);

		
		try{
			ResultSet rs1 = connection.getState().executeQuery("SELECT productName, productPrice, productDiscount, orderDate, quantity, orderStateWording "
					+"FROM lotusbleu.PRODUCT P, lotusbleu.ORDER O, lotusbleu.ORDERLINE L, lotusbleu.ORDERSTATE S "
					+"WHERE P.productID = L.productID AND "
					+"O.orderID = L.orderID AND "
					+"O.orderID ='"+ this.orderID+"' AND "
					+"S.orderStateID = O.orderStateID");
			table.setModel(DbUtils.resultSetToTableModel(rs1));
			
			ResultSet rs2 = connection.getState().executeQuery("SELECT userName, userFirstname FROM lotusbleu.USER U, lotusbleu.ORDER O "
								+"WHERE U.mail = O.userMail AND O.orderID='"+this.orderID+"'");
			rs2.last();
			JLabel userlbl = new JLabel("User : "+rs2.getString("userName")+" "+rs2.getString("userFirstname"));
			userlbl.setBounds(33, 148, 124, 14);
			add(userlbl);
			
			btnCancel = new JButton("Cancel");
			btnCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainFrame.getMainFrame().setMainPanel(new OrderManagementMenuGUI());
				}
			});
			btnCancel.setBounds(33, 414, 89, 23);
			add(btnCancel);
			
			}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		

		

		
	}
}
