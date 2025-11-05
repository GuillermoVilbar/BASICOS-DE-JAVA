package basicos;

import java.util.Scanner;

public class Del1al100 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		for ( int i =1; i <=10; i++) {
			for (int j =1; j <=10; j++) {
				System.out.print(" F" + i + "C" + j );
			}
			System.out.println("");
			
		}
			
			int contador = 1;
			for ( int i =1; i <=10; i++) {
				for (int j =1; j <=10; j++) {
					System.out.print( contador + " " );
					contador++;}
				System.out.println("");
		
			
		}
	}

}
