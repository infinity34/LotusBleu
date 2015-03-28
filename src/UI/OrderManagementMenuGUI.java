
package UI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;
import Functions.OrderManagementFacade;
import Tools.DBconnection;

/**
 * 
 * 
 * @poseidon-object-id [Im26623am14bf96eff7cmm7b11]
 */
@SuppressWarnings("serial")
public class OrderManagementMenuGUI extends JPanel {
	public OrderManagementFacade myFacade = new OrderManagementFacade();
	private JTable table;
	DBconnection connection;
	static JTextField txtOrderId;

	
	public OrderManagementMenuGUI() {
		this.connection = DBconnection.getConnection();
		this.setSize(640, 480);
		setLayout(null);
		
		JLabel title = new JLabel("Order Management");
		title.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(10, 49, 628, 35);
		add(title);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 180, 551, 266);
		add(scrollPane);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"OrderID", "Product name","Order date", "User first name", "User name",  "State", "Quantity"
			}
		));
		//  JComboBox of the possible actions
		JComboBox namesComboBox = new JComboBox();
		namesComboBox.addItem("Display");
		namesComboBox.addItem("Confirm");
		namesComboBox.addItem("Send");
		namesComboBox.addItem("Cancel");
		

		
		JButton btnRefreshOrders = new JButton("Pending");
		btnRefreshOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					ResultSet rs = connection.getState().executeQuery("SELECT O.orderID,productName, orderDate, userName, userFirstName, quantity, orderStateWording "
							+"FROM lotusbleu.PRODUCT P, lotusbleu.ORDER O, lotusbleu.USER U, lotusbleu.ORDERLINE L, lotusbleu.ORDERSTATE S "
							+"WHERE P.productID = L.productID AND "
							+"O.orderID = L.orderID AND "
							+"O.userMail = U.mail AND "
							+"S.orderStateID = O.orderStateID AND "
							+"S.orderStateWording = 'Pending';");
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					
					}
				catch (SQLException e) {
					e.printStackTrace();
				}
				
				
				
			}
		});
		btnRefreshOrders.setBounds(38, 158, 139, 23);
		add(btnRefreshOrders);
		
		JButton btnConfirmed = new JButton("Confirmed");
		btnConfirmed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					ResultSet rs = connection.getState().executeQuery("SELECT O.orderID, productName, orderDate, userName, userFirstName, quantity, orderStateWording "
							+"FROM lotusbleu.PRODUCT P, lotusbleu.ORDER O, lotusbleu.USER U, lotusbleu.ORDERLINE L, lotusbleu.ORDERSTATE S "
							+"WHERE P.productID = L.productID AND "
							+"O.orderID = L.orderID AND "
							+"O.userMail = U.mail AND "
							+"S.orderStateID = O.orderStateID AND "
							+"S.orderStateWording = 'Confirmed';");
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					
					}
				catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
		});
		btnConfirmed.setBounds(176, 158, 139, 23);
		add(btnConfirmed);
		
		JButton btnSent = new JButton("Sent");
		btnSent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					ResultSet rs = connection.getState().executeQuery("SELECT O.orderID, productName, orderDate, userName, userFirstName, quantity, orderStateWording "
							+"FROM lotusbleu.PRODUCT P, lotusbleu.ORDER O, lotusbleu.USER U, lotusbleu.ORDERLINE L, lotusbleu.ORDERSTATE S "
							+"WHERE P.productID = L.productID AND "
							+"O.orderID = L.orderID AND "
							+"O.userMail = U.mail AND "
							+"S.orderStateID = O.orderStateID AND "
							+"S.orderStateWording = 'Sent';");
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
		btnSent.setBounds(315, 158, 139, 23);
		add(btnSent);
		
		JButton btnCancelledrejected = new JButton("Cancelled/Rejected");
		btnCancelledrejected.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					ResultSet rs = connection.getState().executeQuery("SELECT O.orderID, productName, orderDate, userName, userFirstName, quantity, orderStateWording "
							+"FROM lotusbleu.PRODUCT P, lotusbleu.ORDER O, lotusbleu.USER U, lotusbleu.ORDERLINE L, lotusbleu.ORDERSTATE S "
							+"WHERE P.productID = L.productID AND "
							+"O.orderID = L.orderID AND "
							+"O.userMail = U.mail AND "
							+"S.orderStateID = O.orderStateID AND "
							+"S.orderStateWording = 'Cancelled/Rejected';");
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					
					}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
		btnCancelledrejected.setBounds(451, 158, 139, 23);
		add(btnCancelledrejected);
		
		txtOrderId = new JTextField();
		txtOrderId.setText("Order ID");
		txtOrderId.setBounds(148, 111, 86, 20);
		add(txtOrderId);
		txtOrderId.setColumns(10);
		
		JLabel lblChooseTheOrder = new JLabel("Choose the order ID :");
		lblChooseTheOrder.setBounds(27, 114, 124, 14);
		add(lblChooseTheOrder);
		
		JButton btnOk = new JButton("Display");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				MainFrame.getMainFrame().setMainPanel(new OrderDisplayGUI());
				}
		});
		
		btnOk.setBounds(250, 110, 78, 23);
		add(btnOk);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(336, 110, 78, 23);
		add(btnConfirm);
		
		JButton btnSend = new JButton("Send");
		btnSend.setBounds(424, 110, 78, 23);
		add(btnSend);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(512, 110, 78, 23);
		add(btnCancel);
		
		
		/*ResultSet rs = myFacade.listOrder("Pending");
		ResultSetTableModel rtm = new ResultSetTableModel(rs);
		*/
	}
 }
