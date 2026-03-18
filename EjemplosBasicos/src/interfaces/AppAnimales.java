package interfaces;

public class AppAnimales {

	public static void main(String[] args) {
	Animales a = new Perro ("Pepe", 5);
	Animales b = new Aguila ("Fenix", 2);

	a.hacerSonido();
	a.respirar();
	
	b.hacerSonido();
	b.respirar();
	
	Avion av = new Avion("RF4452");
	ejecutarVuelo((Aguila)b, 30);
	
	ejecutarVuelo(av, 1500);
	
	
	
	Pato patoPato = new Pato("Donald",35);
	Volador patoVolador = new Pato ( "Lucas",30);
	Nadador patoNadador = new Pato ( "Gilito", 60);
	
	Volador avioVolador=new Avion("f15");
	
	
	ejecutarNado(patoPato,50);
	ejecutarNado((Nadador)patoVolador, 400);
	ejecutarNado(patoNadador, 400);
	}

	public static void ejecutarVuelo ( Volador v, int metros) {
		System.out.println("Iniciando el vuelo:");
		v.despega();
		v.volar(metros);
		v.aterrizar();
		System.out.println("fin del trayecto");
		
	}

	
	public static void ejecutarNado ( Nadador n, int metros) {
		System.out.println("Iniciando el curso de natacion:");
		n.zambullirse();
		n.nadar(metros);
		n.salirDelAgua();
		System.out.println(" a por la toalla:");
	}
	}

