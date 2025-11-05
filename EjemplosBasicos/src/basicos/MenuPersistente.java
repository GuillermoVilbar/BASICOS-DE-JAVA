package basicos;

import java.util.Scanner;


public class MenuPersistente {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int opcion;
		
		do {
			System.out.println("\n--- MENÚ PERSISTENTE ---");
            System.out.println("1. Saludar");
            System.out.println("2. Decir la hora (simulado)");
            System.out.println("3. Agradecer");
            System.out.println("4. Salir");
            System.out.print("Elige una opción (1-4): ");
            
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch (opcion) {
    		case 1:
    			String nombre;
    			String apellido;
    			System.out.print("Dime tu nombre: " );
    			
    			 nombre = entrada.nextLine();
    			 
    			 System.out.print("Dime tu apellido: " );
    			 
    			 apellido = entrada.nextLine();
    			 
    			 System.out.print("Bienvenido a Java " + nombre + " " + apellido);
    			break;
    		case 2:
    			System.out.print("La hora es 19:30" );
    			break;
    		case 3:
    			
    			System.out.print("Dime tu nombre: " );
    			
   			 nombre = entrada.nextLine();
   			 
   			 System.out.print("Muchas gracias, " + nombre );
   			 break;
    		case 4:
    			System.out.print("Adios" );
    			break;
    			default:
    				System.out.print("Error, intente nuevamente" );
   			
            }
		} while (opcion!=4);
		
			  entrada.close();
	

	}
	}


