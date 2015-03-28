
package UI;

import java.awt.Font;
import java.sql.ResultSet;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Functions.ContributorManagementFacade;
import Functions.OrderManagementFacade;

/**
 * 
 * 
 * @poseidon-object-id [Im26623am14bf96eff7cmm7b11]
 */
public class OrderManagementMenuGUI extends JPanel {
	public OrderManagementFacade myFacade = new OrderManagementFacade();

	
	public OrderManagementMenuGUI() {
		
		this.setSize(640, 480);
		setLayout(null);
		
		JLabel title = new JLabel("Contributor Management");
		title.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(6, 49, 628, 35);
		add(title);
		
		
		ResultSet rs = myFacade.listOrder("Pending");
		ResultSetTableModel rtm = new ResultSetTableModel(rs);
		TablePanel tablePanel = new TablePanel(rtm);
		tablePanel.setBounds(76, 114, 452, 305);
		add(tablePanel);
		
	}
 }
