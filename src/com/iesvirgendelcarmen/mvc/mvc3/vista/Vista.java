package com.iesvirgendelcarmen.mvc.mvc3.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Vista {

	private JFrame frame;
	public JFrame getFrame() {
		return frame;
	}

	private JMenuItem menuItemCargar;
	private JMenuItem menuItemSalir;
	private JMenuItem menuItemAcercaDe;
	private JTabbedPane tabbedPane_1;
	private JSplitPane splitPane;
	private JTabbedPane tabbedPane;
	private JSplitPane splitPane_1;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JTextField textFieldNombre;
	private JTextField textFieldApellidos;
	private JTextField textFieldGenero;
	private JTextField textFieldLenguaje;
	private JTextField textFieldRaza;
	private JPanel panel_1;
	private JButton botonMenos10;
	public JButton getBotonMenos10() {
		return botonMenos10;
	}

	public JButton getBotonMenos1() {
		return botonMenos1;
	}

	public JButton getBotonMas10() {
		return botonMas10;
	}

	public JButton getBotonMas1() {
		return botonMas1;
	}

	private JButton botonMenos1;
	private JButton botonMas10;
	private JButton botonMas1;
	
	public JTextField getTextFieldRaza() {
		return textFieldRaza;
	}

	public JTextField getTextFieldNombre() {
		return textFieldNombre;
	}

	public JTextField getTextFieldApellidos() {
		return textFieldApellidos;
	}

	public JTextField getTextFieldGenero() {
		return textFieldGenero;
	}

	public JTextField getTextFieldLenguaje() {
		return textFieldLenguaje;
	}

	

	
	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista window = new Vista();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	public JMenuItem getMenuItemCargar() {
		return menuItemCargar;
	}

	public JMenuItem getMenuItemSalir() {
		return menuItemSalir;
	}

	public JMenuItem getMenuItemAcercaDe() {
		return menuItemAcercaDe;
	}

	/**
	 * Create the application.
	 */
	public Vista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnDatos = new JMenu("Datos");
		menuBar.add(mnDatos);
		
		menuItemCargar = new JMenuItem("Cargar datos");
		mnDatos.add(menuItemCargar);
		
		menuItemSalir = new JMenuItem("Salir");
		mnDatos.add(menuItemSalir);
		
		JMenu mnAcercaDe = new JMenu("Acerca de");
		menuBar.add(mnAcercaDe);
		
		menuItemAcercaDe = new JMenuItem("Acerca de");
		mnAcercaDe.add(menuItemAcercaDe);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		splitPane_1 = new JSplitPane();
		splitPane_1.setResizeWeight(0.25);
		tabbedPane.addTab("Filtros", null, splitPane_1, null);
		
		panel = new JPanel();
		splitPane_1.setRightComponent(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel labelNombre = new JLabel("Nombre");
		panel.add(labelNombre);
		
		textFieldNombre = new JTextField();
		panel.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		JLabel labelApellidos = new JLabel("Apellidos");
		panel.add(labelApellidos);
		
		textFieldApellidos = new JTextField();
		panel.add(textFieldApellidos);
		textFieldApellidos.setColumns(10);
		
		JLabel labelGenero = new JLabel("Genero");
		panel.add(labelGenero);
		
		textFieldGenero = new JTextField();
		panel.add(textFieldGenero);
		textFieldGenero.setColumns(10);
		
		JLabel labelLenguaje = new JLabel("Lenguaje");
		panel.add(labelLenguaje);
		
		textFieldLenguaje = new JTextField();
		panel.add(textFieldLenguaje);
		textFieldLenguaje.setColumns(10);
		
		JLabel labelRaza = new JLabel("Raza");
		panel.add(labelRaza);
		
		textFieldRaza = new JTextField();
		panel.add(textFieldRaza);
		textFieldRaza.setColumns(10);
		
		panel_1 = new JPanel();
		panel.add(panel_1);
		
		botonMenos10 = new JButton("<<");
		panel_1.add(botonMenos10);
		
		botonMenos1 = new JButton("<");
		panel_1.add(botonMenos1);
		
		botonMas1 = new JButton(">");
		panel_1.add(botonMas1);
		
		botonMas10 = new JButton(">>");
		panel_1.add(botonMas10);
		
		scrollPane = new JScrollPane();
		tabbedPane.addTab("Tabla", null, scrollPane, null);
		
		
	
	}

}
