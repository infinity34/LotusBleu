package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SpringLayout;

import Data.Category;
import Data.Product;
import Functions.CategoryFacade;
import Functions.ProductManagementFacade;

public class ProductManagementDisplayAllProductsGUI extends JPanel
{
	private JTable table;
	private JButton btnback;
	public ProductManagementDisplayAllProductsGUI()
	{
		this.setSize( 640, 480);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		btnback = new JButton("< Back");
		springLayout.putConstraint(SpringLayout.WEST, btnback, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnback, -10, SpringLayout.SOUTH, this);
		add(btnback);
		
		ArrayList<Product> allProduct = ProductManagementFacade.getFacade().getAllProduct();
		String[] headers = {"Name", "Price", "Discount", "Quantity", "Category"};
		String [][] product = new String [allProduct.size()][headers.length];
		for (int i = 0 ; i<allProduct.size(); i++)
		{
			product[i][0] = allProduct.get(i).getProductName();
			product[i][1] = Float.toString(allProduct.get(i).getProductPrice());
			product[i][2] = Float.toString(allProduct.get(i).getProductDiscount());
			product[i][3] = Integer.toString(allProduct.get(i).getProductQuantity());
			product[i][4] = ((Category)CategoryFacade.getFacade().getCategory(allProduct.get(i).getProductCategoryID())).getCategoryName();
		}
		
		table = new JTable(product, headers);
		
		springLayout.putConstraint(SpringLayout.NORTH, table, 154, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, table, 295, SpringLayout.WEST, this);
		add(new JScrollPane(table));
		
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.MainFrame.getMainFrame().setMainPanel(new ProductManagementMenuGUI());
				}
			});
		
	}
}
