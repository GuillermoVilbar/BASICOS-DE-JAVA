package basicos;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayEstaONoEsta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<String>nombres = new ArrayList<>();
		nombres.add("Maria");
		nombres.add("Mario");
		nombres.add("Guillermo");
		nombres.add("Jose");
		nombres.add("Leandro");
		System.out.println("Escribe un nombre y veremos si esta en esta lista");
		String nombre = entrada.nextLine();
		String nombre2 = Character.toUpperCase(nombre.charAt(0)) + nombre.substring(1);
		if(nombres.contains(nombre2)) {
			System.out.println("el nombre "+ nombre2+ " si esta en la lista");
		}else{ System.out.println("el nombre " + nombre2 + " no esta en la lista");
		}
		entrada.close();
	}
}


