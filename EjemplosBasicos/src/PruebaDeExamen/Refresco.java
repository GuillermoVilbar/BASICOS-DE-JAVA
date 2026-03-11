package PruebaDeExamen;

public class Refresco extends bebidas{
	

	// los tamaños son 'G','P', 'M'
	private char tamaño;

	public Refresco(String nombre, double precioBase, char tamaño) {
		super(nombre, precioBase);
		this.tamaño=tamaño;
	}

	@Override
	protected double calcularPrecio() {
		if (tamaño == 'G'){
			//Si es grande + 80% mas del precio base
			return this.getPrecio() *1.8;
		}else if (tamaño == 'M') {
			return this.getPrecio()*1.4;
		}else {
			return this.getPrecio();

		}
		
	}

	@Override
	public String toString() {
		return "Refresco [nombre "+ this.getNombre() + "tamaño" + tamaño + ", calcularPrecio()=" + calcularPrecio() + "]";
	}
	
}


	
	

