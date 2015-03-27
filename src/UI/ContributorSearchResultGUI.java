package UI;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Functions.ContributorManagementFacade;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class ContributorSearchResultGUI extends JPanel {
	private ContributorManagementFacade myFacade = new ContributorManagementFacade();

	/**
	 * Create the panel.
	 */
	public ContributorSearchResultGUI() {
		
		this.setSize(640, 480);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contributor Management");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 49, 628, 35);
		add(lblNewLabel);
		
		
		//Create listModel
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		
		//Get the contributor's information
		 ArrayList<String> contributors = myFacade.searchContributor(ContributorSearchGUI.txtContributorName.getText(), ContributorSearchGUI.txtContributorFirstName.getText());
		
		 //Fill the model
		 int size = contributors.size();
		 for(int index=0; index<size; index++)
		 {
		     listModel.addElement(contributors.get(index));
		 }
		 JList<String> liste = new JList<String>(listModel);
		 liste.setBounds(110, 147, 426, 178);
		 add(liste);
		
				 
		 //Buttons
			
		JButton btn = new JButton("Search an other contributor");
		btn.setBounds(371, 375, 165, 29);
		add(btn);
			
		 
		 
		 //Listeners
		 JButton btnCancel = new JButton("Cancel");
			btnCancel.setBounds(110, 375, 160, 29);
			add(btnCancel);
			
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ContributorSearchGUI());
		}});
		 
		 btnCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MainFrame.getMainFrame().setMainPanel(new ContributorManagementMenuGUI());
				}});
	}

}
