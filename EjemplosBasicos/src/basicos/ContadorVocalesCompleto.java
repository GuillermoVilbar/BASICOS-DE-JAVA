package basicos;

import java.util.Scanner;

public class ContadorVocalesCompleto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		String frase, vocalesMinuscula;
		int i;
		int contador;
		contador = 0;
		System.out.print("Introduce una frase y te dire cuantas vocales tiene");
		frase = entrada.nextLine();
		
		vocalesMinuscula = frase.toLowerCase();
		
		for (i=0; i< vocalesMinuscula.length() ;i++){
			if         (vocalesMinuscula.charAt(i) == 'a' || vocalesMinuscula.charAt(i) == 'e' 
					|| vocalesMinuscula.charAt(i) == 'i'  || vocalesMinuscula.charAt(i) == 'o'
					||  vocalesMinuscula.charAt(i) == 'u' ||  vocalesMinuscula.charAt(i) == 'á' 
					||  vocalesMinuscula.charAt(i) == 'é' ||  vocalesMinuscula.charAt(i) == 'í' 
					||  vocalesMinuscula.charAt(i) == 'ó' ||  vocalesMinuscula.charAt(i) == 'ú') {
				contador++;
			}
		}
		System.out.print("Tu frase/palabra tiene " + contador + " vocales");
		
	

	
	}

}