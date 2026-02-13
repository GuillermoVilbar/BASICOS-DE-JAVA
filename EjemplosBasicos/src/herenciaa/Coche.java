package herenciaa;

public class Coche extends Vehiculo{
	private int cPuertas;
	public Coche( String marca, String modelo, int cPuertas) {
		super(marca, modelo);
		this.cPuertas = cPuertas;
	}

public void verCoche() {
	System.out.println("EL coche es de marca "+ marca+ " modelo " + modelo +" con " + cPuertas + " puertas");
}


public String toString() {
	return "Coche [cPuertas=" + cPuertas + ", marca=" + marca + ", modelo=" + modelo + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}



}
