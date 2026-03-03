package Suscripciones;
import java.util.ArrayList;
public abstract class Suscripcion {

	private  String nombreUsuario;
	private final double precioBase;
	private ArrayList<Perfil>perfiles = new ArrayList<>();
	
	
	protected Suscripcion (String nombreUsuario, double precioBase) {
		this.nombreUsuario = nombreUsuario;
		if (precioBase < 0) {
			// si intetan engañarnos que paguen!!!
			this.precioBase=100;
		}else {
			this.precioBase=precioBase;
		}
		this.perfiles = new ArrayList<>();
			
		}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	protected abstract double calcularPrecio();
	protected abstract int getMaxPerfiles();
	
	
	
	protected void añadirPerfil(Perfil p) {
		if( perfiles.size() >= getMaxPerfiles()) {
			System.out.println("Tu lista esta llena, no puedes añadir mas perfiles");
		}else {
			perfiles.add(p);
			calcularPrecio();
		}
		
	}
	

	protected void getPerfiles() {
		 for (Perfil p:perfiles) {
			System.out.println( p.toString());
		 }
	}
	public double getPrecioBase() {
		return precioBase;
	}
	}
	
	
		
	
	
	

	


