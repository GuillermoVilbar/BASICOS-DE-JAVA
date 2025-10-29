package basicos;

import java.util.Scanner;

public class CalculadoraSimple {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
			int n1, n2;
			
			System.out.print("Dime tu primer numero: ");
			
			n1 = entrada.nextInt();
					
			System.out.print("Dime tu segundo numero ");
			
			n2 = entrada.nextInt();
			
			int suma, resta, multiplicacion;
			
			suma = n1 + n2;
		
			resta = n1 - n2;
			
			multiplicacion = n1 * n2;
			
			 System.out.println("Tu suma es " + suma );
			 System.out.println("Tu resta es " + resta );
			 System.out.println("Tu multiplicacion es " + multiplicacion );
			 
			 entrada.close();
			
		
			
			
			
			
			
			
			
			
	}

}
