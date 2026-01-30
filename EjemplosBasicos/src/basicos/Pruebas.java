package basicos;
import java.util.ArrayList;
public class Pruebas {
	public static void main(String[] args){
ArrayList<String> pruebas = new ArrayList<>();

pruebas.add("Hola");
pruebas.add("Que");
pruebas.add("Tal");
System.out.println("Ahora en la posicion 1 esta: "+ pruebas.get(1));
pruebas.remove(1);
System.out.println("Ahora en la posicion 1 esta: "+ pruebas.get(1));
}
}