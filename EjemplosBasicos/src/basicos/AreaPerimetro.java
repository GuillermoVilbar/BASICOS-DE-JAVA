package basicos;

public class AreaPerimetro {

	public static double perimetro (double radio) {
		return 2*Math.PI*radio;}
	
	public static double area (double radio) {
		double area=Math.PI*radio*radio;
		return area;
	}
	public static void main(String [] args) {
		
		double r = 1.4;
		double p;
		
		//Guardamos el valor debvuelto por el metodo
		
		p=perimetro(r);
		System.out.print("El perimetro es: " + p);
		
		//Utiizamos directamente el valor que me devuelve el metodo
		
		System.out.println("El area es: " + area(r));
	
		
	
		
		
	}

}
