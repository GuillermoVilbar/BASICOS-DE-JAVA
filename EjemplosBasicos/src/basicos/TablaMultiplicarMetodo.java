package basicos;

import java.util.Scanner;
public class TablaMultiplicarMetodo {

	public static void mostrarTabla (int num) {

	System.out.println("Tabla del numero: " + num);
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x" + i + "=" + num*i);
			
		}
			
	}





	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);

		System.out.println("Dame un numero y muestro su tabla de multiplicar");
		int numero = entrada.nextInt();

		for ( int i = 1; i <= numero; i++) {
			mostrarTabla(i);
			System.out.println("-----------");
		}

		mostrarTabla(numero);
		
		entrada.close();
	}

}
