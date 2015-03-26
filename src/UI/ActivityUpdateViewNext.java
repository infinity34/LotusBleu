package UI;

import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import Functions.ActivityFacade;

public class ActivityUpdateViewNext extends JPanel {
	private JTextField txtNewActivityName;
	private JTextField txtNewactivitydescription;
	private String oldActivityName;
	private JLabel lblNewLabel;

	/**
	 * Create the panel.
	 */
	public ActivityUpdateViewNext() {
		this.setSize(640, 480);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblActivityManagement = new JLabel("Activity Management");
		lblActivityManagement.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		GridBagConstraints gbc_lblActivityManagement = new GridBagConstraints();
		gbc_lblActivityManagement.insets = new Insets(0, 0, 5, 5);
		gbc_lblActivityManagement.gridx = 5;
		gbc_lblActivityManagement.gridy = 1;
		add(lblActivityManagement, gbc_lblActivityManagement);
		
		this.lblNewLabel = new JLabel("Old name activity");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 5;
		gbc_lblNewLabel.gridy = 3;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblEnterTheNew = new JLabel("Enter the new activity name :");
		GridBagConstraints gbc_lblEnterTheNew = new GridBagConstraints();
		gbc_lblEnterTheNew.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnterTheNew.gridx = 5;
		gbc_lblEnterTheNew.gridy = 5;
		add(lblEnterTheNew, gbc_lblEnterTheNew);
		
		txtNewActivityName = new JTextField();
		txtNewActivityName.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_txtNewActivityName = new GridBagConstraints();
		gbc_txtNewActivityName.insets = new Insets(0, 0, 5, 5);
		gbc_txtNewActivityName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNewActivityName.gridx = 5;
		gbc_txtNewActivityName.gridy = 6;
		add(txtNewActivityName, gbc_txtNewActivityName);
		txtNewActivityName.setColumns(10);
		
		JLabel lblEnterTheNew_1 = new JLabel("Enter the new description :");
		GridBagConstraints gbc_lblEnterTheNew_1 = new GridBagConstraints();
		gbc_lblEnterTheNew_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnterTheNew_1.gridx = 5;
		gbc_lblEnterTheNew_1.gridy = 8;
		add(lblEnterTheNew_1, gbc_lblEnterTheNew_1);
		
		txtNewactivitydescription = new JTextField();
		txtNewactivitydescription.setToolTipText("");
		GridBagConstraints gbc_txtNewactivitydescription = new GridBagConstraints();
		gbc_txtNewactivitydescription.insets = new Insets(0, 0, 5, 5);
		gbc_txtNewactivitydescription.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNewactivitydescription.gridx = 5;
		gbc_txtNewactivitydescription.gridy = 9;
		add(txtNewactivitydescription, gbc_txtNewactivitydescription);
		txtNewactivitydescription.setColumns(10);
		
		JButton btnCancel = new JButton("Cancel");
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancel.gridx = 4;
		gbc_btnCancel.gridy = 11;
		add(btnCancel, gbc_btnCancel);
		
		JButton btnSubmit = new JButton("Submit");
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.insets = new Insets(0, 0, 0, 5);
		gbc_btnSubmit.gridx = 6;
		gbc_btnSubmit.gridy = 11;
		add(btnSubmit, gbc_btnSubmit);
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new ActivityMainView());
			}});
		
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Boolean isUpdated = ActivityFacade.getFacade().editActivity(oldActivityName,txtNewActivityName.getText(),txtNewactivitydescription.getText());
				
				if(!isUpdated){
					//Error popup 
					JOptionPane.showMessageDialog(null, "The activity doesn't update! :(", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else{
					//Information popup
					JOptionPane.showMessageDialog(null, "Activity Updated! :)", "Success", JOptionPane.INFORMATION_MESSAGE);
					MainFrame.getMainFrame().setMainPanel(new ActivityMainView());
				}
			}});
		
	}
	
	//Getters and Setters
	public void setOldActivityName(String name){
		this.oldActivityName = name;
		this.lblNewLabel.setText(oldActivityName);
	}
	
	public String getOldActivityName(){
		return this.oldActivityName;
	}
	
	

}
