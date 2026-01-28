package poo;

public class AppCocheCompletoConMotor {
//PARA ESTA CLASE UTILIZAMOS LA CLASE CochePlano Y LA CLASE MotorPlano
	public static void main(String[] args) {
		CochePlano cars =new CochePlano("civic", "honda", "diesel", 300);
		CochePlano cars2 =new CochePlano("Dacia", "Sandero", "Gasolina", 5);
	cars.mostrarInfo();
	cars2.mostrarInfo();
	}

}
