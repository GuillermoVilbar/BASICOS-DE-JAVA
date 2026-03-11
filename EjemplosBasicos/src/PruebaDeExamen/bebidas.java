package PruebaDeExamen;

public abstract class bebidas {

	private String nombre;
	private double precioBase;

	public bebidas (String nombre, double precioBase) {
		this.nombre=nombre;
		this.precioBase=precioBase;
	}

	protected String getNombre() {
		return nombre;
	}


	protected double getPrecio() {
		return precioBase;
	}

	@Override
	public String toString() {
		return "bebidas [nombre=" + nombre + ", precioBase=" + precioBase + "]";
	}

protected abstract double calcularPrecio();







}
