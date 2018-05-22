package com.iesvirgendelcarmen.mvc.mvc3.modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colectivo {
	
	private List<Persona> listaPersona = new ArrayList<>();
	
	public Colectivo(String path) {
		cargarDatosFichero(path);
	}
	
	public List<Persona> getListaPersona() {
		return listaPersona;
	}

	private void cargarDatosFichero(String path) {
		try (Scanner in = new Scanner(new File(path));){
			
			in.nextLine(); //elimino la cabecera
			while (in.hasNextLine()) {
				Sexo genero = Sexo.HOMBRE;
			//	System.out.println(in.nextLine());
				String[] datos = in.nextLine().split(",");
			//	System.out.println(datos[2]+ "--" +genero);
				if (datos[2].equals("Female")) {
					genero = Sexo.MUJER;
					
				}
				
				listaPersona.add(new Persona(datos[0], datos[1],
						genero, datos[3], datos[4]));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
