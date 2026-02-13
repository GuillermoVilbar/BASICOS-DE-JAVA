package poo;
import java.util.Scanner;
import java.util.ArrayList;
public class AppGestionMatriculas {

	
	
	
	public static void mostrarEstudiantes(ArrayList<Estudiante> estus) {
		for(Estudiante e: estus) {
			System.out.println(e.getNumMatricula()+" " + e.getNombre());
		}
		}
		
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<Materia> materias = new ArrayList<>();
		ArrayList<Estudiante> estudiantes = new ArrayList<>();
do {
			
			System.out.println("¿Qué te gustaría hacer?");
			System.out.println("1-Añadir una materia");
			System.out.println("2-añadir un estudiante");
			System.out.println("3-Matricular a un estudiante");
			System.out.println("4-Listar las materias");
			System.out.println("5-Listar los estudiante");
			System.out.println("6-Ver numero total de matriculados");
			System.out.println("7-Salir");
			
			System.out.println("¿qué eliges?");
			int opcion =entrada.nextInt();
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


			
		}while(opcion!=7); 

	}

}
