package windows;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;

public class MainMenuFrame extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel pnl2 = new JPanel();
	private JPanel pnl3 = new JPanel();
	public JLabel lbl3 = new JLabel(); 
	private MBar mbar = new MBar();
	private String pp="unkmown";
	int p1=0;	
	private int n;
	private JTextField nn[];
	private JInternalFrame iframe = new JInternalFrame();
	private String[] CName=null;
	public MainMenuFrame() {

		/*for(int i=0; i<5; i++)	
			mbar.playerItem[i].addActionListener(this);*/
		
		mbar.mitem.addActionListener(this);
		mbar.item4.addActionListener(this);
		add(mbar,BorderLayout.NORTH);
		
		add(iframe);
				
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		
		if(e.getSource() == mbar.mitem)
		{
			setPlayers();
		}

	}
	
	public void setPlayers(){
			String[] plys= {"2","3","4","5"};
			Object input  = null;
			input = JOptionPane.showInputDialog(null,"How many players?","Choose Players",
					JOptionPane.QUESTION_MESSAGE,null,plys, plys[0]);
			System.out.println(input);
			String[] tempN;
			
			if(input == plys[0])
			{
				//setNames(3);
				tempN = setNames(3);
				settable(3,tempN);
			}
			else if(input == plys[1])
			{
				tempN =setNames(4);
				settable(4,tempN);
			}
			else if(input == plys[2])
			{
				tempN =setNames(5);
				settable(5,tempN);
			}	else if(input == plys[3])
			{
				tempN =setNames(6);
				settable(6,tempN);
			}
			
			
			iframe.setVisible(true);
			iframe.add(pnl2);
			MainMenuFrame.this.add(iframe);
			
			
		}
	
	public String[] setNames(int numP)
	{
		CName = new String[numP];
		CName[0] = "Round";
		for (int j = 1; j < numP; j++)
			CName[j] = "player" + j;
		
		for (int j =1; j<numP; j++)
		{
			CName[j] = JOptionPane.showInputDialog(null, "Player"+j+ ":", "Type Name",
				JOptionPane.QUESTION_MESSAGE);
		}
		
		return CName;
	}
	public void settable(int numP, String[] CName)
	{
		pnl3.removeAll();
		
		Splitpane settable = new Splitpane(numP,CName);
		pnl3.add(settable);
		pnl2.add(pnl3);
	}

}

