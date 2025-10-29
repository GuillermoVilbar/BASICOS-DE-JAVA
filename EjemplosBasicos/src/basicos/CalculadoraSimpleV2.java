package basicos;

import java.util.Scanner;

public class CalculadoraSimpleV2 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
			int n1, n2;
			
			System.out.print("Dime tu primer numero: ");
			
			n1 = entrada.nextInt();
					
			System.out.print("Dime tu segundo numero ");
			
			n2 = entrada.nextInt();
			
		
			
			 System.out.println("Tu suma es " + (n1 + n2) );
			 System.out.println("Tu resta es " + (n1 - n2) );
			 System.out.println("Tu multiplicacion es " + (n1 * n2) );
			 
			 entrada.close();
	}
}
			
