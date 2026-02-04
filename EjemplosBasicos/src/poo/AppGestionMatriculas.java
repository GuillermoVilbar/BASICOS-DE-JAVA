package poo;
import java.util.Scanner;
import java.util.ArrayList;
public class AppGestionMatriculas {

	public static void main(String[] args) {
		Scanner entrada Scanner = new Scanner(System.in);
do {
			
			System.out.println("¿Qué te gustaría hacer?");
			System.out.println("1-Añadir una materia");
			System.out.println("2-añadir un estudiante");
			System.out.println("3-Mostrar el listado de personas");
			System.out.println("4-Salir");
			
			System.out.println("¿qué eliges?");
			opcion=entrada.nextInt();
			entrada.nextLine();

			switch (opcion) {
				case 1:
					
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					System.out.println("Hasta luego!");
				default:
					System.out.println("Elige una opción valida");

			}


			
		}while(opcion!=4); 

	}

}
