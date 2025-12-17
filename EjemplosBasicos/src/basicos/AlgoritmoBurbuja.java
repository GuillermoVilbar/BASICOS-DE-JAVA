	package basicos;
		import java.util.Arrays;
		import java.util.Scanner;

public class AlgoritmoBurbuja {

	public static void main(String[] args) {
	
				Scanner entrada = new Scanner(System.in);
				System.out.println("tamaño del array: ");
				int dimension = entrada.nextInt();
		 
				int[] array1 = new int [dimension];
		 
				for(int i=0; i<array1.length; i++) {
					array1[i]= recursos.numAleatorio(100);
				}
				System.out.println("El array es:" +"\n"+Arrays.toString(array1));
				System.out.println("Comenzamos a ordenarlo");
				for (int i =0;i<array1.length-1;i++) {
				for(int j=0;j<array1.length-1-i;j++) {
					if (array1[j]>array1[j+1]) {
						int aux=array1[j];
						System.out.println(Arrays.toString(array1));
						array1[j]= array1[j+1];
						array1[j+1]=aux;
						
					}
					}			
					
				}
				System.out.print(Arrays.toString(array1));
		 
			}
		 
		 
		 
		 
		 
		 
		
		 
	}


