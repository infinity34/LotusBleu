
package UI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		
		JLabel lblChooseTheOrder = new JLabel("Choose the order ID :");
		lblChooseTheOrder.setBounds(27, 114, 124, 14);
		add(lblChooseTheOrder);
		
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

		txtOrderId = new JTextField();
		txtOrderId.setText("Order ID");
		txtOrderId.setBounds(148, 111, 86, 20);
		add(txtOrderId);
		txtOrderId.setColumns(10);		

		JButton btnConfirmed = new JButton("Confirmed");
		btnConfirmed.setBounds(176, 158, 139, 23);
		add(btnConfirmed);
		
		JButton btnSent = new JButton("Sent");
		btnSent.setBounds(315, 158, 139, 23);
		add(btnSent);
		
		JButton btnCancelledrejected = new JButton("Cancelled/Rejected");
		btnCancelledrejected.setBounds(451, 158, 139, 23);
		add(btnCancelledrejected);
		
		JButton btnOk = new JButton("Display");
		btnOk.setBounds(250, 110, 78, 23);
		add(btnOk);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(328, 110, 86, 23);
		add(btnConfirm);
		
		JButton btnSend = new JButton("Send");
		btnSend.setBounds(413, 110, 78, 23);
		add(btnSend);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(490, 110, 78, 23);
		add(btnCancel);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(562, 110, 78, 23);
		add(btnDelete);
		
		//Listener
		btnConfirmed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					ResultSet rs = myFacade.getConfirmedOrders();
					table.setModel(DbUtils.resultSetToTableModel(rs));
			}
		});
	
		btnSent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
					ResultSet rs = myFacade.getSentOrders();
					table.setModel(DbUtils.resultSetToTableModel(rs));					
			}
		});

		btnCancelledrejected.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
					ResultSet rs = myFacade.getCancelledOrders();
					table.setModel(DbUtils.resultSetToTableModel(rs));
		
			}
		});

		
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				MainFrame.getMainFrame().setMainPanel(new OrderDisplayGUI());
				}
		});
		

		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Boolean isAdd = myFacade.confirmPurchase(Integer.parseInt(txtOrderId.getText()));
				
				if(!isAdd){
					//Error popup 
					JOptionPane.showMessageDialog(null, "Fail !", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else{
					//Information popup
					JOptionPane.showMessageDialog(null, "The order "+txtOrderId.getText()+" has been confirmed! ", "Success", JOptionPane.INFORMATION_MESSAGE);
					MainFrame.getMainFrame().setMainPanel(new OrderManagementMenuGUI());
				}
			}
		});
		
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Boolean isAdd = myFacade.sendPurchase(Integer.parseInt(txtOrderId.getText()));
				
				if(!isAdd){
					//Error popup 
					JOptionPane.showMessageDialog(null, "Fail !", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else{
					//Information popup
					JOptionPane.showMessageDialog(null, "The sent of the order "+txtOrderId.getText()+" is confirmed! ", "Success", JOptionPane.INFORMATION_MESSAGE);
					MainFrame.getMainFrame().setMainPanel(new OrderManagementMenuGUI());
				}
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Boolean isAdd = myFacade.cancelOrder(Integer.parseInt(txtOrderId.getText()));
				
				if(!isAdd){
					//Error popup 
					JOptionPane.showMessageDialog(null, "Fail !", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else{
					//Information popup
					JOptionPane.showMessageDialog(null, "The order "+txtOrderId.getText()+" has been canceled! ", "Success", JOptionPane.INFORMATION_MESSAGE);
					MainFrame.getMainFrame().setMainPanel(new OrderManagementMenuGUI());
				}
			}
		});

		
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Boolean deleted = myFacade.deleteOrder(Integer.parseInt(txtOrderId.getText()));
				
				if(!deleted){
					//Error popup 
					JOptionPane.showMessageDialog(null, "Fail !", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else{
					//Information popup
					JOptionPane.showMessageDialog(null, "The order "+txtOrderId.getText()+" has been deleted! ", "Success", JOptionPane.INFORMATION_MESSAGE);
					MainFrame.getMainFrame().setMainPanel(new OrderManagementMenuGUI());
				}
			}
		});


	}
 }
