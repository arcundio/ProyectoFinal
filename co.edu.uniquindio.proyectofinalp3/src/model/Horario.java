package model;

public class Horario {
	
	/** Arreglo 2D, o matriz, que representa un horario de lunes a viernes.
	 * Cada columna representa un día de la semana, mientras que
	 * las filas representan un bloque en el que un instructor 
	 * puede partir clases. Existen cuatro bloques para cada día:
	 * (horario militar)
	 *  7:00-9:00
	 * 	9:00-11:00
	 *  14:00-16:00
	 *  16:00-18:00
	 */
	
	private int[][] horario;
	private int intensidadHoraria;
	
	public Horario(int intensidadHoraria) {
		horario  = new int[4][5];
		this.intensidadHoraria = intensidadHoraria;
	}

	public int[][] getHorario() {
		return horario;
	}

	public void setHorario(int[][] horario) {
		this.horario = horario;
	}

	public int getIntensidadHoraria() {
		return intensidadHoraria;
	}

	public void setIntensidadHoraria(int intensidadHoraria) {
		this.intensidadHoraria = intensidadHoraria;
	}
	
	

}
