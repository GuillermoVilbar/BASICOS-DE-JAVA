package PruebaDeExamen;

public class cafe extends bebidas{

public static final double PRECIO_SUPLEMENTO =0.5;
private  int numSuplementos;



public cafe(String nombre, double precioBase, int numSuplementos) {
	super(nombre, precioBase);
this.numSuplementos=numSuplementos;
}


@Override
protected double calcularPrecio() {
	return this.getPrecio() + PRECIO_SUPLEMENTO * numSuplementos;
}


@Override
public String toString() {
	String mensaje;
	if(numSuplementos >0) {

		mensaje= "cafe [nombre; " + this.getNombre() +"con" + numSuplementos + "suplementos]";

	}else {
		mensaje = "cafe [nombre; " + this.getNombre() +"]";
	}



	return mensaje + "ON UN PRECIO DE " + calcularPrecio();


}

}
