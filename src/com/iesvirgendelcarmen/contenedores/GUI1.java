package com.iesvirgendelcarmen.contenedores;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI1 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Primera ventana");
		frame.setSize(600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		JButton boton = new JButton("Botón");
		frame.add(boton);
		frame.setResizable(false);
		frame.setVisible(true);
		
	}

}
