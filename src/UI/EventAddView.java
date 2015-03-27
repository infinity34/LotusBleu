package UI;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;

public class EventAddView extends JPanel {
	private JTextField txtEventName;
	private JTextField txtActivityName;
	private JTextField txtContributorName;
	private JTextField txtContributorName_1;

	/**
	 * Create the panel.
	 */
	public EventAddView() {
		this.setSize(640, 480);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblEventManagement = new JLabel("Event Management");
		lblEventManagement.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		GridBagConstraints gbc_lblEventManagement = new GridBagConstraints();
		gbc_lblEventManagement.insets = new Insets(0, 0, 5, 5);
		gbc_lblEventManagement.gridx = 5;
		gbc_lblEventManagement.gridy = 1;
		add(lblEventManagement, gbc_lblEventManagement);
		
		JLabel lblFillOutThe = new JLabel("Fill out the form to add an event :");
		GridBagConstraints gbc_lblFillOutThe = new GridBagConstraints();
		gbc_lblFillOutThe.insets = new Insets(0, 0, 5, 5);
		gbc_lblFillOutThe.gridx = 5;
		gbc_lblFillOutThe.gridy = 3;
		add(lblFillOutThe, gbc_lblFillOutThe);
		
		txtEventName = new JTextField();
		txtEventName.setText("Event name");
		GridBagConstraints gbc_txtEventName = new GridBagConstraints();
		gbc_txtEventName.insets = new Insets(0, 0, 5, 5);
		gbc_txtEventName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEventName.gridx = 5;
		gbc_txtEventName.gridy = 5;
		add(txtEventName, gbc_txtEventName);
		txtEventName.setColumns(10);
		
		txtActivityName = new JTextField();
		txtActivityName.setText("Activity Name");
		GridBagConstraints gbc_txtActivityName = new GridBagConstraints();
		gbc_txtActivityName.insets = new Insets(0, 0, 5, 5);
		gbc_txtActivityName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtActivityName.gridx = 5;
		gbc_txtActivityName.gridy = 6;
		add(txtActivityName, gbc_txtActivityName);
		txtActivityName.setColumns(10);
		
		txtContributorName = new JTextField();
		txtContributorName.setText("Contributor Firstname");
		GridBagConstraints gbc_txtContributorName = new GridBagConstraints();
		gbc_txtContributorName.insets = new Insets(0, 0, 5, 5);
		gbc_txtContributorName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtContributorName.gridx = 5;
		gbc_txtContributorName.gridy = 7;
		add(txtContributorName, gbc_txtContributorName);
		txtContributorName.setColumns(10);
		
		txtContributorName_1 = new JTextField();
		txtContributorName_1.setText("Contributor Name");
		GridBagConstraints gbc_txtContributorName_1 = new GridBagConstraints();
		gbc_txtContributorName_1.insets = new Insets(0, 0, 0, 5);
		gbc_txtContributorName_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtContributorName_1.gridx = 5;
		gbc_txtContributorName_1.gridy = 8;
		add(txtContributorName_1, gbc_txtContributorName_1);
		txtContributorName_1.setColumns(10);

	}

}
