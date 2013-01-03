package windows;

import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class MBar extends JMenuBar {
	public JMenuItem item2, item3, item4, mitem;
	public JRadioButtonMenuItem playerItem[] = new JRadioButtonMenuItem[5];
	private ButtonGroup playerGroup = new ButtonGroup();
	private JMenu menu1;
	public JMenu menu11;
	public MBar(){
		
		menu1 = new JMenu("Game");
		mitem = new JMenuItem("New Game");
		item2 = new JMenuItem("Continue");
		item3 = new JMenuItem("Score");
		item4 = new JMenuItem("Close");


		menu1.add(mitem);
		menu1.add(item2);
		menu1.add(item3);
		menu1.addSeparator();
		menu1.add(item4);
		this.add(menu1);
		
	}

}
