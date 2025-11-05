package basicos;

import java.util.Scanner;


public class PositivoNegativo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dime cuantos numeros me vas a dar: " );
		int numeros = entrada.nextInt();
		int  num;
		int positivos = 0;
		int negativos = 0;
		int ceros = 0;
		
		for (int i=1 ; i<=numeros ; i++) {
			System.out.print("Dime el numero: " + i );
			num = entrada.nextInt(); 
			if (num>0) {
				positivos++;
			}else if (num<0) {
				negativos++;
			}else {
				ceros++;
			}
		
		}
	
	System.out.print("En total han sido: "
			+ positivos + " numeros positivos "
			+ceros + " numeros 0");
	
	
	entrada.close();
}
}


