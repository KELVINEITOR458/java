package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> nota;

	public Estudiante(String cedula, String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		nota = new ArrayList<Nota>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNota() {
		return nota;
	}

	public void setNota(ArrayList<Nota> nota) {
		this.nota = nota;
	}

	public void agregarNota(Nota nuevaNota) {
		Double calificacionn = nuevaNota.getCalificacion();
		Nota codigoNota;
		Materia materiaCodigo;
		String codigoNuevaNota = nuevaNota.getMateria().getCodigo();

		
		if (calificacionn >= 0 && calificacionn <= 10) {
			if (nota.size()  == 0) {
				nota.add(nuevaNota);
			}else {
				boolean existeNota = false;
				for (int i = 0; i < nota.size(); i++) {
					codigoNota = nota.get(i);
					materiaCodigo = codigoNota.getMateria();
					if (materiaCodigo.getCodigo() == codigoNuevaNota) {
						existeNota = true;
						break;
					}
				}
				if (existeNota == false) {
					nota.add(nuevaNota);
					System.out.println("Se agrego correctamente la nota");
				} else {
					System.out.println("El codigo de materia ya exite");
				}
			}
	
			

		}
	}

	public void modificarNota(String codigo, double nuevaNota) {
		Nota nuevaNotaIngresada;
		Materia nuevoCodigoMateria;
		for (int i = 0; i < nota.size(); i++) {
			nuevaNotaIngresada = nota.get(i);
			nuevoCodigoMateria = nuevaNotaIngresada.getMateria();
			if (nuevoCodigoMateria.getCodigo() != codigo) {
				System.out.println("Codigo no encontrado");
			} else {
				if (nuevaNota >= 0 && nuevaNota <= 10) {
					nuevaNotaIngresada.setCalificacion(nuevaNota);
				}else {
					System.out.println("La nota debe ser entre 0 y 10");
				}
			}
		}
	}

	public double calcularPromedioNotasEstudiante() {
		Nota notasRecuperadas;
		int materias = nota.size();
		double notasSumadas = 0;
		double promedio = 0.0;

		for (int i = 0; i < nota.size(); i++) {
			notasRecuperadas = nota.get(i);
			double notass;
			notass = notasRecuperadas.getCalificacion();
			notasSumadas += notass;
		}

		promedio = notasSumadas / materias;

		return promedio;
	}

	public void mostrar() {
		Nota notas;
		for (int i = 0; i < nota.size(); i++) {
			notas = nota.get(i);
			System.out.println(
					"Estudiante: [Nombre:" + nombre + " Apeliido:" + apellido + " Cedula:" + cedula );
			notas.mostrar();
		}
	}

	public Estudiante buscarEstudiantePorCedula(Estudiante estudiante) {
		Estudiante estudianteEncontrado = null;
		return estudianteEncontrado;
	}
}
