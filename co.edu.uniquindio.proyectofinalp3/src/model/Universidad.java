package model;

import java.util.ArrayList;

public class Universidad {
	
	private String nombre;
	private ArrayList<Estudiante> listaEstudiantes;
	private ArrayList<Instructor> listaInstructor;
	private ArrayList<Credito> listaCreditos;
	private ArrayList<String> lugares;
	
	public Universidad(String nombre) {
		inicializarLugares();
		this.nombre = nombre;
	}

	private void inicializarLugares() {
		lugares = new ArrayList<String>();
		
		lugares.add("Sala A-1");
		lugares.add("Sala F-2");
		lugares.add("Sala B-1");
		lugares.add("Sala Z-4");
		lugares.add("Auditorio San Rafael");
		lugares.add("Jardín Botánico");
		lugares.add("Sala de computación");
		lugares.add("Laboratorio de Química");
		lugares.add("Sala R-6");
		
		
	}
	
}
