/*package windows;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class setPlayers extends JLabel{
	private String[] plys= {"1","2","3"};
	private int p1;
	private String pp;
	public JLabel lbl3 = new JLabel(); 
	private MainMenuFrame frame =new MainMenuFrame();
	public setPlayers(){
		String[] plys= {"1","2","3"};
		
		p1 = JOptionPane.showOptionDialog(null, "How many players?", 
				"choose Players", 0, 0, null, plys, plys[0]);
		if (p1 == 0)
			pp = "1 player";
		else if(p1 == 1)
			pp = "2 players";
		else if(p1 == 2)
			pp ="3 players";
		
		lbl3.setText(pp);
		//pnl3.add(lbl3);
		//MainMenuFrame.this.add(pnl3);
		//pnl2.add(lbl3);
		//MainMenuFrame.this.add(pnl2);
		//MainMenuFrame.this.add(lbl3);
		System.out.println(lbl3.getText());
		

		
	}
}
*/