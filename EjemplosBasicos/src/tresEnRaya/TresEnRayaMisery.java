package tresEnRaya;


import java.util.Scanner;

public class TresEnRayaMisery extends juegoDeTablero{
	
	
	
	public TresEnRayaMisery(String nombre1, char ficha1, String nombre2, char ficha2) {
		super(nombre1, ficha1, nombre2, ficha2);
		// TODO Auto-generated constructor stub
	}

	public void inicio() {
		Scanner sc = new Scanner(System.in);
		boolean finPartida=false;
		
		while (!finPartida) {
			tablero.mostrar();
			System.out.println("\nTurno de " + jugadorActivo.getNombre() + " (" + jugadorActivo.getFicha()+")");
			
			boolean fichaColocada=false;
			while (!fichaColocada) {
				System.out.println("Elige una fila");
				int f = sc.nextInt()-1;
				System.out.println("Elige una columna");
				int c = sc.nextInt()-1;
				fichaColocada = tablero.colocarFicha(f, c, jugadorActivo.getFicha());
			}
			
			//Comprobar si hemos terminado (ganando o empatando)
			if (tablero.hayGanador()) {
				tablero.mostrar();
				cambiarTurno();
				System.out.println("Enhorabuena " + jugadorActivo.getNombre() + " has ganado");
				finPartida=true;
			} else if(tablero.hayEmpate()){
				tablero.mostrar();
				System.out.println("Empate!! No quedan movimientos");
				finPartida=true;
			}else {
				//Cambio de jugador
				cambiarTurno();	
			}
		}

		sc.close();
	}
	
	private void cambiarTurno() {
		this.jugadorActivo = (jugadorActivo == j1) ? j2 : j1;
	}
	
}
