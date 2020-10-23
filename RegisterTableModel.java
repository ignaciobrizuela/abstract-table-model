
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import models.TSocio;


/**
 *
 * @author brzig
 */
public class RegisterTableModel extends AbstractTableModel{
    private final int COLUMN_NAME = 0;
    private final int COLUMN_DNI = 1;
    private final int COLUMN_PHONE = 2;
    private final int COLUMN_CATEGORY = 3;
    private final int N_COLUMN = 4;
    
    private ArrayList<TSocio> tSocio_to_show;

    public RegisterTableModel(ArrayList<TSocio> tSocio_to_show) {
        this.tSocio_to_show = tSocio_to_show;
    }
    
    public TSocio getSelectedRegister(int selected_row){
        return tSocio_to_show.get(selected_row);
    }

    @Override
    public int getRowCount() {
        return this.tSocio_to_show.size();
    }

    @Override
    public int getColumnCount() {
        return N_COLUMN;
    }
    
    

    @Override
    public Object getValueAt(int row_index, int column_index) {
        switch (column_index){
            case COLUMN_NAME:
                return this.tSocio_to_show.get(row_index).getName();
            case COLUMN_DNI:
                return this.tSocio_to_show.get(row_index).getDni();
            case COLUMN_PHONE:
                return this.tSocio_to_show.get(row_index).getPhone();
            case COLUMN_CATEGORY:
                return this.tSocio_to_show.get(row_index).getCategory();
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column){
            case COLUMN_NAME:
                return "Nombre y Apellido";
            case COLUMN_DNI:
                return "DNI";
            case COLUMN_PHONE:
                return "Telefono";
            case COLUMN_CATEGORY:
                return "Categoría";
            default:
                throw new IllegalArgumentException();
        }
    }
    
    
    
    
}
