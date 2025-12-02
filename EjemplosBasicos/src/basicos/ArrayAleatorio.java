package basicos;

public class ArrayAleatorio {

	public static void main(String[] args) {
	
		int numeroRedondeado=0;
		double [] array_numeros = new double [10];

		for(int i= 0; i < array_numeros.length;i++) {
			double valorAleatorio = (double)(Math.random()*10);
			array_numeros[i] = valorAleatorio;

		}

		for(int i= 0; i < array_numeros.length;i++) {

			numeroRedondeado = (int) Math.ceil(array_numeros[i]);
			System.out.println("Los numeros son: "+ numeroRedondeado );
		}
			int cuadrado = (int)Math.pow(numeroRedondeado,2);
			int cubo = (int)Math.pow(numeroRedondeado,3);
			
			
			System.out.println("Los numeros son: "+ numeroRedondeado + ", su cuadrado es " + cuadrado + " y su cubo es " + cubo);
	}
}


