package Models;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author bachir
 */
public class ModeleAsk extends AbstractTableModel {

    private final List<Ask> orderbookAsk = new ArrayList<Ask>();
    private final String[] entetes = {"Volume", "Price"};

    public ModeleAsk() {

        super();

        orderbookAsk.add(new Ask("1", "1"));
        orderbookAsk.add(new Ask("1", "1"));

    }

    public int getRowCountA() {
        return orderbookAsk.size();
    }

    public int getColumnCount() {
        return entetes.length;
    }

    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return orderbookAsk.get(rowIndex).getvolumeA();
            case 1:
                return orderbookAsk.get(rowIndex).getpriceA();

            default:
                return null; //Ne devrait jamais arriver
        }
    }

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
