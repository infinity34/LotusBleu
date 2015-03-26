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

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class ActivityAddView extends JPanel {
	
	private JTextField txtActivityName;
	private JTextArea txtrActivityDescription;

	/**
	 * Create the panel.
	 */
	public ActivityAddView() {
		this.setSize(640, 480);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 41, 273, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblActivityManagement = new JLabel("Activity Management");
		lblActivityManagement.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		GridBagConstraints gbc_lblActivityManagement = new GridBagConstraints();
		gbc_lblActivityManagement.insets = new Insets(0, 0, 5, 5);
		gbc_lblActivityManagement.gridx = 5;
		gbc_lblActivityManagement.gridy = 1;
		add(lblActivityManagement, gbc_lblActivityManagement);
		
		JLabel lblFillOutThe = new JLabel("Fill out the form to add an activity:");
		lblFillOutThe.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblFillOutThe = new GridBagConstraints();
		gbc_lblFillOutThe.anchor = GridBagConstraints.WEST;
		gbc_lblFillOutThe.gridwidth = 2;
		gbc_lblFillOutThe.insets = new Insets(0, 0, 5, 5);
		gbc_lblFillOutThe.gridx = 5;
		gbc_lblFillOutThe.gridy = 3;
		add(lblFillOutThe, gbc_lblFillOutThe);
		
		JLabel lblName = new JLabel("Name :");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.anchor = GridBagConstraints.EAST;
		gbc_lblName.gridx = 4;
		gbc_lblName.gridy = 5;
		add(lblName, gbc_lblName);
		
		txtActivityName = new JTextField();
		txtActivityName.setText("Activity Name");
		txtActivityName.setToolTipText("activityName");
		GridBagConstraints gbc_txtActivityName = new GridBagConstraints();
		gbc_txtActivityName.insets = new Insets(0, 0, 5, 5);
		gbc_txtActivityName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtActivityName.gridx = 5;
		gbc_txtActivityName.gridy = 5;
		add(txtActivityName, gbc_txtActivityName);
		txtActivityName.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description:");
		GridBagConstraints gbc_lblDescription = new GridBagConstraints();
		gbc_lblDescription.anchor = GridBagConstraints.NORTH;
		gbc_lblDescription.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescription.gridx = 4;
		gbc_lblDescription.gridy = 7;
		add(lblDescription, gbc_lblDescription);
		
		txtrActivityDescription = new JTextArea();
		txtrActivityDescription.setText("Activity Description");
		GridBagConstraints gbc_txtrActivityDescription = new GridBagConstraints();
		gbc_txtrActivityDescription.insets = new Insets(0, 0, 5, 5);
		gbc_txtrActivityDescription.fill = GridBagConstraints.BOTH;
		gbc_txtrActivityDescription.gridx = 5;
		gbc_txtrActivityDescription.gridy = 7;
		add(txtrActivityDescription, gbc_txtrActivityDescription);
		
		JButton btnCancel = new JButton("Cancel");
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancel.gridx = 4;
		gbc_btnCancel.gridy = 9;
		add(btnCancel, gbc_btnCancel);
		
		JButton btnSubmit = new JButton("Submit");
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.insets = new Insets(0, 0, 5, 5);
		gbc_btnSubmit.gridx = 6;
		gbc_btnSubmit.gridy = 9;
		add(btnSubmit, gbc_btnSubmit);
		
		//Listeners
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ActivityMainView());
			}});
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Boolean isAdd = ActivityFacade.getFacade().createActivity(txtActivityName.getText(),txtrActivityDescription.getText());
				
				if(!isAdd){
					//Error popup 
					JOptionPane.showMessageDialog(null, "The activity doesn't add in the database!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else{
					//Information popup
					JOptionPane.showMessageDialog(null, "Activity Added! :) :)", "Success", JOptionPane.INFORMATION_MESSAGE);
					MainFrame.getMainFrame().setMainPanel(new ActivityMainView());
				}
			}});

	}

}
