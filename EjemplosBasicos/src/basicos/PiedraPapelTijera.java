









package basicos;

import java.util.Scanner;


public class PiedraPapelTijera {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		String[] arrayOpciones = {"Piedra", "Papel", "Tijera"};
		String opcionPlayer = arrayOpciones[pedirOpcion()-1];

		String opcionPc = arrayOpciones[eleccionPC()-1];
		System.out.print("El jugador ha elegido: " + opcionPlayer + " y el PC  " + opcionPc);

		if(opcionPlayer.equals(opcionPc)) {
			System.out.println(" Empate!! ");
		}	else if ((opcionPlayer.equals(" Papel")&& opcionPc.equals(" Piedra ")) ||
				(opcionPlayer.equals(" Tijera ")&& opcionPc.equals(" Papel ")) ||
						(opcionPlayer.equals(" Piedra")&& opcionPc.equals(" Tijera "))){
							System.out.println(" Ganaste!!");
						}else {
							System.out.println(" Perdiste!! ");
						}

						entrada.close();
	}

	public static int eleccionPC() {
		int eleccion = (int)(Math.random()*3)+1;
		return eleccion;
	}


	public static int pedirOpcion() {
		int eleccion;
		System.out.println("Por favor, elija una de las siguientes opciones");
		System.out.println("1-Piedra");
		System.out.println("2-Papel");
		System.out.println("3-Tijera");
		do {
			eleccion =entrada.nextInt();

			if(eleccion <1 || eleccion>3) {
				System.out.println("Revisa tu respuesta");
			}
		}while(eleccion < 1 || eleccion >3);
		return eleccion;




	}
}




	

