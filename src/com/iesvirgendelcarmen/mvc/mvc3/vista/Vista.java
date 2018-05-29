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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

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
	
	private JButton botonMenos1;
	private JButton botonMas10;
	private JButton botonMas1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JRadioButton botonHombre;
	private JRadioButton botonMujer;
	private JLabel lblNewLabel;
	private JComboBox comboBoxLenguaje;
	private JLabel lblNewLabel_1;
	private JComboBox comboBoxRaza;
	private JButton botonBuscar;
	private JButton botonSalir;
	private JButton botonReset;
	private ButtonGroup bgGroup;
	//private JTable table;
	

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

	
	public JButton getBotonBuscar() {
		return botonBuscar;
	}

	public JButton getBotonSalir() {
		return botonSalir;
	}

	public JButton getBotonReset() {
		return botonReset;
	}

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

	

	
	public JComboBox getComboBoxLenguaje() {
		return comboBoxLenguaje;
	}

	public JComboBox getComboBoxRaza() {
		return comboBoxRaza;
	}

	/*public void setTable(JTable table) {
		this.table = table;
	}*/

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

	public ButtonGroup getBgGroup() {
		return bgGroup;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
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
		
		//String[] columnNames = 
		//	{"First Name", "Last Name", "Sport", "# of Years", "Vegetarian"};
		/*Object[][] data = {
			    {"Kathy", "Smith", "Snowboarding", new Integer(5), new Boolean(false)},
			    {"John", "Doe", "Rowing", new Integer(3), new Boolean(true)},
			    {"Sue", "Black", "Knitting", new Integer(2), new Boolean(false)},
			    {"Jane", "White", "Speed reading", new Integer(20), new Boolean(true)},
			    {"Joe", "Brown", "Pool", new Integer(10), new Boolean(false)}
			};*/
	//	table = new JTable();
	//	scrollPane.setViewportView(table);
		botonMas1.setEnabled(false);
		botonMas10.setEnabled(false);
		botonMenos1.setEnabled(false);
		botonMenos10.setEnabled(false);
		
		panel_2 = new JPanel();
		splitPane_1.setLeftComponent(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_3 = new JPanel();
		panel_2.add(panel_3);
		
		bgGroup = new ButtonGroup();
		
		botonHombre = new JRadioButton("Hombre");
		botonHombre.setActionCommand("hombre");
		botonHombre.setSelected(true);
		panel_3.add(botonHombre);
		
		botonMujer = new JRadioButton("Mujer");
		botonMujer.setActionCommand("mujer");
		panel_3.add(botonMujer);
		bgGroup.add(botonHombre);
		bgGroup.add(botonMujer);
		
		panel_4 = new JPanel();
		panel_2.add(panel_4);
		
		lblNewLabel = new JLabel("Lenguaje");
		panel_4.add(lblNewLabel);
		
	//	String[] items = {"item1", "item2", "item3","item4", "item5" };
		comboBoxLenguaje = new JComboBox();
		panel_4.add(comboBoxLenguaje);
		comboBoxLenguaje.setEnabled(false);
		
		panel_5 = new JPanel();
		panel_2.add(panel_5);
		
		lblNewLabel_1 = new JLabel("Raza");
		panel_5.add(lblNewLabel_1);
		
		comboBoxRaza = new JComboBox();
		panel_5.add(comboBoxRaza);
		comboBoxRaza.setEnabled(false);

		
		panel_6 = new JPanel();
		panel_2.add(panel_6);
		
		botonBuscar = new JButton("Filtrar");
		panel_6.add(botonBuscar);
		
		botonReset = new JButton("Reset");
		panel_6.add(botonReset);
		
		botonSalir = new JButton("Salir");
		botonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_6.add(botonSalir);
		botonBuscar.setEnabled(false);
		botonReset.setEnabled(false);
	
	}

}
