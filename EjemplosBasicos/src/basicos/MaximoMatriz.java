package basicos;

import java.util.Scanner;
public class MaximoMatriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce numero de columnas de la matriz");
		int numColumnas =entrada.nextInt();

		System.out.println("Introduce  el numero de filas de la matriz");
		int numFilas = entrada.nextInt();

		int [][] matriz = new int[numFilas][numColumnas]; 


		for(int i = 0; i< matriz.length;i++ ) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.println("Introduce valor para [" + j + "][" + i + "]: ");
				matriz[i][j] = entrada.nextInt();
			}
		}

		for(int i=0; i < matriz.length;i++) {
			for(int j=0; j<matriz[i].length;j++) {

				System.out.print(matriz[i][j]+ "\t");

			}
			System.out.println();
		}
	}
}

