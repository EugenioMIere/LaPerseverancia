package ar.edu.unlam.pb2.laPerseverancia;

import static org.junit.Assert.*;

import org.junit.Test;

public class GerenteTest {

	//	Un Gerente con 160 horas trabajadas, con esposa, un hijo y 10 años de
	//	antigüedad. (658.000)

	@Test
	public void queSePuedaCrearUnGerente() {
		Integer horasTrabajadas = 160;
		Integer CantidadDeHijos = 1;
		Boolean estadoCasado = true;
		Integer Antiguedad = 10;
		Double esperado = 658000.00;

		Gerente natan = new Gerente(horasTrabajadas, CantidadDeHijos, estadoCasado, Antiguedad);
		Double obtenido = natan.getSueldo();
		assertEquals(esperado, obtenido);
	}

}
