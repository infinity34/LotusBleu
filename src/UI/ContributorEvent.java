package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

import Functions.ContributorManagementFacade;

@SuppressWarnings("serial")
public class ContributorEvent extends JPanel {
	private ContributorManagementFacade myFacade = new ContributorManagementFacade();
	private JTable table;
	private JTextField txtName;
	private JTextField txtFirstname;
	
	
	public ContributorEvent( TableModel model )
	  {
	    table = new JTable( model );
	    this.setSize(640, 480);
		setLayout(null);
	    add( new JScrollPane( table ), BorderLayout.CENTER );
	    
	    
		txtName = new JTextField();
		txtName.setForeground(Color.BLACK);
		txtName.setText("Enter the contributor's name");
		txtName.setBounds(210, 69, 231, 28);
		add(txtName, BorderLayout.NORTH);
		txtName.setColumns(10);
		
		txtFirstname = new JTextField();
		txtFirstname.setText("Enter the contributor's firstname");
		txtFirstname.setToolTipText("");
		txtFirstname.setForeground(Color.BLACK);
		txtFirstname.setText("Enter the first name");
		txtFirstname.setBounds(210, 124, 231, 28);
		add(txtFirstname, BorderLayout.WEST);
		txtFirstname.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(470, 97, 117, 29);
		add(btnSubmit);
		
		//Listener
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet rs = myFacade.listEvents(txtName.getText(), txtFirstname.getText());
				
				ResultSetTableModel rtm = new ResultSetTableModel( rs );
		        
		        
		        
			    JButton btnBack = new JButton("Back");
				mainFrame.getContentPane().add(btnBack);
				
				btnBack.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						MainFrame.getMainFrame().setMainPanel(new ContributorEvent(model));
				}});
			
			}});
	    
	    
	    
	    
	    
	    
	  }
}
