package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> curso;
	
	public Curso() {
		curso = new ArrayList<Estudiante>();
	}
		
	public ArrayList<Estudiante> getCurso() {
		return curso;
	}

	public void setCurso(ArrayList<Estudiante> curso) {
		this.curso = curso;
	}

	public Estudiante buscarEstudiantePorCedula(Estudiante estudiante) {
		Estudiante estudianteEncontrado = null;
		Estudiante estudianteRecuperado;
		String cedulaEstudiante;
		cedulaEstudiante = estudiante.getCedula();
		if(curso.size() == 0) {
			estudianteEncontrado = null;
		}else {
			for(int i=0; i<curso.size(); i++) {
				estudianteRecuperado = curso.get(i);
				if(cedulaEstudiante == estudianteRecuperado.getCedula()) {
					estudianteEncontrado = estudianteRecuperado;
					System.out.println("El estudiante ya existe Nombre: " + estudianteEncontrado.getNombre());
				}
			}
		}
		
		return estudianteEncontrado;
	}
	
	public void matricularEstudiante(Estudiante estudiante) {
		Estudiante estudianteParaMatricular = buscarEstudiantePorCedula(estudiante);
		if(estudianteParaMatricular == null) {
			curso.add(estudiante);
		}else {
			System.out.println("El estudiante ya existe");
		}
	}
	
	public double calcularPromedioCurso() {
		double promedioDeLaClase = 0.0;
		Estudiante estudianteRecuperado;
		int estudiantes = curso.size();
		double promediosSumados = 0;
		
		for(int i=0; i<curso.size(); i++) {
			estudianteRecuperado = curso.get(i);
			double promedioss;
			promedioss = estudianteRecuperado.calcularPromedioNotasEstudiante();
			promediosSumados += promedioss;
		}
		
		promedioDeLaClase = promediosSumados / estudiantes;
		return promedioDeLaClase;
	}
	
	public void mostrar() {
		Estudiante estudiante;
		for(int i=0; i<curso.size(); i++) {
			estudiante = curso.get(i);
			estudiante.mostrar();
		}
		System.out.println("Promedio del curso: " + calcularPromedioCurso());
	}
}
