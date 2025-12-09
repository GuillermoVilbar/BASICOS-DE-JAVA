package basicos;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class SumarArrays {

	final static int ELEMENTOS=5;
	static Scanner entrada= new Scanner(System.in);


	public static void main(String[] args) {
		//Scanner entrada= new Scanner(System.in);


		int array1[] = new int[ELEMENTOS];
		int array2[] = new int[ELEMENTOS];
		int array3[] = new int[ELEMENTOS];


		System.out.println("Dime los valores del primer array");

		rellenarArray(array1);

		System.out.println("Dime los valores del segundo array");
		rellenarArray(array2);

		if (array1.length==array2.length){
			array3=sumarDosArrays(array1, array2);
			System.out.println("Las sumas son:");
			mostrarArray(array3);
			//System.out.println("La suma es: " + Arrays.toString(array3));
		} else {
			
			System.out.println("Los arrays tienen que tener el mismo tamaño");
		}
		
		entrada.close();
	}
	
	public static void mostrarArray(int[]array){
		for (int i=0; i<array.length; i++) {
			System.out.println("Para el elemento[" + i + "] = " + array[i]);
		}
	}
	
	public static int [] sumarDosArrays(int[]array1, int[] array2){
		int [] suma = new int [array1.length];
		for(int i =0;i<array1.length; i++) {
			suma[i]= array1[i] + array2[i];
		}
		
		return suma;
	}
	
	public static void rellenarArray(int a[]) {
		for(int i = 0; i <a.length; i++) {
			a[i] = entrada.nextInt();
		}
	}
}
