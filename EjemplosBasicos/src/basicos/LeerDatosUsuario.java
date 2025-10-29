package basicos;

import java.util.Scanner;

public class LeerDatosUsuario {

	public static void main(String[] args) {
		
		//Creamos el Scanner
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Introduce tu nombre ");
		
		//Leemos una linea de texto entera y la guardamos en una variable de tipo String
		String nombre = entrada.nextLine();
		
		System.out.print("Introduce tu edad: ");
		
		//Leemos un numero entero
		int edad = entrada.nextInt();
		
		System.out.println("Hola " + nombre + ", tienes " + edad + " años ");
		
		//cerramos el Scanner al final
		entrada.close();
		
		
		
		
		
		
	}

}
