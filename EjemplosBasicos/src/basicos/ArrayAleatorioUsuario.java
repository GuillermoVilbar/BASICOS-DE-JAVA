package basicos;

import java.util.Scanner;
public class ArrayAleatorioUsuario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cual es el tamaño de array?");
		int dimension = entrada.nextInt();

		int[] numeros= new int[dimension];

		System.out.println("Tengo un array de longitud " + numeros.length);

		for (int i= 0; i < numeros.length; i++) {

			numeros[i] = ((int)(Math.random()*10+1));
			//System.out.println("El numero es " + numeros[i] + " su cuadrado " + (int)Math.pow(numeros[i], 2) + " y su cubo " +(int) Math.pow(numeros[i], 3) );
		}
		//se podria hacer con el bucle anterior))
		for (int num : numeros) {
			System.out.println("El numero es " + num + " su cuadrado " + (int)Math.pow(num, 2) + " y su cubo " +(int) Math.pow(num, 3) );
		}
			entrada.close();
	}
}

