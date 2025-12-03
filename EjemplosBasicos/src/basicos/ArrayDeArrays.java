package basicos;

public class ArrayDeArrays {

	public static void main(String[] args) {
		int [][] numero = new int [5][3];
		int [][][] locura = new int[10][5][3];
		System.out.println("Tengo "+ numero.length + " filas y "+ numero[0].length + " columnas y mido ");
		System.out.println("Tengo "+ locura.length + " filas y "+ locura[0].length + " columnas y mido "+ locura[0][0].length + " de altura");
		
		
		for(int i=0 ; i < numero.length;i++) {
			numero[i][0] = i;
			numero[i][1] = (int)Math.powExact(i, 2);
			numero[i][2] = (int)Math.powExact(i, 3);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
