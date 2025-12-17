


package basicos;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;

public class OrdenarArraySeleccion {


	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Escribe la longitud del array: ");
		int dimension = entrada.nextInt();
		int [] array1 = new int [dimension];
		recursos.rellenarArrayAleatorio(array1, 100);
		System.out.println("El array inicial es:  " );
		System.out.println("-------------------- ");
		recursos.mostrarArray(array1);
		System.out.println("\nComenzamos a ordenarlo");
		for(int i=0; i<array1.length;i++) {
		int menor = array1[i];
		int posicion =i;
		for( int j=1+i;j<array1.length;j++) {
			if (menor >array1[j]) {
				menor = array1[j];
				posicion =j;
			}
		}
		
		array1[posicion] = array1[i];
		array1[i]= menor;
		
		}
		recursos.mostrarArray(array1);

	}
}




