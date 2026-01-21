package basicos;

import java.util.Arrays;
import java.util.Scanner;
public class TresEnRaya {

	static char[][] tablero = new char[3][3] ;

	public static void mostrarTablero () {
		System.out.println("Tablero actual \n---------");
		for(int i=0; i < tablero.length; i++) {
			for(int j =0; j<tablero[i].length;j++) {
				System.out.print("|"+tablero[i][j] +"|" );
			}
			System.out.println();			
		}

	}
	public static boolean colocarFicha (int fila, int columna, char ficha) {
		if (tablero[fila][columna]== '-') {
			// podemos poner la ficha, esta libre
			tablero[fila][columna] = ficha;
			return true;
		}else {
			//si no hay guion es que hay una ficha
			System.out.println("Ya hay una ficha colocada, intentalo nuevamente");
			return false;
		}
	}


	public static boolean finPartida() {
		//hay 3 en raya en la horizontal
		for (int i=0; i<tablero.length;i++) {
			if (tablero[i][0]== tablero[i][1] && tablero[i][1]== tablero[i][2] && tablero[i][0]!='-') {

				return true;
			}
		}
		//comprobamos las columnas
		for(int j=0; j<tablero.length;j++) {
			if (tablero[0][j]== tablero[1][j] && tablero[1][j]== tablero[2][j] && tablero[0][j]!='-') {
				return true;
			}
		}
		if((tablero[0][0]==tablero[1][1] && tablero[1][1]==tablero[2][2] && tablero[0][0]!='-') 
				||
				(tablero[0][2]==tablero[1][1] && tablero[1][1] == tablero[2][0]&& tablero[0][2]!='-')){
			return true;
		}

		// si llegamos aqui es que nadie gano aun
		return false;
	}

	public static boolean hayEmpate() {
		//Hay que tener cuidado por si alguien gana en la ultima jugada
		for(int i =0; i< tablero.length;i++) {
			for(int j=0;j<tablero.length;j++) {
				if (tablero[i][j]=='-') {
					// si encontramos un guion significa que hay un espacio libre y por lo tanto no acaba la apartida
					return false;
				}
			}
		}
		return true;



	}
	public static void crearTablero() {
		for(int i=0; i< tablero.length;i++) {	
			Arrays.fill(tablero[i], '-');

		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// aqui va el juego como tal

		System.out.println("\nVamos a jugar al Tres en Raya\nEste sera nuestro tablero");
		crearTablero();
		mostrarTablero();
		do {	
			boolean colocarExitoso =false;
			while(!colocarExitoso) {
				System.out.println("Jugador 1, elije donde quieres poner la ficha\n"
						+ "Primero elije la fila, luego la columna y por ultimo el valor"
						+ " con el que quieres jugara X O");
				int jugador1Column = entrada.nextInt();
				entrada.nextLine();
				int jugador1Row = entrada.nextInt();
				entrada.nextLine();
				String jugador1Simbol =entrada.next();
				entrada.nextLine();
				char ficha = jugador1Simbol.charAt(0);
				colocarExitoso =colocarFicha(jugador1Row,jugador1Column,ficha);
				mostrarTablero();
			}
			if(finPartida() || hayEmpate())break;
			System.out.println("El jugador 1 gano la partida");
			
			System.out.println("Jugador 2, elije donde quieres poner la ficha"
					+ "\nPrimero elije la fila, luego la columna y por ultimo el valor"
					+ " con el que quieres jugara X O");
			boolean colocarExitoso2 =false;
			while(!colocarExitoso2) {
				int jugador2Column=entrada.nextInt();
				entrada.nextLine();
				int jugador2Row = entrada.nextInt();
				entrada.nextLine();
				String jugador2Simbol =entrada.next();
				entrada.nextLine();
				char ficha2 = jugador2Simbol.charAt(0);
				colocarExitoso2=colocarFicha(jugador2Row,jugador2Column,ficha2);
				mostrarTablero();
			}
		}while(!finPartida() && !hayEmpate());
		System.out.println("El segundo jugador gana la partida");;
		System.out.println(finPartida());
	}









}


