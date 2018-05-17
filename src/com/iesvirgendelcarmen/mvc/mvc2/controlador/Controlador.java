package com.iesvirgendelcarmen.mvc.mvc2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.iesvirgendelcarmen.mvc.mvc2.modelo.Modelo;
import com.iesvirgendelcarmen.mvc.mvc2.modelo.ModeloOperacionException;
import com.iesvirgendelcarmen.mvc.mvc2.vista.InterfazCalculadora;

public class Controlador implements ActionListener{
	private Modelo modelo;
	private InterfazCalculadora vista;
	
	public Controlador(InterfazCalculadora vista) {
		this.vista = vista;
		registrarBotones();
	}

	private void registrarBotones() {
		
		vista.getBoton0().addActionListener(this);
		vista.getBoton1().addActionListener(this);
		vista.getBoton2().addActionListener(this);
		vista.getBoton3().addActionListener(this);
		vista.getBoton4().addActionListener(this);
		vista.getBoton5().addActionListener(this);
		vista.getBoton6().addActionListener(this);
		vista.getBoton7().addActionListener(this);
		vista.getBoton8().addActionListener(this);
		vista.getBoton9().addActionListener(this);
		vista.getBotonC().addActionListener(this);
		vista.getBotonMas().addActionListener(this);
		vista.getBotonMenos().addActionListener(this);
		vista.getBotonPor().addActionListener(this);
		vista.getBotonDivision().addActionListener(this);
		vista.getBotonIgual().addActionListener(this);



		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("Llegada de evento");
		JLabel labelTexto = vista.getLabelResultado();
		String textoEtiqueta = labelTexto.getText();
		
		JButton botonPulsado = (JButton) e.getSource();
		String textoBoton = botonPulsado.getText();
		
		switch (textoBoton) {
		case "C":
			labelTexto.setText("");
			break;

		case "=":
			//llamamos al modelo
			try {
				modelo = new Modelo(textoEtiqueta);
				textoEtiqueta = modelo.devolverResultado() + "";
				labelTexto.setText(textoEtiqueta);
			} catch (ModeloOperacionException e1) {
				labelTexto.setText("ERROR");
			}
			break;
		default:
			textoEtiqueta += textoBoton;
			labelTexto.setText(textoEtiqueta);
			break;
		}
		
	}
	
	
}
