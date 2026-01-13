package poo;

public class Lampara {
	private String color;
	private String marca;
	private boolean estaEncendida;
	

	
	public  Lampara (String color, String marca, boolean estaEncendida) {
		this.color=color;
		this.marca=marca;
		this.estaEncendida=estaEncendida;
		
	
	
}
	public void corroborarEstado() {
		System.out.print("Esta lampara es Color " + color + " comprada en" + marca );
		if(estaEncendida == true) {
			System.out.println("y esta encendida");
		}else {
			System.out.println("y esta apagada");
		}
	
}
	public void apagar() {
		this.estaEncendida=false; 
	}
	public void encender() {
		this.estaEncendida=true;
	}
}
