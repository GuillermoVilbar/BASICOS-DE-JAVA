package poo;
import java.util.Scanner;
public class AppTamagotchi {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
int opcion;
		
		do {
			System.out.println("\n--- Bienvenido a mundo Tamagotchi \n Veremos como se encuentra hoy tu Tamagotchi");
            System.out.println("1. Dormir");
            System.out.println("2. Comer");
            System.out.println("3. Jugar");
            System.out.println("4. Salir");
            System.out.print("Elige una opción (1-4): ");
            
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch (opcion) {
    		case 1:
    			
    			 
    			break;
    		case 2:
    			
    			break;
    		case 3:
    			
    			
    			
   			
   			 
   			 
   			 break;
    		case 4:
    			
    			break;
    			default:
    			
   			
            }
		} while (opcion!=4);
		
			  entrada.close();
	}

}
