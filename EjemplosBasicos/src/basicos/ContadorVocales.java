package basicos;

import java.util.Scanner;

public class ContadorVocales {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String frase, vocalesMinuscula;
		int i;
		int contador;
		contador = 0;
		System.out.print("Introduce una frase y te dire cuantas vocales tiene");
		frase = entrada.nextLine();
		
		vocalesMinuscula = frase.toLowerCase();
		
		for (i=0; i< vocalesMinuscula.length();i++){
			if (vocalesMinuscula.charAt(i) == 'a' || vocalesMinuscula.charAt(i) == 'e' || vocalesMinuscula.charAt(i) == 'i' || vocalesMinuscula.charAt(i) == 'i' || frase.charAt(i) == 'u') {
				contador++;
			}
		}
		System.out.print("Tu frase/palabra tiene " + contador + " vocales");
		

	}

}
