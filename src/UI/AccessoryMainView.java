package UI;

import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ListModel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JList;

import Data.Accessory;
import Functions.AccessoryFacade;

public class AccessoryMainView extends JPanel {
	
	private AccessoryFacade myFacade = new AccessoryFacade();
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
		lblNewLabel_1.setBounds(286, 151, 312, 16);
		add(lblNewLabel_1);
		
		JButton btnAddAnAccessory = new JButton("Add an accessory");
		btnAddAnAccessory.setBounds(286, 181, 300, 29);
		add(btnAddAnAccessory);
		
		JButton btnUpdateAnAccessory = new JButton("Update an accessory");
		btnUpdateAnAccessory.setBounds(286, 237, 300, 29);
		add(btnUpdateAnAccessory);
		
		JButton btnDeleteAnAccessory = new JButton("Delete an accessory");
		btnDeleteAnAccessory.setBounds(286, 295, 300, 29);
		add(btnDeleteAnAccessory);
		
		//Create listModel
		DefaultListModel listModel = new DefaultListModel();
		//Get all accessories
		 ArrayList<Accessory> accessories = myFacade.getAccessories();
		 
		 //Fill the model
		 int size = accessories.size();
		 for(int index=0; index<size; index++)
		 {
		      listModel.addElement(accessories.get(index).getAccessoryName());
		 }
		 JList liste = new JList(listModel);
		 liste.setBounds(26, 181, 173, 178);
		 //liste.addListSelectionListener(this);
		 add(liste);
		 
		 JLabel lblAllAccessories = new JLabel("The list of accessories existing:");
		 lblAllAccessories.setBounds(16, 142, 231, 35);
		 add(lblAllAccessories);
		 revalidate();
		
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
