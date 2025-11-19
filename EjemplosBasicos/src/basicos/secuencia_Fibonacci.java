package basicos;

import java.util.Scanner;
public class secuencia_Fibonacci {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int termino;
		int penultimo = 1;
		int antepenultimo = 0;
		int actual;
		int i;
		System.out.print("Cuantos terminos de la secesion de fibonacci quieres ver?");
		termino = entrada.nextInt();
		
	System.out.println("El termino numero 1 es 0\nEl termino numero 2 es 1");
	
	for (i = 3; i <= termino; i++) {
		actual = penultimo + antepenultimo;
		System.out.println("El termino numero " + i + " es " + actual);
		antepenultimo = penultimo;
		penultimo = actual;
		entrada.close();
		
	}
	
	
	
		}
	
	

}
