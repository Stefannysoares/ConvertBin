package view;
import javax.swing.JOptionPane;
import controller.ConverteController;



public class Principal {
	
	public static void main(String[] args) {
	
		
		int x = 1001;
				
		while (x <= 2 || x >1000) {
			x = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor de 0 a 1000: "));}     
		
			
		ConverteController.Converte(x);
	} 
}
