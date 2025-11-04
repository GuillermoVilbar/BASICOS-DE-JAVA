package basicos;

import java.util.Scanner;

public class OrdenandoNumeros {
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1; 
		int num2;
		int num3;
		
		System.out.print("Escribe un numero: ");
		num1 = entrada.nextInt();
		
		
		
		System.out.print("Escribe un numero: ");
		num2 = entrada.nextInt();
	
		
		System.out.print("Escribe un numero: ");
		num3 = entrada.nextInt();
		
		if ((num1 >= num2 && num1 >=num3)) {
			// Si estamos aqui num1 es el mas grande
			 if (num2  >= num3) {
			System.out.print("De mayor a menor: " + num1 + " " + num2 + " " + num3);
		} else {
			System.out.print("De mayor a menor: " + num1 + " " + num3 + " " + num2);
		}
	} else if (num2 >= num1 && num2 > num3) {
			//Si estamos aqui num2 es el mas grande
			if ( num1 >= num3 ) {
				System.out.print("De mayor a menor: " + num2 + " " + num1 + " " + num3);
		} else {
			System.out.print("De mayor a menor: " + num2 + " " + num3 + " " + num1);
			
		}
	} else {
		//Si num1 no es el mas grande ni num2, el mas grande es num3
		if (num1 >= num2) {
			System.out.print("De mayor a menor: " + num3 + " " + num1 + " " + num2);
		} else {
			System.out.print("De mayor a menor: " + num3 + " " + num2 + " " + num1);
		}
	}
}

	}

