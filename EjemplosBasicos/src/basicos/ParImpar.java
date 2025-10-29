package basicos;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

System.out.println("Por favor, escribe un numero por pantalla");
	int num = entrada.nextInt();
	
	entrada.close();

	if(num % 2 == 0 ) {
		System.out.print("El numero: " + num + " es par");
			} else { 
				System.out.print("El numero: " + num + " es impar");
			}
	
	
	}
	
	}


