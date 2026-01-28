package poo;

public class Ascensor {

	private int capacidad;
	private int pesoMaximo;
	private int pisoActual;
	private boolean tieneEspejo;

	public Ascensor(int capacidad, int pesoMaximo, int pisoActual, boolean tieneEspejo) {
		this.capacidad=capacidad;
		this.pesoMaximo=pesoMaximo;
		this.pisoActual=pisoActual;
		this.tieneEspejo=tieneEspejo;
	}
	public void subir(int n) {
		System.out.println("Subiendo"+ n + "pisos");
		pisoActual = pisoActual+n;
	}
	public void baja(int n) {
		System.out.println("Bajando"+ n + "pisos");
	}
	public void getpisoActual(int n) {
		System.out.println("estas en el piso"+ pisoActual);
	}
}
