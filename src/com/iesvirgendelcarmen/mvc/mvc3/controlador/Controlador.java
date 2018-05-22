package com.iesvirgendelcarmen.mvc.mvc3.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import com.iesvirgendelcarmen.mvc.mvc3.modelo.Colectivo;
import com.iesvirgendelcarmen.mvc.mvc3.modelo.Persona;

import com.iesvirgendelcarmen.mvc.mvc3.vista.Vista;

public class Controlador implements ActionListener {
	
	private Vista vista;
	private Colectivo colectivo;
	private List<Persona> listaPersona;
	private int contador = 0;
	private String path;
	
	public Controlador(Vista vista) {
		this.vista = vista;
		
		registrarComponentes();
	}


	private void colocarFormularioPersona(int i) {
		vista.getTextFieldNombre().setText(
				listaPersona.get(i).getNombre());
		vista.getTextFieldApellidos().setText(
				listaPersona.get(i).getApellidos());
		vista.getTextFieldGenero().setText(
				listaPersona.get(i).getGenero()+"");
		vista.getTextFieldLenguaje().setText(
				listaPersona.get(i).getLenguaje());
		vista.getTextFieldRaza().setText(
				listaPersona.get(i).getRaza());
		
	}


	private void registrarComponentes() {
		//registramos item de menú
		vista.getMenuItemAcercaDe().addActionListener(this);
		vista.getMenuItemCargar().addActionListener(this);
		vista.getMenuItemSalir().addActionListener(this);
		//registramos botones
		vista.getBotonMas1().addActionListener(this);
		vista.getBotonMas10().addActionListener(this);
		vista.getBotonMenos1().addActionListener(this);
		vista.getBotonMenos10().addActionListener(this);

		
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
			else
				lanzarEleccionFichero();
		}
		//agruparemos jbutton
		if (e.getSource().getClass() == JButton.class) {
			JButton jButton = (JButton) e.getSource();
			String textoBoton = jButton.getText();
			switch (textoBoton) {
			case ">":
				System.out.println("pulsado " + textoBoton);
				contador++;
			//	colocarFormularioPersona(contador);
				break;
			case ">>":
				System.out.println("pulsado " + textoBoton);
				contador += 10;
			//	colocarFormularioPersona(contador);
				break;
			case "<":
				System.out.println("pulsado " + textoBoton);
				contador--;
			//	colocarFormularioPersona(contador);
				break;
			case "<<":
				System.out.println("pulsado " + textoBoton);
				contador -= 10;
			//	colocarFormularioPersona(contador);
				break;
			default:
				break;
			}
			// contador = contador % listaPersona.size()
			contador %= listaPersona.size();  
			if (contador < 0)
				contador += listaPersona.size();
			colocarFormularioPersona(contador);
		}

	}


	private void lanzarEleccionFichero() {
		JFileChooser jFileChooser = new JFileChooser(".");
		int resultado = jFileChooser.showOpenDialog(vista.getFrame());
		if (resultado == jFileChooser.APPROVE_OPTION) {
			path = jFileChooser.getSelectedFile().getPath();
			colectivo = new Colectivo(path);
			listaPersona = colectivo.getListaPersona();
			colocarFormularioPersona(contador);
		}
		
	
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
