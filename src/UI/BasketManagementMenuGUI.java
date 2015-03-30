package UI;

import java.awt.Font;
import java.util.Iterator;
import java.util.TreeSet;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

import Data.OrderLine;
import Data.Product;
import Functions.ProductManagementFacade;
import Functions.ShoppingFacade;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BasketManagementMenuGUI extends JPanel {
	
	public ShoppingFacade myFacade = ShoppingFacade.getShoppingFacade();
	public ProductManagementFacade productFacade = new ProductManagementFacade();
	public JTable table;
	private JTextField txtProductName;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public BasketManagementMenuGUI() {
		this.setSize(640, 480);
		setLayout(null);
		
		JLabel title = new JLabel("Basket Management");
		title.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(10, 49, 628, 35);
		add(title);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 180, 551, 197);
		/*add(scrollPane);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Product ID", "Product name", "Price($)", "Discount(%)", "Quantity"
			}
		));*/
		
		
		
		TreeSet<OrderLine> orderline = myFacade.getBasket().getOrderLine();
		OrderLine[] tab = orderline.toArray(new OrderLine[0]);
		String[] headers = {"Product ID", "Product name", "Price($)", "Discount(%)", "Quantity"};
		Object [][] orders = new String [orderline.size()][headers.length];
        Iterator<OrderLine> iter=orderline.iterator();
        int i = 0;
        while(iter.hasNext())
		{
        	OrderLine order = iter.next();

        	orders[i][0] = Integer.toString(order.getProduct().getProductCategoryID());
			orders[i][1] = order.getProduct().getProductName();
			orders[i][2] = Float.toString(order.getProduct().getProductPrice());
			orders[i][3] = Float.toString(order.getProduct().getProductDiscount());
			orders[i][4] = Integer.toString(order.getQuantity());

			i++;

		}
        add(scrollPane);
		table = new JTable(orders,headers);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);


		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new HomePanel());
			}
		});
		btnNewButton.setBounds(277, 401, 100, 23);
		add(btnNewButton);
		
		JLabel lblEnterTheProduct = new JLabel("Enter the product name :");
		lblEnterTheProduct.setBounds(39, 131, 135, 14);
		add(lblEnterTheProduct);
		
		txtProductName = new JTextField();
		txtProductName.setBounds(181, 128, 86, 20);
		add(txtProductName);
		txtProductName.setColumns(10);
		
		JLabel lblQuantity = new JLabel("Quantity :");
		lblQuantity.setBounds(284, 131, 69, 14);
		add(lblQuantity);
		
		textField = new JTextField();
		textField.setBounds(343, 128, 34, 20);
		add(textField);
		textField.setColumns(10);
		
		JButton btnAddToBasket = new JButton("Add to basket");
		btnAddToBasket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Product product =productFacade.getProduct(txtProductName.getText());
				myFacade.addProductToBasket(product, Integer.parseInt(textField.getText()));
				System.out.println(myFacade.getBasket().getUser().getUsername());//"quantity : "+LoginGUI.basket.getUser().getUsername());
							}
		});
		btnAddToBasket.setBounds(405, 127, 116, 23);
		add(btnAddToBasket);
		
		JButton btnPayment = new JButton("payment");
		btnPayment.setBounds(165, 398, 102, 29);
		add(btnPayment);
		btnPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.getMainFrame().setMainPanel(new PaymentUI(myFacade.getBasket().getBasketPrice()));
			}
		});
		
		if(myFacade.getBasket() == null){
			JLabel lblNumberOfArticles = new JLabel("Number of articles in your basket : 0 ");
			lblNumberOfArticles.setBounds(39, 95, 482, 14);	
			add(lblNumberOfArticles);
		}
		else {
			JLabel lblNumberOfArticles = new JLabel("Number of articles in your basket : "+ myFacade.getBasket().getOrderLine().size());
			lblNumberOfArticles.setBounds(39, 95, 482, 14);
			add(lblNumberOfArticles);
		}

		
		
	}
}
