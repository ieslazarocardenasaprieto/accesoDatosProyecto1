package tarea4_5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class FicheroAlumno {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Dame el nombre de un fichero");
		String nombre = sc.nextLine();
		
		File fichero = new File (nombre);
		FileOutputStream ficheroSalida = new FileOutputStream  (fichero);
		ObjectOutputStream dataOS = new ObjectOutputStream (ficheroSalida);
		
		for (int i=0; i<3; i++) {
			
			System.out.println();
			System.out.println("Alumno numero : "+i+1);
			System.out.println();
			
			System.out.print("Dame el NIA: ");
	        int NIA = sc.nextInt();
	        sc.nextLine(); 
	        
	       
	        System.out.print("Dame el nombre: ");
	        String nombreA = sc.nextLine();
	        
	       
	        System.out.print("Dame los apellidos: ");
	        String apellidos = sc.nextLine();
	        
	      
	        System.out.print("Dame el género (M/F/O): ");
	        char genero = sc.nextLine().toUpperCase().charAt(0);
	        
	        
	        LocalDate fecha = null;
	        boolean fe = false;
	        
	        	while(!fe) {
	        		try {
	        			System.out.println("Dame fecha de nacimiento (yyyy-MM-dd)");
		        		fecha = LocalDate.parse(sc.nextLine());
		        		fe = true;
	        		}catch(DateTimeParseException e){
	        			System.out.println("El formato de la fecha esta mal");
	        		}
	        		
	        		
	        	}
	        
	     
	        System.out.print("Dame el ciclo: ");
	        String ciclo = sc.nextLine();
	        
	     
	        System.out.print("Dame el curso: ");
	        String curso = sc.nextLine();
	        
	 
	        System.out.print("Dame el grupo: ");
	        String grupo = sc.nextLine();
	        
	        Alumno alumno = new Alumno (NIA, nombreA, apellidos, genero, fecha, ciclo, curso, grupo);
	        
	        dataOS.writeObject(alumno);
			
			
		}
		
		dataOS.close();        
		
	}

}
