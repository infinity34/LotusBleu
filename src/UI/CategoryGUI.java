

package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Functions.CategoryFacade;

import UI.MainFrame;


public class CategoryGUI {
	
	private UI.MainFrame frmLotusBleu;
	private CategoryFacade facade;
	
	public CategoryGUI()
	{
		frmLotusBleu = UI.MainFrame.getMainFrame();
		facade = CategoryFacade.getFacade();
		frmLotusBleu.setMainPanel(new CategoryManagementMenu());
		frmLotusBleu.setVisible(true);		
	}	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CategoryGUI window = new CategoryGUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 }
