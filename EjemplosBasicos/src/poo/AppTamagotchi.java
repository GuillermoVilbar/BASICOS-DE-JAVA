package poo;
import java.util.Scanner;
public class AppTamagotchi {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Como quieres que se llame tu mascota?");
		String  nombre = entrada.nextLine();
		Tamagotchi mascota = new Tamagotchi(nombre);

		mascota.estado();
		mascota.saludar();

		System.out.println("\n--- Bienvenido a mundo Tamagotchi ");

		int menu;

		do {
			System.out.println("\n Que quieres hacer?");
			System.out.println("1. Jugar");
			System.out.println("2. Comer");
			System.out.println("3. Dormir");
			System.out.println("0. salir");
			System.out.println("Elige una opción (1-4): ");

			menu = entrada.nextInt();
			entrada.nextLine();

			switch (menu) {
			case 1:
				mascota.jugar();

				break;
			case 2:
				mascota.comer();
				break;
			case 3:
				mascota.dormir();

				break;

			default:
				System.out.println("La opcion elegida no es valida");

				mascota.estado();
			}

		} while (menu!=0);

		entrada.close();
	}

}
