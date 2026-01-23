package poo;

public class MotorPlano {

	
		private String tipo;
		private int potencia;
 
	public MotorPlano(String tipo, int potencia) {
			this.tipo=tipo;
			this.potencia=potencia;
					}
		
	public String getInfo() {
		return( this.tipo + " y tiene una potencia de " 
				+ this.potencia+"CV");
	}

}
