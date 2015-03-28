package UI;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.text.NumberFormatter;

import Data.Category;
import Data.Product;
import Functions.ProductManagementFacade;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JComboBox;

public class ProductManagementUpdateProductFieldGUI extends JPanel {

	private JTextField productNameTextField;
	private JComboBox listCategory;
	private JSpinner price;
	private JSpinner quantity;
	private JSpinner discount;
	private int id;
	
	
	public ProductManagementUpdateProductFieldGUI(Product product) {
		id = product.getProductID();
		this.setSize(640, 480);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblAddAProduct = new JLabel("Add a Product");
		lblAddAProduct.setFont(new Font("Dialog", Font.BOLD, 20));
		springLayout.putConstraint(SpringLayout.NORTH, lblAddAProduct, 38, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblAddAProduct, -232, SpringLayout.EAST, this);
		add(lblAddAProduct);
		
		JLabel lblProductName = new JLabel("Product name :");
		add(lblProductName);
		
		productNameTextField = new JTextField(product.getProductName());
		
		springLayout.putConstraint(SpringLayout.NORTH, productNameTextField, 53, SpringLayout.SOUTH, lblAddAProduct);
		springLayout.putConstraint(SpringLayout.WEST, productNameTextField, 40, SpringLayout.EAST, lblProductName);
		springLayout.putConstraint(SpringLayout.NORTH, lblProductName, 2, SpringLayout.NORTH, productNameTextField);
		add(productNameTextField);
		productNameTextField.setColumns(10);
		
		JLabel lblProductsPrice = new JLabel("Product's price");
		springLayout.putConstraint(SpringLayout.WEST, lblProductsPrice, 101, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, lblProductName, 0, SpringLayout.WEST, lblProductsPrice);
		add(lblProductsPrice);
		
		JLabel lblProductQuantity = new JLabel("Product quantity :");
		springLayout.putConstraint(SpringLayout.NORTH, lblProductQuantity, 201, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblProductQuantity, 100, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblProductsPrice, -28, SpringLayout.NORTH, lblProductQuantity);
		add(lblProductQuantity);
		
		JLabel lblProductDiscount = new JLabel("Product discount :");
		springLayout.putConstraint(SpringLayout.WEST, lblProductDiscount, 101, SpringLayout.WEST, this);
		add(lblProductDiscount);
		
		JButton btnAdd = new JButton("Add");
		springLayout.putConstraint(SpringLayout.WEST, btnAdd, 0, SpringLayout.WEST, lblAddAProduct);
		springLayout.putConstraint(SpringLayout.SOUTH, btnAdd, -76, SpringLayout.SOUTH, this);
		add(btnAdd);
		
		JButton btnBack = new JButton("< Back");
		springLayout.putConstraint(SpringLayout.WEST, btnBack, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnBack, -10, SpringLayout.SOUTH, this);
		add(btnBack);
		
		JLabel lblProductCategory = new JLabel("Product category :");
		springLayout.putConstraint(SpringLayout.NORTH, lblProductCategory, 289, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblProductDiscount, -29, SpringLayout.NORTH, lblProductCategory);
		add(lblProductCategory);
		
		listCategory = new JComboBox();
		springLayout.putConstraint(SpringLayout.EAST, lblProductCategory, -17, SpringLayout.WEST, listCategory);
		springLayout.putConstraint(SpringLayout.NORTH, listCategory, -5, SpringLayout.NORTH, lblProductCategory);
		springLayout.putConstraint(SpringLayout.WEST, listCategory, 0, SpringLayout.WEST, lblAddAProduct);
		springLayout.putConstraint(SpringLayout.EAST, listCategory, -278, SpringLayout.EAST, this);
		
		ArrayList<Category> allCategory =  Functions.CategoryFacade.getFacade().getAllCategory();
		
		for(int i = 0 ; i< allCategory.size(); i++)
		{
			listCategory.addItem(allCategory.get(i).getCategoryName());
		}
		add(listCategory);
		
		price = new JSpinner(new SpinnerNumberModel(product.getProductPrice(),
                0, 
                5000, 
                0.1));               
		springLayout.putConstraint(SpringLayout.NORTH, price, 24, SpringLayout.SOUTH, productNameTextField);
		springLayout.putConstraint(SpringLayout.WEST, price, 0, SpringLayout.WEST, lblAddAProduct);
		springLayout.putConstraint(SpringLayout.EAST, price, 0, SpringLayout.EAST, productNameTextField);
		add(price);
		JFormattedTextField priceForm = ((JSpinner.NumberEditor) price.getEditor()).getTextField();
		NumberFormatter formatter = ((NumberFormatter)priceForm.getFormatter());
		DecimalFormat decimalFormat = new DecimalFormat("0.0"); 
		formatter.setFormat(decimalFormat); 
		((NumberFormatter)priceForm.getFormatter()).setAllowsInvalid(false);
		
		quantity = new JSpinner(new SpinnerNumberModel(product.getProductQuantity(),
                0, 
                5000, 
                1));
		JFormattedTextField quantityForm = ((JSpinner.NumberEditor) quantity.getEditor()).getTextField();
		((NumberFormatter)quantityForm.getFormatter()).setAllowsInvalid(false);
		springLayout.putConstraint(SpringLayout.NORTH, quantity, 23, SpringLayout.SOUTH, price);
		springLayout.putConstraint(SpringLayout.WEST, quantity, 0, SpringLayout.WEST, lblAddAProduct);
		springLayout.putConstraint(SpringLayout.EAST, quantity, 0, SpringLayout.EAST, productNameTextField);
		add(quantity);
		
		discount = new JSpinner(new SpinnerNumberModel(product.getProductDiscount(),
                0, 
                100, 
                1));
		JFormattedTextField discountForm = ((JSpinner.NumberEditor) discount.getEditor()).getTextField();
		((NumberFormatter)discountForm.getFormatter()).setAllowsInvalid(false);
		
		springLayout.putConstraint(SpringLayout.WEST, discount, 19, SpringLayout.EAST, lblProductDiscount);
		springLayout.putConstraint(SpringLayout.SOUTH, discount, -21, SpringLayout.NORTH, listCategory);
		springLayout.putConstraint(SpringLayout.EAST, discount, 0, SpringLayout.EAST, productNameTextField);
		add(discount);
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.MainFrame.getMainFrame().setMainPanel(new ProductManagementMenuGUI());
				}
			});
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(productNameTextField.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(new CategoryManagementAddCategoryGUI(),"you must give a name to your product !");
				}
				else
				{
					String nameSel = productNameTextField.getText();
					float priceSel = ((Number)price.getValue()).floatValue();
					float discountSel = ((Number)discount.getValue()).floatValue();
					int quantitySel = ((Number)quantity.getValue()).intValue();
					String motherCategory = (String)listCategory.getSelectedItem();
					
					if(ProductManagementFacade.getFacade().updateProduct(id,nameSel, priceSel, discountSel, quantitySel, motherCategory))
					{
						JOptionPane.showMessageDialog(new CategoryManagementMenuGUI(),"Product updated !");
						UI.MainFrame.getMainFrame().setMainPanel(new ProductManagementMenuGUI());
					}
					else
					{
						JOptionPane.showMessageDialog(new ProductManagementAddProductGUI(),"Product name already taken !");
					}
				}
			}
		});
		
	}
}
