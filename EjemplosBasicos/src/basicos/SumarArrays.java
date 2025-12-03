package basicos;
import java.util.Arrays;
import java.util.Scanner;
public class SumarArrays {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int array1[] = new int[5];
		int array2[] = new int[5];
		int array3[] = new int[5];
		int i;

		System.out.println("Dime los valores del primer array");
		
		for(i = 0; i <array1.length; i++) {
			
			array1[i] = entrada.nextInt();
		}
		System.out.println("Dime los valores del segundo array");

		for(i = 0; i < array2.length; i++) {

			array2[i] = entrada.nextInt();
		}
		
		for(i =0;i<array1.length; i++) {
			array3[i]= array1[i] + array2[i];
			//System.out.println(array3[i]);
			
		}
		System.out.println("La suma de tus arrays es: "+ Arrays.toString(array3));
		entrada.close();
	}

}


