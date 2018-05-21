package com.iesvirgendelcarmen.mvc.mvc3;

import java.awt.EventQueue;

import com.iesvirgendelcarmen.mvc.mvc3.controlador.Controlador;
import com.iesvirgendelcarmen.mvc.mvc3.vista.Vista;

public class Principal {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista window = new Vista();
					new Controlador(window);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
