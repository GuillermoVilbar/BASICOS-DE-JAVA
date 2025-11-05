package basicos;

import java.util.Scanner;

public class CuentaRegresiva {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contadorWhile;
		int contadorDoWhile;
		
		
		System.out.println("Introduce un numero para hacer una cuenta regresiva");
		
		int n1= entrada.nextInt();
		
	contadorWhile = n1;
	while (contadorWhile > 0 ) {
		System.out.print(contadorWhile);
		contadorWhile --; //contadorWhile = contadorWhile - 1;
	}
	System.out.println("0.");
	
	
	System.out.println("Con un bucle Do While");
	contadorDoWhile = n1;
	do {
		System.out.print(contadorDoWhile + ",");
		contadorDoWhile--;
	} while ( contadorDoWhile > 0 );
	System.out.println("0.");
	
	System.out.println("Con un bucle for");
	for (int i=n1; i>0;i--) {
	System.out.print(i + ", ");
	}
	System.out.println("0.");
	
	
	}
	

}
