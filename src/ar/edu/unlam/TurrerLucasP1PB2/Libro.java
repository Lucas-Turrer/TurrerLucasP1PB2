package ar.edu.unlam.TurrerLucasP1PB2;

public abstract class Libro {
	protected Integer codigo;
	protected String nombre;
	protected String autor;
	
	public Libro(Integer codigo, String nombre, String autor) {
		this.codigo=codigo;
		this.nombre= nombre;
		this.autor=autor;
	}
	
	public abstract String fotocopiable();
}
