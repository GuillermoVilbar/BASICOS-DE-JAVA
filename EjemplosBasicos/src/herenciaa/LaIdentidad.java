package herenciaa;

public class LaIdentidad {

	public static void main(String[] args) {
	Comercial comercial1 = new Comercial("guillermo",120);
	comercial1.getSalario();
	
	
	Repartidor repartidor1 = new Repartidor("jorge", 1);
	Repartidor repartidor2 = new Repartidor("manuel", 2);
	
	System.out.print(repartidor2.getSalario());

	repartidor2.getSalario();

	}
	}
