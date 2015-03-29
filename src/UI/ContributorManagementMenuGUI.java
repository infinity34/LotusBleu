package UI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



import Functions.ContributorManagementFacade;

@SuppressWarnings("serial")
public class ContributorManagementMenuGUI extends JPanel {

		public ContributorManagementFacade myFacade = new ContributorManagementFacade();
	
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
		instruct.setBounds(286, 151, 312, 16);
		add(instruct);
		
		JButton addContributorButton = new JButton("Add/Modify a contributor to an event");
		addContributorButton.setBounds(284, 178, 300, 29);
		add(addContributorButton);
		
		JButton deleteContributorButton = new JButton("Delete a contributor from an event");
		deleteContributorButton.setBounds(284, 218, 300, 29);
		add(deleteContributorButton);
		
		JButton createContributorButton = new JButton("Add a new contributor");
		createContributorButton.setBounds(284, 258, 300, 29);
		add(createContributorButton);
		
		JButton removeContributor = new JButton("Remove a contributor");
		removeContributor.setBounds(284, 298, 300, 29);
		add(removeContributor);
		
		 JLabel lblAllContributors = new JLabel("List of contributors :");
		 lblAllContributors.setBounds(26, 142, 173, 35);
		 add(lblAllContributors);
		 revalidate();
		
		
		//Create listModel
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		//Get all contributors
		 ArrayList<String> contributors = myFacade.listContributor();
		 //Fill the model
		 int size = contributors.size();
		 for(int index=0; index<size; index++)
		 {
			 String fullname = contributors.get(index);
		     listModel.addElement(fullname);
		 }
		 JList<String> liste = new JList<String>(listModel);
		 liste.setBounds(26, 181, 173, 178);
		 //liste.addListSelectionListener(this);
		 add(liste);
		 
		 JButton btnSeeAllThe = new JButton("See all the events of a contributor");
		 btnSeeAllThe.setBounds(286, 342, 300, 29);
		 add(btnSeeAllThe);
		 
		 JButton btnSearchAContributor = new JButton("Search a contributor");
		 btnSearchAContributor.setBounds(24, 371, 173, 29);
		 add(btnSearchAContributor);
		
		
		 //Listener
		 
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
		*/
		deleteContributorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ContributorDelete2GUI());
			}
		});
		
		
		createContributorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ContributorCreateGUI());
			}
		});
		
		removeContributor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ContributorRemoveGUI());
			}
		});
		
		btnSeeAllThe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ContributorEvent());
			}
		});
		
		btnSearchAContributor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ContributorSearchGUI());
			}
		});
	}
}	