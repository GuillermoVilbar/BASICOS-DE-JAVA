package basicos;

import java.util.Scanner;

public class MostrarIniciales {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre;
		String iniciales;
		int posicionApellido;
		System.out.println("Dime tu nombre y tu apellido");
		nombre = entrada.nextLine().toUpperCase();
		//las comillas con un espacio en el medio significa que tomara el caracter que sea el espacio 
		posicionApellido = nombre .indexOf(" ")+1;
	//le sumamos 1 por que luego del espacion escribira su apellido
	
		System.out.println(nombre.charAt(0) + "," + nombre.charAt(posicionApellido));
		
		entrada.close();
		
		
		
		
		
	}

}
