

package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Functions.CategoryFacade;

import UI.MainFrame;


public class CategoryGUI {
	
	//private UI.MainFrame frmLotusBleu;
	private CategoryFacade facade;
	
	public CategoryGUI()
	{
		facade = CategoryFacade.getFacade();
		MainFrame.getMainFrame().setMainPanel(new CategoryManagementMenuGUI());
		MainFrame.getMainFrame().setVisible(true);		
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
