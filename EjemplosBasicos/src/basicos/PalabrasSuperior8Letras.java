package basicos;

import java.util.Scanner;

public class PalabrasSuperior8Letras {

	public static void longitud (String p1, String p2) {
	
	
	int longitud1 = p1.length();
	int longitud2 = p2.length();
	 
	if(longitud1 > 8) {
		System.out.println("La palabra " + p1 + " tiene mas de 8 letras");
		if (longitud2 > 8) {
			System.out.println("La palabra +" + p2 + " tiene mas de 8 letras");
		}else {
			System.out.println("Ninguna palabra supera las 8 letras");
		}
	}
	
	
	
	}
		
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime 2 palabras y te dire que palabra tiene mas de 8 letras");
		
		
		String palabra1=entrada.next();
		String palabra2 = entrada.next();
		
		longitud(palabra1, palabra2);
	
		entrada.close();
			
		}
	}


