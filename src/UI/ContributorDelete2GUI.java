package UI;

import java.awt.Color;
import java.awt.Font;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTextField;

import javax.swing.SwingConstants;

import Functions.ContributorManagementFacade;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContributorDelete2GUI extends JPanel {
	private ContributorManagementFacade myFacade = new ContributorManagementFacade();
	private JTextField txtEnterTheId;
	private JTextField txtEnterTheContributor_1;
	private JTextField txtEnterTheContributor;

	/**
	 * Create the panel.
	 */
	public ContributorDelete2GUI() {
		this.setSize(640, 480);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contributor Management");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 49, 628, 35);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the id of the event you want to delete from :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(6, 95, 628, 16);
		add(lblNewLabel_1);
		
		JLabel lblContributorName = new JLabel("Contributor name :");
		lblContributorName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContributorName.setBounds(90, 129, 123, 14);
		add(lblContributorName);
		
		JLabel lblContributorFirstName = new JLabel("Contributor first name :");
		lblContributorFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContributorFirstName.setBounds(64, 162, 149, 14);
		add(lblContributorFirstName);
		
		JLabel lblEventId = new JLabel("Event ID :");
		lblEventId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEventId.setBounds(105, 201, 108, 14);
		add(lblEventId);
		
		txtEnterTheId = new JTextField();
		txtEnterTheId.setForeground(Color.BLACK);
		txtEnterTheId.setText("Enter the event ID");
		txtEnterTheId.setBounds(223, 194, 231, 28);
		add(txtEnterTheId);
		
		txtEnterTheContributor_1 = new JTextField();
		txtEnterTheContributor_1.setText("Enter the contributor name");
		txtEnterTheContributor_1.setForeground(Color.BLACK);
		txtEnterTheContributor_1.setBounds(223, 122, 231, 28);
		add(txtEnterTheContributor_1);
		
		txtEnterTheContributor = new JTextField();
		txtEnterTheContributor.setText("Enter the contributor first name ");
		txtEnterTheContributor.setForeground(Color.BLACK);
		txtEnterTheContributor.setBounds(223, 159, 231, 28);
		add(txtEnterTheContributor);

		
		JButton btnDeleteContributorFrom = new JButton("Delete contributor from this event");
		btnDeleteContributorFrom.setBounds(223, 256, 231, 23);
		add(btnDeleteContributorFrom);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(298, 290, 89, 23);
		add(btnCancel);
		
		//Listeners
		btnDeleteContributorFrom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Boolean deleted = myFacade.deleteContributorFromEvent(Integer.parseInt(txtEnterTheId.getText()));
				if (!deleted){
					//Error popup 
					JOptionPane.showMessageDialog(null, "Fail!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else{
					//Information popup
					JOptionPane.showMessageDialog(null, "Contributor deleted from the event "+txtEnterTheId.getText()+"!", "Success", JOptionPane.INFORMATION_MESSAGE);
					MainFrame.getMainFrame().setMainPanel(new ContributorManagementMenuGUI());
				}
			}
		});

		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ContributorManagementMenuGUI());
			}
		});

		
	}

}
