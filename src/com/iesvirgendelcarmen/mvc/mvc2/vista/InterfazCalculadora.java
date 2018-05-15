package com.iesvirgendelcarmen.mvc.mvc2.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

class InterfazCalculadora extends JFrame {
	private JLabel labelResultado;
	private JButton boton7, boton8, boton9, botonMas, boton4, boton5, boton6,
	botonMenos, boton1, boton2, boton3, botonPor, boton0, botonC,
	botonIgual, botonDivision;
	
	public InterfazCalculadora() {
		crearVentana();
		crearPanelResultado();
		crearBotones();
	}

	private void crearBotones() {
		
		boton7 = new JButton("7");
		boton8 = new JButton("8");
		boton9 = new JButton("9");
		botonMas = new JButton("+");
		boton4 = new JButton("4");
		boton5 = new JButton("5");
		boton6 = new JButton("6");
		botonMenos = new JButton("-");
		boton1 = new JButton("1");
		boton2 = new JButton("2");
		boton3 = new JButton("3");
		botonPor = new JButton("*");
		boton0 = new JButton("0");
		botonC = new JButton("C");
		botonIgual = new JButton("=");
		botonDivision = new JButton("/");
		JPanel panelBotones = new JPanel(new GridLayout(4, 4));
		panelBotones.add(boton7);
		panelBotones.add(boton8);
		panelBotones.add(boton9);
		panelBotones.add(botonMas);
		panelBotones.add(boton4);
		panelBotones.add(boton5);
		panelBotones.add(boton6);
		panelBotones.add(botonMenos);
		panelBotones.add(boton1);
		panelBotones.add(boton2);
		panelBotones.add(boton3);
		panelBotones.add(botonPor);
		panelBotones.add(boton0);
		panelBotones.add(botonC);
		panelBotones.add(botonIgual);
		panelBotones.add(botonDivision);
		this.add(panelBotones, BorderLayout.CENTER);
	}

	private void crearPanelResultado() {
		
		JPanel panelResultado = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		labelResultado = new JLabel("0");
		Border border = BorderFactory.createEmptyBorder(4, 4, 4, 4);
		labelResultado.setBorder(border);
		Font font = new Font("Fuente nueva", Font.BOLD, 16);
		labelResultado.setFont(font);
		labelResultado.setOpaque(true);
		labelResultado.setBackground(Color.WHITE);
		labelResultado.setForeground(Color.RED);
		//labelResultado.setAlignmentY(RIGHT_ALIGNMENT);
		panelResultado.add(labelResultado);
		this.add(panelResultado, BorderLayout.NORTH);
		
	}

	private void crearVentana() {
		
		this.setTitle("CALCULADORA SENCILLA");
		this.setSize(300, 350);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
}
