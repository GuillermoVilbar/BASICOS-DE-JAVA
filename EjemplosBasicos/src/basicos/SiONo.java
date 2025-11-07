package basicos;

import java.util.Scanner;

public class SiONo {

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);

			String opcion;
			
			do {
				System.out.println("Quieres Continuar? (s/n)");
				opcion = entrada.nextLine();
			     
			     
			}while (!opcion.equals("s") );
	
			
			entrada.close();
			
		}  
		
}
	            
	       