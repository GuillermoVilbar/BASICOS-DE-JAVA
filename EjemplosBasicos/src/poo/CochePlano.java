package poo;

public class CochePlano {

	private String marca;
	private String modelo;
	private  MotorPlano motor;
	
	public CochePlano(String marca, String modelo, String tipo, int potencia) {
		this.marca=marca;
		this.modelo=modelo;
		motor = new MotorPlano(tipo,potencia);
	}
	public void mostrarInfo() {
		System.out.println("Este coche es un " + this.marca + " y es de "+ this.modelo
				+ " ademas es a base de "+ this.motor.getInfo());

	
	}
	
}

