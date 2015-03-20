

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
		frmLotusBleu = new UI.MainFrame();
		
		facade = CategoryFacade.getFacade();
	}

	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CategoryGUI window = new CategoryGUI();
					window.frmLotusBleu.setVisible(true);
					window.frmLotusBleu.setMainPanel(new CategoryManagementMenu());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 }
