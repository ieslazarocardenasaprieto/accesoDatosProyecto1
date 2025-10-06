package tarea4_5;

import java.io.Serializable;
import java.time.LocalDate;

public class Alumno implements Serializable{

	private int NIA;
	private String nombre;
	private String apellidos;
	private char genero;
	private LocalDate fechaNacimiento;
	private String ciclo;
	private String curso;
	private String grupo;
	
	public Alumno(int nIA, String nombre, String apellidos, char genero, LocalDate fechaNacimiento, String ciclo,
			String curso, String grupo) {
		super();
		NIA = nIA;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
		this.fechaNacimiento = fechaNacimiento;
		this.ciclo = ciclo;
		this.curso = curso;
		this.grupo = grupo;
	}
	public int getNIA() {
		return NIA;
	}
	public void setNIA(int nIA) {
		NIA = nIA;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getCiclo() {
		return ciclo;
	}
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	
	
	
	
}
