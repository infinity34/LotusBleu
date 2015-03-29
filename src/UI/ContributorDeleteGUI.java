package UI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Data.Accessory;
import Data.ContributorRole;
import Functions.ContributorManagementFacade;
import Functions.EventFacade;

public class ContributorDeleteGUI extends JPanel {

	/**
	 * Create the panel.
	 */
	
	static JTextField txtEnterTheName;
	static JTextField txtEnterTheFirstName;
	private ContributorManagementFacade myFacade = new ContributorManagementFacade();
	
	
	public ContributorDeleteGUI() {
		this.setSize(640, 480);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contributor Management");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 49, 628, 35);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the contributor you want to delete :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(6, 123, 628, 16);
		add(lblNewLabel_1);
		
		txtEnterTheName = new JTextField();
		txtEnterTheName.setForeground(Color.BLACK);
		txtEnterTheName.setText("Enter the contributor's name");
		txtEnterTheName.setBounds(291, 204, 231, 28);
		add(txtEnterTheName);
		txtEnterTheName.setColumns(10);
		
		txtEnterTheFirstName = new JTextField();
		txtEnterTheFirstName.setText("Enter the contributor's firstname");
		txtEnterTheFirstName.setToolTipText("");
		txtEnterTheFirstName.setForeground(Color.BLACK);
		txtEnterTheFirstName.setText("Enter the first name");
		txtEnterTheFirstName.setBounds(291, 243, 231, 28);
		add(txtEnterTheFirstName);
		txtEnterTheFirstName.setColumns(10);
		
		
		JButton btnNextstep = new JButton("Next step");
		btnNextstep.setBounds(405, 338, 117, 29);
		add(btnNextstep);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(121, 338, 117, 29);
		add(btnCancel);
		
		JLabel lblContributorName = new JLabel("Contributor name :");
		lblContributorName.setBounds(160, 211, 117, 14);
		add(lblContributorName);
		
		JLabel lblContributorFirstname = new JLabel("Contributor firstName :");
		lblContributorFirstname.setBounds(160, 250, 117, 14);
		add(lblContributorFirstname);
		
		
		//Listeners
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ContributorManagementMenuGUI());
			}});
		
		btnNextstep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ContributorDelete2GUI());
			}});
	}

}
