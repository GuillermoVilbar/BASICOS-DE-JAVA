package basicos;

import java.util.Scanner;

public class CalculoHipotenusa {

	public static void main(String[] args) {
		
			Scanner entrada = new Scanner(System.in); 
				double n1, n2;
				
				System.out.print("Dime tu primer cateto: ");
				
				n1 = entrada.nextInt();
						
				System.out.print("Dime tu segundo cateto ");
				
				n2 = entrada.nextInt();
				
				
				 System.out.println("Tu hipotenusa es " + (Math.sqrt((Math.pow(n1, 2) + (Math.pow(n2,2))))));
				 
				 entrada.close();
	}

}
