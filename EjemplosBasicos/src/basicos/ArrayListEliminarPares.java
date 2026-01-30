package basicos;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListEliminarPares {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Integer> numeroUsuario = new ArrayList<>();
		int respuestas;
		System.out.println("introduce numero hasta te canses, cuando no quieras mas escribe -1");
		do { respuestas = entrada.nextInt();

		if (respuestas != -1) {
			numeroUsuario.add(respuestas);
			numeroUsuario.removeIf(patata -> patata  %2 ==0);
		}
		
		}while(respuestas !=-1);
		
		
		
		System.out.println(numeroUsuario);
		
		
		
		

	}

}
