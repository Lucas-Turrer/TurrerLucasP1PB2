package ar.edu.unlam.TurrerLucasP1PB2;

public class Geografia extends Libro {

	public Geografia(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
	}

	@Override
	public String fotocopiable() {
		return "Es fotocopiable";
	}

}
