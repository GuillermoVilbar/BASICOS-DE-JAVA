package poo.polimorfismo;

public class APPaves {

	public static void main(String[] args) {
		Gallina gallina = new Gallina ("turuleta");
		Ave gallo = new Gallo ("Claudio");

		if (gallina instanceof Gallina) {
			gallina.volar();
			((Gallina)gallina).ponerHuevo();
		}
		
	if (gallo instanceof Gallina) {
	
	((Gallina)gallo).ponerHuevo();
	}else {
		gallo.volar();
	}
	
	}
	

}
