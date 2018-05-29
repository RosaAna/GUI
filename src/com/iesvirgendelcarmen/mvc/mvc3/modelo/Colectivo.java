package com.iesvirgendelcarmen.mvc.mvc3.modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colectivo {
	
	private List<Persona> listaPersona = new ArrayList<>();
	private String[] nombreColumnas;
	private Object[][] data;
	
	public Colectivo(String path) {
		cargarDatosFichero(path);
	}
	
	
	
	public String[] getNombreColumnas() {
		return nombreColumnas;
	}



	public Object[][] getData() {
		return data;
	}



	public List<Persona> getListaPersona() {
		return listaPersona;
	}

	private void cargarDatosFichero(String path) {
		try (Scanner in = new Scanner(new File(path));){
			
			nombreColumnas = in.nextLine().split(","); //obtengo la cabecera
			while (in.hasNextLine()) {
				Sexo genero = Sexo.HOMBRE;
				String[] datos = in.nextLine().split(",");
				if (datos[2].equals("Female")) {
					genero = Sexo.MUJER;
					
				}
				
				listaPersona.add(new Persona(datos[0], datos[1],
						genero, datos[3], datos[4]));
				
			/*	data[contador][0] = datos[0];
				data[contador][1] = datos[1];
				data[contador][2] = genero;
				data[contador][3] = datos[3];
				data[contador][4] = datos[4];
				contador++;*/
			}
			System.out.println(listaPersona);
			completarArrays();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void completarArrays() {
		data = new Object[listaPersona.size()][5];
		int contador = 0;
		for (Persona persona: listaPersona) {
			data[contador][0] = persona.getNombre();
			data[contador][1] = persona.getApellidos();
			data[contador][2] = persona.getGenero();
			data[contador][3] = persona.getLenguaje();
			data[contador][4] = persona.getRaza();
			contador++;
		}
		
	}



	public boolean annadirPersona(Persona p) {
		return listaPersona.add(p);
	}
	
	public boolean eliminarPersona(Persona p) {
		return listaPersona.remove(p);
	}
	
	public static void main(String[] args) {
		Colectivo c = new Colectivo("datos/data.csv");
		//System.out.println(c.getListaPersona());
	}
}
