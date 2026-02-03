package poo;

import java.util.ArrayList;

import poo.PersonasPlano;

public class AppPersonaArrayList2 {

	public static void main(String[] args) {
		
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
				
			
			
				}
			
				
			


			
			

			

	}


