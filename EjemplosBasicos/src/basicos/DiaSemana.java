package basicos;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe un numero y te digo el dia de la semana: ");
		int num = entrada.nextInt();
		
		entrada.close();
		
		

		
	switch (num) {
	
	case 1:
		System.out.println("Es lunes");
		break;
	case 2:
		System.out.println("Es martes");
		break;
	case 3:
		System.out.println("Es miercoles");
		break;
	case 4:
		System.out.println("Es jueves");
		break;
	case 5: 
		System.out.println("Es viernes");
		break;
	case 6:
		System.out.println("Es sabado");
		break;
	case 7:
		System.out.println("Es domingo");
		break;
		default:
			System.out.println("Dia no valido");
			
		
			
	}
	}
}

