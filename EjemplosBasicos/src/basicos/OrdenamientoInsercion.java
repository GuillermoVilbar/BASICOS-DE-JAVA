package basicos;

import java.util.Arrays;
import java.util.Scanner;

import basicos.recursos;

public class OrdenamientoInsercion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe la longitud del array: ");
		int dimension = sc.nextInt();
		int [] arrayNumeros = new int[dimension];
		
		recursos.rellenarArrayAleatorio(arrayNumeros, 100);
		System.out.println("El array inicial es: ");
		System.out.println("---------------------");
		recursos.mostrarArray(arrayNumeros);
		System.out.println("\nComenzamos a ordenarlo");
		for(int i=1;i<arrayNumeros.length;i++ ) {
		//System.out.println("vamos por el elemento: "+ arrayNumeros[i]);
		int j=i;
		do {
			if (arrayNumeros[j]< arrayNumeros[j-1]) {
				//los intercambio( seria mas eficiente si escribiesemos el numero solo una vez
			// pero hace que el algoritmo se entienda peor
				//System.out.println("Voy a comparar " + arrayNumeros[j] + " a ver si es mas pequeño que " + arrayNumeros[j-1]);
				int aux = arrayNumeros[j];
				arrayNumeros[j] = arrayNumeros[j-1];
				arrayNumeros[j-1] = aux;
				j--;
			}
			else {
				// acabo ya esta ordenado
				break;
			}
		}while(j>=1);
		}
		recursos.mostrarArray(arrayNumeros);
		
		
		
	}
	}

