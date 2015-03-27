package UI;

import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import Functions.EventFacade;

public class EventDeleteView extends JPanel {
	private JTextField txtEventNameTo;

	/**
	 * Create the panel.
	 */
	public EventDeleteView() {
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
		
		JLabel lblTheEventName = new JLabel("The event name you want to delete :");
		GridBagConstraints gbc_lblTheEventName = new GridBagConstraints();
		gbc_lblTheEventName.anchor = GridBagConstraints.WEST;
		gbc_lblTheEventName.gridwidth = 2;
		gbc_lblTheEventName.insets = new Insets(0, 0, 5, 5);
		gbc_lblTheEventName.gridx = 5;
		gbc_lblTheEventName.gridy = 5;
		add(lblTheEventName, gbc_lblTheEventName);
		
		txtEventNameTo = new JTextField();
		txtEventNameTo.setHorizontalAlignment(SwingConstants.CENTER);
		txtEventNameTo.setText("Event Name To Delete");
		GridBagConstraints gbc_txtEventNameTo = new GridBagConstraints();
		gbc_txtEventNameTo.insets = new Insets(0, 0, 5, 5);
		gbc_txtEventNameTo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEventNameTo.gridx = 5;
		gbc_txtEventNameTo.gridy = 6;
		add(txtEventNameTo, gbc_txtEventNameTo);
		txtEventNameTo.setColumns(10);
		
		JButton btnCancel = new JButton("Cancel");
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.anchor = GridBagConstraints.WEST;
		gbc_btnCancel.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancel.gridx = 4;
		gbc_btnCancel.gridy = 8;
		add(btnCancel, gbc_btnCancel);
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new EventMainView());
			}});
		
		JButton btnSubmit = new JButton("Submit");
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.anchor = GridBagConstraints.WEST;
		gbc_btnSubmit.insets = new Insets(0, 0, 0, 5);
		gbc_btnSubmit.gridx = 6;
		gbc_btnSubmit.gridy = 8;
		add(btnSubmit, gbc_btnSubmit);
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventDeleteNextView nextView = new EventDeleteNextView(EventFacade.getFacade().getEventsWithAName(txtEventNameTo.getText()));
				MainFrame.getMainFrame().setMainPanel(nextView);
			}});

	}

}
