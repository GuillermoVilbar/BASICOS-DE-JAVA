package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NotarioDigital {

	public static void main(String[] args) {


		File miFichero = new File("Regitro.txt");
		PrintWriter escritor = null;
		Scanner sc = new Scanner(System.in);



		try {


		escritor  = new PrintWriter(miFichero);

			while(true) {
				System.out.println("Escribe una frase o escribe FIN ");
				String frase = sc.nextLine();
				if (frase.equals("FIN")) {
					break;
				}else {
					escritor.println(frase);
				}
			}


		} catch (FileNotFoundException e) {
			System.out.println("Error: El fichero no existe");


		} finally {
			// Ponemos un if para no generar otra excepción dentro del finally.
			if (escritor != null) {
				// Esta instrucción es la que realmente vuelca el texto al disco duro
				escritor.close(); 
			}sc.close();
				System.out.println("Flujo cerrado. Datos guardados físicamente en disco.");
			}
		
	}
}