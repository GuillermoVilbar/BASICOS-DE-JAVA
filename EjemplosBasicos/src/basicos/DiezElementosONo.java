package basicos;
import java.util.Scanner;

public class DiezElementosONo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] numeros = new int[10];
		int contador =0;
	do { 
		System.out.println("Introduce un valor: ");
		numeros[contador]= entrada.nextInt();
				contador++;
		
		
		
	} while(numeros[contador-1] > 0 && contador<numeros.length);
				
	for (int i =0; i<numeros.length;i++) {
		if (numeros[i] <=0) {
			break;
		}
		System.out.println(numeros[i] + " ");
	}
		}
			
		
		}
		
		
		
		
	


