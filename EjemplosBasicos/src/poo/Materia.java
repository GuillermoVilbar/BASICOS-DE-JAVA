package poo;
import java.util.ArrayList;
public class Materia {
		
			
			private String nombre;
			private ArrayList<Estudiante> estudiantes;
			private static int numeroMatriculas=0;
			private static String NombreFacu= "UVA";
			
			public ArrayList<Estudiante> getEstudiantes() {
				return estudiantes;
			}
			public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
				this.estudiantes = estudiantes;
			}
			public Materia (String nombre) {
			this.nombre=nombre;
			this.estudiantes = new ArrayList<>();
			}
			
			public static String getNombreFacu() {
				return NombreFacu;
			}
			

			public String getNombre() {
				return nombre;
			}


			public static int getNumeroMatriculas() {
			return numeroMatriculas;
			}
			
			public static void setNombreFacu(String nombreFacu) {
				NombreFacu = nombreFacu;
			}
			public void matricularEstudiante(Estudiante estu) {
				estudiantes.add(estu);
				//Independiente
				numeroMatriculas++;
			}
			
	

	
}
