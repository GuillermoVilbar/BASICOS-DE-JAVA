package basicos;

import java.util.Scanner;

public class ContarPalabras {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Escribe una frase y te dire cuantas palabras tiene");
	String frase = entrada.nextLine();
	int palabras = 0;
for( int i =0; i < frase.length();i++) {
	if (frase.charAt(i)==' '   ){
		palabras++;
		
		 
	}
	
}
	palabras++;
	
	System.out.println("La cantidad de palabras es: " + palabras);
	entrada.close();
	
	}

}
