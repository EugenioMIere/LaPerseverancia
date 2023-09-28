package ar.edu.unlam.pb2.laPerseverancia;

import java.util.ArrayList;

public class Empresa {

	private String razonSocial;
	private Integer cuit;
	private ArrayList<Empleado>empleados = new ArrayList<Empleado>();

	public Empresa(Integer cuit, String razonSocial) {
		this.cuit = cuit;
		this.razonSocial = razonSocial;
	}

	public void setEmpleado(Empleado empleado1) {
		
		this.empleados.add(empleado1);
	}

	public Double getSalario() {
		double sueldoTotal = 0;
		for (Empleado empleado : empleados) {
			sueldoTotal += empleado.getSueldo();
		}
		return sueldoTotal;
	}

}
