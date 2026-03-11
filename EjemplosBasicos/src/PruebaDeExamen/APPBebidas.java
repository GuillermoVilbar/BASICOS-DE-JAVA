package PruebaDeExamen;
import java.util.ArrayList;
public class APPBebidas {

	public static void main(String[] args) {
	ArrayList<bebidas> bebidas = new ArrayList();
	
	cafe cafe = new cafe("cafe solo",1,0);
	cafe cafe2 = new cafe ("cafe con hielo",1,1);
	
	Refresco ref = new Refresco("Cocacola", 2.5, 'M');
	Refresco ref2 = new Refresco("Fanta naranja", 2.5, 'G');

	bebidas.add(ref2);
	bebidas.add(ref);
	bebidas.add(cafe);
	bebidas.add(cafe2);
	bebidas.add(new Refresco("Aquarius", 2,'P'));
	

	for ( bebidas b : bebidas) {
		System.out.println(b.toString());
	}
}
}
