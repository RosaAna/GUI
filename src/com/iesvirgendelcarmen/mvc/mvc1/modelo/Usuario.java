package com.iesvirgendelcarmen.mvc.mvc1.modelo;

public class Usuario {
	
	private String nombre;
	private String apellidos;
	private Sexo sexo;
	private int edad;
	public Usuario(String nombre, String apellidos, Sexo sexo, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.edad = edad;
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
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos + ", sexo=" + sexo + ", edad=" + edad + "]";
	}
	
	
}
