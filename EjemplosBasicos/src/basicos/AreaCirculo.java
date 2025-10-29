package basicos;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
		double n1;
		
		System.out.print("Dime el radio del circulo que quieres: ");
		
		n1 = entrada.nextInt();
				
		 System.out.println("El area de tu circulo es: " + (Math.PI * Math.pow(n1,2)));
		
		 entrada.close();
	}

}
