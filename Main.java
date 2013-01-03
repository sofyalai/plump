

import javax.swing.JFrame;


import windows.MainMenuFrame;
import windows.Splitpane;



public class Main {
	
	public static void main (String[] args){
	
	
		MainMenuFrame window1 = new MainMenuFrame();
		window1.setTitle("Plump");
		window1.setBounds(20, 20 ,500, 500);
		window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window1.setVisible(true);
		//Splitpane frame1 = new Splitpane();
	
}
}
