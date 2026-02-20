package herenciaa.Tienda_de_Tecnologia;

public class Television extends Producto{

	private int pulgadas;
	
	public Television (String nombre, double precio, int pulgadas) {
		super(nombre, precio);
		this.pulgadas=pulgadas;
	}

	@Override
	public String toString() {
		return "Esta "+ nombre+" tiene pulgadas=" + pulgadas + "y vale" + precio;
	}
	
	
		
		
		
	

}
