package model;

enum TipoCredito {
	
	CULTURAL, DEPORTIVO, ACADEMICO, NO_APLICA;
	
	TipoCredito getTipoCredito(String tipoCredito) {
		if (tipoCredito.equals("Cultural"))
			return TipoCredito.CULTURAL;
		if (tipoCredito.equals("Deportivo"))
			return TipoCredito.DEPORTIVO;
		if (tipoCredito.equals("Académico"))
			return TipoCredito.ACADEMICO;
		
		return TipoCredito.NO_APLICA;
	}
	
}

public class Credito {
	
	private String nombre, lugar;
	private int codigo, duracion_horas, cupo_maximo;
	private TipoCredito tipoCredito;
	private Instructor instructor;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getDuracion_horas() {
		return duracion_horas;
	}
	public void setDuracion_horas(int duracion_horas) {
		this.duracion_horas = duracion_horas;
	}
	public int getCupo_maximo() {
		return cupo_maximo;
	}
	public void setCupo_maximo(int cupo_maximo) {
		this.cupo_maximo = cupo_maximo;
	}
	public TipoCredito getTipoCredito() {
		return tipoCredito;
	}
	public void setTipoCredito(TipoCredito tipoCredito) {
		this.tipoCredito = tipoCredito;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	
}
