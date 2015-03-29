package UI;

import java.awt.Component;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

@SuppressWarnings("serial")
class CellRenderer extends DefaultTreeCellRenderer {
    Icon categorie;
    Icon produit;

    public CellRenderer() {
        this.categorie = new ImageIcon(CellRenderer.class.getResource("categorie.png"));
        this.produit = new ImageIcon(CellRenderer.class.getResource("produit.png"));
    }

    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        
    	super.getTreeCellRendererComponent(tree, value, sel,expanded, leaf, row, hasFocus);
        
        if (((DefaultMutableTreeNode) value).getUserObject().getClass().getName().contains("Product")) {
            setIcon(produit);
        } else if (((DefaultMutableTreeNode) value).getUserObject().getClass().getName().contains("Category")){
            setIcon(categorie);
        }
        return this;
    }
}