package com.iesvirgendelcarmen.contenedores;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class PanelesIntermedios {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				JFrame frame = new Ventana();
				frame.setVisible(true);
			}
		});

	}

}
class Ventana extends JFrame{
	
	private JTextArea jTextArea;
	private String texto;
	private JTextField jTextFieldLogin;
	private JPasswordField jPasswordField;
	private JButton jButtonAceptar;
	
	public Ventana() {
		texto = "JTabbedPane jTabbedPane = new JTabbedPane();\n"
				+ "JPanel jPanel1 = new JPanel();\n" + 
				"JLabel jLabel1 = new JLabel(\"Panel 1\");\n" + 
				"JTextField jtTextField1 = new JTextField(10);\n" + 
				"jPanel1.add(jLabel1);\n" + 
				"JTabbedPane jTabbedPane = new JTabbedPane();\n"
				+ "JPanel jPanel1 = new JPanel();\n" + 
				"JLabel jLabel1 = new JLabel(\"Panel 1\");\n" + 
				"JTextField jtTextField1 = new JTextField(10);\n" + 
				"jPanel1.add(jLabel1);\n" +
				"JTabbedPane jTabbedPane = new JTabbedPane();\n"
				+ "JPanel jPanel1 = new JPanel();\n" + 
				"JLabel jLabel1 = new JLabel(\"Panel 1\");\n" + 
				"JTextField jtTextField1 = new JTextField(10);\n" + 
				"jPanel1.add(jLabel1);\n" +
				"JTabbedPane jTabbedPane = new JTabbedPane();\n"
				+ "JPanel jPanel1 = new JPanel();\n" + 
				"JLabel jLabel1 = new JLabel(\"Panel 1\");\n" + 
				"JTextField jtTextField1 = new JTextField(10);\n" + 
				"jPanel1.add(jLabel1);\n" +
				"JTabbedPane jTabbedPane = new JTabbedPane();\n"
				+ "JPanel jPanel1 = new JPanel();\n" + 
				"JLabel jLabel1 = new JLabel(\"Panel 1\");\n" + 
				"JTextField jtTextField1 = new JTextField(10);\n" + 
				"jPanel1.add(jLabel1);\n" ;
		crearVentana();
		crearPanelPestannas();
	}

	private void crearPanelPestannas() {
		
		JTabbedPane jTabbedPane = new JTabbedPane();
		JSplitPane jSplitPane = crearJSplitPane();
		jTabbedPane.addTab("Pestaña 1", jSplitPane);
		jTabbedPane.setToolTipTextAt(0, "Panel con jsplitpane");
		
		JScrollPane jPanel2 = crearJScrollPane();	
		jTabbedPane.addTab("Pestaña 2", jPanel2);
		jTabbedPane.setToolTipTextAt(1, "Panel con jscrollpane");
		
		this.add(jTabbedPane);
		
	}

	private JSplitPane crearJSplitPane() {
		JSplitPane jSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				crearJScrollPane(), crearPanelDerecho());
		return jSplitPane;
	}

	private JPanel crearPanelDerecho() {
		JPanel jPanel = new JPanel(new GridLayout(0, 2, 30, 120));
		JLabel jLabelLogin = new JLabel("Usuario: ");
		jPanel.add(jLabelLogin);
		jTextFieldLogin = new JTextField();
		jPanel.add(jTextFieldLogin);
		JLabel jLabelPassword = new JLabel("Contraseña");
		jPanel.add(jLabelPassword);
		jPasswordField = new JPasswordField();
		jPanel.add(jPasswordField);
		jButtonAceptar = new JButton("ACEPTAR");
		jPanel.add(jButtonAceptar);
		return jPanel;
	}

	private JScrollPane crearJScrollPane() {
		jTextArea = new JTextArea(100, 20);
		jTextArea.setText(texto);
		jTextArea.setEditable(false);
		JScrollPane jScrollPane = new JScrollPane(jTextArea);
		return jScrollPane;
	}

	private void crearVentana() {
		
		this.setTitle("Contenedores intermedios");
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	
	
	
	
	
}