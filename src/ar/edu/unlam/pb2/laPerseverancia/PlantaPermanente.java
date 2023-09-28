package ar.edu.unlam.pb2.laPerseverancia;

public class PlantaPermanente extends Empleado {

	private static final double VALOR_HORA = 3_000.00;
	private static final double VALOR_ANTIGUEDAD = 1_000.00;

	private Integer antiguedad;

	public PlantaPermanente(Integer horasTrabajadas, Integer cantidadDeHijos, Boolean estadoCasado,
			Integer antiguedad) {
		super(horasTrabajadas, cantidadDeHijos, estadoCasado);
		this.antiguedad = antiguedad;
	}

	@Override
	public Double getSueldo() {

		return (super.getHorasTrabajadas() * PlantaPermanente.VALOR_HORA) + super.getSalarioFamiliar()
				+ (this.antiguedad * PlantaPermanente.VALOR_ANTIGUEDAD);
	}

	protected Integer getAntiguedad() {
		return this.antiguedad;
	}

}
