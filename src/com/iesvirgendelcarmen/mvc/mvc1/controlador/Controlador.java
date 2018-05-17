package com.iesvirgendelcarmen.mvc.mvc1.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.iesvirgendelcarmen.mvc.mvc1.modelo.Sexo;
import com.iesvirgendelcarmen.mvc.mvc1.modelo.Usuario;
import com.iesvirgendelcarmen.mvc.mvc1.vista.Vista;

public class Controlador implements ActionListener {
	
	private Usuario usuario; //modelo
	private Vista vista;
	
	
	
	public Controlador(Usuario usuario, Vista vista) {
		
		this.usuario = usuario;
		this.vista = vista;
		registrarComponentes(); //fuentes de los eventos
	}
	



	




	private void registrarComponentes() {

		vista.getBtnNewButtonExit().addActionListener(this);
		vista.getBtnAceptar().addActionListener(this);
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {

		String boton = e.getActionCommand();
		switch (boton) {
		case "aceptar":
			String nombre = vista.getTextFieldNombre().getText();
			String apellidos = vista.getTextFieldApellidos().getText();
			int edad = (int) vista.getSpinnerEdad().getValue();
			Sexo sexo = Sexo.HOMBRE;
			String sexoString = vista.getbGroup().getSelection().getActionCommand();
			if (sexoString.equals("mujer"))
				sexo = Sexo.MUJER;
			usuario.setNombre(nombre);
			usuario.setApellidos(apellidos);
			usuario.setSexo(sexo);
			usuario.setEdad(edad);
			System.out.println(usuario);
			vista.lanzarDialogo(usuario);
			break;
		case "salir":
			System.exit(0);
			break;
		default:
			break;
		}
	}

}
