package tarea1;

public class Alumno {
	private int nia;
    private String nombre;
    private String apellidos;
    private char genero;
    private String fechaNacimiento;
    private String ciclo;
    private String curso;
    private String grupo;
    
	public Alumno(int nia, String nombre, String apellidos, char genero, String fechaNacimiento, String ciclo,
			String curso, String grupo) {
		super();
		this.nia = nia;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
		this.fechaNacimiento = fechaNacimiento;
		this.ciclo = ciclo;
		this.curso = curso;
		this.grupo = grupo;
	}

	public int getNia() {
		return nia;
	}

	public void setNia(int nia) {
		this.nia = nia;
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

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
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
    
	
    public void mostrarInfo() {
    	System.out.println("NIA: " + nia +
                ", Nombre: " + nombre + " " + apellidos +
                ", Género: " + genero +
                ", Fecha de nacimiento: " + fechaNacimiento +
                ", Ciclo: " + ciclo +
                ", Curso: " + curso +
                ", Grupo: " + grupo);
    }
    
    
    
}
