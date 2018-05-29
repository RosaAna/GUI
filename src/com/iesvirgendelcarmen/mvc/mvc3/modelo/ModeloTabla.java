package com.iesvirgendelcarmen.mvc.mvc3.modelo;

import javax.swing.table.AbstractTableModel;

public class ModeloTabla extends AbstractTableModel{

	String[] cabecera;
	Object[][] datos;

	public ModeloTabla (Colectivo colectivo) {
		cabecera = colectivo.getNombreColumnas();
		datos    = colectivo.getData();
	}
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return cabecera.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return datos.length;
	}

	@Override
	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		return datos[row][col];
	}
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return cabecera[column];
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		if (columnIndex < 2)
			return false;
		return true;
	}
	
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		System.out.println(((Persona)aValue).toString());
		System.out.println(datos[rowIndex][columnIndex]);
	}


}
