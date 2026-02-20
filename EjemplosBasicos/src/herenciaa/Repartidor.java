package herenciaa;

public class Repartidor extends Empleado {

	private int zona;
	
	public Repartidor(String nombre, int zona) {
		super(nombre);
		this.zona =zona;
		

	}
	@Override
	public double getSalario() {
		if(this.zona==1) {
		return super.getSalario() + 100;
		}
			return super.getSalario();
	}
	}

	
