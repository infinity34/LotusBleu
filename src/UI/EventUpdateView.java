package UI;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class EventUpdateView extends JPanel {
	private JTextField txtEventNameTo;

	/**
	 * Create the panel.
	 */
	public EventUpdateView() {
		this.setSize(640, 480);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblEventManagement = new JLabel("Event Management");
		lblEventManagement.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		GridBagConstraints gbc_lblEventManagement = new GridBagConstraints();
		gbc_lblEventManagement.insets = new Insets(0, 0, 5, 5);
		gbc_lblEventManagement.gridx = 5;
		gbc_lblEventManagement.gridy = 1;
		add(lblEventManagement, gbc_lblEventManagement);
		
		JLabel lblEnterTheEvent = new JLabel("Enter the event name you want to update :");
		GridBagConstraints gbc_lblEnterTheEvent = new GridBagConstraints();
		gbc_lblEnterTheEvent.anchor = GridBagConstraints.WEST;
		gbc_lblEnterTheEvent.gridwidth = 2;
		gbc_lblEnterTheEvent.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnterTheEvent.gridx = 5;
		gbc_lblEnterTheEvent.gridy = 4;
		add(lblEnterTheEvent, gbc_lblEnterTheEvent);
		
		txtEventNameTo = new JTextField();
		txtEventNameTo.setHorizontalAlignment(SwingConstants.CENTER);
		txtEventNameTo.setText("Event Name To Update");
		GridBagConstraints gbc_txtEventNameTo = new GridBagConstraints();
		gbc_txtEventNameTo.insets = new Insets(0, 0, 5, 5);
		gbc_txtEventNameTo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEventNameTo.gridx = 5;
		gbc_txtEventNameTo.gridy = 5;
		add(txtEventNameTo, gbc_txtEventNameTo);
		txtEventNameTo.setColumns(10);
		
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

	}

}
