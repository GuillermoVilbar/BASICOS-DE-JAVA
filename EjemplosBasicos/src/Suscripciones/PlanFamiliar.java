package Suscripciones;

public class PlanFamiliar extends Suscripcion {

	// el recargo del 40%
	private static final double PLUS =1.4;
	int maxPerfiles = 5;

	protected PlanFamiliar(String nombreUsuario, double precioBase) {
		super(nombreUsuario, precioBase);

	}


	@Override
	protected double calcularPrecio() {
		// TODO Auto-generated method stub
		return getPrecioBase() * (PLUS);
	}




	@Override
	//posible refactorizacion, subir metodo al padre, el atributo tambien e inicializar en el constructor
	protected int getMaxPerfiles() {

		return maxPerfiles;
	}



}
