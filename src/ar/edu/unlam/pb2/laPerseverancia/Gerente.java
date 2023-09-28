package ar.edu.unlam.pb2.laPerseverancia;

public class Gerente extends PlantaPermanente {
	private static final double VALOR_HORA = 4_000.00;
	private static final double VALOR_ANTIGUEDAD = 1_500.00;

	public Gerente(Integer horasTrabajadas, Integer cantidadDeHijos, Boolean estadoCasado, Integer antiguedad) {
		super(horasTrabajadas, cantidadDeHijos, estadoCasado, antiguedad);
		
	}
	
	@Override
	public Double getSueldo() {

		return super.getAntiguedad() * Gerente.VALOR_ANTIGUEDAD +
				super.getHorasTrabajadas() * Gerente.VALOR_HORA +
				super.getSalarioFamiliar();
		
	}


}
