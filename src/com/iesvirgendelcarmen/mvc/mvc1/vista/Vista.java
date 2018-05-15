package com.iesvirgendelcarmen.mvc.mvc1.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.SpinnerNumberModel;

import com.iesvirgendelcarmen.mvc.mvc1.modelo.Sexo;
import com.iesvirgendelcarmen.mvc.mvc1.modelo.Usuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista {

	private JFrame frame;
	private JTextField textFieldNombre;
	private JTextField textFieldApellidos;
	private JSpinner spinnerEdad;
	private JRadioButton rdbtnMujer;
	private JRadioButton rdbtnHombre;
	private JButton btnAceptar;
	private JButton btnNewButtonExit;
	private ButtonGroup bGroup;

	
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista window = new Vista();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	public JButton getBtnAceptar() {
		return btnAceptar;
	}

	public ButtonGroup getbGroup() {
		return bGroup;
	}

	public JSpinner getSpinnerEdad() {
		return spinnerEdad;
	}

	public JTextField getTextFieldNombre() {
		return textFieldNombre;
	}

	public JTextField getTextFieldApellidos() {
		return textFieldApellidos;
	}

	public JButton getBtnNewButtonExit() {
		return btnNewButtonExit;
	}

	/**
	 * Create the application.
	 */
	public Vista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("Aplicación de Usuarios");
		frame.getContentPane().setLayout(new GridLayout(0, 2, 20, 20));
		frame.setVisible(true);

		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		frame.getContentPane().add(panel);

		JLabel lblNewLabel = new JLabel("Nombre de usuario:");
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		frame.getContentPane().add(panel_1);

		textFieldNombre = new JTextField();
		panel_1.add(textFieldNombre);
		textFieldNombre.setColumns(30);

		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_2.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		frame.getContentPane().add(panel_2);

		JLabel lblApellidosDeUsuario = new JLabel("Apellidos de usuario");
		panel_2.add(lblApellidosDeUsuario);

		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_4.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		frame.getContentPane().add(panel_4);

		textFieldApellidos = new JTextField();
		panel_4.add(textFieldApellidos);
		textFieldApellidos.setColumns(30);

		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panel_3.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		frame.getContentPane().add(panel_3);

		JLabel lblSexo = new JLabel("Sexo");
		panel_3.add(lblSexo);

		JPanel panel_6 = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) panel_6.getLayout();
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		frame.getContentPane().add(panel_6);

		bGroup = new ButtonGroup();

		rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setSelected(true);
		rdbtnHombre.setActionCommand("hombre");
		panel_6.add(rdbtnHombre);

		rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setActionCommand("mujer");
		panel_6.add(rdbtnMujer);
		bGroup.add(rdbtnHombre);
		bGroup.add(rdbtnMujer);

		JPanel panel_5 = new JPanel();
		FlowLayout flowLayout_6 = (FlowLayout) panel_5.getLayout();
		flowLayout_6.setAlignment(FlowLayout.LEFT);
		frame.getContentPane().add(panel_5);

		JLabel lblEdad = new JLabel("Edad");
		panel_5.add(lblEdad);

		JPanel panel_8 = new JPanel();
		FlowLayout flowLayout_7 = (FlowLayout) panel_8.getLayout();
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		frame.getContentPane().add(panel_8);

		spinnerEdad = new JSpinner();
		spinnerEdad.setModel(new SpinnerNumberModel(
				new Integer(18), new Integer(1),new Integer(100), new Integer(1)));
		spinnerEdad.setMinimumSize(new Dimension(50, 20));
		spinnerEdad.setBounds(new Rectangle(0, 0, 100, 0));
		panel_8.add(spinnerEdad);

		JPanel panel_7 = new JPanel();
		frame.getContentPane().add(panel_7);

		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setActionCommand("aceptar");
	/*	btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = textFieldNombre.getText();
				String apellidos = textFieldApellidos.getText();
				int edad = (int) spinnerEdad.getValue();
				Sexo sexo = Sexo.HOMBRE;
				String sexoString = bGroup.getSelection().getActionCommand();
				if (sexoString.equals("mujer"))
					sexo = Sexo.MUJER;
				Usuario usuario = new Usuario(nombre, apellidos, sexo, edad);
				System.out.println(usuario);
				JOptionPane dialogo = new JOptionPane();
				dialogo.showMessageDialog(frame, "Creado usuario: " + usuario,
						"INFORMACIÓN DE USUARIO", JOptionPane.INFORMATION_MESSAGE);
			}
		});*/
		panel_7.add(btnAceptar);

		JPanel panel_9 = new JPanel();
		frame.getContentPane().add(panel_9);

		btnNewButtonExit = new JButton("Salir");
		btnNewButtonExit.setActionCommand("salir");
	/*	btnNewButtonExit.addActionListener(e -> {
			System.exit(0);
		});*/
		panel_9.add(btnNewButtonExit);
	}
	public void lanzarDialogo(Usuario usuario) {
		JOptionPane dialogo = new JOptionPane();
		dialogo.showMessageDialog(frame, "Creado usuario: " + usuario,
				"INFORMACIÓN DE USUARIO", JOptionPane.INFORMATION_MESSAGE);
	}

}
