package model;


public class Credito {
	
	private String nombre, lugar;
	private int codigo, duracionHoras, cupoMaximo;
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
	public int getDuracionHoras() {
		return duracionHoras;
	}
	public void setDuracionHoras(int duracionHoras) {
		this.duracionHoras = duracionHoras;
	}
	public int getCupoMaximo() {
		return cupoMaximo;
	}
	public void setCupoMaximo(int cupoMaximo) {
		this.cupoMaximo = cupoMaximo;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}


	
}
