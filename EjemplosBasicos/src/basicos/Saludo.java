package basicos;

import java.util.Scanner;

public class Saludo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre;
		String apellido;
		System.out.print("Dime tu nombre: " );
		
		 nombre = entrada.nextLine();
		 
		 System.out.print("Dime tu apellido: " );
		 
		 apellido = entrada.nextLine();
		 
		 System.out.print("Bienvenido a Java " + nombre + " " + apellido);
		 
		 entrada.close();

	}

}
