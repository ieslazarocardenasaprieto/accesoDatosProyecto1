package tarea1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
public class MainAlumno2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Alumno> listaAlumnos = new ArrayList<>();
		int num =0;
		
		
		listaAlumnos.add(new Alumno(2003, "Ana", "López", 'F', "2002/5/10", "DAM", "2º", "A"));
		listaAlumnos.add(new Alumno(1001, "Luis", "Martínez", 'M', "2001/7/20", "DAW", "1º", "B"));
		listaAlumnos.add(new Alumno(1502, "Carlos", "García", 'M', "2003/3/15", "ASIR", "1º", "C"));
		listaAlumnos.add(new Alumno(1804, "María", "Fernández", 'F', "2002/11/5", "DAM", "2º", "B"));
		listaAlumnos.add(new Alumno(1305, "Javier", "Sánchez", 'M', "2003/2/28", "DAW", "1º", "A"));
		
		
		do {
			
			System.out.println("1. Añadir alumnos\n" +
                    "2. Leer alumnos\n" +
                    "3. Leer alumnos ordenados por NIA\n" +
                    "4. Leer alumnos ordenados por el parámetro que usted pida\n" +
                    "5. Salir");
			num=sc.nextInt();
			
			switch(num) {
			
				case 1:
					
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
					
					break;
				
				case 2:
					
					for(Alumno A : listaAlumnos) {
						A.mostrarInfo();
						System.out.println();
					}
					
					break;
					
				case 3:
					
					listaAlumnos.sort(Comparator.comparingInt(Alumno::getNia));
					
					for(Alumno A : listaAlumnos) {
						A.mostrarInfo();
						System.out.println();
					}
					
					break;
					
				case 4:
					
					int orden=0;
					
					System.out.println("Seleccione el criterio para ordenar alumnos:");
					System.out.println("1. NIA");
					System.out.println("2. Nombre");
					System.out.println("3. Apellidos");
					System.out.println("4. Ciclo");
					System.out.println("5. Curso");
					System.out.println("6. Grupo");
					System.out.print("Opción: ");
					int criterio = sc.nextInt();
					
					switch(criterio) {
						case 1: // NIA
					        listaAlumnos.sort(Comparator.comparingInt(Alumno::getNia));
					        break;
					        
					    case 2: // Nombre
					    	listaAlumnos.sort(Comparator.comparing(Alumno::getNombre));
					        break;
					        
					    case 3: // Apellidos
					    	listaAlumnos.sort(Comparator.comparing(Alumno::getNombre));
					        break;
					        
					    case 4: // Ciclo
					        listaAlumnos.sort(Comparator.comparing(Alumno::getCiclo));
					        break;
					        
					    case 5: // Curso
					    	listaAlumnos.sort(Comparator.comparing(Alumno::getCurso));
					        break;
					        
					    case 6: // Grupo
					    	listaAlumnos.sort(Comparator.comparing(Alumno::getGrupo));
					        break;
					    default:
					        System.out.println("Opción no válida.");
						}
					
					for(Alumno A : listaAlumnos) {
						A.mostrarInfo();
						System.out.println();
					}
					
					break;
					
				case 5:
					System.out.println("Saliste");
					break;
					
				default:
			        System.out.println("Opción no válida");
			}
			
		}while(num!=5);
		
	}

}
