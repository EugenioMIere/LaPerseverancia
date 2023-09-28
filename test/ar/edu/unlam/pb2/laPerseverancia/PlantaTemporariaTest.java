package ar.edu.unlam.pb2.laPerseverancia;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlantaTemporariaTest {

	// Un empleado de Planta Temporaria con 80 horas trabajadas, con esposa
	// y sin hijos. (161.000)
	@Test
	public void queSePuedaCrearUnEmpleadoDePlantaTemporaria() {
		Integer horasTrabajadas = 80;
		Integer CantidadDeHijos = 0;
		Boolean estadoCasado = true;
		Double esperado = 161000.00;

		PlantaTemporaria natan = new PlantaTemporaria(horasTrabajadas, CantidadDeHijos, estadoCasado);
		Double obtenido = natan.getSueldo();
		assertEquals(esperado, obtenido);
	}

	@Test
	public void queSePuedaCalcularElSueldoDeUnEmpleadoDePlanaTemporaria() {
		Integer horasTrabajadas = 80;
		Integer CantidadDeHijos = 1;
		Boolean estadoCasado = true;
		Double esperado = 163000.00;

		PlantaTemporaria natan = new PlantaTemporaria(horasTrabajadas, CantidadDeHijos, estadoCasado);
		Double obtenido = natan.getSueldo();
		assertEquals(esperado, obtenido);
	}

}
