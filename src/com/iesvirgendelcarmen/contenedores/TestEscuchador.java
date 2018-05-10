package com.iesvirgendelcarmen.contenedores;

import java.awt.EventQueue;

public class TestEscuchador {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Escuchador1 window = new Escuchador1();
					//window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
