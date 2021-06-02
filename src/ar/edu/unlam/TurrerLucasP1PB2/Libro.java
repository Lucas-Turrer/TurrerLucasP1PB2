package ar.edu.unlam.TurrerLucasP1PB2;

import java.util.ArrayList;

public abstract class Libro {
	protected Integer codigo;
	protected String nombre;
	protected String autor;
	protected ArrayList<Libro> librosEnPrestamo = new ArrayList<Libro>();
	
	public Libro(Integer codigo, String nombre, String autor) {
		this.codigo=codigo;
		this.nombre= nombre;
		this.autor=autor;
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public abstract String fotocopiable();
	
	public void librosEnPrestamos(Libro libro) {
		librosEnPrestamo.add(libro);
	}
	
	public Boolean disponibilidad(Libro libro) {
		for (Libro libros : librosEnPrestamo) {
			if(libros.getCodigo()==libro.getCodigo()) {
				return false;
			}
		}
		return true;
	}

	
	
}
	
