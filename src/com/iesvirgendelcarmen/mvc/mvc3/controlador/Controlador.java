package com.iesvirgendelcarmen.mvc.mvc3.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import com.iesvirgendelcarmen.mvc.mvc3.vista.Vista;

public class Controlador implements ActionListener {
	
	private Vista vista;
	
	
	public Controlador(Vista vista) {
		this.vista = vista;
		registrarComponentes();
	}


	private void registrarComponentes() {
		vista.getMenuItemAcercaDe().addActionListener(this);
		vista.getMenuItemCargar().addActionListener(this);
		vista.getMenuItemSalir().addActionListener(this);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		//agrupamos jmenuitem
		if (e.getSource().getClass() == JMenuItem.class) {
			//System.out.println("pulsado un menú item");
			JMenuItem menuItem = (JMenuItem) e.getSource();
			//identificamos el jmenuitem que genera el evento
			if (menuItem.getText().equals("Salir"))
				salirAplicacion();
			else if (menuItem.getText().equals("Acerca de"))
				desplegarInformacion();
		}
		//agruparemos jbutton

	}


	private void desplegarInformacion() {
		JOptionPane jpJOptionPane = new JOptionPane();
		jpJOptionPane.showMessageDialog(vista.getFrame(), 
				"Creado por MMM", "Información autor",
				JOptionPane.INFORMATION_MESSAGE);
		
	}


	private void salirAplicacion() {
		System.exit(0);
		
	}

}
