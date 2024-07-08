
package com.mycompany.cenaflix.gui;

import javax.swing.table.DefaultTableModel;

public class EditavelTableModel extends DefaultTableModel {

    @Override
    public boolean isCellEditable(int row, int column) {
      
        return true;
    }
    
}
