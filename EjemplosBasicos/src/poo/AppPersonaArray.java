package poo;
import java.util.ArrayList;
import java.util.Scanner;
import poo.PersonasPlano;
public class AppPersonaArray {



	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<PersonasPlano> listaDePersonas = new ArrayList<>();
		PersonasPlano guillermo = new PersonasPlano("Guillermo",23);
		PersonasPlano juan = new PersonasPlano("Juan",12);
		PersonasPlano luis = new PersonasPlano("Luis",25);

		listaDePersonas.add(guillermo);
		listaDePersonas.add(juan);
		listaDePersonas.add(luis);

		System.out.println("La lista de personas es: "+ listaDePersonas.toString());

		for(int i = 0; i< listaDePersonas.size();i++) {
			if(listaDePersonas.get(i).getEdad()>=18) {
				System.out.println(listaDePersonas.get(i).toString());


			}
		}
		//eliminar gente
		System.out.println("Que nombre quieres eliminar de la lista");
		String respuesta = entrada.nextLine();
		listaDePersonas.removeIf(n ->n.getNombre().equalsIgnoreCase(respuesta));

		System.out.println("lista final" + listaDePersonas.toString());



		//añadir gente
		System.out.println("Que nombre quieres añadir de la lista");
		String añadir = entrada.nextLine();
		System.out.println("cual es su edad");
		int edadR = entrada.nextInt();
		listaDePersonas.add( new PersonasPlano(añadir,edadR));

		System.out.println("lista final" + listaDePersonas.toString());
	}
}





	

	


