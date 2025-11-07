package basicos;

import java.util.Scanner;
public class EsPrimo {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	boolean esPrimo;
			
	System.out.println("Dime un numero (positivo)y te digo si es o no primo");
	int num = entrada.nextInt();
	
	esPrimo = true;
	 if (num > 2) {
		 if (num % 2==0) {
			 esPrimo = false;
		 }	else {		 
		 for (int i =3 ; i <= (num/2); i+=2 ) {
			 if (num%i==0) {
				 esPrimo=false;
				 break;
			 }
		 }
	 }
	 }
	 if (esPrimo) {
		 
		 System.out.print("El numero: " + num + " es primo");
	 } else {
		 System.out.print("El numero: " + num + " no es primo");
		 
		 
		 
		 
		 
		 
	entrada.close();
	

}
}
}