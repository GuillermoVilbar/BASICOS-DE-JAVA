package basicos;

import java.util.Scanner;

public class InicialesNombre {
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		String nombreCompleto;
		int inicialApellido;
	System.out.println("Introduce tu nombre y tu apellido");
	nombreCompleto = entrada.nextLine().toUpperCase();
inicialApellido= nombreCompleto.indexOf(" ")+1;
System.out.print("Tus iniciales son " + nombreCompleto.charAt(0) + "." +nombreCompleto.charAt(inicialApellido) + ".");
	
	
	
	

		
		
		
		
		
		
	}

}
