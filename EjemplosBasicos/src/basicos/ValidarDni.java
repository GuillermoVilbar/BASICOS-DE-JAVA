package basicos;

import java.util.Scanner;

public class ValidarDni {
	final static String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKED";
	
	public static boolean dniValido(String dni) {
	
		String dniSinLetra;
		dniSinLetra = dni.substring(0,8);
		char letra = dni.charAt(dni.length()-1);
		System.out.println("El dni entero es: " + dni + " y sin letra " + dniSinLetra + " la letra es: "+ letra);
		int dniNumerico = Integer.valueOf(dniSinLetra);
		System.out.println("El dni en numero es: " + dniNumerico);
		
		char letraBuena;
		int resto = dniNumerico%23;
		letraBuena=LETRAS.charAt(resto);
		System.out.print("El resto da: " + resto + " y letra buena seria " + letraBuena);
		
		
		if(letra == letraBuena) {
			return true;
		}
		
		return false;}

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce el DNI para ver si es valido");
		String dni = entrada.nextLine();
		
		if (dniValido(dni.toUpperCase())) {
			System.out.println("\nLa letra es correcta");
		}else {
			System.out.println("\nLa letra es Incorrecta");
		}
	
		
		
	
		
		

	

}
}