package poo;

import java.util.Arrays;
import java.util.Scanner;
public class TresEnRaya {
	Scanner entrada = new Scanner(System.in);
	static char[][] tablero = new char[3][3] ;
	
	public static void mostrarTablero () {
		System.out.println("Tablero actual \n---------");
		for(int i=0; i < tablero.length; i++) {
			for(int j =0; j<tablero[i].length;j++) {
				System.out.print("|"+tablero[i][j] +"|" );
			}
			System.out.println();			
		}
		System.out.println();
	}
	public static int colocarFicha (int fila, int columna, char ficha) {
		if (tablero[fila][columna]== '-') {
			// podemos poner la ficha, esta libre
			tablero[fila][columna] = ficha;
return 0;
		}else {
			//si no hay guion es que hay una ficha
			System.out.println("Ya hay una ficha colocada");
			return -1;
		}
	}
public static boolean finPartida() {
	//hay 3 en raya en la horizontal
	for (int i=0; i<tablero.length;i++) {
		if (tablero[i][0]== tablero[i][1] && tablero[i][1]== tablero[i][2]) {
			return true;
		}
	}
	//comprobamos las columnas
	for(int j=0; j<tablero.length;j++) {
		if (tablero[0][j]== tablero[1][j] && tablero[1][j]== tablero[2][j]) {
			return true;
	}
	}
	if((tablero[0][0]==tablero[1][1] && tablero[1][1]==tablero[2][2]) 
		||
		(tablero[0][2]==tablero[1][1] && tablero[1][1] == tablero[2][0])){
			return true;
		}
		
	
	return false;
	

}

	public static void main(String[] args) {


		for(int i=0; i< tablero.length;i++) {	
			Arrays.fill(tablero[i], '-');
		}
		mostrarTablero();
		colocarFicha(1,2,'X');
		mostrarTablero();
		colocarFicha(1,1,'X');
		mostrarTablero();
		colocarFicha(1,0,'X');
		mostrarTablero();
		finPartida();
	}









}


