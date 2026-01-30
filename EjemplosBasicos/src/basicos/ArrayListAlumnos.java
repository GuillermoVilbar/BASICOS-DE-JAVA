package basicos;
import java.util.ArrayList;
public class ArrayListAlumnos {

	public static void main(String[] args) {
		ArrayList<String>alumnos = new ArrayList<>();
		alumnos.add("Maria");
		alumnos.add("Mario");
		alumnos.add("guillermo");
		alumnos.add("jose");
		alumnos.add("leandro");
		
		for(int i=0; i<alumnos.size();i++) {
			String nombres = alumnos.get(i);
			System.out.println("esta es la lista de alumnos de este año: " + nombres);
		
		}
	
	for( String nombre : alumnos) {
		System.out.println("lista de nombressss: "+ nombre);
	}
	}
}
