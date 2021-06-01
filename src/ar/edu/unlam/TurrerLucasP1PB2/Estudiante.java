package ar.edu.unlam.TurrerLucasP1PB2;

import java.util.ArrayList;

public class Estudiante {
	protected String nombre;
	protected String apellido;
	protected Integer dni;
	protected ArrayList<Libro> librosPedidos = new ArrayList<Libro>();

	
	public Estudiante (String nombre, String apellido, Integer dni) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
	}

	public void pedirLibro(Libro libro) {
		librosPedidos.add(libro);
	}

	public Integer librosEnSuPoder() {
		return librosPedidos.size();
	}

	public Boolean seguirRetirando() {
		if(librosPedidos.size()==2) {
			return false;
		}
		return true;
	}
}
