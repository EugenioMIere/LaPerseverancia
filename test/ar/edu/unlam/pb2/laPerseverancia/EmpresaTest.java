package ar.edu.unlam.pb2.laPerseverancia;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpresaTest {

//	Una empresa, con el CUIT y Razón Social que desee, y con los
//	cuatro empleados de los escenarios anteriores. (1.554.000)

	@Test
	public void queSePuedagenerarUnaEmpresaConEmpelados() {
		String razonSocial = "La Perseverancia";
		Integer cuit = 999999999;
		// datos de empleado 1
		Integer horasTrabajadas1 = 80;
		Integer CantidadDeHijos1 = 2;
		Boolean estadoCasado1 = true;
		Integer Antiguedad1 = 6;
		// datos de empleado
		Integer horasTrabajadas = 160;
		Integer CantidadDeHijos = 1;
		Boolean estadoCasado = true;
		Integer Antiguedad = 10;
		// datos de empleado 2
		Integer horasTrabajadas2 = 160;
		Integer CantidadDeHijos2 = 0;
		Boolean estadoCasado2 = false;
		Integer Antiguedad2 = 4;
		// datos de empleado 3
		Integer horasTrabajadas3 = 80;
		Integer CantidadDeHijos3 = 0;
		Boolean estadoCasado3 = true;
		
		//Creacion de empelados
		PlantaPermanente empleado1 = new PlantaPermanente(horasTrabajadas1, CantidadDeHijos1, estadoCasado1,
				Antiguedad1);

		PlantaPermanente empleado2 = new PlantaPermanente(horasTrabajadas2, CantidadDeHijos2, estadoCasado2,
				Antiguedad2);

		PlantaTemporaria empleado3 = new PlantaTemporaria(horasTrabajadas3, CantidadDeHijos3, estadoCasado3);

		Gerente empleado4 = new Gerente(horasTrabajadas, CantidadDeHijos, estadoCasado, Antiguedad);
		
		//Creacion de una empresa
		Empresa empresa1 = new Empresa(cuit,razonSocial); 
		
		
		//Carga de nomina de empleados
		
		empresa1.setEmpleado(empleado1);
		empresa1.setEmpleado(empleado2);
		empresa1.setEmpleado(empleado3);
		empresa1.setEmpleado(empleado4);
		
		//Calcular salario total
		
		Double valorObtenido = empresa1.getSalario();
		
		//Prueba de salario total
		Double valorEsperado = 1554000.00;
		
		assertEquals(valorEsperado,valorObtenido);
		
		
		

	}

}
