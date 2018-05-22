package com.iesvirgendelcarmen.mvc.mvc3.modelo;

public class Persona {
	private String nombre;
	private String apellidos;
	private Sexo genero;
	private String lenguaje;
	private String raza;
	
	public Persona() {}
	
	public Persona(String nombre, String apellidos, Sexo genero, String lenguaje, String raza) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
		this.lenguaje = lenguaje;
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Sexo getGenero() {
		return genero;
	}

	public void setGenero(Sexo genero) {
		this.genero = genero;
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", genero=" + genero + ", lenguaje="
				+ lenguaje + ", raza=" + raza + "]";
	}
	
	
	
	
}
