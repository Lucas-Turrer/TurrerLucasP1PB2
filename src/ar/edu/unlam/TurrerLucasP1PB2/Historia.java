package ar.edu.unlam.TurrerLucasP1PB2;

public class Historia extends Libro  {

	public Historia(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
	}

	@Override
	public String fotocopiable() {
		return "Es fotocopiable";
	}

}
