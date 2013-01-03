package windows;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.table.AbstractTableModel;

public class ctbmodel extends AbstractTableModel{
	private String[] CName;
	private Object[][] data;
	private int getval;
	JTextArea display = null;
	JLabel display2 = null;
	
	public ctbmodel(Object data[][], String CName[])
	{
		this.CName = CName;
		this.data = data;
		
	}
	public void setData(Object data[][])
	{
		this.data = data;
		this.fireTableDataChanged();
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.length;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return CName.length;
	}
	
	@Override
	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		return data[row][col];
	}
	
	public String getColumnName(int col) {
	        return CName[col];
	    }
	
	public boolean isCellEditable(int row, int col)
	{
		if (col == 0)
			return false;
		else
			return true;
	}
	
	public void setValueAt(Object value, int row, int col) {
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }
	
	public void setDisplay(JTextArea display) {
		// TODO Auto-generated method stub
		this.display = display;
	}

}
