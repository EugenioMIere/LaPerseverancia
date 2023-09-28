package ar.edu.unlam.pb2.laPerseverancia;

public class PlantaTemporaria extends Empleado {
	
	private static final double VALOR_HORA = 2_000.00;
	

	public PlantaTemporaria(Integer horasTrabajadas, Integer cantidadDeHijos, Boolean estadoCasado) {
		super(horasTrabajadas,cantidadDeHijos,estadoCasado);

	}

	@Override
	public Double getSueldo() {

		return (super.getHorasTrabajadas() * PlantaTemporaria.VALOR_HORA) + super.getSalarioFamiliar();
	}

	
}
