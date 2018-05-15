package com.iesvirgendelcarmen.mvc.mvc1;

import java.awt.EventQueue;

import com.iesvirgendelcarmen.mvc.mvc1.controlador.Controlador;
import com.iesvirgendelcarmen.mvc.mvc1.modelo.Usuario;
import com.iesvirgendelcarmen.mvc.mvc1.vista.Vista;

public class Principal {
	
	public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				Usuario usuario = new Usuario();
				Vista vista = new Vista();
				new Controlador(usuario, vista);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}
}
