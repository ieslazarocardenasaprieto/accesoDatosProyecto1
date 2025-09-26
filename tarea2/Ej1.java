package tarea2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// String ruta = "C:\\Users\\alumno\\Documents\\AccesoDatos\\AccesoDatosEclipse\\TRY.txt";
		
		System.out.println("Dame la ruta del fichero");
		String ruta = sc.nextLine();
		System.out.println("Dame el nombre del fichero");
		String name = sc.nextLine();
		String rutaCompleta = ruta + "/" + name;
		
		BufferedReader fichero = new BufferedReader (new FileReader(rutaCompleta)) ;
		String ln;
		
		while ((ln = fichero.readLine()) != null) {
			System.out.println(ln);
		}
		
		fichero.close();
	}

}
