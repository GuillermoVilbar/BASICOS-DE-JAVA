package basicos;

import java.util.Scanner;

public class CocienteYResto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
				int n1, n2;
				
				System.out.print("Dime tu primer numero: ");
				
				n1 = entrada.nextInt();
						
				System.out.print("Dime tu segundo numero ");
				
				n2 = entrada.nextInt();
				
				float division, modulo;
				
				division = n1 / n2;
				
				modulo = n1 % n2;
				
				 System.out.println("Tu division es " + division );
				 System.out.println("Tu resto es " + modulo );
				
				 entrada.close();
				
				
		
		
		
		
}
}