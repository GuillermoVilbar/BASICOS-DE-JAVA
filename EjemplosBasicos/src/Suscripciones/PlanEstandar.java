package Suscripciones;

public class PlanEstandar extends Suscripcion{


	private int maxPerfiles=1;

	

	protected PlanEstandar(String nombreUsuario, double precioBase) {
		super(nombreUsuario, precioBase);
		

	}

	public int getMaxPerfiles() {
		return maxPerfiles;
	}


	@Override
	protected double calcularPrecio() {
		return getPrecioBase();
	}

	
		
	}

	

	


