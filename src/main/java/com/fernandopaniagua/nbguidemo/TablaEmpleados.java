/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernandopaniagua.nbguidemo;

import com.fernandopaniagua.generadordatos.Empleado;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TablaEmpleados implements TableModel{
    private ArrayList<Empleado> empleados;
    private static final String[] COLUMNAS = {"Id","Nombre","Primer apellido", "Segundo apellido", "Categoría", "Salario"};
    private static final Class[] CLASES = {Integer.class, String.class, String.class, String.class, String.class, Integer.class};
    
    
    public TablaEmpleados(ArrayList<Empleado> empleados){
        this.empleados = empleados;
    }
    
    @Override
    public int getRowCount() {
        return this.empleados.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNAS.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return COLUMNAS[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return CLASES[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return this.empleados.get(rowIndex).getId();
            case 1:
                return this.empleados.get(rowIndex).getNombre();
            case 2:
                return this.empleados.get(rowIndex).getApellido1();
            case 3:
                return this.empleados.get(rowIndex).getApellido2();
            case 4:
                return this.empleados.get(rowIndex).getPuesto();
            case 5:
                return this.empleados.get(rowIndex).getSalarioAnual();    
        }       
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        //NO HAGAS NADA
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        //NO HAGAS NADA
    }
    
}
