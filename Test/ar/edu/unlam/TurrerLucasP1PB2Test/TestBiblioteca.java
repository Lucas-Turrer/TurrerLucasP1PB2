package ar.edu.unlam.TurrerLucasP1PB2Test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.TurrerLucasP1PB2.Estudiante;
import ar.edu.unlam.TurrerLucasP1PB2.Geografia;
import ar.edu.unlam.TurrerLucasP1PB2.Historia;

public class TestBiblioteca {

	@Test
	public void QueUnEstudiantePideDosLibros() {
		Estudiante alumno = new Estudiante("Lucas", "Turrer", 37931874);
		Historia libro1 = new Historia(001,"Los Andes", "San Martin");
		Geografia libro2 = new Geografia(002, "Egipto", "Eduar");
		
		alumno.pedirLibro(libro1);
		alumno.pedirLibro(libro2);
		
		Integer valorEsperado=2;
		Integer valorObtenido=alumno.librosEnSuPoder();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void QueUnEstudianteNoPuedePedirMasDeDosLibros() {
		Estudiante alumno = new Estudiante("Lucas", "Turrer", 37931874);
		Historia libro1 = new Historia(001,"Los Andes", "San Martin");
		Geografia libro2 = new Geografia(002, "Egipto", "Eduar");
		
		alumno.pedirLibro(libro1);
		alumno.pedirLibro(libro2);
		
		Boolean valorObtenido=alumno.seguirRetirando();
		assertFalse(valorObtenido);
	}
	
	@Test
	public void QueNoSePuedePedirUnLibroPestado() {
		Estudiante alumno = new Estudiante("Lucas", "Turrer", 37931874);
		Estudiante alumno2 = new Estudiante("Jose", "Perez", 37931873);
		Historia libro1 = new Historia(001,"Los Andes", "San Martin");
		Geografia libro2 = new Geografia(002, "Egipto", "Eduar");
		
		alumno.pedirLibro(libro1);
		libro1.librosEnPrestamos(libro1);
		
		Boolean estadoDeLibro = libro1.disponibilidad(libro1);
		assertFalse(estadoDeLibro);
	}

}
