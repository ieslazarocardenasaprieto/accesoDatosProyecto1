package tarea2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ruta = "C:\\Users\\alumno\\Documents\\AccesoDatos\\AccesoDatosEclipse\\ej2try.txt";
		
		 FileWriter fw = null;
	     PrintWriter pw = null;
		
		try {
			fw = new FileWriter(ruta);
			pw = new PrintWriter(fw);
			String palabra="";
			while(!palabra.equals("exit")) {
				
				System.out.println("Dame un texto para introducir en el archivo, cuando escribas exit saldra");
				palabra = sc.nextLine();
				
				if (palabra.equals("exit")) {
                    break; 
                }
				
				pw.println(palabra);
				
			}
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  finally {
            if (pw != null) {
                pw.close(); 
            }
        }

		
		
		
	}

}
