package basicos;

import java.util.Scanner;

public class KilometrosConversion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double velocidad; 
		double conversion;
		int opcion;
		System.out.println("¿A que velocidad vas?");
		velocidad = entrada.nextDouble();
		
		System.out.println("¿Y de que unidades estamos hablando?");
		System.out.println("1-Km/h");
		System.out.println("2-m/s");
		opcion = entrada.nextInt();
		entrada.close();
		
		if (opcion ==1) {
			// El dato esta en Km/h se lo muestro en m/s
			conversion = velocidad * 1000/3600;
			System.out.println("Vas a " + velocidad + " km/h lo que equivale a " + conversion + "m/s");
		} else {
			//El dato esta en m/s, se lo muestro en Km/h
			conversion=velocidad*3600/1000;
			System.out.println("Vas a " + velocidad + " m/s lo que equivale a " + conversion + "Km/h");
		}
	}

}
