package basicos;

import java.util.Scanner;

public class ArrayMaximoMinimo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int [] datos = {100,2,3,4,5,6,7,8,9};
		int VMaximo=datos[0];
		int VMinimo=datos[0];
		
		for (int i = 0 ; i < datos.length; i++) {
			if (datos[i] > VMaximo) {
				VMaximo = datos[i];
				
			}if ( datos[i]< VMinimo){
				VMinimo = datos[i];
				
				}
			
		}
		
		System.out.println("El valor minimo es: " + VMinimo);
		System.out.println("El valor maximo es: " + VMaximo);
			
		}
			
		
		
		
		

	}


