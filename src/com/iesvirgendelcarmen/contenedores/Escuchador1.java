package com.iesvirgendelcarmen.contenedores;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class Escuchador1 implements ActionListener, ItemListener{

	private JFrame frmVentanaConEventos;
	private JTextField textFieldUsuario;
	private JPasswordField passwordField;
	private JButton btnAceptar;
	private JLabel labelInfo;
	private JButton btnBorrar;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Escuchador1 window = new Escuchador1();
					window.frmVentanaConEventos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public Escuchador1() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVentanaConEventos = new JFrame();
		frmVentanaConEventos.setTitle("Ventana con eventos");
		frmVentanaConEventos.setBounds(100, 100, 450, 300);
		frmVentanaConEventos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVentanaConEventos.getContentPane().setLayout(null);
		frmVentanaConEventos.setVisible(true);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(47, 66, 70, 15);
		frmVentanaConEventos.getContentPane().add(lblUsuario);

		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(186, 64, 183, 19);
		frmVentanaConEventos.getContentPane().add(textFieldUsuario);
		textFieldUsuario.setColumns(10);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(47, 140, 70, 15);
		frmVentanaConEventos.getContentPane().add(lblPassword);

		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		passwordField.setBounds(186, 138, 183, 19);
		frmVentanaConEventos.getContentPane().add(passwordField);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		//btnAceptar.addActionListener(new PulsarBoton());
		/*btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nuevoUsuario = textFieldUsuario.getText();
				char[] password     = passwordField.getPassword();
				System.out.println("Botón pulsado por " + 
						((JButton) e.getSource()).getText());
				if (password.length != 0 && nuevoUsuario.length() != 0)
					labelInfo.setText("Añadido nuevo usuario: " +
							nuevoUsuario);
			}

		});*/

		btnAceptar.setBounds(47, 210, 117, 25);
		frmVentanaConEventos.getContentPane().add(btnAceptar);

		labelInfo = new JLabel("");
		labelInfo.setBounds(53, 262, 361, 15);
		frmVentanaConEventos.getContentPane().add(labelInfo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(47, 182, 322, 2);
		frmVentanaConEventos.getContentPane().add(separator);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		//btnBorrar.addActionListener(new PulsarBoton());
		/*btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nuevoUsuario = textFieldUsuario.getText();
				//char[] password     = passwordField.getPassword();
				System.out.println("Botón pulsado por " + 
						((JButton) e.getSource()).getText());
				if ( nuevoUsuario.length() != 0) {
					labelInfo.setText("Borrado usuario: " +
							nuevoUsuario);
					textFieldUsuario.setText("");
			}
			}
		});*/
		btnBorrar.setBounds(252, 210, 117, 25);
		frmVentanaConEventos.getContentPane().add(btnBorrar);
	}
	/*class PulsarBoton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String usuario = textFieldUsuario.getText();
			String cabecera = "Creado usuario ";
			if (((JButton) e.getSource()).getText().equals("Borrar"))
				cabecera = "Borrado usuario ";
			labelInfo.setText(cabecera + usuario);
		}
		
	}*/

	@Override
	public void actionPerformed(ActionEvent e) {
		String usuario = textFieldUsuario.getText();
		String cabecera = "Creado usuario ";
		if (((JButton) e.getSource()).getText().equals("Borrar"))
			cabecera = "Borrado usuario ";
		labelInfo.setText(cabecera + usuario);
		
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
