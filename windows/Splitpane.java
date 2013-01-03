package windows;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;

import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Splitpane extends JSplitPane implements TableModelListener{
	public JScrollPane scrollPane;
	public JTable table1;
	int sum = 0;
	int numP1 = 0;
	String[][] iniTData ;
	ctbmodel tbmodel ;
	String[] CName1 = null;
	JTextArea display;
	
	
	public Splitpane(int numP, String[] CName) {

		
		super (Splitpane.VERTICAL_SPLIT);
		this.setContinuousLayout(true);
		this.setDividerSize(5);
		this.setDividerLocation(350);
		numP1 = numP;
		CName1 = CName;
		
		iniTData = new String[19][numP];
		for (int i = 0; i < 19; i++)
			for (int j = 0; j < numP; j++)
			{
				iniTData[i][j] = ""+0;
			}
						
		for(int i=0;i<19;i++) 
		{ 
			if(i<10) 
				iniTData[i][0]=""+(10-i);
			else 
				iniTData[i][0]=""+(i-8); 
			 
		}
		 
		/*intCName = new String[numP];
		intCName[0] = "Round";
		for (int j = 1; j < numP; j++)
			intCName[j] = "player" + j;*/

	
		tbmodel = new ctbmodel(iniTData, CName);
		
		table1 = new JTable(tbmodel);
		scrollPane = new JScrollPane(table1);

		table1.setCellSelectionEnabled(true);
		
		table1.getModel().addTableModelListener(this);	
		display = new JTextArea(6, 10);
		display.setText("Results :   ");
		tbmodel.setDisplay(display);
	
		
		/*
		 * final JComboBox frames2 = new JComboBox();
		 * frames2.setSelectedIndex(2); frames2.addActionListener(new
		 * ActionListner()
		 */
		this.setTopComponent(scrollPane);
		this.setBottomComponent(display);
		
	}

	@Override
	public void tableChanged(TableModelEvent e) {
		// TODO Auto-generated method stub
		int row1 = e.getFirstRow();
		int col1 = e.getColumn();
		TableModel model1 = (TableModel) e.getSource();
		String colName = model1.getColumnName(col1);
		Object data1 = model1.getValueAt(row1, col1);
		int[] sumP = new int[numP1] ;
		Object results = "Results:  \n";
		System.out.println(sumP[0]);
		
		for (int j=1; j<numP1; j++)
		{		
			for(int i=0;i<19;i++)
				sumP[j] = Integer.parseInt((String) table1.getValueAt(i, j))+sumP[j];
						
			results += CName1[j]+": "+sumP[j]+"   ";
			
		}
		display.setText((String) results);
		
	
	}
}
