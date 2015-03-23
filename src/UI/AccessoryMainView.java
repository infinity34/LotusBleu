package UI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AccessoryMainView extends JPanel {

	/**
	 * Create the panel.
	 */
	public AccessoryMainView() {
		this.setSize(640, 480);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Accessory Management");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 49, 628, 35);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Choose the action that you will perform");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(6, 108, 628, 16);
		add(lblNewLabel_1);
		
		JButton btnAddAnAccessory = new JButton("Add an accessory");
		btnAddAnAccessory.setBounds(178, 182, 300, 29);
		add(btnAddAnAccessory);
		
		JButton btnUpdateAnAccessory = new JButton("Update an accessory");
		btnUpdateAnAccessory.setBounds(178, 239, 300, 29);
		add(btnUpdateAnAccessory);
		
		JButton btnDeleteAnAccessory = new JButton("Delete an accessory");
		btnDeleteAnAccessory.setBounds(178, 301, 300, 29);
		add(btnDeleteAnAccessory);
		
		btnAddAnAccessory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new AccessoryAddView());
			}
		});
		
		btnUpdateAnAccessory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new AccessoryUpdateView());
			}
		});
		
		btnDeleteAnAccessory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new AccessoryDeleteView());
			}
		});

	}
}
