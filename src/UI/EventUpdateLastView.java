package UI;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class EventUpdateLastView extends JPanel {
	private JTextField textNewEventName;
	private JTextField textNewActivityName;
	private JTextField textNewContributorFirstName;
	private JTextField textNewContributorName;
	private JTextField textNewBeginDate;
	private JTextField textNewEndDate;
	private JTextField textNewLastReccurence;

	/**
	 * Create the panel.
	 */
	public EventUpdateLastView() {
		this.setSize(640, 480);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblEventManagement = new JLabel("Event Management");
		lblEventManagement.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		GridBagConstraints gbc_lblEventManagement = new GridBagConstraints();
		gbc_lblEventManagement.insets = new Insets(0, 0, 5, 5);
		gbc_lblEventManagement.gridx = 5;
		gbc_lblEventManagement.gridy = 1;
		add(lblEventManagement, gbc_lblEventManagement);
		
		JLabel lblUpdateInformationsOf = new JLabel("Update informations of");
		GridBagConstraints gbc_lblUpdateInformationsOf = new GridBagConstraints();
		gbc_lblUpdateInformationsOf.insets = new Insets(0, 0, 5, 5);
		gbc_lblUpdateInformationsOf.gridx = 5;
		gbc_lblUpdateInformationsOf.gridy = 3;
		add(lblUpdateInformationsOf, gbc_lblUpdateInformationsOf);
		
		JLabel lblNewLabel = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 5;
		gbc_lblNewLabel.gridy = 4;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblEventName = new JLabel("Event Name :");
		GridBagConstraints gbc_lblEventName = new GridBagConstraints();
		gbc_lblEventName.anchor = GridBagConstraints.EAST;
		gbc_lblEventName.insets = new Insets(0, 0, 5, 5);
		gbc_lblEventName.gridx = 3;
		gbc_lblEventName.gridy = 6;
		add(lblEventName, gbc_lblEventName);
		
		textNewEventName = new JTextField();
		GridBagConstraints gbc_textNewEventName = new GridBagConstraints();
		gbc_textNewEventName.insets = new Insets(0, 0, 5, 5);
		gbc_textNewEventName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNewEventName.gridx = 5;
		gbc_textNewEventName.gridy = 6;
		add(textNewEventName, gbc_textNewEventName);
		textNewEventName.setColumns(10);
		
		JLabel lblActivityName = new JLabel("Activity Name :");
		GridBagConstraints gbc_lblActivityName = new GridBagConstraints();
		gbc_lblActivityName.anchor = GridBagConstraints.EAST;
		gbc_lblActivityName.insets = new Insets(0, 0, 5, 5);
		gbc_lblActivityName.gridx = 3;
		gbc_lblActivityName.gridy = 7;
		add(lblActivityName, gbc_lblActivityName);
		
		textNewActivityName = new JTextField();
		GridBagConstraints gbc_textNewActivityName = new GridBagConstraints();
		gbc_textNewActivityName.insets = new Insets(0, 0, 5, 5);
		gbc_textNewActivityName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNewActivityName.gridx = 5;
		gbc_textNewActivityName.gridy = 7;
		add(textNewActivityName, gbc_textNewActivityName);
		textNewActivityName.setColumns(10);
		
		JLabel lblContributorFirstname = new JLabel("Contributor Firstname :");
		GridBagConstraints gbc_lblContributorFirstname = new GridBagConstraints();
		gbc_lblContributorFirstname.anchor = GridBagConstraints.EAST;
		gbc_lblContributorFirstname.insets = new Insets(0, 0, 5, 5);
		gbc_lblContributorFirstname.gridx = 3;
		gbc_lblContributorFirstname.gridy = 8;
		add(lblContributorFirstname, gbc_lblContributorFirstname);
		
		textNewContributorFirstName = new JTextField();
		GridBagConstraints gbc_textNewContributorFirstName = new GridBagConstraints();
		gbc_textNewContributorFirstName.insets = new Insets(0, 0, 5, 5);
		gbc_textNewContributorFirstName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNewContributorFirstName.gridx = 5;
		gbc_textNewContributorFirstName.gridy = 8;
		add(textNewContributorFirstName, gbc_textNewContributorFirstName);
		textNewContributorFirstName.setColumns(10);
		
		JLabel lblContributorName = new JLabel("Contributor Name :");
		GridBagConstraints gbc_lblContributorName = new GridBagConstraints();
		gbc_lblContributorName.anchor = GridBagConstraints.EAST;
		gbc_lblContributorName.insets = new Insets(0, 0, 5, 5);
		gbc_lblContributorName.gridx = 3;
		gbc_lblContributorName.gridy = 9;
		add(lblContributorName, gbc_lblContributorName);
		
		textNewContributorName = new JTextField();
		GridBagConstraints gbc_textNewContributorName = new GridBagConstraints();
		gbc_textNewContributorName.insets = new Insets(0, 0, 5, 5);
		gbc_textNewContributorName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNewContributorName.gridx = 5;
		gbc_textNewContributorName.gridy = 9;
		add(textNewContributorName, gbc_textNewContributorName);
		textNewContributorName.setColumns(10);
		
		JLabel lblBeginDate = new JLabel("Begin Date :");
		GridBagConstraints gbc_lblBeginDate = new GridBagConstraints();
		gbc_lblBeginDate.anchor = GridBagConstraints.EAST;
		gbc_lblBeginDate.insets = new Insets(0, 0, 5, 5);
		gbc_lblBeginDate.gridx = 3;
		gbc_lblBeginDate.gridy = 10;
		add(lblBeginDate, gbc_lblBeginDate);
		
		textNewBeginDate = new JTextField();
		GridBagConstraints gbc_textNewBeginDate = new GridBagConstraints();
		gbc_textNewBeginDate.insets = new Insets(0, 0, 5, 5);
		gbc_textNewBeginDate.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNewBeginDate.gridx = 5;
		gbc_textNewBeginDate.gridy = 10;
		add(textNewBeginDate, gbc_textNewBeginDate);
		textNewBeginDate.setColumns(10);
		
		JLabel lblEndDate = new JLabel("End Date :");
		GridBagConstraints gbc_lblEndDate = new GridBagConstraints();
		gbc_lblEndDate.anchor = GridBagConstraints.EAST;
		gbc_lblEndDate.insets = new Insets(0, 0, 5, 5);
		gbc_lblEndDate.gridx = 3;
		gbc_lblEndDate.gridy = 11;
		add(lblEndDate, gbc_lblEndDate);
		
		textNewEndDate = new JTextField();
		GridBagConstraints gbc_textNewEndDate = new GridBagConstraints();
		gbc_textNewEndDate.insets = new Insets(0, 0, 5, 5);
		gbc_textNewEndDate.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNewEndDate.gridx = 5;
		gbc_textNewEndDate.gridy = 11;
		add(textNewEndDate, gbc_textNewEndDate);
		textNewEndDate.setColumns(10);
		
		JRadioButton rdbtnReccurence = new JRadioButton("Reccurence");
		GridBagConstraints gbc_rdbtnReccurence = new GridBagConstraints();
		gbc_rdbtnReccurence.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnReccurence.gridx = 5;
		gbc_rdbtnReccurence.gridy = 12;
		add(rdbtnReccurence, gbc_rdbtnReccurence);
		
		JLabel lblLastReccurence = new JLabel("Last Reccurence :");
		GridBagConstraints gbc_lblLastReccurence = new GridBagConstraints();
		gbc_lblLastReccurence.anchor = GridBagConstraints.EAST;
		gbc_lblLastReccurence.insets = new Insets(0, 0, 0, 5);
		gbc_lblLastReccurence.gridx = 3;
		gbc_lblLastReccurence.gridy = 13;
		add(lblLastReccurence, gbc_lblLastReccurence);
		
		textNewLastReccurence = new JTextField();
		GridBagConstraints gbc_textNewLastReccurence = new GridBagConstraints();
		gbc_textNewLastReccurence.insets = new Insets(0, 0, 0, 5);
		gbc_textNewLastReccurence.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNewLastReccurence.gridx = 5;
		gbc_textNewLastReccurence.gridy = 13;
		add(textNewLastReccurence, gbc_textNewLastReccurence);
		textNewLastReccurence.setColumns(10);

	}

}
