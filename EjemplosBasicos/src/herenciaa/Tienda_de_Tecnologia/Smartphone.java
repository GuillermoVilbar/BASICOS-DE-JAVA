package herenciaa.Tienda_de_Tecnologia;

public class Smartphone extends Producto {
	
	protected int RAM;

	public Smartphone(String nombre, double precio, int RAM ) {
		super(nombre, precio);
		this.RAM=RAM;
	
		
	}

	@Override
	public String toString() {
		return super.toString()+"con "+ RAM + "de memoria RAM";
	}
	
}


	


