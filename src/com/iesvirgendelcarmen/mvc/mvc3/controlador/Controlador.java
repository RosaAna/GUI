package com.iesvirgendelcarmen.mvc.mvc3.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

import com.iesvirgendelcarmen.mvc.mvc1.modelo.Sexo;
import com.iesvirgendelcarmen.mvc.mvc3.modelo.Colectivo;
import com.iesvirgendelcarmen.mvc.mvc3.modelo.ModeloTabla;
import com.iesvirgendelcarmen.mvc.mvc3.modelo.Persona;

import com.iesvirgendelcarmen.mvc.mvc3.vista.Vista;

public class Controlador implements ActionListener, TableModelListener {

	private Vista vista;
	private Colectivo colectivo;
	private List<Persona> listaPersona;
	private List<Persona> listaReset = new ArrayList<>();;
	private List<String>  listaLenguajes = new ArrayList<>();
	private Set<String>   conjutoLenguajes = new HashSet<>();
	private Set<String>   conjutoRazas = new HashSet<>();
	private List<Persona> listaFiltrada = new ArrayList<>();
	private int contador = 0;
	private String path;

	public Controlador(Vista vista) {
		this.vista = vista;

		registrarComponentes();
	}


	private void colocarFormularioPersona(int i, List<Persona> lista) {
		System.out.println(lista);

		vista.getTextFieldNombre().setText(
				lista.get(i).getNombre());
		vista.getTextFieldApellidos().setText(
				lista.get(i).getApellidos());
		vista.getTextFieldGenero().setText(
				lista.get(i).getGenero()+"");
		vista.getTextFieldLenguaje().setText(
				lista.get(i).getLenguaje());
		vista.getTextFieldRaza().setText(
				lista.get(i).getRaza());

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
		vista.getBotonSalir().addActionListener(this);
		vista.getBotonBuscar().addActionListener(this);
		vista.getBotonReset().addActionListener(this);


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
			System.out.println(textoBoton);
			switch (textoBoton) {
			case ">":
				System.out.println("pulsado " + textoBoton);
				contador++;
				break;
			case ">>":
				System.out.println("pulsado " + textoBoton);
				contador += 10;
				break;
			case "<":
				System.out.println("pulsado " + textoBoton);
				contador--;
				break;
			case "<<":
				System.out.println("pulsado " + textoBoton);
				contador -= 10;
				break;
			case "Salir":
				salirAplicacion();
			case "Filtrar":

				String lenguaje = (String) vista.getComboBoxLenguaje()
				.getSelectedItem();
				String raza     = (String) vista.getComboBoxRaza()
						.getSelectedItem();
				String sexo = vista.getBgGroup()
						.getSelection().getActionCommand();

				System.out.println(lenguaje + " " + raza + " " +sexo );

				for (Persona persona : listaPersona) {
					if ((persona.getLenguaje().equals(lenguaje) ||
							persona.getRaza().equals(raza)) &&
							persona.getGenero().toString().equals(
									sexo.toUpperCase()))
						listaFiltrada.add(persona);
				}
				listaPersona = listaFiltrada;
				contador = 0;
				break;
			case "Reset" :
				listaPersona = listaReset;
				contador = 0;
				break;
			default:
				break;
			}
			contador = contador % listaPersona.size();
			contador %= listaPersona.size();  
			if (contador < 0)
				contador += listaPersona.size();
			colocarFormularioPersona(contador, listaPersona);
		}

	}


	private void lanzarEleccionFichero() {

		JFileChooser jFileChooser = new JFileChooser(".");
		int resultado = jFileChooser.showOpenDialog(vista.getFrame());
		if (resultado == jFileChooser.APPROVE_OPTION) {
			path = jFileChooser.getSelectedFile().getPath();
			colectivo = new Colectivo(path);
			listaPersona = colectivo.getListaPersona();
			for (Persona persona : listaPersona) {
				listaReset.add(persona);
				conjutoLenguajes.add(persona.getLenguaje());
				conjutoRazas.add(persona.getRaza());
			}
			//System.out.println("Tamaño lista " + listaLenguajes.size());
			//System.out.println("Tamaño conjunto " + conjutoLenguajes.size());
			for (String string : conjutoLenguajes) {
				vista.getComboBoxLenguaje().addItem(string);
			}
			for (String string : conjutoRazas) {
				vista.getComboBoxRaza().addItem(string);
			}
			colocarFormularioPersona(contador, listaPersona);
			vista.getBotonMas1().setEnabled(true);
			vista.getBotonMas10().setEnabled(true);
			vista.getBotonMenos1().setEnabled(true);
			vista.getBotonMenos10().setEnabled(true);
			vista.getMenuItemCargar().setEnabled(false);
			vista.getComboBoxLenguaje().setEnabled(true);
			vista.getComboBoxRaza().setEnabled(true);
			vista.getBotonReset().setEnabled(true);
			vista.getBotonBuscar().setEnabled(true);
			ModeloTabla mtTabla = new ModeloTabla(colectivo);
			JTable jTable = new JTable(mtTabla);
			jTable.getModel().addTableModelListener(this);
			vista.getScrollPane().setViewportView(jTable);
			
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
	@Override
	public void tableChanged(TableModelEvent e) {
		// TODO Auto-generated method stub
		
	}

}
