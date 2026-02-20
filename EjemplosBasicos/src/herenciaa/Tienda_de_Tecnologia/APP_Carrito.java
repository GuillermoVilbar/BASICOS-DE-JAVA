package herenciaa.Tienda_de_Tecnologia;
import java.util.ArrayList;
public class APP_Carrito {

		public static void main (String[] args) {
	 ArrayList<Producto> productos = new ArrayList();
	 
	 Television miTele = new Television("phili`s t400", 399.99, 65);
	 Smartphone miSmartphone = new Smartphone("apple 11",250,5);
	 
	 productos.add(miTele);
	 productos.add(miSmartphone);
	 System.out.println(productos.get(0).toString());
}
}