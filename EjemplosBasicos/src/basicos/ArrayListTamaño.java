package basicos;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListTamaño {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Integer> numeroUsuario = new ArrayList<>();
		int respuestas;
		System.out.println("introduce numero hasta te canses, cuando no quieras mas escribe -1");
		do { respuestas = entrada.nextInt();

		if (respuestas != -1) {
			numeroUsuario.add(respuestas);
		}
		}while(respuestas !=-1);
		System.out.println("La lista es" + numeroUsuario);
		System.out.println(numeroUsuario.get(0));
		System.out.println(numeroUsuario.get(numeroUsuario.size()-1));
	}
}


	
	


