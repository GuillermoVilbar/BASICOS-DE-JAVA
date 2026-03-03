package Suscripciones;

public class PlanEstudiante extends Suscripcion{

	private int maxPerfiles=1;
	private final double PLUS = 0.5;
	private String nombreInstituto;
	
	protected PlanEstudiante(String nombreUsuario, double precioBase, String nombreInstituto) {
		super(nombreUsuario, precioBase);
		this.nombreInstituto=nombreInstituto;

	}

	@Override
	protected double calcularPrecio() {
		// TODO Auto-generated method stub
		return getPrecioBase() * (PLUS);
	}

	@Override
	protected int getMaxPerfiles() {
		// TODO Auto-generated method stub
		return maxPerfiles;
	}

	public String getNombreInstituto() {
		return nombreInstituto;
	}






}
