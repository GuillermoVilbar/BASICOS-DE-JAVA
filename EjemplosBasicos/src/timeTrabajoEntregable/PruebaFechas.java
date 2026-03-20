package timeTrabajoEntregable;

import java.time.Month;
import java.time.LocalDate;
import java.util.Locale;
import java.time.format.TextStyle;



public class PruebaFechas  {
	public static void main ( String [] args ) {
	
	LocalDate fechaNacimiento = LocalDate.of(2002, 12, 16);

Locale idioma = Locale.forLanguageTag("es");
System.out.println("Mes:" + fechaNacimiento.getMonth().getDisplayName(TextStyle.FULL, idioma).toUpperCase());
 	

System.out.println("Dia" + fechaNacimiento.getDayOfMonth());
	}
	
}
