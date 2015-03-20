package UI;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpinnerListModel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JSpinner;

import Data.Accessory;
import Functions.AccessoryFacade;
import javax.swing.JTextField;
import java.awt.Color;

public class AccessoryUpdateView extends JPanel {

	private AccessoryFacade accessoryFacade;
	private JTextField txtEnterTheName;
	
	/**
	 * Create the panel.
	 */
	public AccessoryUpdateView() {
		this.setSize(640, 480);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Accessory Management");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 49, 628, 35);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the accessory you want to update :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(6, 123, 628, 16);
		add(lblNewLabel_1);
		
		ArrayList<Accessory> accessories = accessoryFacade.getAccessories(); //get all accessories
		SpinnerListModel accessoriesModel = new SpinnerListModel(accessories);
		
		
		JButton btnSubmite = new JButton("Submit");
		btnSubmite.setBounds(406, 228, 117, 29);
		add(btnSubmite);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(122, 228, 117, 29);
		add(btnCancel);
		
		txtEnterTheName = new JTextField();
		txtEnterTheName.setForeground(Color.LIGHT_GRAY);
		txtEnterTheName.setText("Enter the name");
		txtEnterTheName.setBounds(210, 166, 231, 28);
		add(txtEnterTheName);
		txtEnterTheName.setColumns(10);
		
	}
}
