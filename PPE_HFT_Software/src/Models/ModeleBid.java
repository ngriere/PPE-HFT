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
public class ModeleBid extends AbstractTableModel {

    private final List<Bid> orderbookBid = new ArrayList<Bid>();
    private final String[] entetes = {"Volume", "Price"};

    public ModeleBid() {

        super();

        orderbookBid.add(new Bid("1", "1"));
        orderbookBid.add(new Bid("1", "1"));

    }

    public int getRowCountB() {
        return orderbookBid.size();
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
                return orderbookBid.get(rowIndex).getvolumeB();
            case 1:
                return orderbookBid.get(rowIndex).getpriceB();

            default:
                return null; //Ne devrait jamais arriver
        }
    }

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
