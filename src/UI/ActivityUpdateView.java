package UI;

import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import Data.Activity;
import Functions.ActivityFacade;

public class ActivityUpdateView extends JPanel {
	private JTextField txtActivityName;

	/**
	 * Create the panel.
	 */
	public ActivityUpdateView() {
		this.setSize(640, 480);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblActivityManagement = new JLabel("Activity Management");
		lblActivityManagement.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		GridBagConstraints gbc_lblActivityManagement = new GridBagConstraints();
		gbc_lblActivityManagement.insets = new Insets(0, 0, 5, 5);
		gbc_lblActivityManagement.gridx = 5;
		gbc_lblActivityManagement.gridy = 1;
		add(lblActivityManagement, gbc_lblActivityManagement);
		
		JLabel lblEnterTheActivity = new JLabel("Enter the activity you want to update :");
		lblEnterTheActivity.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblEnterTheActivity = new GridBagConstraints();
		gbc_lblEnterTheActivity.anchor = GridBagConstraints.WEST;
		gbc_lblEnterTheActivity.gridwidth = 2;
		gbc_lblEnterTheActivity.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnterTheActivity.gridx = 5;
		gbc_lblEnterTheActivity.gridy = 4;
		add(lblEnterTheActivity, gbc_lblEnterTheActivity);
		
		txtActivityName = new JTextField();
		txtActivityName.setHorizontalAlignment(SwingConstants.CENTER);
		txtActivityName.setText("Activity Name");
		GridBagConstraints gbc_txtActivityName = new GridBagConstraints();
		gbc_txtActivityName.insets = new Insets(0, 0, 5, 5);
		gbc_txtActivityName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtActivityName.gridx = 5;
		gbc_txtActivityName.gridy = 5;
		add(txtActivityName, gbc_txtActivityName);
		txtActivityName.setColumns(10);
		
		JButton btnCancel = new JButton("Cancel");
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancel.gridx = 4;
		gbc_btnCancel.gridy = 7;
		add(btnCancel, gbc_btnCancel);
		
		JButton btnSubmit = new JButton("Submit");
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.insets = new Insets(0, 0, 0, 5);
		gbc_btnSubmit.gridx = 6;
		gbc_btnSubmit.gridy = 7;
		add(btnSubmit, gbc_btnSubmit);
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new AccessoryMainView());
			}});
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Activity activity = ActivityFacade.getFacade().getAnActivity(txtActivityName.getText());
				if(activity != null){
					ActivityUpdateViewNext nextPanel = new ActivityUpdateViewNext();
					nextPanel.setOldActivityName(txtActivityName.getText());
					MainFrame.getMainFrame().setMainPanel(nextPanel);
				}
				else{
					JOptionPane.showMessageDialog(null, "This activity doesn't exist! Try with another name", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}});
		
	}

}
