package poo;

public class PersonasPlano {

	private String nombre;
	private  int edad;
	
	public PersonasPlano(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}

	public  String getNombre() {
		return nombre;
	}

	

	public  int getEdad() {
		return edad;
	}

	
	public String toString() {
		return   nombre +' ' +  edad + " años" ;
	}



	
	}

	
	
	

		

	


