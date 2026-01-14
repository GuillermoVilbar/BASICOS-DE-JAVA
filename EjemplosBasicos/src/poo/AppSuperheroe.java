package poo;

import java.util.Scanner;

public class AppSuperheroe {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Como quieres que se llame tu superheore?");
		String  nombre = entrada.nextLine();
		System.out.println("¿Que superpoder quieres que tenga?");
		String  poder = entrada.nextLine();
		
		Superheroe caballoman = new Superheroe(nombre,poder);
	
		caballoman.describir();
		

	}

}
