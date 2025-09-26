package tarea1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class MainAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		ArrayList<Alumno> listaAlumnos = new ArrayList<>();
		
		listaAlumnos.add(new Alumno(2003, "Ana", "López", 'F', "2002/5/10", "DAM", "2º", "A"));
		listaAlumnos.add(new Alumno(1001, "Luis", "Martínez", 'M', "2001/7/20", "DAW", "1º", "B"));
		listaAlumnos.add(new Alumno(1502, "Carlos", "García", 'M', "2003/3/15", "ASIR", "1º", "C"));
		listaAlumnos.add(new Alumno(1804, "María", "Fernández", 'F', "2002/11/5", "DAM", "2º", "B"));
		listaAlumnos.add(new Alumno(1305, "Javier", "Sánchez", 'M', "2003/2/28", "DAW", "1º", "A"));
		
		for (int i = 0; i<5; i++) {
			
			System.out.println("NIA");
			int nia = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Nombre");
			String nombre = sc.nextLine();
			
			System.out.println("Apellidos");
			String apellidos = sc.nextLine();
			
			System.out.println("Genero");
			char genero = sc.next().charAt(0);
			 sc.nextLine();
			
			System.out.println("Fecha de nacimiento");
			String fechaNacimiento = sc.nextLine();
			
			System.out.println("Ciclo");
			String ciclo = sc.nextLine();
			
			System.out.println("Curso");
			String curso = sc.nextLine();
			
			System.out.println("Grupo");
			String grupo = sc.nextLine();
			
			
			listaAlumnos.add(new Alumno(nia,nombre,apellidos,genero
					,fechaNacimiento,ciclo,curso,grupo));
			
			System.out.println();
			System.out.println("Se añadio el alumno correctamente");
			System.out.println();
			
		}
		
		listaAlumnos.sort(Comparator.comparingInt(Alumno::getNia));
		
		for(Alumno A : listaAlumnos) {
			A.mostrarInfo();
			System.out.println();
		}
		
		
	}

}
