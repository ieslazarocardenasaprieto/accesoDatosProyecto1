package tarea4_5;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.Scanner;

public class LeerFicheroAlumno {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Que fichero quieres leer");
		String nombreF = sc.nextLine();
		
		File fichero = new File (nombreF);
		FileInputStream ficheroEntrada = new FileInputStream(fichero);
		ObjectInputStream dataIS = new ObjectInputStream (ficheroEntrada);
		int contador =1;
		try {
			while(true) {
				Alumno alumno = (Alumno) dataIS.readObject();
				
				System.out.println("Alumno numero: "+contador);
				System.out.println();
				
				 System.out.println("NIA: " + alumno.getNIA());
	             System.out.println("Nombre: " + alumno.getNombre());
	             System.out.println("Apellidos: " + alumno.getApellidos());
	             System.out.println("Género: " + alumno.getGenero());
	             System.out.println("Fecha Nacimiento: " + alumno.getFechaNacimiento());
	             System.out.println("Ciclo: " + alumno.getCiclo());
	             System.out.println("Curso: " + alumno.getCurso());
	             System.out.println("Grupo: " + alumno.getGrupo());
	             System.out.println();
	             contador++;
			}
		
		}catch (EOFException e) {
			 System.out.println("Fin del fichero");
		}
		finally {
			dataIS.close();
		}
		
		
	}

}
