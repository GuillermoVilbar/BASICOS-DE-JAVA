package Suscripciones;

public class Perfil  {

 private  String nombreUsuario;
 private int edad;
 
 public Perfil (String nombreUsuario, int edad) {
	 this.nombreUsuario=nombreUsuario;
	 this.edad=edad;
 }



public String getNombreUsuario() {
	return nombreUsuario;
}



public int getEdad() {
	return edad;
}


public String mostrarDatos() {
	return "Perfil [nombreUsuario=" + nombreUsuario + ", edad=" + edad + "]";

}



@Override
public String toString() {
	return "Perfil [nombreUsuario=" + nombreUsuario + ", edad=" + edad + "]";
}
}
 

 
	
 

	


