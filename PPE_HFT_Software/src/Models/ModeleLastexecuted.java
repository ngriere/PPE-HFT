/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author bachir
 */
public class ModeleLastexecuted extends AbstractTableModel{
    
    private final List<Lastexecuted> lastexecuted= new ArrayList<Lastexecuted>();
   
  private final String[] entetes = {"Timestanp", "Price", "Num Shares"};
  public ModeleLastexecuted() {  
    
    super();

    
    
    
}
    public int getRowCount() {
        return lastexecuted.size();
    }

    public int getColumnCount() {
        return entetes.length;
    }

    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return lastexecuted.get(rowIndex).gettimestanp();
            case 1:
                return lastexecuted.get(rowIndex).getprice();
            case 2:
                return lastexecuted.get(rowIndex).getnum();
          
            
            default:
                return null; //Ne devrait jamais arriver
        }
}
    
     public void add(Lastexecuted LE) {
        lastexecuted.add(LE);
 
        fireTableRowsInserted(lastexecuted.size() -1, lastexecuted.size() -1);
    }
     
      public void remove(int rowIndex) {
        lastexecuted.remove(rowIndex);
 
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
}
