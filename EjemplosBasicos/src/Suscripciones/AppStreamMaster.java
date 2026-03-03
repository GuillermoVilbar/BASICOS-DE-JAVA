package Suscripciones;

public class AppStreamMaster {

	public static void main(String[] args) {
		PlanEstandar pe = new PlanEstandar("Netflix Estandar", 10.99);
		System.out.println(pe.calcularPrecio());
		pe.añadirPerfil(new Perfil ("Guillermo",22));
		pe.getPerfiles();
		
		
	}
}
