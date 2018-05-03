package com.iesvirgendelcarmen.contenedores;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class GUI2 {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new Interfaz();
				frame.setVisible(true);
			}
		});

	}

}
class Interfaz extends JFrame {

	private JLabel etiqueta1, etiqueta2;
	private JTextField cajaTexto1, cajaTexto2;

	public Interfaz() {
		iniciarVentana();
		colocarComponentes();
	}

	private void colocarComponentes() {
		//FlowLayout layout = new FlowLayout(FlowLayout.RIGHT);
		//layout.setHgap(50);
		//GridLayout layout = new GridLayout(0, 1);
		//layout.setHgap(10);
		//layout.setVgap(50);
		//this.setLayout(layout); //cambio el layout de la frame
		etiqueta1 = new JLabel("Texto de la etiqueta");
		this.add(etiqueta1, BorderLayout.NORTH);
		cajaTexto1 = new JTextField(10);
		this.add(cajaTexto1, BorderLayout.WEST);
		etiqueta2 = new JLabel("Texto de nueva etiqueta");
		this.add(etiqueta2, BorderLayout.CENTER);
		cajaTexto2 = new JTextField(10);
		this.add(cajaTexto2, BorderLayout.SOUTH);

	}

	private void iniciarVentana() {
		setTitle("Título de la interfaz"); //título 
		//	setSize(300, 200); //tamaño
		setBounds(10, 10, 300, 300); //posición (x,y) y tamaño
		//setLocationRelativeTo(null); //centrado
		//setResizable(false); //no se puede redimensionar
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //se cierra al acabar

	}
}




