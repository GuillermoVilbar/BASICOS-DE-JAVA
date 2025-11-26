package basicos;

import java.util.Scanner;

public class AdivinarNumero123 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		int vidas=10;
		int numeroPensado = (int) (Math.random()*100);	
		System.out.println("He pensado el número:" + numeroPensado);
		
		System.out.println("He pensado un múmero, a ver si adivinas");
		
		do{
			System.out.println("\nPrueba");
			numero=entrada.nextInt();
			if(numero< numeroPensado) {
				System.out.println("Fallaste es mayor, te quedan " + --vidas + " vidas");
			}else if(numero > numeroPensado){
				System.out.println("Fallaste es menor, te quedan " + --vidas + " vidas");
			}else {
				System.out.print("Acertaste!");
				break;
			}
		} while(numero!=numeroPensado && vidas>0);
		
		entrada.close();
		
		

	}
	

}