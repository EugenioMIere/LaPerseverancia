package ar.edu.unlam.pb2.laPerseverancia;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlantaPermanenteTest {

	// Un empleado de Planta Permanente (que no sea gerente) con 80 horas
	// trabajadas, con esposa, 2 hijos y 6 años de antigüedad. (251.000)

	@Test
	public void queSePuedaCrearUnEmpleadoDePlantaPermanenete() {
		Integer horasTrabajadas = 80;
		Integer CantidadDeHijos = 2;
		Boolean estadoCasado = true;
		Integer Antiguedad = 6;
		Double esperado = 251000.00;

		PlantaPermanente natan = new PlantaPermanente(horasTrabajadas, CantidadDeHijos, estadoCasado, Antiguedad);
		Double obtenido = natan.getSueldo();
		assertEquals(esperado, obtenido);
	}

	// Un empleado de Planta Permanente (que no sea gerente) con 160 horas
	// trabajadas, sin esposa, sin hijos y con 4 años de antigüedad. (484.000)

	@Test
	public void queSePuedaCalcularElSueldoDeUnEmpleadoDePlanaPermaneneteConCuatroAñosDeAntiguedad() {
		Integer horasTrabajadas = 160;
		Integer CantidadDeHijos = 0;
		Boolean estadoCasado = false;
		Integer Antiguedad = 4;
		Double esperado = 484000.00;

		PlantaPermanente natan = new PlantaPermanente(horasTrabajadas, CantidadDeHijos, estadoCasado, Antiguedad);
		Double obtenido = natan.getSueldo();
		assertEquals(esperado, obtenido);
	}

}
