package UI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ContributorManagementMenuGUI extends JPanel {

	public ContributorManagementMenuGUI() {
		this.setSize(640, 480);
		setLayout(null);
		
		JLabel title = new JLabel("Contributor Management");
		title.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(6, 49, 628, 35);
		add(title);
		
		JLabel instruct = new JLabel("Choose the action that you will perform");
		instruct.setHorizontalAlignment(SwingConstants.CENTER);
		instruct.setBounds(6, 108, 628, 16);
		add(instruct);
		
		JButton addContributorButton = new JButton("Add a contributor");
		addContributorButton.setBounds(178, 182, 300, 29);
		add(addContributorButton);
		
		JButton updateContributorButton = new JButton("Update a contributor");
		updateContributorButton.setBounds(178, 239, 300, 29);
		add(updateContributorButton);
		
		JButton deleteContributorButton = new JButton("Delete a contributor");
		deleteContributorButton.setBounds(178, 301, 300, 29);
		add(deleteContributorButton);
		
		addContributorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ContributorAddGUI());
			}
		});
		
		/*updateContributorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new UpdateContributorGUI());
			}
		});
		
		deleteContributorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new DeleteContributorGUI());
			}
		});*/
	}
}	