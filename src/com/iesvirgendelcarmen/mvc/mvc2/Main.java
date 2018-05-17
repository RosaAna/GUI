package com.iesvirgendelcarmen.mvc.mvc2;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.iesvirgendelcarmen.mvc.mvc2.controlador.Controlador;
import com.iesvirgendelcarmen.mvc.mvc2.vista.InterfazCalculadora;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazCalculadora vista = new InterfazCalculadora();
					vista.setVisible(true);
					new Controlador(vista);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
