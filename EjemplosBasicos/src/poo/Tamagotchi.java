package poo;

public class Tamagotchi {

	private String nombre;
	private int hambre;
	private int energia;

	public Tamagotchi (String nombre) {
		this.nombre=nombre;
		this.hambre=0;
		this.energia=100;
	}
	
	
	public void estado() {
		System.out.println(nombre + " tiene " + hambre + " de hambre " + " y " + energia + " de energia " );
	
	}

	public void comer () {
		if(hambre<=10) {
			this.hambre=0;
		} else{
			this.hambre-=20;
		}
	}
	public void dormir() {
		this.energia=100;
	}
	public void jugar () {
		if (this.energia >=20) {
			if(this.hambre<85) {
			}else {
				this.hambre=100;
			}
			this.energia-=20;
		}else {
			System.out.print("Estoy muy cansado para jugar, necesito una siesta");
		}
	}

public void saludar() {
	System.out.println("Soy " + this.nombre + " encantado de conocerte, que hacemos ahora");
}

}


	

	


