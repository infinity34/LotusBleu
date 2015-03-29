
package UI;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.ToolTipManager;

import Data.Category;
import Data.Product;
import Data.Order;
import Functions.ShoppingFacade;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JSplitPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;




public class ShoppingView extends JPanel implements TreeSelectionListener{
	private DefaultMutableTreeNode root;
	private ShoppingFacade facade;
	private JPanel rightPanel;
	private JTree tree;
	
	public ShoppingView() {
		setLayout(null);
		facade = ShoppingFacade.getShoppingFacade();
		
		
		/* Main SplitPane */
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(0, 0, 640, 480);
		add(splitPane);
		
		/* Left SplitPane component (tree) */
		root = new DefaultMutableTreeNode("Shopping");
		tree = new JTree(root);
		tree.setBorder(new EmptyBorder(2, 4, 0, 0));
		tree.setRootVisible(false);
		tree.addTreeSelectionListener(this);
		
		/* Icons */
		ToolTipManager.sharedInstance().registerComponent(tree);
		tree.setCellRenderer(new CellRenderer());
		
		/* Right SplitPane component */
		rightPanel = new JPanel();
		
		splitPane.setLeftComponent(tree);
		splitPane.setRightComponent(rightPanel);
		splitPane.setOneTouchExpandable(true);
		add(splitPane);
		
		getMainCategories();
		
	}
	
	public void getMainCategories(){
		List<Category> categories = facade.getMainCategories();
		for(int i=0; i<categories.size();i++){
			DefaultMutableTreeNode node = new DefaultMutableTreeNode(categories.get(i),true);
			this.root.add(node);
		}
		this.tree.expandPath(new TreePath(this.tree.getModel().getRoot()));
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		
		DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();

		/* if nothing is selected */ 
		if (node == null) return;
		Object nodeInfo = node.getUserObject();
		if (nodeInfo.getClass().getName().endsWith("Category")){
			
			try{
				List<Category> subCategories = facade.getSubCategories(((Category)node.getUserObject()).getCategoryName());
				List<Product> products = facade.getProductsByCat(((Category)node.getUserObject()).getCategoryID());
				for (int i = 0; i < subCategories.size(); i++){
					node.add(new DefaultMutableTreeNode(subCategories.get(i),true));
				}

				for (int i = 0; i < products.size(); i++){
					node.add(new DefaultMutableTreeNode(products.get(i),false));
				}
				this.tree.expandPath(new TreePath(node.getPath()));
				MainFrame.getMainFrame().requestFocus();
			}catch (ClassCastException ex){
				System.out.println("ClassCastException");
			}
			
		}
		
	}
 }
