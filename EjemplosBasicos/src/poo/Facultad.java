package poo;

public class Facultad {

	public static void main(String[] args) {
		
Materia programacion = new Materia("programacion");

System.out.println("La materia " + programacion.getNombre() + " es del instituto " + Materia.getNombreFacu());

Materia sistemas_informaticos = new Materia("Sistemas Informaticos");

System.out.println("La materia " + sistemas_informaticos.getNombre() + " es del instituto " + Materia.getNombreFacu());
	}

}
