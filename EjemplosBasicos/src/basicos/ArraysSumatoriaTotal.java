package basicos;

import java.util.Scanner;

public class ArraysSumatoriaTotal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		

		int[] notas = {1, 2, 3, 4, 5};
		 int suma =0;
		for (int i=0; i< notas.length; i++) {
			suma = suma + notas[i];
			//System.out.println(" sumamos  "+ notas[i]+ " a " +suma + " da " + (notas[i]+suma));
			
		}
		System.out.println("La suma da: " + suma);
		
		entrada.close();
		
		
	}

}
