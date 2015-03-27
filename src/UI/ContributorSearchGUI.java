package UI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Functions.ContributorManagementFacade;

public class ContributorSearchGUI extends JPanel {
	private ContributorManagementFacade myFacade = new ContributorManagementFacade();
	private JTextField txtContributorName;
	private JTextField txtContributorFirstName;
	/**
	 * Create the panel.
	 */
	public ContributorSearchGUI() {
		this.setSize(640, 480);
		setLayout(null);
		
		JLabel title = new JLabel("Contributor Management");
		title.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(6, 49, 628, 35);
		add(title);
		
		txtContributorName = new JTextField();
		txtContributorName.setForeground(Color.BLACK);
		txtContributorName.setText("Enter the name");
		txtContributorName.setBounds(259, 186, 282, 28);
		add(txtContributorName);
		txtContributorName.setColumns(10);
		
		JLabel lblContributorName = new JLabel("Contributor name :");
		lblContributorName.setBounds(110, 192, 137, 16);
		add(lblContributorName);
		
		txtContributorFirstName = new JTextField();
		txtContributorFirstName.setForeground(Color.BLACK);
		txtContributorFirstName.setText("Enter the first name");
		txtContributorFirstName.setBounds(259, 239, 282, 28);
		add(txtContributorFirstName);
		txtContributorFirstName.setColumns(10);
		
		JLabel lblContributorFirstName = new JLabel("Contributor first name :");
		lblContributorFirstName.setBounds(110, 245, 137, 16);
		add(lblContributorFirstName);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(410, 327, 117, 29);
		add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(140, 327, 117, 29);
		add(btnCancel);
		
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ContributorManagementMenuGUI());
			}});
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				//Create listModel
				DefaultListModel<String> listModel = new DefaultListModel<String>();
				//Get all contributors
				 String contributors = myFacade.searchContributor(txtContributorName.getText(), txtContributorFirstName.getText());
				 //Fill the model
				 
				 listModel.addElement(contributors);
				 
				 JList<String> liste = new JList<String>(listModel);
				 liste.setBounds(26, 181, 173, 178);
				 //liste.addListSelectionListener(this);
				 add(liste);
			}});

	}

}