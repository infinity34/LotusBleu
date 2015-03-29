package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import Data.Product;
import Functions.ShoppingFacade;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class ProductView extends JPanel{
	private JTextField name;
	private JTextField price;
	private JTextField discount;
	private JTextField quantity;
	private ShoppingFacade facade;
	
	public ProductView(Product product){
		setLayout(null);
		facade = ShoppingFacade.getShoppingFacade();
		
		JLabel lblName = new JLabel("Product Name :");
		lblName.setBounds(118, 49, 95, 16);
		add(lblName);
		
		JLabel lblPrice = new JLabel("Price :");
		lblPrice.setBounds(118, 110, 56, 16);
		add(lblPrice);
		
		JLabel lblDiscount = new JLabel("Discount : ");
		lblDiscount.setBounds(118, 174, 67, 16);
		add(lblDiscount);
		
		JLabel lblQuantity = new JLabel("Quantity available :");
		lblQuantity.setBounds(118, 253, 120, 16);
		add(lblQuantity);
		
		name = new JTextField();
		name.setEditable(false);
		name.setBounds(267, 46, 116, 22);
		name.setText(product.getProductName());
		add(name);
		name.setColumns(10);
		
		price = new JTextField();
		price.setEditable(false);
		price.setBounds(267, 107, 116, 22);
		price.setText(Float.toString(product.getProductPrice()));
		add(price);
		price.setColumns(10);
		
		discount = new JTextField();
		discount.setEditable(false);
		discount.setBounds(267, 171, 116, 22);
		discount.setText(Float.toString(product.getProductDiscount()));
		add(discount);
		discount.setColumns(10);
		
		quantity = new JTextField();
		quantity.setEditable(false);
		quantity.setBounds(267, 250, 116, 22);
		quantity.setText(Integer.toString(product.getProductQuantity()));
		add(quantity);
		quantity.setColumns(10);
		
		SpinnerModel model = new SpinnerNumberModel(1, 1, product.getProductQuantity(), 1);
		JSpinner spinner = new JSpinner(model);
		spinner.setBounds(238, 366, 30, 22);
		add(spinner);
		
		JLabel lblDesiredQuantity = new JLabel("Desired quantity :");
		lblDesiredQuantity.setBounds(118, 369, 108, 16);
		add(lblDesiredQuantity);
		
		JButton btnAddToCart = new JButton("Add to cart");
		btnAddToCart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int quantity = (Integer)spinner.getValue();
				facade.addProductToBasket(product, quantity);
				MainFrame.getMainFrame().setMainPanel(new BasketManagementMenuGUI());
			}
		});
		btnAddToCart.setBounds(286, 365, 97, 25);
		add(btnAddToCart);
		
	}
}
