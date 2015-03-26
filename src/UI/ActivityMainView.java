package UI;

import javax.swing.JPanel;

import Data.Activity;
import Functions.ActivityFacade;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;

public class ActivityMainView extends JPanel {
	
	/**
	 * Create the panel.
	 */
	public ActivityMainView() {
		this.setSize(640, 480);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblActivityManagement = new JLabel("Activity Management");
		lblActivityManagement.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		GridBagConstraints gbc_lblActivityManagement = new GridBagConstraints();
		gbc_lblActivityManagement.insets = new Insets(0, 0, 5, 5);
		gbc_lblActivityManagement.gridx = 5;
		gbc_lblActivityManagement.gridy = 1;
		add(lblActivityManagement, gbc_lblActivityManagement);
		
		JLabel lblChooseTheAction = new JLabel("Choose the action you will perform :");
		GridBagConstraints gbc_lblChooseTheAction = new GridBagConstraints();
		gbc_lblChooseTheAction.insets = new Insets(0, 0, 5, 5);
		gbc_lblChooseTheAction.gridx = 5;
		gbc_lblChooseTheAction.gridy = 3;
		add(lblChooseTheAction, gbc_lblChooseTheAction);
		
		JButton btnAddAnActivity = new JButton("Add an Activity");
		GridBagConstraints gbc_btnAddAnActivity = new GridBagConstraints();
		gbc_btnAddAnActivity.insets = new Insets(0, 0, 5, 5);
		gbc_btnAddAnActivity.gridx = 5;
		gbc_btnAddAnActivity.gridy = 4;
		add(btnAddAnActivity, gbc_btnAddAnActivity);
		
		JButton btnUpdateAnActivity = new JButton("Update an Activity");
		GridBagConstraints gbc_btnUpdateAnActivity = new GridBagConstraints();
		gbc_btnUpdateAnActivity.insets = new Insets(0, 0, 5, 5);
		gbc_btnUpdateAnActivity.gridx = 5;
		gbc_btnUpdateAnActivity.gridy = 5;
		add(btnUpdateAnActivity, gbc_btnUpdateAnActivity);
		
		JButton btnDeleteAnActivity = new JButton("Delete an Activity");
		GridBagConstraints gbc_btnDeleteAnActivity = new GridBagConstraints();
		gbc_btnDeleteAnActivity.insets = new Insets(0, 0, 5, 5);
		gbc_btnDeleteAnActivity.gridx = 5;
		gbc_btnDeleteAnActivity.gridy = 6;
		add(btnDeleteAnActivity, gbc_btnDeleteAnActivity);
		
		JLabel lblActivitiesAlreadyExisted = new JLabel("Activities already existed :");
		GridBagConstraints gbc_lblActivitiesAlreadyExisted = new GridBagConstraints();
		gbc_lblActivitiesAlreadyExisted.insets = new Insets(0, 0, 5, 5);
		gbc_lblActivitiesAlreadyExisted.gridx = 5;
		gbc_lblActivitiesAlreadyExisted.gridy = 7;
		add(lblActivitiesAlreadyExisted, gbc_lblActivitiesAlreadyExisted);
		
		
		//Create listModel
		DefaultListModel listModel = new DefaultListModel();
		//Get all accessories
		ArrayList<Activity> activities = ActivityFacade.getFacade().getAllActivities();
				 
		//Fill the model
		int size = activities.size();
		if(size!=0){
			for(int index=0; index<size; index++)
			{
				listModel.addElement(activities.get(index).getName());
			}
		}
		JList list = new JList(listModel);
		//JList list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 5;
		gbc_list.gridy = 8;
		add(list, gbc_list);
		
		//Listeners
		btnAddAnActivity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ActivityAddView());
			}
		});
		
		btnDeleteAnActivity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ActivityDeleteView());
			}
		});
		
		btnUpdateAnActivity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ActivityUpdateView());
			}
		});
		
	}

}
