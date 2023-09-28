package ar.edu.unlam.pb2.laPerseverancia;

public abstract class Empleado {

	private static final double VALOR_CONYUGE = 1_000.00;
	private static final double VALOR_HIJO = 2_000.00;
	private Integer horasTrabajadas;
	private Integer cantidadDeHijos;
	private Boolean estadoCasado;

	public Empleado(Integer horasTrabajadas, Integer cantidadDeHijos, Boolean estadoCasado) {
		this.horasTrabajadas = horasTrabajadas;
		this.cantidadDeHijos = cantidadDeHijos;
		this.estadoCasado = estadoCasado;

	}

	public abstract Double getSueldo();

	protected Double getSalarioFamiliar() {
		Double salarioFamiliar = this.cantidadDeHijos * VALOR_HIJO;
		if (this.estadoCasado) {
			salarioFamiliar += VALOR_CONYUGE;
		}
		return salarioFamiliar;
	}

	protected Integer getHorasTrabajadas() {
		return horasTrabajadas;
	}

	protected Integer getCantidadDeHijos() {
		return cantidadDeHijos;
	}

	protected Boolean getEstadoCasado() {
		return estadoCasado;
	}

}
