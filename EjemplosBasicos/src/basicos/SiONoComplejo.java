package basicos;
import java.util.Scanner;
public class SiONoComplejo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final String VOCALES = "aeiouáéíóúAEIOUÁÉÍÓÚ";
		
		String frase, vocalesMinuscula;
		char caracter;
		int numVocales=0;
		
	
		
		System.out.print("Introduce una frase y te dire cuantas vocales tiene");
		frase = entrada.nextLine();
		
		for (int i = 0; i<= frase.length()-1; i++) {
			caracter = frase.charAt(i);
			if (VOCALES.indexOf(caracter)>0) {
				numVocales++;
				System.out.print(caracter);
				
			}
			
			
		}
			System.out.println("\nEn total hay " + numVocales + " vocales");
			
			entrada.close();
		
		
	}

}
