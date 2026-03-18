package interfaces;

public class Aguila extends Animales implements Volador{

	public Aguila(String nombre, int edad) {
		super(nombre, edad);
	
	}
	
	

	@Override
	public void despega() {
		System.out.println(this.getNombre()+"Despliega sus alas y despega");
		
	}



	@Override
	public void volar(int altitud) {
		System.out.println(this.getNombre() + " Planea  a una altitud de " + altitud + "metros");
		
	}



	@Override
	public void aterrizar() {
		System.out.println(this.getNombre() + "se posa en una rama ");
		
	}



	@Override
	public void hacerSonido() {
	System.out.println(this.getNombre() + "Creak creak");
	
		
	}
 public void volar() {
	 System.out.println(this.getNombre() + "Esta volando");
 }


}
