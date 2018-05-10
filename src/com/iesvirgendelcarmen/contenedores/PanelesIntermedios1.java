package com.iesvirgendelcarmen.contenedores;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class PanelesIntermedios1 {

	private JFrame frame;
	private String texto;
	private final JScrollPane scrollPane = new JScrollPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelesIntermedios1 window = new PanelesIntermedios1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PanelesIntermedios1() {
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
				"jPanel1.add(jLabel1);\n" +
				 "JPanel jPanel1 = new JPanel();\n" + 
				"JLabel jLabel1 = new JLabel(\"Panel 1\");\n" + 
				"JTextField jtTextField1 = new JTextField(10);\n" + 
				"jPanel1.add(jLabel1);\n" +
				 "JPanel jPanel1 = new JPanel();\n" + 
				"JLabel jLabel1 = new JLabel(\"Panel 1\");\n" + 
				"JTextField jtTextField1 = new JTextField(10);\n" + 
				"jPanel1.add(jLabel1);\n";
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		tabbedPane.addTab("Pestaña1", null, scrollPane, null);
		
		JTextArea textArea = new JTextArea(100, 20);
		textArea.setText(texto);
		textArea.setEditable(false);
		scrollPane.setColumnHeaderView(textArea);
		tabbedPane.setToolTipTextAt(0, "Pestaña para visualizar un TextArea");

		JSplitPane splitPane = new JSplitPane();
		tabbedPane.addTab("Pestaña 2", null, splitPane, null);
		tabbedPane.setToolTipTextAt(1, "Pestaña para visualizar un JSplitPane");

	}

}
